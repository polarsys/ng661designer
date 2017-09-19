/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef ENUMPARSER_H
#define ENUMPARSER_H

#include "abstractdigesthandler.h"

namespace AP2I
{

class ParsingContext;

class EnumParser : public AbstractDigestHandler
{
public:
    explicit EnumParser(ParsingContext &pContext);
    virtual ~EnumParser() = default;

    EnumParser() = delete;
    EnumParser(const EnumParser&) = delete;

    void digest(QDomElement &pElement);

private:
    ParsingContext &mContext;
};

} /* namespace AP2I */

#endif // ENUMPARSER_H


