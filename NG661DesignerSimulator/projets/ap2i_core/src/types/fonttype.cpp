/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "fonttype.h"

namespace AP2I
{

FontType::FontType()
    : StringType()
{
}

FontType::FontType(const QString &pValue)
    : StringType(pValue)
{
}

FontType::FontType(const std::string pValue)
    : StringType(pValue)
{
}

FontType::FontType(const char * pValue)
    : StringType(pValue)
{
}

bool FontType::isValueValid(const std::string )
{
    return true;
}


QScriptValue FontType::toScriptValue(QScriptEngine *,
                                        const FontType &pFont)
{
    return QScriptValue(pFont.getValue().c_str());
}


void FontType::fromScriptValue(const QScriptValue &pValue,
                                  FontType &pFont)
{
    if (pValue.isString())
    {
        pFont.setValue(pValue.toString());
    }
}
} /* namespace AP2I */


