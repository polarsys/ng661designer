/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef COMPLEXTYPEPARSER_H
#define COMPLEXTYPEPARSER_H

#include "abstractdigesthandler.h"

namespace AP2I
{

class ParsingContext;

class ComplexTypeParser : public AbstractDigestHandler
{
public:
    explicit ComplexTypeParser(ParsingContext &pContext);
    virtual ~ComplexTypeParser() = default;

    ComplexTypeParser() = delete;
    ComplexTypeParser(const ComplexTypeParser &) = delete;

    void digest(QDomElement &pElement);

private:
    ParsingContext &mContext;
};

} /* namespace AP2I */

#endif // COMPLEXTYPEPARSER_H


