/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "velocitytype.h"
#include <math.h>

namespace AP2I
{

VelocityType::VelocityType()
    : DoubleType()
{
}

VelocityType::VelocityType(const double pValue)
    : DoubleType(pValue)
{
}


bool VelocityType::isValueValid(const double pValue)
{
    if ((pValue < 0) || (pValue > 3*exp(11)))

        return false;
    else
        return true;
}

/**
 * @brief set a velocity with the value of the script QML
 * @param pValue the script value
 * @param pVelocity the velocity
 */
void VelocityType::fromScriptValue(const QScriptValue &pValue, VelocityType &pVelocity)
{
    if (pValue.isString())
    {
        pVelocity.setValue(pValue.toString());
    }
}

/**
 * @brief set the velocity value to script QML.
 * @param pEngine the script engine
 * @param pVelocity the velocity to set
 * @return the script value.
 */
QScriptValue VelocityType::toScriptValue(QScriptEngine *, const VelocityType &pVelocity)
{
    return QScriptValue(pVelocity.getValue());
}

} /* namespace AP2I */


