/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "distancetype.h"
#include <QScriptEngine>

#include <iostream>

namespace AP2I
{

DistanceType::DistanceType()
    : DoubleType()
{
}

DistanceType::DistanceType(const double pValue)
    : DoubleType(pValue)
{
}

QScriptValue DistanceType::toScriptValue(QScriptEngine *,
                                        const DistanceType &pDistance)
{
     return pDistance.getValue();
}


void DistanceType::fromScriptValue(const QScriptValue &pValue,
                                  DistanceType &pDistance)
{
    if (pValue.isString())
    {
        pDistance.setValue(pValue.toString());
    }
    else
    {
        pDistance.setValue(pValue.toNumber());
    }
}

} /* namespace AP2I */
