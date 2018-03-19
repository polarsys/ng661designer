/*******************************************************************************
* Copyright (c) 2015, 2016, 2017 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "scrollwheelarea.h"

#include "transition.h"
#include "condition.h"
#include "executablecontent.h"
#include "runtimecontext.h"
#include "renderingcontext.h"
#include "transformitem.h"
#include "booleantype.h"

#include <QStack>

namespace AP2I
{

const char *ScrollWheelArea::CLASS_NAME = "ScrollWheelArea";

class ScrollWheelAreaCondition : public Condition
{
public:
    ScrollWheelArea &mArea;
    ScrollWheelArea::T_PACondition mEvalFunc;
    ScrollWheelAreaCondition(ScrollWheelArea &pArea,
                    ScrollWheelArea::T_PACondition pFunc) : mArea(pArea), mEvalFunc(pFunc) {}
    bool evaluate() const
    {
        return mEvalFunc(mArea);
    }
};

class ScrollWheelAreaAction : public ExecutableContent
{
public:
    ScrollWheelArea &mArea;
    ScrollWheelArea::T_PAAction mAction;
    ScrollWheelAreaAction(ScrollWheelArea &pArea,
                      ScrollWheelArea::T_PAAction pAction) : mArea(pArea), mAction(pAction) {}

    void execute()
    {
        mAction(mArea);
    }
};

bool ScrollWheelArea::isEnabled(ScrollWheelArea &pArea)  {
    if (pArea.enable() && pArea.visibility().getValue() == "visible")
    {
        return true;
    }
    else
    {
        return false;
    }
}
bool ScrollWheelArea::isDisabled(ScrollWheelArea &pArea) {
    if (!(pArea.enable() && pArea.visibility().getValue() == "visible"))
    {
        return true;
    }
    else
    {
        return false;
    }
}
bool ScrollWheelArea::isFocusNeeded(ScrollWheelArea &pArea)  { return pArea.needFocus();  }
bool ScrollWheelArea::isFocusNotNeeded(ScrollWheelArea &pArea) { return !pArea.needFocus(); }
bool ScrollWheelArea::isFocused(ScrollWheelArea &pArea)  { return pArea.focused();   }
bool ScrollWheelArea::isUnfocused(ScrollWheelArea &pArea){ return !pArea.focused();  }

bool ScrollWheelArea::requestFocus()
{
    context().scrollwheel()->requestFocus(this);
    return true;
}

bool ScrollWheelArea::releaseFocus()
{
    context().scrollwheel()->releaseFocus(this);
    return true;
}

void ScrollWheelArea::raiseFocusInEvent(ScrollWheelArea &pArea)   { pArea.notifyListeners(pArea.mFocusInEvent); }
void ScrollWheelArea::raiseFocusOutEvent(ScrollWheelArea &pArea)   { pArea.notifyListeners(pArea.mFocusOutEvent); }
void ScrollWheelArea::raiseWheelScrolledEvent(ScrollWheelArea &pArea)
{    
    pArea.mWheelScrolledEvent.setParamValue("nbofincrement", QVariant::fromValue(pArea.mData->nbOfIncrement()));
    pArea.notifyListeners(pArea.mWheelScrolledEvent);
}

ScrollWheelArea::ScrollWheelArea(BasicObject *pParent)
	: BasicItem(pParent),
	mFocusNeeded(true),
    mFocusInEvent  ("FocusInEvent", this),
    mFocusOutEvent  ("FocusOutEvent", this),
    mWheelScrolledEvent  ("WheelScrolledEvent", this),
    mFocused(false)
{
	setClassName(CLASS_NAME);

    mData = new WheelEventStructType;

    State *lDisabled = new State("DISABLED", mStateMachine.rootState());
    State *lEnabled  = new State("ENABLED" , mStateMachine.rootState());

    //Enabled state Transition
    Transition *lDisable = new Transition(
                               lEnabled,
                               lDisabled,
                               NULL,
                               new ScrollWheelAreaCondition(*this, isDisabled));
    lEnabled->addTransition(lDisable);

    //Disable state Transition
    Transition *lEnable = new Transition(
                              lDisabled,
                              lEnabled,
                              NULL,
                              new ScrollWheelAreaCondition(*this, isEnabled));
    lDisabled->addTransition(lEnable);


    State *lEIdle    = new State("E_IDLE"   , lEnabled);
    State *lEFocused = new State("E_FOCUSED", lEnabled);    

    lEFocused->addOnEntryAction(new ScrollWheelAreaAction(*this, raiseFocusInEvent));
    lEFocused->addOnExitAction(new ScrollWheelAreaAction(*this, raiseFocusOutEvent));

    // EnabledIdle state Transition
    Transition *lGainFocus = new Transition(
                                 lEIdle,
                                 lEFocused,
                                 NULL,
                                 new ScrollWheelAreaCondition(*this, isFocused));
    lEIdle->addTransition(lGainFocus);

    // EnabledFocused state Transition
    Transition *lLoseFocus = new Transition(
                                 lEFocused,
                                 lEIdle,
                                 NULL,
                                 new ScrollWheelAreaCondition(*this, isUnfocused));
    lEFocused->addTransition(lLoseFocus);

    // EnabledFocused state Transition
    Transition *lFocusWheel = new Transition(
                                 lEFocused,
                                 NULL,
                                 &context().scrollwheel()->wheelScrolledEvent(),
                                 NULL);
    lFocusWheel->addAction(new ScrollWheelAreaAction(*this, raiseWheelScrolledEvent));
    lEFocused->addTransition(lFocusWheel);

    mWheelScrolledEvent.addParameter("nbofincrement", qMetaTypeId<IntegerType>());

    context().scrollwheel()->addEventsListener(this);
	mStateMachine.start();
}

bool ScrollWheelArea::handleEvent(RuntimeEvent &pEvent)
{
    mStateMachine.enqueueEvent(pEvent);
    return true;
}

const RuntimeEvent *ScrollWheelArea::getEvent(const QString &pEventName) const
{
         if (pEventName == "FocusInEvent"  ) return &mFocusInEvent  ;
    else if (pEventName == "FocusOutEvent"  ) return &mFocusOutEvent  ;    
    else if (pEventName == "WheelScrolledEvent") return &mWheelScrolledEvent;
    else                                   return 0             ;
}

bool ScrollWheelArea::updateIn()
{
    if (this == context().scrollwheel()->IsFocused())
    {
        mFocused.setValue("true");
    }
    else
    {
        mFocused.setValue("false");
    }

    mData->setNbOfIncrement(context().scrollwheel()->nbOfIncrements());
    mStateMachine.executeIteration();
    return true;
}

} /* namespace AP2I */
