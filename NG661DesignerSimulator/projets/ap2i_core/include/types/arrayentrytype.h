/*******************************************************************************
* Copyright (c) 2015, 2016, 2017 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef ARRAYENTRYTYPE_H
#define ARRAYENTRYTYPE_H

#include <QScriptable>

#include <QString>
#include <QMetaType>

#include <QScriptValue>
#include "entrytype.h"

class QScriptEngine;

namespace AP2I
{

class ArrayEntryType
{
public:
    //Q_OBJECT
    //Q_PROPERTY(QList<QVariant> values READ values WRITE setValues)

    ArrayEntryType();
	ArrayEntryType(const int pIndex, const int pNumberOfEntries, const int pMaxNumberOfEntries);	
    virtual ~ArrayEntryType() {}

    ArrayEntryType &operator=(const ArrayEntryType &pOther);    

    bool operator==(const ArrayEntryType &pOther) const;
	
	int index() const {return mIndex; }	
    void setIndex(const int pIndex);
	int numberOfEntries() const {return mNumberOfEntries; }	
    void setNumberOfEntries(const int pNumberOfEntries);
	int maxNumberOfEntries() const {return mMaxNumberOfEntries; }	
    void setMaxNumberOfEntries(const int pMaxNumberOfEntries);
    QList<EntryType> values() const {return mValues;}
    void addValue(EntryType pValue);


	static QScriptValue toScriptValue(QScriptEngine *,
                                      const ArrayEntryType &pVal);

    static void fromScriptValue(const QScriptValue &pValue,
                                ArrayEntryType &pEnum);
private:	    
    int mIndex;
	int mNumberOfEntries;
	int mMaxNumberOfEntries;
    QList<EntryType> mValues;
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::ArrayEntryType)

#endif // ARRAYENTRYTYPE_H
