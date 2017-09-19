/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "booleantype.h"

namespace AP2I
{

BooleanType::BooleanType()
    : StringType()
{
}

BooleanType::BooleanType(const QString &pValue)
{
    bool lIsSetted = setBooleanValue(pValue.toStdString());
    if(lIsSetted)
        setValue(pValue);
}

BooleanType::BooleanType(const std::string pValue)
{
    bool lIsSetted = setBooleanValue(pValue);
    if(lIsSetted)
        setValue(pValue);
}

BooleanType::BooleanType(const char * pValue)
{
    bool lIsSetted = setBooleanValue(pValue);
    if(lIsSetted)
        setValue(pValue);
}

BooleanType::BooleanType(const bool pValue)
{
    mBooleanValue = pValue;
    if(mBooleanValue)
        setValue("TRUE");
    else
        setValue("FALSE");
}

bool BooleanType::setBooleanValue(const std::string pValue){

    std::string lValue = pValue;
    std::transform(lValue.begin(), lValue.end(),lValue.begin(), ::toupper);

    if(lValue.compare("TRUE") == 0){
        mBooleanValue = true;
    }
    else if(lValue.compare("FALSE") == 0){
        mBooleanValue = false;
    }
    else if(lValue.compare("YES") == 0){
        mBooleanValue = true;
    }
    else if(lValue.compare("NO") == 0){
        mBooleanValue = false;
    }
    else{
        mBooleanValue = false;
    }

    return true;
}

void BooleanType::setValue(const QString pValue){
    bool lIsSetted = setBooleanValue(pValue.toLatin1().data());
    if(lIsSetted)
        StringType::setValue( pValue);

}

void BooleanType::setValue(std::string pValue){
    bool lIsSetted = setBooleanValue(pValue);
    if(lIsSetted)
        StringType::setValue(pValue);
}

void BooleanType::setValue(const char * pValue){
    bool lIsSetted = setBooleanValue(pValue);
    if(lIsSetted)
        StringType::setValue(pValue);
}

bool BooleanType::value(){
    return mBooleanValue;
}

bool BooleanType::isValueValid(const std::string )
{
    return true;
}


QScriptValue BooleanType::toScriptValue(QScriptEngine *,
                                        const BooleanType &pBoolean)
{
    return QScriptValue(pBoolean.getValue().c_str());
}

void BooleanType::fromScriptValue(const QScriptValue &pValue,
                                  BooleanType &pBoolean)
{
    if (pValue.isString())
    {
        pBoolean.setValue(pValue.toString());
    }
}
} /* namespace AP2I */

