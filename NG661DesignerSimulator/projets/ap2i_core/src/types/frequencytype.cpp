/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "frequencytype.h"

namespace AP2I
{

FrequencyType::FrequencyType()
    : DoubleType()
{
}

FrequencyType::FrequencyType(const double pValue)
    : DoubleType(pValue)
{
}


bool FrequencyType::isValueValid(const double pValue)
{
    if ((pValue < 0) || (pValue > 1000))

        return false;
    else
        return true;
}


QScriptValue FrequencyType::toScriptValue(QScriptEngine *,
                                        const FrequencyType &pFrequency)
{
    return pFrequency.getValue();
}


void FrequencyType::fromScriptValue(const QScriptValue &pValue,
                                  FrequencyType &pFrequency)
{
    if (pValue.isString())
    {
        pFrequency.setValue(pValue.toString());
    }
    else
    {
        pFrequency.setValue(pValue.toNumber());
    }
}
} /* namespace AP2I */

