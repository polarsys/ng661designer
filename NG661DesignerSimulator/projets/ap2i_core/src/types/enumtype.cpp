/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "enumtype.h"

#include <QDebug>
#include <QScriptEngine>

namespace AP2I
{

QMap<QString, EnumType::EnumerationEntry> EnumType::ENUMERATIONS =
{
    {"", EnumType::EnumerationEntry() }
};

EnumType::EnumType(const QString &pName)
    : mTypeName(pName),
      mType(getEnumeration(pName)),
      mValue("")
{
}

EnumType &EnumType::operator=(const EnumType &pOther)
{
    if (&pOther == this)
        return *this;
    if (&pOther.mType == &mType)
        setValue(pOther.value());
    else
        qDebug() << "ERROR: cannot assign " << pOther.mTypeName << " to "
                 << mTypeName;
    return *this;
}

EnumType &EnumType::operator=(const QString &pVal)
{
    setValue(pVal);
    return *this;
}


bool EnumType::operator==(const EnumType &pOther) const
{
    return (mValue == pOther.mValue);
}

bool EnumType::operator<(const EnumType &pOther) const
{
    return (mValue < pOther.mValue);
}

void EnumType::setValue(const QString &pValue)
{
    if (mType.values.contains(pValue))
    {
        mValue = pValue;
    }
    else
    {
        qDebug() << "ERROR: value " << pValue << "doesn't exist for Enum " << mTypeName;
    }
}

bool EnumType::addEnumeration(const QString &pName, QStringList &pValues)
{
    bool lReturnValue = true;

    if (ENUMERATIONS.contains(pName))
    {
        // already exists
        lReturnValue = false;
    }
    else
    {
        ENUMERATIONS.insert(pName, { pValues });
    }
    return lReturnValue;
}

const EnumType::EnumerationEntry &EnumType::getEnumeration(const QString &pName)
{
    if (ENUMERATIONS.contains(pName))
        return ENUMERATIONS[pName];
    return ENUMERATIONS[""];
}

QScriptValue EnumType::toScriptValue(QScriptEngine */*pEngine*/,
                                        const EnumType &pVal)
{
     return pVal.value();
}

void EnumType::fromScriptValue(const QScriptValue &pValue,
                                  EnumType &pEnum)
{
    if (pValue.isString())
    {
        pEnum = pValue.toString();
    }
    else
    {
        pEnum = pValue.toVariant().value<EnumType>();
    }
}

} /* namespace AP2I */
