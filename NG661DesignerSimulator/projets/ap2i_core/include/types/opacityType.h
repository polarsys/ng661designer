/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef OPACITYTYPE_H
#define OPACITYTYPE_H

#include "doubletype.h"


namespace AP2I
{

class OpacityType : public DoubleType
{
public:
    OpacityType();
    OpacityType(const double pValue);

    void setValue(const QString &pValue);
    void setValue(const double pValue);
    double getValue() const { return mOpacity; }

    static void fromScriptValue(const QScriptValue &pValue, OpacityType &pOpacity);
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const OpacityType &pOpacity);


protected:
    bool isValueValid(const double pValue);

private:
    double mOpacity;

};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::OpacityType)

#endif // OPACITYTYPE_H
