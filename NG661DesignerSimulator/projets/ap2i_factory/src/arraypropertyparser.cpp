/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "arraypropertyparser.h"

#include <QDebug>
#include <QDomElement>
#include <QVariant>
#include <QMetaType>

#include "component.h"
#include "parsingcontext.h"

#include "entrytype.h"
#include "arrayentrytype.h"

namespace AP2I 
{

ArrayPropertyParser::ArrayPropertyParser(ParsingContext &pContext)
    : mContext(pContext)
{
}

void ArrayPropertyParser::digest(QDomElement &pElement)
{
    // Remove namespace prefix for type attribute as it can refer to a standard type
    QString lValueType = pElement.attribute("type").section(":", -1);    
    QString lArrayPropName = pElement.attribute("name");
    QString lNumberOfEntries = pElement.attribute("numberOfEntries");
    QString lMaxNumberOfEntries = pElement.attribute("maxNumberOfEntries");
    QString lElemName;
    ArrayEntryType lEntries;    

    lEntries.setMaxNumberOfEntries(lMaxNumberOfEntries.toInt());
    lEntries.setNumberOfEntries(lNumberOfEntries.toInt());

    QDomElement lCurrent = pElement.firstChildElement();
    lElemName = lCurrent.localName();    

    if (lElemName == "Entry")
    {
        int i=0;
        //EntryType lEntry;
        while (!lCurrent.isNull())
        {
            //lEntry = parseEntry(lCurrent, lValueType);
            //lEntries.addValue(lEntry);
            StringType lString(lCurrent.attribute("value"));
            QVariant lNewVal = QVariant::fromValue(lString);
            QString lPropName = lArrayPropName + "_" + QString::number(i);
            mContext.mComponent.addProperty(lPropName.toLatin1().data(), lNewVal);
            lCurrent = lCurrent.nextSiblingElement();
            i++;
        }
    }
//    else if (lElemName == "ArrayEntry")
//    {
//        QVariant lArrayEntry;
//        while (!lCurrent.isNull())
//        {
//            lArrayEntry = parseArrayEntry(lCurrent, lValueType);
//            lEntries.addValue(QVariant::fromValue(lArrayEntry));
//            lCurrent = lCurrent.nextSiblingElement();
//        }
//    }
    else
    {
        /* TO DO : structEntry, unionEntry */
    }

    mContext.mComponent.addProperty(lArrayPropName.toLatin1().data(), QVariant::fromValue(lEntries));
}

EntryType ArrayPropertyParser::parseEntry(QDomElement &pElement, QString pValueType)
{
    QVariant lNewVal(pElement.attribute("value"));
    QString lIndexStr = pElement.attribute("index");
    int lIndex;
    EntryType lEntry;

    if (lIndexStr != "")
    {
        lIndex = lIndexStr.toInt();
    }
    else
    {
        lIndex = 0;
    }

    lEntry.setValue(lNewVal.toString());
    lEntry.setIndex(lIndex);

    //return QVariant::fromValue(lEntry);
    return lEntry;
}

//QVariant ArrayPropertyParser::parseArrayEntry(QDomElement &pElement, QString pValueType)
//{
//    QString lElemName;
//    QString lIndexStr = pElement.attribute("index");
//    QString lNumberOfEntryStr = pElement.attribute("numberOfEntries");
//    QString lMaxNumberOfEntryStr = pElement.attribute("maxNumberOfEntries");
//    int lIndex, lNumberOfEntry, lMaxNumberOfEntry;
//    ArrayEntryType lEntries;

//    QDomElement lCurrent = pElement.firstChildElement();
//    lElemName = lCurrent.localName();

//    //QList<QVariant> lEntries;

//    if (lIndexStr != "")
//    {
//        lIndex = lIndexStr.toInt();
//    }
//    else
//    {
//        lIndex = 0;
//    }
//    lNumberOfEntry = lNumberOfEntryStr.toInt();
//    lMaxNumberOfEntry = lMaxNumberOfEntryStr.toInt();

//    lEntries.setIndex(lIndex);
//    lEntries.setNumberOfEntries(lNumberOfEntry);
//    lEntries.setMaxNumberOfEntries(lMaxNumberOfEntry);

//    if (lElemName == "Entry")
//    {
//        EntryType lEntry;
//        while (!lCurrent.isNull())
//        {
//            lEntry = parseEntry(lCurrent, pValueType);
//            lEntries.addValue(lEntry);
//            lCurrent = lCurrent.nextSiblingElement();
//        }
//    }
//    else if (lElemName == "ArrayEntry")
//    {
//        QVariant lArrayEntry;
//        while (!lCurrent.isNull())
//        {
//            lArrayEntry = parseArrayEntry(lCurrent, pValueType);
//            //lEntries.append(lArrayEntry);
//            lEntries.addValue(lArrayEntry);
//            lCurrent = lCurrent.nextSiblingElement();
//        }
//    }
//    else
//    {
//        /* TO DO : structEntry, unionEntry */
//    }

//    return QVariant::fromValue(lEntries);
//}

} /* namespace AP2I */
