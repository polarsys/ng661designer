/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef STATE_H
#define STATE_H

#include <QObject>
#include <QList>

namespace AP2I
{

class Event;
class ExecutableContent;
class Condition;
class Transition;

class State
{
friend class StateMachine;

public:

    explicit State(State *pParent = 0);
    State(const QString &pName, State *pParent = 0);

    // delete the state, all is onEntry/onExit actions and all its children thus
    // State objects and ExecutableContent objects shall be only allocated
    // dynamically in the heap.
    virtual ~State();

    const QString &name() const { return mName; }
    void setName(const QString &pName) { mName = pName; }

    const QList<State *> &children() const { return mChildren; }
    const QList<Transition *> &transitions() const { return mTransitions; }

    void addState(State *pChildState);

    State *initialState() { return mInitialState; }
    void setInitialState(State *pChildState);
    void setInitialState(const QString &pChildStateName);

    void addTransition(State *pTarget,
                       const Event *pEvent,
                       const Condition *pCondition);

    void addTransition(Transition *pTransition);

    void addOnEntryAction(ExecutableContent *pAction);
    void addOnExitAction(ExecutableContent *pAction);

    State *parent() { return mParent; }

    State *getChild(const QString &pChildName);

    //An atomic state is a leaf state with no child state
    bool isAtomicState() const;

    bool isAncestorOf(const State *pState) const;

protected:
    // available for StateMachine class
    void enterState();
    void leaveState();
    QList<Transition *> mTransitions;

private:
    void setParent(State *pParent);

    QList<ExecutableContent *>mOnEntryActions;
    QList<ExecutableContent *>mOnExitActions;
    QList<State *> mChildren;
    State *mParent;
    State *mInitialState;
    QString mName;
};

} /* namespace AP2I */

#endif // STATE_H


