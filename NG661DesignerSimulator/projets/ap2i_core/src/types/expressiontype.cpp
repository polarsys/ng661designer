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
#include "expressiontype.h"
#include "QDebug.h"


namespace AP2I
{

ExpressionType::ExpressionType()
    : StringType()
{
}

ExpressionType::ExpressionType(const QString &pValue)
    : StringType( pValue)
{
}


ExpressionType::ExpressionType(const char * pValue)
    : StringType( pValue)
{
}

ExpressionType::ExpressionType(const std::string pValue)
    : StringType( pValue)
{
}

/**
 * Validate a value from expression.
 * @brief ExpressionType::validateValue
 * @param pValue
 * @return TRUE if value espect the expression.
 */
bool ExpressionType::validateValue( std::string ) const
{
    return true;
}

QScriptValue ExpressionType::toScriptValue(QScriptEngine *,
                                        const ExpressionType &pExpression)
{
    return QScriptValue(pExpression.getValue().c_str());
}

void ExpressionType::fromScriptValue(const QScriptValue &pValue,
                                  ExpressionType &pExpression)
{
    if (pValue.isString())
    {
        pExpression.setValue(pValue.toString());
    }
}

} /* namespace AP2I */

