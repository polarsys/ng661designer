/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef INTEGERTYPE_H
#define INTEGERTYPE_H

#include <QMetaType>
#include <QScriptValue>

namespace AP2I
{

class IntegerType
{

public:
    IntegerType();
    IntegerType(const long pValue);
    virtual ~IntegerType() {}

    void setValue(const QString &pValue);
    void setValue(const long pValue);
    long getValue() const { return mValue; }
    bool isDefined() const { return mDefined; }

    IntegerType &operator=(const IntegerType &pOther);
    IntegerType &operator/(const IntegerType &pOther);
    bool operator==(const IntegerType &pOther) const;
    bool operator<(const IntegerType &pOther) const;
    bool operator>(const IntegerType &pOther) const;

    static void fromScriptValue(const QScriptValue &pValue, IntegerType &pInteger);
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const IntegerType &pInteger);

protected:
    bool isValueValid(const long pValue);

private:
    long mValue;
    bool mDefined; // true if value is set by user (not default value)

};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::IntegerType)

#endif // INTEGERTYPE_H
