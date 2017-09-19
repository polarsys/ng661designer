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
#include "nametype.h"
#include "QDebug.h"


namespace AP2I
{

NameType::NameType()
    : StringType()
{
}

NameType::NameType(const char * pValue)
    : StringType( pValue)
{
}

NameType::NameType(const QString &pValue)
    : StringType( pValue)
{
}

NameType::NameType(const std::string pValue)
    : StringType( pValue)
{
}

/**
 * Validate a value from expression.
 * @brief NameType::validateValue
 * @param pValue
 * @return TRUE if value espect the expression.
 */
bool NameType::validateValue( std::string ) const
{
    return true;
}

QScriptValue NameType::toScriptValue(QScriptEngine *,
                                        const NameType &pName)
{
    return  QScriptValue(pName.getValue().c_str());
}


void NameType::fromScriptValue(const QScriptValue &pValue,
                                  NameType &pName)
{
    if (pValue.isString())
    {
        pName.setValue(pValue.toString());
    }
    else
    {
        pName = pValue.toVariant().value<NameType>();
    }
}

} /* namespace AP2I */


