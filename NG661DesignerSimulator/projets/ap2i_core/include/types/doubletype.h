/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef DOUBLETYPE_H
#define DOUBLETYPE_H

#include <QMetaType>
#include <QScriptValue>


namespace AP2I
{

class DoubleType
{

public:
    DoubleType();
    DoubleType(const double pValue);
    virtual ~DoubleType() {}

    void setValue(const QString &pValue);
    void setValue(const double pValue);
    double getValue() const { return mValue; }
    bool isDefined() const { return mDefined; }

    DoubleType &operator=(const DoubleType &pOther);
    DoubleType &operator/(const DoubleType &pOther);
    bool operator==(const DoubleType &pOther) const;
    bool operator<(const DoubleType &pOther) const;
    bool operator>(const DoubleType &pOther) const;

    static QScriptValue toScriptValue(QScriptEngine *pEngine, const DoubleType &pDouble);
    static void fromScriptValue(const QScriptValue &pValue, DoubleType &pDouble);

protected:
    virtual bool isValueValid(const double pValue);

private:
    double mValue;
    bool mDefined; // true if value is set by user (not default value)
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::DoubleType)

#endif // DOUBLETYPE_H
