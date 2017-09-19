/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef TYPETYPE_H
#define TYPETYPE_H

#include "stringtype.h"
#include <QScriptValue>

namespace AP2I
{

class TypeType : public StringType
{
public:
    TypeType();
    TypeType(const QString &pId);
    TypeType(const char *pId);
    TypeType(const TypeType &pType);

    ~TypeType();

    /**
     * @brief set a type with the value of the script QML
     * @param pValue the script value
     * @param pType the type
     */
    static void fromScriptValue(const QScriptValue &pValue, TypeType &pType);
    /**
     * @brief set the type value to script QML.
     * @param pEngine the script engine
     * @param Type the type to set
     * @return the script value.
     */
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const TypeType &pType);

protected:
    bool isValueValid(const std::string pValue);
};
} /* namespace AP2I */
Q_DECLARE_METATYPE(AP2I::TypeType)

#endif // TYPETYPE_H
