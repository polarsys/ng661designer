/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef NAMETYPE_H
#define NAMETYPE_H

#include <QScriptValue>
#include <QMetaType>
#include <Qstring>
#include <string>
#include <QScriptEngine>
#include <QScriptContext>
#include "stringtype.h"

class QString;
class QScriptEngine;
class QScriptContext;

namespace AP2I
{

class NameType : public StringType
{

public:

    NameType();
    NameType(const QString &pValue);
    NameType(const char * pName);
    NameType(const std::string pValue);
    virtual ~NameType() {}

    static QScriptValue toScriptValue(QScriptEngine *pEngine,
                                            const NameType &pName);
    static void fromScriptValue(const QScriptValue &pValue,
                                      NameType &pName);

    bool validateValue( std::string pValue) const;
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::NameType)

#endif // NAMETYPE_H
