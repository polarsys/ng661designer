/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef EXPRESSIONTYPE_H
#define EXPRESSIONTYPE_H


#include <QMetaType>
#include <Qstring>
#include <string>
#include <QScriptValue>


namespace AP2I
{

class ExpressionType : public StringType
{

public:
    ExpressionType();
    ExpressionType(const std::string pExpression);
    ExpressionType(const char * pExpression);
    ExpressionType(const QString &pExpression);
    virtual ~ExpressionType() {}

    bool validateValue( std::string pValue) const;

    /**
     * @brief set an expression with the value of the script QML
     * @param pValue the script value
     * @param pExpression the stipple
     */
    static void fromScriptValue(const QScriptValue &pValue, ExpressionType &pExpression);
    /**
     * @brief set the expression value to script QML.
     * @param pEngine the script engine
     * @param pExpression the expression to set
     * @return the script value.
     */
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const ExpressionType &pExpression);
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::ExpressionType)


#endif // EXPRESSIONTYPE_H
