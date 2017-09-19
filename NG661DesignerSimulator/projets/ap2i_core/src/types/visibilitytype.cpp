/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "visibilitytype.h"

namespace AP2I
{

VisibilityType::VisibilityType()
    : StringType()
{
    mValueEnum = Visibility::visible;
}

VisibilityType::VisibilityType(const QString &pValue)
{
    bool lIsSetted = setEnumValue(pValue.toStdString());
    if(lIsSetted)
        setValue(pValue);
}

VisibilityType::VisibilityType(const std::string pValue)
{
    bool lIsSetted = setEnumValue(pValue);
    if(lIsSetted)
        setValue(pValue);
}

VisibilityType::VisibilityType(const char * pValue)
{
    bool lIsSetted = setEnumValue(pValue);
    if(lIsSetted)
        setValue(pValue);
}

bool VisibilityType::setEnumValue(const std::string pValue){
    if(pValue.compare("visible") == 0){
        mValueEnum = Visibility::visible;
    }
    else if(pValue.compare("collapse") == 0){
        mValueEnum = Visibility::collapse;
    }
    else if(pValue.compare("hidden") == 0){
        mValueEnum = Visibility::hidden;
    }
    else{
        return false;
    }

    return true;
}

void VisibilityType::setValue(const QString pValue){
    bool lIsSetted = setEnumValue(pValue.toLatin1().data());
    if(lIsSetted)
        StringType::setValue( pValue);

}

void VisibilityType::setValue(std::string pValue){
    bool lIsSetted = setEnumValue(pValue);
    if(lIsSetted)
        StringType::setValue(pValue);
}

void VisibilityType::setValue(const char * pValue){
    bool lIsSetted = setEnumValue(pValue);
    if(lIsSetted)
        StringType::setValue(pValue);
}

VisibilityType::Visibility VisibilityType::value(){
    return mValueEnum;
}

bool VisibilityType::isValueValid(const std::string )
{
    return true;
}


QScriptValue VisibilityType::toScriptValue(QScriptEngine *,
                                        const VisibilityType &pVisibility)
{
    return QScriptValue(pVisibility.getValue().c_str());
}

// used by QScriptEngine to convert a generic QScriptValue to an ColorType
// it allows to set color properties in scripts by giving another color property :
//      Representation.rect1.fillColor = Representation.rect2.fillColor
// or to set the color directly by giving the its name :
//      Representation.rect1.fillColor = "red";
//      Representation.rect1.fillColor = "#FFFF0000";
void VisibilityType::fromScriptValue(const QScriptValue &pValue,
                                  VisibilityType &pVisibility)
{
    if (pValue.isString())
    {
        pVisibility.setValue(pValue.toString());
    }
}

} /* namespace AP2I */

