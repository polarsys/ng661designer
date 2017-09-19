/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef FREQUENCYTYPE_H
#define FREQUENCYTYPE_H

#include "doubletype.h"
#include <QScriptValue>


namespace AP2I
{

class FrequencyType : public DoubleType
{
public:
    FrequencyType();
    FrequencyType(const double pValue);

    static void fromScriptValue(const QScriptValue &pValue, FrequencyType &pFrequency);
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const FrequencyType &pFrequency);

protected:
    bool isValueValid(const double pValue);

};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::FrequencyType)

#endif // FREQUENCYTYPE_H
