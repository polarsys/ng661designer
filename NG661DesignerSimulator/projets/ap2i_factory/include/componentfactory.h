/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef COMPONENTFACTORY_H
#define COMPONENTFACTORY_H

#include <QMap>
#include <QString>

#include "engine.h"
#include "domparser.h"

class QDomDocument;
class QDomElement;
class QScriptEngine;

namespace AP2I
{

class BasicObject;
class Component;

class ComponentFactory
{

// ImportParser need to be able to call registerComponent
friend class ImportParser;

//those class need to be able to call instantiateComponent recursively
friend class RepresentationParser;
friend class BehaviorParser;

public:
    explicit ComponentFactory();
    ~ComponentFactory();

    Component *createScene(const QString &pMainFile);

    void activateXmlValidationAgainstXsd(bool pValue) {mXmlValidationAgainstXsd = pValue;}

private:
    struct ComponentEntry
    {
        QString folder;
        QDomDocument *document;
    };

    // disable copy constructor
    ComponentFactory(const ComponentFactory &);

    QDomDocument *registerComponent(const QString &pComponentFile);

    ComponentEntry findDocument(const QString &pComponantName);

    Component *instantiateComponent(BasicObject *pParent,
                                    const QString &pComponentName);

    const QString &currentFolder() { return mCurrentFolder; }

    QMap<QString, ComponentEntry> mRegistry;
    QString mCurrentFolder;
    bool mXmlValidationAgainstXsd;
};

} /* namespace AP2I */

#endif // COMPONENTFACTORY_H


