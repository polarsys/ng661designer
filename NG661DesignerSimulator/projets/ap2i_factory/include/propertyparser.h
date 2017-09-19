/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef PROPERTYPARSER_H
#define PROPERTYPARSER_H

#include "abstractdigesthandler.h"

#include <QVariant>

class QString;

namespace AP2I
{

class Component;
class ParsingContext;

typedef QVariant (*CreateVariantFunc)(const QString &, bool &);

class PropertyParser : public AbstractDigestHandler
{
public:
    PropertyParser(ParsingContext &pContext);
    virtual ~PropertyParser() = default;

    PropertyParser() = delete;
    PropertyParser(const PropertyParser&) = delete;

    void digest(QDomElement &pElement);

private:
    ParsingContext &mContext;
};

} /* namespace AP2I */

#endif // PROPERTYPARSER_H


