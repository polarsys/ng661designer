/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "stippletype.h"
#include "paintstrokecapacities.h"
#include <qdebug.h>

namespace AP2I
{

StippleType::StippleType()
    : StringType()
{
}

StippleType::StippleType(const QString &pValue)
    : StringType(pValue)
{
    getArrayFromValue();
}

StippleType::StippleType(const std::string pValue)
    : StringType(pValue)
{
    getArrayFromValue();
}

StippleType::StippleType(const char * pValue)
    : StringType(pValue)
{
    getArrayFromValue();
}
void StippleType::setValue (std::string pValue)
{
    if (isValueValid(pValue))
    {
        mValue = pValue;
        mDefined = true;
        getArrayFromValue();
    }
    else
    {
        qDebug() << "ERROR: string value " << &pValue << "not valid";
    }
}

void StippleType::setValue(const QString pValue){
    StringType::setValue(pValue);
}

void StippleType::setValue(const char * pValue){
    StringType::setValue(pValue);
}

void StippleType::getArrayFromValue(){
    mArray = PaintStrokeCapacities::getDashPatternArray(QString(getValue().c_str()));
}

/**
 * @brief set a stipple with the value of the script QML
 * @param pValue the script value
 * @param pStipple the stipple
 */
void StippleType::fromScriptValue(const QScriptValue &pValue, StippleType &pStipple)
{
    if (pValue.isString())
    {
        pStipple.setValue(pValue.toString());
    }
}

/**
 * @brief set the stipple value to script QML.
 * @param pEngine the script engine
 * @param pStipple the stipple to set
 * @return the script value.
 */
QScriptValue StippleType::toScriptValue(QScriptEngine *, const StippleType &pStipple)
{
    return QScriptValue(pStipple.getValue().c_str());
}

} /* namespace AP2I */



