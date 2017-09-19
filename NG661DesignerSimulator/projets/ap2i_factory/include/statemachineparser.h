/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef STATEMACHINEPARSER_H
#define STATEMACHINEPARSER_H

#include "abstractdigesthandler.h"
#include "domparser.h"

#include <QString>
#include <QMap>
#include <QList>
#include <QPair>

class QScriptEngine;

namespace AP2I
{

class Component;
class RuntimeEvent;
class State;
class Transition;
class HSMConditionProcessor;
class ParsingContext;
class SendEventEC;

class StateMachineParser : public AbstractDigestHandler,
                           public DomParser
{
public:
    explicit StateMachineParser(ParsingContext &pContext);
    virtual ~StateMachineParser() = default;

    StateMachineParser() = delete;
    StateMachineParser(const StateMachineParser &) = delete;

    void digest(QDomElement &pElement);
    bool startElement(QDomElement &pElement);
    void endElement(QDomElement &pElement);

private:

    const RuntimeEvent *parseEvent(const QString &pEventField);

    QMap<QString, State *> mStates;
    QList<QPair<Transition *, QString> > mTransitions;
    ParsingContext &mContext;
    QScriptEngine *mScriptEngine;
    State *mCurrentParentState;
    SendEventEC *mCurrentSendEvent;
};

} /* namespace AP2I */

#endif // STATEMACHINEPARSER_H


