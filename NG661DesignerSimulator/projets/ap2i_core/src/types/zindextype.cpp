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
#include "zindextype.h"

namespace AP2I
{

ZIndexType::ZIndexType()
    : IntegerType()
{
    mZIndex = 0.0;
}

ZIndexType::ZIndexType(const long pValue)
    : IntegerType(pValue)
{
    if (isValueValid(pValue))
    {
        mZIndex = pValue;
    }
    else
    {
        mZIndex = 0.0;
        qDebug() << "ERROR: Zindex value " << pValue << "not valid";
    }
}

void ZIndexType::setValue(const QString &pValue)
{
    bool lStatus;
    long lResult;

    lResult = pValue.toLong(&lStatus);
    if (lStatus)
    {
        setValue(lResult);
    }
    else
    {
        qDebug() << "ERROR: value " << pValue << "can not be interpreted as Zindex";
    }
}

void ZIndexType::setValue(const long pValue)
{
    if (isValueValid(pValue))
    {
        mZIndex = pValue;
    }
    else
    {
        qDebug() << "ERROR: Zindex value " << pValue << "not valid";
    }
}


bool ZIndexType::isValueValid(const long pValue)
{
    if ((pValue < -32768) || (pValue > 32767))
        return false;
    else
        return true;
}


QScriptValue ZIndexType::toScriptValue(QScriptEngine *,
                                        const ZIndexType &pZIndex)
{
    return QScriptValue(pZIndex.getValue());
}


void ZIndexType::fromScriptValue(const QScriptValue &pValue,
                                  ZIndexType &pZIndex)
{
    if (pValue.isString())
    {
        pZIndex.setValue(pValue.toString());
    }
    else
    {
        pZIndex.setValue(pValue.toNumber());
    }
}


} /* namespace AP2I */
