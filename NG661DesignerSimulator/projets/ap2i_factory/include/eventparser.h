/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef EVENTPARSER_H
#define EVENTPARSER_H

#include "abstractdigesthandler.h"

namespace AP2I
{

class Component;
class RuntimeEvent;
class ParsingContext;

class EventParser : public AbstractDigestHandler
{
public:
    explicit EventParser(ParsingContext &pContext);
    virtual ~EventParser() = default;

    EventParser() = delete;
    EventParser(const EventParser &) = delete;

    void digest(QDomElement &pElement);

private:

    ParsingContext &mContext;
    RuntimeEvent *mCurrentEvent;
};

} /* namespace AP2I */

#endif // EVENTPARSER_H


