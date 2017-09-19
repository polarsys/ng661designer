/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef IMPORTPARSER_H
#define IMPORTPARSER_H

#include "abstractdigesthandler.h"

namespace AP2I
{

class ParsingContext;

class ImportParser : public AbstractDigestHandler
{
public:
    ImportParser(ParsingContext &pContext);
    virtual ~ImportParser() = default;

    ImportParser() = delete;
    ImportParser(const ImportParser &) = delete;

    void digest(QDomElement &pElement);

private:
    ParsingContext &mContext;
};

} /* namespace AP2I */

#endif // IMPORTPARSER_H


