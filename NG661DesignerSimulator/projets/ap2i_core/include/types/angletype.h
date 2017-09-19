/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef ANGLETYPE_H
#define ANGLETYPE_H

#include "doubletype.h"
#include <QScriptValue>


namespace AP2I
{

class AngleType : public DoubleType
{
public:
    AngleType();
    AngleType(const double pValue);

    static void fromScriptValue(const QScriptValue &pValue, AngleType &pAngle);
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const AngleType &pAngle);

protected:
    bool isValueValid(const double pValue);

};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::AngleType)

#endif // ANGLETYPE_H
