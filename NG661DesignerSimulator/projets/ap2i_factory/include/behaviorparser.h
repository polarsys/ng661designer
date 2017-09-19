/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef BEHAVIORPARSER_H
#define BEHAVIORPARSER_H

#include <QDomElement>
#include <QStack>
#include <QPair>

#include "abstractdigesthandler.h"
#include "domparser.h"


namespace AP2I
{
class BasicObject;
class Component;
class ParsingContext;

class BehaviorParser : public AbstractDigestHandler,
                       public DomParser
{
public:
    explicit BehaviorParser(ParsingContext &pContext);
    virtual ~BehaviorParser() = default;

    BehaviorParser() = delete;
    BehaviorParser(const BehaviorParser &) = delete;

    void digest(QDomElement &pElement);
    bool startElement(QDomElement &pElement);
    void endElement(QDomElement &pElement);

private:

    ParsingContext &mContext;
    QStack<QPair<BasicObject *, QDomElement> > mParents;
};

} /* namespace AP2I */

#endif // BEHAVIORPARSER_H


