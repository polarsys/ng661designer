/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef TRANSITION_H
#define TRANSITION_H

#include <QString>
#include <QList>

namespace AP2I
{

class Event;
class State;
class ExecutableContent;
class Condition;

class Transition
{
public:

    explicit Transition(State *pSource,
                        State *pTarget,
                        const Event *pEvent,
                        const Condition *pCondition);
    Transition(const Transition &pTransition);

    // delete the transition and all its associated Actions, thus
    // they shall only be allocated dynamically in the heap
    virtual ~Transition();

    State *source() const { return mSource; }

    State *target() const { return mTarget; }
    void setTarget(State *pTarget) { mTarget = pTarget; }

    const Event *event() const { return mEvent; }

    const Condition *condition() const { return mCondition; }

    void addAction(ExecutableContent *pAction);

    void executeTransition();

private:
    Transition() {}

    State *mSource;
    State *mTarget;
    const Event *mEvent;
    const Condition *mCondition;
    QList<ExecutableContent *> mActions;
};

} /* namespace AP2I */

#endif // TRANSITION_H


