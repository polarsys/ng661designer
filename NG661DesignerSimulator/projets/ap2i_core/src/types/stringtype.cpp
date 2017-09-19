/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "stringtype.h"
#include "QDebug.h"


namespace AP2I
{

StringType::StringType()
{
    mValue = "";
    mDefined = false;
}


StringType::StringType(const QString &pValue)
{
    mValue = "";
    mDefined = false;
    setValue(pValue);
}


StringType::StringType(const char * pValue)
{
    mValue = "";
    mDefined = false;
    setValue(pValue);
}

StringType::StringType(const std::string pValue)
{
    mValue = "";
    mDefined = false;
    setValue(pValue);
}

StringType &StringType::operator=(const StringType &pOther)
{
    setValue(pOther.getValue());
    return *this;
}

bool StringType::operator==(const StringType &pOther) const
{
    return (mValue == pOther.mValue);
}

bool StringType::operator<(const StringType &pOther) const
{
    return (mValue < pOther.mValue);
}

bool StringType::operator>(const StringType &pOther) const
{
    return (mValue > pOther.mValue);
}

void StringType::setValue(const QString pValue)
{
    setValue(pValue.toStdString());
}


void StringType::setValue (std::string pValue)
{
    if (isValueValid(pValue))
    {
        mValue = pValue;
        mDefined = true;
    }
    else
    {
        qDebug() << "ERROR: string value " << &pValue << "not valid";
    }
}

void StringType::setValue(const char * pValue)
{
    std::string lValue = pValue;
    setValue(lValue);
}

bool StringType::isValueValid(const std::string )
{
    return true;
}


/**
 * @brief set a string with the value of the script QML
 * @param pValue the script value
 * @param pString the string
 */
void StringType::fromScriptValue(const QScriptValue &pValue, StringType &pString)
{
    if (pValue.isString())
    {
        pString.setValue(pValue.toString());
    }
}

/**
 * @brief set the string value to script QML.
 * @param pEngine the script engine
 * @param String the string to set
 * @return the script value.
 */
QScriptValue StringType::toScriptValue(QScriptEngine *, const StringType &pString)
{        
    return QScriptValue(pString.getValue().c_str());
}

} /* namespace AP2I */
