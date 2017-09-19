/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "typetype.h"
#include <QString>
#include <QDebug>
#include <QScriptEngine>
#include <QScriptContext>

namespace AP2I
{

TypeType::TypeType()
{
}

TypeType::TypeType(const QString &pType)
   : StringType(pType)
{
}

TypeType::TypeType(const char *pType)
    : StringType(pType)
{
}

TypeType::TypeType(const TypeType &pType)
    : StringType(pType)
{
}

TypeType::~TypeType()
{
}

bool TypeType::isValueValid(const std::string pValue)
{
    std::size_t found = pValue.find_last_of(".");
    if( found == std::string::npos)
        return false;
    else if( found != 0)
        return false;


    std::string lType = pValue.substr(found + 1, pValue.length());
    std::transform(lType.begin(), lType.end(),lType.begin(), ::toupper);

    found = pValue.find_last_of("TYPE");
    if( found == std::string::npos)
        return false;
    else if( found != (lType.length() - 3))
        return false;

    return true;
}

/**
 * @brief set a type with the value of the script QML
 * @param pValue the script value
 * @param pType the type
 */
void TypeType::fromScriptValue(const QScriptValue &pValue, TypeType &pType)
{
    if (pValue.isString())
    {
        pType.setValue(pValue.toString());
    }
}

/**
 * @brief set the type value to script QML.
 * @param pEngine the script engine
 * @param pType the type to set
 * @return the script value.
 */
QScriptValue TypeType::toScriptValue(QScriptEngine *, const TypeType &pType)
{
    return QScriptValue(pType.getValue().c_str());
}

} /* namespace AP2I */
