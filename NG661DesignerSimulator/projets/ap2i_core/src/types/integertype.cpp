/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include <QScriptValue>
#include "integertype.h"
#include "QDebug.h"


namespace AP2I
{

IntegerType::IntegerType()
{
    mValue = 0;
    mDefined = false;
}

IntegerType::IntegerType(const long pValue)
{
    mDefined = false;
    setValue(pValue);
}

IntegerType &IntegerType::operator=(const IntegerType &pOther)
{
    setValue(pOther.getValue());
    return *this;
}

bool IntegerType::operator==(const IntegerType &pOther) const
{
    return (mValue == pOther.mValue);
}

bool IntegerType::operator<(const IntegerType &pOther) const
{
    return (mValue < pOther.mValue);
}

bool IntegerType::operator>(const IntegerType &pOther) const
{
    return (mValue > pOther.mValue);
}

void IntegerType::setValue(const QString &pValue)
{
    bool lStatus;
    double lResult;

    lResult = pValue.toLong(&lStatus);
    if (lStatus)
    {
        setValue(lResult);
    }
    else
    {
        qDebug() << "ERROR: value " << pValue << "can not be interpreted as long";
    }
}

void IntegerType::setValue(const long pValue)
{
    if (isValueValid(pValue))
    {
        mValue = pValue;
        mDefined = true;
    }
    else
    {
        qDebug() << "ERROR: long value " << pValue << "not valid";
    }
}

bool IntegerType::isValueValid(const long )
{
    return true;
}

QScriptValue IntegerType::toScriptValue(QScriptEngine *,
                                        const IntegerType &pInteger)
{
    return QScriptValue((double)pInteger.getValue());
}


void IntegerType::fromScriptValue(const QScriptValue &pValue,
                                  IntegerType &pInteger)
{
    if (pValue.isString())
    {
        pInteger.setValue(pValue.toString());
    }
    else
    {
        pInteger.setValue(pValue.toNumber());
    }
}


} /* namespace AP2I */
