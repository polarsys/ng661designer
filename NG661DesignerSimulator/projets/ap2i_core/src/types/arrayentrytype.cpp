/*******************************************************************************
* Copyright (c) 2015, 2016, 2017 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "arrayentrytype.h"
#include <QDebug>
#include <QScriptEngine>
#include <QScriptValueIterator>
namespace AP2I
{

ArrayEntryType::ArrayEntryType()
{	
	mIndex = 0;
    mNumberOfEntries = 0;
    mMaxNumberOfEntries = 0;
}

ArrayEntryType::ArrayEntryType(const int pIndex, const int pNumberOfEntries, const int pMaxNumberOfEntries)
{    
    mIndex = pIndex;
    mNumberOfEntries = pNumberOfEntries;
    mMaxNumberOfEntries = pMaxNumberOfEntries;
}

ArrayEntryType &ArrayEntryType::operator=(const ArrayEntryType &pOther)
{    
    mIndex = pOther.mIndex;
    mNumberOfEntries = pOther.mNumberOfEntries;
    mMaxNumberOfEntries = pOther.mMaxNumberOfEntries;
    return *this;
}

//bool ArrayEntryType::operator==(const ArrayEntryType &pOther) const
//{
//    return (mValue == pOther.mValue);
//}

void ArrayEntryType::setIndex(const int pIndex)
{
    mIndex = pIndex;
}

void ArrayEntryType::setMaxNumberOfEntries(const int pMaxNumberOfEntries)
{
    mMaxNumberOfEntries = pMaxNumberOfEntries;
}

void ArrayEntryType::setNumberOfEntries(const int pNumberOfEntries)
{
    mNumberOfEntries = pNumberOfEntries;
}

void ArrayEntryType::addValue(EntryType pValue)
{
    mValues.append(pValue);
}

QScriptValue ArrayEntryType::toScriptValue(QScriptEngine *pEngine,
                                        const ArrayEntryType &pArrayEntry)
{
    QScriptValue lObj = pEngine->newObject();

    //lObj.setProperty("index", pArrayEntry.mIndex);
    lObj.setProperty("MaxNumberOfEntries", pArrayEntry.mMaxNumberOfEntries);
    lObj.setProperty("NumberOfEntries", pArrayEntry.mNumberOfEntries);

//    for(int i=0; i<pArrayEntry.mNumberOfEntries; i++)
//    {
//        lObj.setProperty(i, pEngine->newVariant(QVariant::fromValue(pArrayEntry.mValues.at(i).value())));
//    }

    return lObj;

    //return QScriptValue(pArrayEntry.toString());
}

void ArrayEntryType::fromScriptValue(const QScriptValue &pValue,
                                  ArrayEntryType &pArrayEntry)
{    
    //pArrayEntry.setIndex(pValue.property("index").toInt32());
    pArrayEntry.setMaxNumberOfEntries(pValue.property("MaxNumberOfEntries").toInt32());
    pArrayEntry.setNumberOfEntries(pValue.property("NumberOfEntries").toInt32());
//    if (pValue.isArray())
//    {
//        for (int i=0; i<pValue.property("NumberOfEntries").toInt32(); i++)
//        {
//            pArrayEntry.addValue(pValue.property(i).toString());
//        }
//    }
}

} /* namespace AP2I */
