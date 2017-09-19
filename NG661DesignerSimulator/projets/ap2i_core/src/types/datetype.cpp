/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "datetype.h"
#include <QString>
#include <QDebug>
#include <QScriptEngine>
#include <QScriptContext>


namespace AP2I
{

DateType::DateType()
{
}

DateType::DateType(const QString &pDateExpression)
{
    this->setExpression( pDateExpression);
}

DateType::DateType(const char *pDateExpression)
{
    this->setExpression( QString(pDateExpression));
}

DateType::DateType(const DateType &pDate)
{
    mExpression = pDate.mExpression;
}


DateType::~DateType()
{
}


DateType &DateType::operator=(DateType pDate)
{
    mExpression = pDate.mExpression;
    return *this;
}

DateType &DateType::operator=(const QString &pDateExpression)
{
    *this = DateType(pDateExpression);
    return *this;
}

DateType &DateType::operator=(const char *pDateExpression)
{
    *this = DateType(pDateExpression);
    return *this;
}

// used by QScriptEngine to convert a DateType to a generic QScriptValue
QScriptValue DateType::toScriptValue(QScriptEngine  *,
                                     const DateType &pDate)
{
    return QScriptValue(pDate.expression());
}

// used by QScriptEngine to convert a generic QScriptValue to an DateType
void DateType::fromScriptValue(const QScriptValue &pValue,
                                  DateType &pDate)
{
    if (pValue.isString())
    {
        pDate.setExpression(pValue.toString());
    }
    else
    {
        pDate = pValue.toVariant().value<DateType>();
    }
}

QScriptValue DateType::getDateValue(QScriptContext *pCtx,
                                    QScriptEngine  *)
{

    if (pCtx->argumentCount() == 1)
    {
        DateType lDate;
        fromScriptValue(pCtx->argument(0), lDate);

        return lDate.expression();
    }
    else
    {
        return pCtx->throwError("getDateValue takes only 1 argument : the date.");
    }
}

} /* namespace AP2I */
