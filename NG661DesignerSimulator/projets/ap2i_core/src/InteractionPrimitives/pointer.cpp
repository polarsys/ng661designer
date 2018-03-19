/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "pointer.h"
#include "basicobject.h"
#include "runtimecontext.h"
#include <QDebug>

namespace AP2I
{

const char *Pointer::CLASS_NAME = "Pointer";

const char *Pointer::EVENT_MOVE       = "Move";
const char *Pointer::EVENT_PRESS      = "Press";
const char *Pointer::EVENT_RELEASE    = "Release";
const char *Pointer::EVENT_WHEEL_UP   = "WheelUp";
const char *Pointer::EVENT_WHEEL_DOWN = "WheelDown";

Pointer::Pointer()
    : BasicObject(),
      mX(0),
      mY(0),
      mButtons(0),
      mPrevX(0),
      mPrevY(0),
      mPrevButtons(0),
      mMoveEvent     (EVENT_MOVE, this),
      mPressedEvent  (EVENT_PRESS, this),
      mReleasedEvent (EVENT_RELEASE, this),
      mWheelUpEvent  (EVENT_WHEEL_UP, this),
      mWheelDownEvent(EVENT_WHEEL_DOWN, this)
{
    setClassName(CLASS_NAME);
}

void Pointer::setButtonState(int pButtonId, bool pIsPressed)
{
    //each bit of mButtons represents the state of one button
    if (pButtonId < 32)
    {
        quint32 lMask = 0x00000001 << pButtonId;
        mButtons = pIsPressed
                   ? mButtons | lMask
                   : mButtons & ~lMask;
    }
    else
    {
        qDebug() << "ERROR: ButtonID cannot be greater than 32";
    }
}

bool Pointer::isButtonPressed(int pButtonId)
{
    if (pButtonId < 32)
    {
        return (((mButtons >> pButtonId) & 0x00000001) == 0x00000001)
                ? true : false;
    }
    else
    {
        qDebug() << "ERROR: ButtonID cannot be greater than 32";
        return false;
    }
}

void Pointer::reset()
{
    mEventsListeners.clear();
}

const RuntimeEvent *Pointer::getEvent(const QString &pEventName) const
{
         if (pEventName == EVENT_MOVE      ) return &mMoveEvent     ;
    else if (pEventName == EVENT_PRESS     ) return &mPressedEvent  ;
    else if (pEventName == EVENT_RELEASE   ) return &mReleasedEvent ;
    else if (pEventName == EVENT_WHEEL_UP  ) return &mWheelUpEvent  ;
    else if (pEventName == EVENT_WHEEL_DOWN) return &mWheelDownEvent;
    else                                     return 0               ;
}

bool Pointer::updateIn()
{
    if (mPrevButtons > mButtons)
        notifyListeners(mReleasedEvent);

    if (mX != mPrevX || mY != mPrevY)
    {
        notifyListeners(mMoveEvent);
        for (int i = 0; i<mContext.previousFocusedPointerAreas()->size(); i++)
        {
            if (mContext.focusedPointerAreas()->contains(mContext.previousFocusedPointerAreas()->at(i)) == false)
            {
               mContext.previousFocusedPointerAreas()->at(i)->forceLeave();
            }
            else
            {
                /* NOTHING TO DO */
            }
        }
        mContext.previousFocusedPointerAreas()->clear();
        for (int i = 0; i<mContext.focusedPointerAreas()->size(); i++)
        {
            mContext.previousFocusedPointerAreas()->append(mContext.focusedPointerAreas()->at(i));
        }
        mContext.focusedPointerAreas()->clear();
    }

    if (mPrevButtons < mButtons)
        notifyListeners(mPressedEvent);

    mPrevX = mX;
    mPrevY = mY;
    mPrevButtons = mButtons;

    return true;
}

} /* namespace AP2I */
