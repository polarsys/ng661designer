/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef DATETYPE_H
#define DATETYPE_H

#include <QMetaType>

#include <QScriptValue>

class QString;
class QScriptEngine;
class QScriptContext;

namespace AP2I
{

class DateType
{
public:

    DateType();
    DateType(const QString &pDateExpression);
    DateType(const char *pDateExpression);
    DateType(const DateType &pDate);

    ~DateType();

    DateType &operator=(DateType pDate);
    DateType &operator=(const QString &pDateExpression);
    DateType &operator=(const char *pDateExpression);

    QString expression() const  { return mExpression; }
    void setExpression(QString pExpression) { mExpression = pExpression; }

    static QScriptValue toScriptValue(QScriptEngine *pEngine,
                                      const DateType &pDate);

    static void fromScriptValue(const QScriptValue &pValue,
                                DateType &pDate);

    static QScriptValue getDateValue(QScriptContext *pCtx,
                                     QScriptEngine *pEngine);

private:
    QString mExpression;
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::DateType)

#endif // DATETYPE_H
