/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "aspectratiotype.h"

namespace AP2I
{

AspectRatioType::AspectRatioType()
    : StringType()
{
    mValueEnum = AspectRatio::none;
}

AspectRatioType::AspectRatioType(const QString &pValue)
{
    bool lIsSetted = setEnumValue(pValue.toStdString());
    if(lIsSetted)
        setValue(pValue);
}

AspectRatioType::AspectRatioType(const std::string pValue)
{
    bool lIsSetted = setEnumValue(pValue);
    if(lIsSetted)
        setValue(pValue);
}

AspectRatioType::AspectRatioType(const char * pValue)
{
    bool lIsSetted = setEnumValue(pValue);
    if(lIsSetted)
        setValue(pValue);
}

bool AspectRatioType::setEnumValue(const std::string pValue){
    if(pValue.compare("none") == 0){
        mValueEnum = AspectRatio::none;
    }
    else if(pValue.compare("meet") == 0){
        mValueEnum = AspectRatio::meet;
    }
    else if(pValue.compare("slice") == 0){
        mValueEnum = AspectRatio::slice;
    }
    else{
        return false;
    }

    return true;
}

void AspectRatioType::setValue(const QString pValue){
    bool lIsSetted = setEnumValue(pValue.toLatin1().data());
    if(lIsSetted)
        StringType::setValue( pValue);

}

void AspectRatioType::setValue(std::string pValue){
    bool lIsSetted = setEnumValue(pValue);
    if(lIsSetted)
        StringType::setValue(pValue);
}

void AspectRatioType::setValue(const char * pValue){
    bool lIsSetted = setEnumValue(pValue);
    if(lIsSetted)
        StringType::setValue(pValue);
}

AspectRatioType::AspectRatio AspectRatioType::value(){
    return mValueEnum;
}

bool AspectRatioType::isValueValid(const std::string )
{
    return true;
}


QScriptValue AspectRatioType::toScriptValue(QScriptEngine *,
                                        const AspectRatioType &pAspectRatio)
{
    return QScriptValue(pAspectRatio.getValue().c_str());
}

void AspectRatioType::fromScriptValue(const QScriptValue &pValue,
                                  AspectRatioType &pAspectRatio)
{
    if (pValue.isString())
    {
        pAspectRatio.setValue(pValue.toString());
    }
}
} /* namespace AP2I */

