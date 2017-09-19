/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "angletype.h"

namespace AP2I
{

AngleType::AngleType()
    : DoubleType()
{
}

AngleType::AngleType(const double pValue)
    : DoubleType(pValue)
{
}


bool AngleType::isValueValid(const double pValue)
{
    if ((pValue < -360) || (pValue > 360))

        return false;
    else
        return true;
}


QScriptValue AngleType::toScriptValue(QScriptEngine *,
                                        const AngleType &pAngle)
{
    return pAngle.getValue();
}


void AngleType::fromScriptValue(const QScriptValue &pValue,
                                  AngleType &pAngle)
{
    if (pValue.isString())
    {
        pAngle.setValue(pValue.toString());
    }
    else
    {
        pAngle.setValue(pValue.toNumber());
    }
}
} /* namespace AP2I */

