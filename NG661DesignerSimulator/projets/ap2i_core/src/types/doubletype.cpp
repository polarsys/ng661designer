/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "doubletype.h"
#include "QDebug.h"
#include <QMetaObject>

namespace AP2I
{

DoubleType::DoubleType()
{
    mValue = 0;
    mDefined = false;
}

DoubleType::DoubleType(const double pValue)
{
    mDefined = false;
    setValue(pValue);
}

DoubleType &DoubleType::operator=(const DoubleType &pOther)
{
    setValue(pOther.getValue());
    return *this;
}

/*
DoubleType &DoubleType::operator/(const DoubleType &pOther)
{
    if (pOther.getValue() == 0.0)
    {
        qDebug() << "ERROR: DoubleType division by 0";
        return *this;
    }
    else
    {
        // LNO TBC : attention à la gestion mémoire
        return * (new DoubleType(mValue / pOther.getValue()));
    }
}
*/

bool DoubleType::operator==(const DoubleType &pOther) const
{
    return (mValue == pOther.mValue);
}

bool DoubleType::operator<(const DoubleType &pOther) const
{
    return (mValue < pOther.mValue);
}

bool DoubleType::operator>(const DoubleType &pOther) const
{
    return (mValue > pOther.mValue);
}

void DoubleType::setValue(const QString &pValue)
{
    bool lStatus;
    double lResult;

    lResult = pValue.toDouble(&lStatus);
    if (lStatus)
    {
        setValue(lResult);
    }
    else
    {
        qDebug() << "ERROR: value " << pValue << "can not be interpreted as double";
    }
}

void DoubleType::setValue(const double pValue)
{
    if (isValueValid(pValue))
    {
        mValue = pValue;
        mDefined = true;
    }
    else
    {
        qDebug() << "ERROR: double value" << pValue << "not valid";
    }
}

bool DoubleType::isValueValid(const double )
{
    return true;
}

QScriptValue DoubleType::toScriptValue(QScriptEngine *,
                                        const DoubleType &pDouble)
{
     return pDouble.getValue();
}


void DoubleType::fromScriptValue(const QScriptValue &pValue,
                                  DoubleType &pDouble)
{
    if (pValue.isString())
    {
        pDouble.setValue(pValue.toString());
    }
    else
    {
        pDouble.setValue(pValue.toNumber());
    }
}


} /* namespace AP2I */

