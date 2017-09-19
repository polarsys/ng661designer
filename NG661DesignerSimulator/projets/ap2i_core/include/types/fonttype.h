/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef FONTTYPE_H
#define FONTTYPE_H


#include "stringtype.h"
#include <QScriptValue>


namespace AP2I
{

class FontType : public StringType
{
public:

    FontType();
    FontType(const QString &pValue);
    FontType(const std::string pValue);
    FontType(const char * pValue);

    static void fromScriptValue(const QScriptValue &pValue, FontType &pFont);
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const FontType &pFont);

protected:
    bool isValueValid(const std::string pValue);
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::FontType)

#endif // FONTTYPE_H
