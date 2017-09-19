/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef IDTYPE_H
#define IDTYPE_H

#include "basicitem.h"

namespace AP2I
{
class IdType
{
public:
    IdType();
    IdType(const QString &pId);
    IdType(const char *pId);
    IdType(const IdType &pId);

    ~IdType();

    IdType &operator=(IdType pId);
    IdType &operator=(const QString &pId);
    IdType &operator=(const char *pId);

    QString id()   { return mId; }
    void setId(QString pId) { mId = pId; }

    static QScriptValue toScriptValue(QScriptEngine *pEngine,
                                      const IdType &pId);

    static void fromScriptValue(const QScriptValue &pValue,
                                IdType &pId);

    static QScriptValue getTypeValue(QScriptContext *pCtx,
                                     QScriptEngine *pEngine);

private:
    QString mId;
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::IdType)

#endif // IDTYPE_H
