/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef STATEMACHINE_H
#define STATEMACHINE_H

#include "state.h"
#include "event.h"
#include <QQueue>

namespace AP2I
{

typedef QQueue<const Event *> EventsQueue;


class StateMachine
{
public:
    explicit StateMachine();

    ~StateMachine();

    void addState(State *pState);

    void setInitialState(State *pState);

    void start();

    void executeIteration();

    void enqueueEvent(const Event &pEvent);

    State *rootState() { return &mRoot; }

private:
    Transition *findEnabledTransition(State *pState, const Event *pEvent = 0);
    void executeTransition(Transition *pTransition);

    void goToInitialState();

    State mRoot;
    State *mCurrent;
    EventsQueue mEventsQueue;
};

} /* namespace AP2I */

#endif // STATEMACHINE_H


