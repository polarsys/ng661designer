/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "statemachine.h"

#include "transition.h"
#include "event.h"
#include "condition.h"
#include <QStack>
#include <QDebug>

namespace AP2I 
{

StateMachine::StateMachine()
    : mRoot("root")
{
    mCurrent = &mRoot;
}

StateMachine::~StateMachine()
{
}

void StateMachine::addState(State *pState)
{
    mRoot.addState(pState);
}

void StateMachine::setInitialState(State *pState)
{
    mRoot.setInitialState(pState);
}

void StateMachine::start()
{
    goToInitialState();
}

void StateMachine::enqueueEvent(const Event &pEvent)
{
    mEventsQueue.enqueue(&pEvent);
}

void StateMachine::executeIteration()
{
    Transition *lTransition = NULL;

    // process eventless transition for current state and all its ancestors
    State *lParent = mCurrent;
    while (lTransition == NULL && lParent)
    {
        lTransition = findEnabledTransition(lParent);
        lParent = lParent->parent();
    }
    if (lTransition)
        executeTransition(lTransition);

    // process event queue for current state and all its ancestors
    while (!mEventsQueue.isEmpty())
    {
        const Event *lCurrentEvent = mEventsQueue.dequeue();
        lParent = mCurrent;
        lTransition = NULL;
        while (lTransition == NULL && lParent)
        {
            lTransition = findEnabledTransition(lParent, lCurrentEvent);
            lParent = lParent->parent();
        }
        if (lTransition)
            executeTransition(lTransition);
    }
}

// Look for an enabled transition starting from pState and triggered by pEvent
// If pEvent is NULL, it will look for an eventless transition
Transition *StateMachine::findEnabledTransition(State *pState, const Event *pEvent)
{
    Transition *lTransition = NULL;
    auto it = pState->mTransitions.begin();
    while(lTransition == NULL && it != pState->mTransitions.end())
    {
        bool lCond = (!(*it)->condition())
                     ? true
                     : (*it)->condition()->evaluate();
        if (pEvent)
        {
            if ((*it)->event() && (*it)->event()->matchEvent(*pEvent) && lCond)
                lTransition = *it;
        }
        else
        {
            if(!(*it)->event() && lCond)
                lTransition = *it;
        }
        it++;
    }
    return lTransition;
}

void StateMachine::executeTransition(Transition *pTransition)
{
    if (!pTransition->target())
    {
        // Transition without target, just execute its content and stay in current state
        pTransition->executeTransition();
    }
    else
    {
        // exit all parent states until the first common ancestor
        // between source and target
        // (SCXML spec: common ancestor is neither entered nor exited)
        State *lFirstCommonAncestor = mCurrent;
        while(!lFirstCommonAncestor->isAncestorOf(pTransition->target()))
        {
            lFirstCommonAncestor->leaveState();
            lFirstCommonAncestor = lFirstCommonAncestor->parent();
        }

        pTransition->executeTransition();

        // process the list of states to enter to reach target state
        QStack<State *> lStatesToEnter;
        State *lCurrentState = pTransition->target();
        while (lCurrentState != lFirstCommonAncestor)
        {
            lStatesToEnter.push(lCurrentState);
            lCurrentState = lCurrentState->parent();
        }
        // enter all states between common ancestor and target
        while (!lStatesToEnter.isEmpty())
        {
            lCurrentState = lStatesToEnter.pop();
            lCurrentState->enterState();
        }
        // if Target is not an atomic state, enter initial states of its sub-tree
        mCurrent = lCurrentState;
        goToInitialState();
    }
}

void StateMachine::goToInitialState()
{
    while (!mCurrent->isAtomicState())
    {
        mCurrent = mCurrent->initialState();
        mCurrent->enterState();
    }
}

} /* namespace AP2I */
