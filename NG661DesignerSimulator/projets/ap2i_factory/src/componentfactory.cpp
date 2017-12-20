/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "componentfactory.h"

#include "importparser.h"
#include "parsingcontext.h"
#include "propertyparser.h"
#include "arraypropertyparser.h"
#include "eventparser.h"
#include "representationparser.h"
#include "statemachineparser.h"
#include "behaviorparser.h"
#include "functionparser.h"
#include "enumparser.h"

#include "component.h"
#include "basicobject.h"
#include "digester.h"

#include <QFile>
#include <QDebug>
#include <QtXml>
#include <QXmlSchemaValidator>
#include <QtScript/QScriptEngine>

namespace AP2I 
{

ComponentFactory::ComponentFactory()
    : mCurrentFolder("."),
      mXmlValidationAgainstXsd(false)
{
}

ComponentFactory::~ComponentFactory()
{
    for (QMap<QString, ComponentEntry>::iterator it = mRegistry.begin();
         it != mRegistry.end();
         ++it)
    {
        delete it.value().document;
    }
}

Component *ComponentFactory::createScene(const QString &pMainFile)
{
    Component *lReturnValue = 0;
    QDomDocument *lDoc = registerComponent(pMainFile);
    if (lDoc)
    {
       lReturnValue = instantiateComponent(
                          0,
                          lDoc->documentElement().attribute("name"));
    }
    return lReturnValue;
}

Component *ComponentFactory::instantiateComponent(BasicObject *pParent,
                                                  const QString &pComponentName)
{
    Component *lReturnValue = 0;
    ComponentEntry lEntry = findDocument(pComponentName);
    if (!lEntry.document)
    {
        qDebug() << "ERROR: Unknown component name " << pComponentName;
        return 0;
    }
    // create ComponentNode
    lReturnValue = new Component(pParent);
    lReturnValue->setClassName(pComponentName);
    lReturnValue->setId(pComponentName);
    QDomElement lXMLRoot = lEntry.document->documentElement();

    QString lDefaultWidth  = lXMLRoot.attribute("default_width");
    QString lDefaultHeight = lXMLRoot.attribute("default_height");
    if (!lDefaultWidth.isEmpty())
        lReturnValue->addProperty("defaultWidth", lDefaultWidth.toInt());
    if (!lDefaultHeight.isEmpty())
        lReturnValue->addProperty("defaultHeight", lDefaultHeight.toInt());

    Digester lDigester;
    ParsingContext lContext(*lReturnValue, *this);
    ImportParser lImportParser(lContext);
    PropertyParser lPropertyParser(lContext);
    ArrayPropertyParser lArrayPropertyParser(lContext);
    EventParser lEventParser(lContext);
    RepresentationParser lRpzParser(lContext);
    BehaviorParser lBehaviorParser(lContext);
    StateMachineParser lHSMParser(lContext);
    FunctionParser lFunctionParser(lContext);
    EnumParser lEnumParser(lContext);

    lDigester.addRule(DigestRule("/ComponentDefinition/Definition/Import", &lImportParser));
    lDigester.addRule(DigestRule("/ComponentDefinition/Tree", &lRpzParser));
    lDigester.addRule(DigestRule("/ComponentDefinition/Interface/Property", &lPropertyParser));
    lDigester.addRule(DigestRule("/ComponentDefinition/Interface/ArrayProperty", &lArrayPropertyParser));
    lDigester.addRule(DigestRule("/ComponentDefinition/Interface/Event", &lEventParser));
    lDigester.addRule(DigestRule("/ComponentDefinition/Interface/Event/Param", &lEventParser));
    lDigester.addRule(DigestRule("/ComponentDefinition/Behavior", &lBehaviorParser));    
    lDigester.addRule(DigestRule("/ComponentDefinition/Behavior/scxml", &lHSMParser));
    /* Patch Scxml */
    lDigester.addRule(DigestRule("/ComponentDefinition/Behavior/Scxml", &lHSMParser));
    lDigester.addRule(DigestRule("/ComponentDefinition/Behavior/Function", &lFunctionParser));
    lDigester.addRule(DigestRule("/ComponentDefinition/Behavior/Function/Param", &lFunctionParser));
    lDigester.addRule(DigestRule("/ComponentDefinition/Behavior/Function/Script", &lFunctionParser));
    lDigester.addRule(DigestRule("/ComponentDefinition/Interface/Enum", &lEnumParser));

    QString lFolderSave = mCurrentFolder;
    mCurrentFolder = lEntry.folder;

    lDigester.digest(lXMLRoot);

    mCurrentFolder = lFolderSave;

    return lReturnValue;
}

QDomDocument *ComponentFactory::registerComponent(const QString &pComponentFile)
{
    QDomDocument *lDocument;
    QFile lFile;
    QString lErrStr;
    int lErrLine;
    int lErrColumn;

    if (mCurrentFolder != ".")
        lFile.setFileName(mCurrentFolder + "/" + pComponentFile);
    else
        lFile.setFileName(pComponentFile);

    lDocument = new QDomDocument();

    // manage relative paths
    if (!lFile.open(QIODevice::ReadOnly))
    {
        qDebug() << "ERROR: unable to open file " << lFile.fileName() << "\n";
        delete lDocument;
        return NULL;
    }
    if (!lDocument->setContent(&lFile, true, &lErrStr, &lErrLine, &lErrColumn))
    {
        qDebug() << "ERROR while parsing xml file " << lFile.fileName()
                 << ". At line " << lErrLine
                 << ", column " << lErrColumn
                 << ", message : \n" << lErrStr
                 << "\n";
        delete lDocument;
        return NULL;
    }
    lFile.close();

    // Validate XML against XSD only if requested
    if (mXmlValidationAgainstXsd)
    {
        QXmlSchemaValidator *lSchemaValidator = new QXmlSchemaValidator();

        if(!lSchemaValidator->validate(QUrl::fromLocalFile((pComponentFile))))
        {
            qDebug() << "ERROR while validating xml file " << lFile.fileName() << "against the schema.\n";
            delete lDocument;
            return NULL;
        }
    }

    QDomElement lRoot = lDocument->documentElement();

    if (lRoot.localName() != "ComponentDefinition")
    {
        qDebug() << "ERROR: xml root node is not a \"ComponentDefinition\" node\n";
        delete lDocument;
        return NULL;
    }

    QString lComponentName = lRoot.attribute("name");
    if (lComponentName == "")
    {
        qDebug() << "ERROR: \"ComponentDefinition\" node has no \"name\" attribute\n";
        delete lDocument;
        return NULL;
    }

    ComponentEntry lNewEntry;
    lNewEntry.folder = QFileInfo(lFile.fileName()).dir().canonicalPath();
    lNewEntry.document = lDocument;
    mRegistry.insert(lComponentName, lNewEntry);
    return lDocument;
}

ComponentFactory::ComponentEntry ComponentFactory::findDocument(const QString &pComponantName)
{
    ComponentEntry lReturnValue;

    if (mRegistry.contains(pComponantName))
    {
        lReturnValue = mRegistry[pComponantName];
    }
    else
    {
        lReturnValue.document = NULL;
    }
    return lReturnValue;
}

} /* namespace AP2I */
