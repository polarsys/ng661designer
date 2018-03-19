/*******************************************************************************
* Copyright (c) 2015, 2016, 2017 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "entrytype.h"
#include <QDebug>
#include <QScriptEngine>
namespace AP2I
{

EntryType::EntryType()
{
	mValue = "";
	mIndex = 0;
}

EntryType::EntryType(const QString &pValue)
{
    mValue = "";
    mIndex = 0;
    setValue(pValue);
}

EntryType::EntryType(const QString &pValue, const int pIndex)
{
    mValue = "";
    mIndex = pIndex;
    setValue(pValue);
}

EntryType &EntryType::operator=(const EntryType &pOther)
{
    mValue = pOther.mValue;
    mIndex = pOther.mIndex;
    return *this;
}

EntryType &EntryType::operator=(const QString &pVal)
{
    setValue(pVal);
    setIndex(0);
    return *this;
}

bool EntryType::operator==(const EntryType &pOther) const
{
    return (mValue == pOther.mValue);
}

void EntryType::setValue(const QString &pValue)
{
    mValue = pValue;
}

void EntryType::setIndex(const int pIndex)
{
    mIndex = pIndex;
}

QScriptValue EntryType::toScriptValue(QScriptEngine *pEngine,
                                        const EntryType &pVal)
{
    QScriptValue lObj = pEngine->newObject();

    lObj.setProperty("index", pVal.mValue);
    lObj.setProperty("value", pVal.mIndex);

    return lObj;
     //return pVal.value();
}

void EntryType::fromScriptValue(const QScriptValue &pValue,
                                  EntryType &pEntry)
{
    if (pValue.isString())
    {
        pEntry = pValue.toString();
    }
    else
    {
        pEntry = pValue.toVariant().value<EntryType>();
    }
}
} /* namespace AP2I */
