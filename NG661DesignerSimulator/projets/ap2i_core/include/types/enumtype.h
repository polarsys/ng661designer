/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef ENUMTYPE_H
#define ENUMTYPE_H

#include <QObject>
#include <QScriptable>

#include <QMap>
#include <QString>
#include <QStringList>
#include <QMetaType>

#include <QScriptValue>

class QScriptEngine;

namespace AP2I
{

class EnumType
{
    struct EnumerationEntry
    {
        QStringList values;
    };

public:
    EnumType(const QString &pName = "");
    EnumType(const EnumType &) = default;
    ~EnumType() = default;

    EnumType &operator=(const EnumType &pOther);
    EnumType &operator=(const QString &pVal);

    bool operator==(const EnumType &pOther) const;
    bool operator<(const EnumType &pOther) const;

    QString value() const { return mValue; }
    void setValue(const QString &pValue);

    static QScriptValue toScriptValue(QScriptEngine *,
                                      const EnumType &pVal);

    static void fromScriptValue(const QScriptValue &pValue,
                                EnumType &pEnum);

    static bool addEnumeration(const QString &pName, QStringList &pValues);
    static const EnumerationEntry &getEnumeration(const QString &pName);

private:
    QString mTypeName;
    const EnumerationEntry &mType;
    QString mValue;

    static QMap<QString, EnumerationEntry> ENUMERATIONS;
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::EnumType)

#endif // ENUMTYPE_H


