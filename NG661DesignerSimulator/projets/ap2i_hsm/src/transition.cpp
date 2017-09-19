/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "transition.h"
#include "state.h"
#include "event.h"
#include "executablecontent.h"
#include "condition.h"
#include <QDebug>

namespace AP2I 
{

Transition::Transition(State *pSource,
                       State *pTarget,
                       const Event *pEvent,
                       const Condition *pCondition)
    : mSource(pSource),
      mTarget(pTarget),
      mEvent(pEvent),
      mCondition(pCondition)
{
}

Transition::Transition(const Transition &pTransition)
    : mSource(pTransition.mSource),
      mTarget(pTransition.mTarget),
      mEvent(pTransition.mEvent),
      mCondition(pTransition.mCondition)
{
}

Transition::~Transition()
{
    // delete transition actions
    for (ExecutableContent *lAction : mActions)
    {
        delete lAction;
    }
    if (mCondition)
        delete mCondition;
}

void Transition::addAction(ExecutableContent *pAction)
{
    if (pAction)
        mActions.append(pAction);
}

void Transition::executeTransition()
{
//    qDebug() << "Transition from " << source()->name()
//             << " to " << target()->name() << ".";

    for (ExecutableContent *lAction : mActions)
    {
        lAction->execute();
    }
}

} /* namespace AP2I */
