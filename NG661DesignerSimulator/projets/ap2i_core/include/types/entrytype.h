/*******************************************************************************
* Copyright (c) 2015, 2016, 2017 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef ENTRYTYPE_H
#define ENTRYTYPE_H

#include <QScriptable>

#include <QString>
#include <QMetaType>
#include <QObject>

#include <QScriptValue>

class QScriptEngine;

namespace AP2I
{

class EntryType
{

//    Q_OBJECT
//    Q_PROPERTY(IntegerType index READ index WRITE setIndex)
//    Q_PROPERTY(StringType value READ value WRITE setValue)

public:
	EntryType();
    EntryType(const QString &pName);
	EntryType(const QString &pName, const int pIndex);	
    virtual ~EntryType() {}

    EntryType &operator=(const EntryType &pOther);
    EntryType &operator=(const QString &pVal);

    bool operator==(const EntryType &pOther) const;

	QString value() const { return mValue; }
    void setValue(const QString &pValue);
	int index() const {return mIndex; }	
    void setIndex(const int pIndex);


	static QScriptValue toScriptValue(QScriptEngine *,
                                      const EntryType &pVal);

    static void fromScriptValue(const QScriptValue &pValue,
                                EntryType &pEnum);
private:	
    QString mValue;
    int mIndex;
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::EntryType)

#endif // ENTRYTYPE_H
