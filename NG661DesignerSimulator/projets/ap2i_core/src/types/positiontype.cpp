/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "positiontype.h"
#include <QScriptEngine>
#include <iostream>

namespace AP2I
{

PositionType::PositionType()
    : DoubleType()
{
}

PositionType::PositionType(const double pValue)
    : DoubleType(pValue)
{
}

QScriptValue PositionType::toScriptValue(QScriptEngine *,
                                        const PositionType &pPosition)
{
    return pPosition.getValue();
}


void PositionType::fromScriptValue(const QScriptValue &pValue,
                                  PositionType &pPosition)
{
    if (pValue.isString())
    {
        pPosition.setValue(pValue.toString());
    }
    else
    {
        pPosition.setValue(pValue.toNumber());
    }
}

} /* namespace AP2I */
