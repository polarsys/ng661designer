/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "Keyboardarea.h"

#include "transition.h"
#include "condition.h"
#include "executablecontent.h"
#include "runtimecontext.h"
#include "renderingcontext.h"
#include "transformitem.h"

#include <QStack>
#include <QDebug>

namespace AP2I
{

const char *KeyboardArea::CLASS_NAME = "KeyboardArea";

class KeyboardAreaCondition : public Condition
{
public:
    KeyboardArea &mArea;
    KeyboardArea::T_PACondition mEvalFunc;
    KeyboardAreaCondition(KeyboardArea &pArea,
                    KeyboardArea::T_PACondition pFunc) : mArea(pArea), mEvalFunc(pFunc) {}
    bool evaluate() const
    {
        return mEvalFunc(mArea);
    }
};

class KeyboardAreaAction : public ExecutableContent
{
public:
    KeyboardArea &mArea;
    KeyboardArea::T_PAAction mAction;
    KeyboardAreaAction(KeyboardArea &pArea,
                      KeyboardArea::T_PAAction pAction) : mArea(pArea), mAction(pAction) {}

    void execute()
    {
        mAction(mArea);
    }
};

bool KeyboardArea::isEnable(KeyboardArea &pArea)  {
    if (pArea.enable() && pArea.visibility().getValue() == "visible")
    {
        return true;
    }
    else
    {
        return false;
    }
}
bool KeyboardArea::isDisabled(KeyboardArea &pArea) {
    if (!(pArea.enable() && pArea.visibility().getValue() == "visible"))
    {
        return true;
    }
    else
    {
        return false;
    }
}
bool KeyboardArea::isFocusNeeded(KeyboardArea &pArea)  { return pArea.needFocus();  }
bool KeyboardArea::isFocusNotNeeded(KeyboardArea &pArea) { return !pArea.needFocus(); }
bool KeyboardArea::isFocused(KeyboardArea &pArea)  { return pArea.focused();   }
bool KeyboardArea::isUnfocused(KeyboardArea &pArea){ return !pArea.focused();  }

bool KeyboardArea::requestFocus()
{
    context().keyboard()->requestFocus(this);
    return true;
}

bool KeyboardArea::releaseFocus()
{
    context().keyboard()->releaseFocus(this);
    return true;
}

void KeyboardArea::raiseFocusInEvent(KeyboardArea &pArea)   { pArea.notifyListeners(pArea.mFocusInEvent); }
void KeyboardArea::raiseFocusOutEvent(KeyboardArea &pArea)   { pArea.notifyListeners(pArea.mFocusOutEvent); }
void KeyboardArea::raisePressedEvent(KeyboardArea &pArea)
{
    pArea.mPressedEvent.setParamValue("character", QVariant::fromValue(pArea.mData->character()));
    pArea.mPressedEvent.setParamValue("keycode", QVariant::fromValue(pArea.mData->keycode()));
    pArea.notifyListeners(pArea.mPressedEvent);
}
void KeyboardArea::raiseReleasedEvent(KeyboardArea &pArea)
{
    pArea.mReleasedEvent.setParamValue("character",QVariant::fromValue(pArea.mData->character()));
    pArea.mReleasedEvent.setParamValue("keycode", QVariant::fromValue(pArea.mData->keycode()));
    pArea.notifyListeners(pArea.mReleasedEvent);
}

KeyboardArea::KeyboardArea(BasicObject *pParent)
    : BasicItem(pParent),
      mFocusNeeded(true),
      mFocusInEvent  ("FocusInEvent", this),
      mFocusOutEvent  ("FocusOutEvent", this),
      mPressedEvent  ("PressEvent", this),
      mReleasedEvent("ReleaseEvent", this),
      mFocused(false)
{
    setClassName(CLASS_NAME);

    mData = new KeyEventStructType;

    State *lDisabled = new State("DISABLED", mStateMachine.rootState());
    State *lEnabled  = new State("ENABLED" , mStateMachine.rootState());

    //Enabled state Transition
    Transition *lDisable = new Transition(
                               lEnabled,
                               lDisabled,
                               NULL,
                               new KeyboardAreaCondition(*this, isDisabled));
    lEnabled->addTransition(lDisable);

    //Disable state Transition
    Transition *lEnable = new Transition(
                              lDisabled,
                              lEnabled,
                              NULL,
                              new KeyboardAreaCondition(*this, isEnable));
    lDisabled->addTransition(lEnable);


    State *lEIdle    = new State("E_IDLE"   , lEnabled);
    State *lEFocused = new State("E_FOCUSED", lEnabled);    

    lEFocused->addOnEntryAction(new KeyboardAreaAction(*this, raiseFocusInEvent));
    lEFocused->addOnExitAction(new KeyboardAreaAction(*this, raiseFocusOutEvent));

    // EnabledIdle state Transition
    Transition *lGainFocus = new Transition(
                                 lEIdle,
                                 lEFocused,
                                 NULL,
                                 new KeyboardAreaCondition(*this, isFocused));
    lEIdle->addTransition(lGainFocus);

    // EnabledFocused state Transition
    Transition *lLoseFocus = new Transition(
                                 lEFocused,
                                 lEIdle,
                                 NULL,
                                 new KeyboardAreaCondition(*this, isUnfocused));
    lEFocused->addTransition(lLoseFocus);

    State *lFReleased    = new State("E_F_RELEASED"   , lEFocused);
    State *lFPressed = new State("E_F_PRESSED", lEFocused);

    Transition *lFReleasedPress = new Transition(
                                 lFReleased,
                                 lFPressed,
                                 &context().keyboard()->keyPressedEvent(),
                                 NULL);
    lFReleasedPress->addAction(new KeyboardAreaAction(*this, raisePressedEvent));
    lFReleased->addTransition(lFReleasedPress);

    Transition *lFPressedRelease = new Transition(
                                 lFPressed,
                                 lFReleased,
                                 &context().keyboard()->keyReleasedEvent(),
                                 NULL);
    lFPressedRelease->addAction(new KeyboardAreaAction(*this, raiseReleasedEvent));
    lFPressed->addTransition(lFPressedRelease);

    mReleasedEvent.addParameter("character", qMetaTypeId<StringType>());
    mReleasedEvent.addParameter("keycode", qMetaTypeId<IntegerType>());
    mPressedEvent.addParameter("character", qMetaTypeId<StringType>());
    mPressedEvent.addParameter("keycode", qMetaTypeId<IntegerType>());

    context().keyboard()->addEventsListener(this);

    mStateMachine.start();
}

bool KeyboardArea::handleEvent(RuntimeEvent &pEvent)
{
    mStateMachine.enqueueEvent(pEvent);
    return true;
}

const RuntimeEvent *KeyboardArea::getEvent(const QString &pEventName) const
{
         if (pEventName == "FocusInEvent"  ) return &mFocusInEvent  ;
    else if (pEventName == "FocusOutEvent"  ) return &mFocusOutEvent  ;
    else if (pEventName == "PressEvent"  ) return &mPressedEvent  ;
    else if (pEventName == "ReleaseEvent") return &mReleasedEvent;
    else                                   return 0             ;
}

bool KeyboardArea::updateIn()
{  
    if (this == context().keyboard()->IsFocused())
    {
        mFocused.setValue("true");
    }
    else
    {
        mFocused.setValue("false");
    }

    mData->setCharacter(context().keyboard()->character());
    mData->setKeycode(context().keyboard()->keycode());
    mData->setFunctionKeycode(context().keyboard()->functionkeycode());
    mData->setDeadKeycode(context().keyboard()->deadkeycode());
    mStateMachine.executeIteration();
    return true;
}

} /* namespace AP2I */
