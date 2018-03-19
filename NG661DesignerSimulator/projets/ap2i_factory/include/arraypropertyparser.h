/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef ARRAYPROPERTYPARSER_H
#define ARRAYPROPERTYPARSER_H

#include "abstractdigesthandler.h"
#include "entrytype.h"

#include <QVariant>

class QString;

namespace AP2I
{

class Component;
class ParsingContext;

typedef QVariant (*CreateVariantFunc)(const QString &, bool &);

class ArrayPropertyParser : public AbstractDigestHandler
{
public:
    ArrayPropertyParser(ParsingContext &pContext);
    virtual ~ArrayPropertyParser() = default;

    ArrayPropertyParser() = delete;
    ArrayPropertyParser(const ArrayPropertyParser&) = delete;

    void digest(QDomElement &pElement);    
    EntryType parseEntry(QDomElement &pElement, QString pType);
    QVariant parseArrayEntry(QDomElement &pElement, QString pType);

private:
    ParsingContext &mContext;
};

} /* namespace AP2I */

#endif // ARRAYPROPERTYPARSER_H


