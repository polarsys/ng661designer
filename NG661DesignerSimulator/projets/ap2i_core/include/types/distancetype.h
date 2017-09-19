/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef DISTANCETYPE_H
#define DISTANCETYPE_H

#include "doubletype.h"

#include <QScriptValue>

namespace AP2I
{

class DistanceType : public DoubleType
{

public:
    DistanceType();
    DistanceType(const double pValue);

    static QScriptValue toScriptValue(QScriptEngine *pEngine, const DistanceType &pDistance);
    static void fromScriptValue(const QScriptValue &pValue, DistanceType &pDistance);

};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::DistanceType)

#endif // DISTANCETYPE_H
