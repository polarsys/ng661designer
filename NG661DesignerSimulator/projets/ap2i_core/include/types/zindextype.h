/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef ZINDEX_H
#define ZINDEX_H

#include "integertype.h"


namespace AP2I
{

class ZIndexType : public IntegerType
{
public:
    ZIndexType();
    ZIndexType(const long pValue);

    void setValue(const QString &pValue);
    void setValue(const long pValue);
    double getValue() const { return mZIndex; }

    static void fromScriptValue(const QScriptValue &pValue, ZIndexType &pZIndex);
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const ZIndexType &pZIndex);


protected:
    bool isValueValid(const long pValue);

private:
    long mZIndex;

};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::ZIndexType)

#endif // ZINDEX_H
