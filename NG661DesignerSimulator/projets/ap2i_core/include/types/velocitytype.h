/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef VELOCITYTYPE_H
#define VELOCITYTYPE_H

#include "doubletype.h"
#include <QScriptValue>


namespace AP2I
{

class VelocityType : public DoubleType
{
public:
    VelocityType();
    VelocityType(const double pValue);

    /**
     * @brief set a velocity with the value of the script QML
     * @param pValue the script value
     * @param pVelocity the velocity
     */
    static void fromScriptValue(const QScriptValue &pValue, VelocityType &pVelocity);

    /**
     * @brief set the velocity value to script QML.
     * @param pEngine the script engine
     * @param pVelocity the velocity to set
     * @return the script value.
     */
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const VelocityType &pVelocity);

protected:
    bool isValueValid(const double pValue);

};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::VelocityType)

#endif // VELOCITYTYPE_H
