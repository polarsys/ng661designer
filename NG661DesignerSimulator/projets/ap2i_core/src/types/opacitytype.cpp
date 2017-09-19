/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include <QString>
#include <QDebug>
#include <QScriptValue>
#include "opacitytype.h"

namespace AP2I
{

OpacityType::OpacityType()
    : DoubleType()
{
    mOpacity = 0.0;
}

OpacityType::OpacityType(const double pValue)
    : DoubleType(pValue)
{
    if (isValueValid(pValue))
    {
        mOpacity = pValue;
    }
    else
    {
        mOpacity = 0.0;
        qDebug() << "ERROR: opacity value " << pValue << "not valid";
    }
}

void OpacityType::setValue(const QString &pValue)
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
        qDebug() << "ERROR: value " << pValue << "can not be interpreted as opacity";
    }
}

void OpacityType::setValue(const double pValue)
{
    if (isValueValid(pValue))
    {
        mOpacity = pValue;
    }
    else
    {
        qDebug() << "ERROR: opacity value " << pValue << "not valid";
    }
}


bool OpacityType::isValueValid(const double pValue)
{
    if ((pValue < 0.0) || (pValue > 1.0))
        return false;
    else
        return true;
}


QScriptValue OpacityType::toScriptValue(QScriptEngine *,
                                        const OpacityType &pOpacity)
{
    return QScriptValue(pOpacity.getValue());
}


void OpacityType::fromScriptValue(const QScriptValue &pValue,
                                  OpacityType &pOpacity)
{
    if (pValue.isString())
    {
        pOpacity.setValue(pValue.toString());
    }
    else
    {
        pOpacity.setValue(pValue.toNumber());
    }
}


} /* namespace AP2I */
