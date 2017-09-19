/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef BOOLEANTYPE_H
#define BOOLEANTYPE_H


#include "stringtype.h"
#include <QScriptValue>


namespace AP2I
{

class BooleanType : public StringType
{
public:

    BooleanType();
    BooleanType(const QString &pValue);
    BooleanType(const std::string pValue);
    BooleanType(const char * pValue);
    BooleanType(const bool pValue);

    virtual void setValue(const QString pValue);
    virtual void setValue(std::string pValue);
    virtual void setValue(const char * pValue);
    bool value();

    static void fromScriptValue(const QScriptValue &pValue, BooleanType &pBoolean);
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const BooleanType &pBoolean);

protected:
    bool isValueValid(const std::string pValue);
    bool setBooleanValue(const std::string pValue);

    bool mBooleanValue;
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::BooleanType)

#endif // BOOLEANTYPE_H
