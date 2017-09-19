/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "alignementtype.h"

namespace AP2I
{

AlignementType::AlignementType()
    : StringType()
{
    mValueEnum = Alignement::notDefined;
}

AlignementType::AlignementType(const QString &pValue)
{
    bool lIsSetted = setEnumValue(pValue.toStdString());
    if(lIsSetted)
        setValue(pValue);
}

AlignementType::AlignementType(const std::string pValue)
{
    bool lIsSetted = setEnumValue(pValue);
    if(lIsSetted)
        setValue(pValue);
}

AlignementType::AlignementType(const char * pValue)
{
    bool lIsSetted = setEnumValue(pValue);
    if(lIsSetted)
        setValue(pValue);
}

bool AlignementType::setEnumValue(const std::string pValue){
    if(pValue.compare("topLeft") == 0){
        mValueEnum = Alignement::topLeft;
    }
    else if(pValue.compare("topCenter") == 0){
        mValueEnum = Alignement::topCenter;
    }
    else if(pValue.compare("topRight") == 0){
        mValueEnum = Alignement::topRight;
    }
    else if(pValue.compare("centerLeft") == 0){
        mValueEnum = Alignement::centerLeft;
    }
    else if(pValue.compare("center") == 0){
        mValueEnum = Alignement::center;
    }
    else if(pValue.compare("centerRight") == 0){
        mValueEnum = Alignement::centerRight;
    }
    else if(pValue.compare("bottomLeft") == 0){
        mValueEnum = Alignement::bottomLeft;
    }
    else if(pValue.compare("bottomRight") == 0){
        mValueEnum = Alignement::bottomRight;
    }
    else if(pValue.compare("bottomCenter") == 0){
        mValueEnum = Alignement::bottomCenter;
    }
    else if(pValue.compare("leftOnly") == 0){
        mValueEnum = Alignement::leftOnly;
    }
    else if(pValue.compare("rightOnly") == 0){
        mValueEnum = Alignement::rightOnly;
    }
    else if(pValue.compare("centerOnly") == 0){
        mValueEnum = Alignement::centerOnly;
    }
    else{
        return false;
    }

    return true;
}

void AlignementType::setValue(const QString pValue){
    bool lIsSetted = setEnumValue(pValue.toLatin1().data());
    if(lIsSetted)
        StringType::setValue( pValue);

}

void AlignementType::setValue(std::string pValue){
    bool lIsSetted = setEnumValue(pValue);
    if(lIsSetted)
        StringType::setValue(pValue);
}

void AlignementType::setValue(const char * pValue){
    bool lIsSetted = setEnumValue(pValue);
    if(lIsSetted)
        StringType::setValue(pValue);
}

AlignementType::Alignement AlignementType::value(){
    return mValueEnum;
}

bool AlignementType::isValueValid(const std::string )
{
    return true;
}


QScriptValue AlignementType::toScriptValue(QScriptEngine *,
                                        const AlignementType &pAlignement)
{
    return QScriptValue(pAlignement.getValue().c_str());
}


void AlignementType::fromScriptValue(const QScriptValue &pValue,
                                  AlignementType &pAlignement)
{
    if (pValue.isString())
    {
        pAlignement.setValue(pValue.toString());
    }
}
} /* namespace AP2I */

