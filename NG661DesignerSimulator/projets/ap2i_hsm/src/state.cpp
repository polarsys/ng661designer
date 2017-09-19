/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "state.h"
#include "transition.h"
#include "event.h"
#include "executablecontent.h"
#include <QDebug>

namespace AP2I 
{

State::State(State *pParent)
    : mParent(pParent),
      mInitialState(NULL)
{
    if (mParent)
    {
        mParent->addState(this);
    }
}

State::~State()
{
    // remove state from its parent's children list
    if (mParent)
    {
        mParent->mChildren.removeAt(mParent->mChildren.indexOf(this));
    }

    // delete transitions
    for (Transition *lTransition : mTransitions)
    {
        delete lTransition;
    }

    // delete onEntry actions
    for (ExecutableContent *lExec : mOnEntryActions)
    {
        delete lExec;
    }

    // delete onExit actions
    for (ExecutableContent *lExec : mOnExitActions)
    {
        delete lExec;
    }

    // delete children
    while (!mChildren.isEmpty())
    {
        delete *mChildren.begin();
    }
}

State::State(const QString &pName, State *pParent)
    : mParent(pParent),
      mInitialState(NULL),
      mName(pName)
{
    if (mParent)
    {
        mParent->addState(this);
    }
}

void State::addTransition(State *pTarget,
                          const Event *pEvent,
                          const Condition *pCondition)
{
    mTransitions.append(new Transition(this, pTarget, pEvent, pCondition));
}

void State::addTransition(Transition *pTransition)
{
    if (pTransition && pTransition->source() == this)
    {
        mTransitions.append(pTransition);
    }
    else
    {
        qDebug() << "Error: transition to add to " << name()
                 << " state don't have the same source state.";
    }
}

void State::addOnEntryAction(ExecutableContent *pAction)
{
    if (pAction)
        mOnEntryActions.append(pAction);
}

void State::addOnExitAction(ExecutableContent *pAction)
{
    if (pAction)
        mOnExitActions.append(pAction);
}

void State::addState(State *pChildState)
{
    if (pChildState)
    {
        mChildren.append(pChildState);
        pChildState->setParent(this);
        if (!mInitialState)
        {
            // default initial state is the first added state
            mInitialState = pChildState;
        }
    }
}

void State::setInitialState(State *pChildState)
{
    bool lFound = false;
    QList<State *>::iterator it = mChildren.begin();
    while (lFound == false && it != mChildren.end())
    {
        if (pChildState == *it)
        {
            lFound = true;
        }
        it++;
    }
    if (lFound)
    {
        mInitialState = pChildState;
    }
    else
    {
        qDebug() << "ERROR: Cannot set initialState with a state that is not"
                    " child this state.";
    }
}

void State::setInitialState(const QString &pChildStateName)
{
    State *lChild = getChild(pChildStateName);
    if (lChild)
    {
        mInitialState = lChild;
    }
    else
    {
        qDebug() << "ERROR: No child state named " << pChildStateName
                 << " for state" << name();
    }
}

void State::setParent(State *pParent)
{
    mParent = pParent;
}

void State::enterState()
{
    //qDebug() << "Entering state " << mName;

    for (ExecutableContent *lExec :  mOnEntryActions)
    {
        lExec->execute();
    }
}

void State::leaveState()
{
    //qDebug() << "Leaving state " << mName;

    for (ExecutableContent *lExec : mOnExitActions)
    {
        lExec->execute();
    }
}

State *State::getChild(const QString &pChildName)
{
    State *lReturnValue = NULL;
    QList<State *>::iterator it = mChildren.begin();
    while (!lReturnValue && it != mChildren.end())
    {
        if (pChildName == (*it)->name())
        {
            lReturnValue = *it;
        }
        it++;
    }
    return lReturnValue;
}

bool State::isAtomicState() const
{
    return (mInitialState == NULL);
}

bool State::isAncestorOf(const State *pState) const
{
    State *lCurrentParent = pState->mParent;

    while (lCurrentParent != this && lCurrentParent != NULL)
    {
        lCurrentParent = lCurrentParent->mParent;
    }
    return (lCurrentParent != NULL) ? true : false;
}

} /* namespace AP2I */
