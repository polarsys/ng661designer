/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "scrollwheel.h"

namespace AP2I
{

const char *ScrollWheel::CLASS_NAME = "Scrollwheel";

const char *ScrollWheel::EVENT_WHEEL_SCROLLED      = "WheelScrolled";

ScrollWheel::ScrollWheel()
    : BasicObject(),
      mNbOfIncrements(0),
      mPrevNbOfIncrements(0),
      mFocusedScrollWheelArea(NULL),
      mWheelScrolledEvent (EVENT_WHEEL_SCROLLED, this)
{
	setClassName(CLASS_NAME);
}

void ScrollWheel::setWheelDelta(int pDeltaWheel)
{
    mNbOfIncrements.setValue(pDeltaWheel);
    mScrolloccured = true;
}

bool ScrollWheel::requestFocus(ScrollWheelArea *pScrollWheelArea)
{
    mFocusedScrollWheelArea = pScrollWheelArea;
    return true;
}

bool ScrollWheel::releaseFocus(ScrollWheelArea *pScrollWheelArea)
{
    if (mFocusedScrollWheelArea == pScrollWheelArea)
    {
        mFocusedScrollWheelArea = NULL;
    }
    else
    {
        /* Nothing to do */
    }

    return true;
}

ScrollWheelArea* ScrollWheel::IsFocused()
{
    return mFocusedScrollWheelArea;
}

void ScrollWheel::reset()
{
    mEventsListeners.clear();
}

const RuntimeEvent *ScrollWheel::getEvent(const QString &pEventName) const
{
    if (pEventName == EVENT_WHEEL_SCROLLED     ) return &mWheelScrolledEvent  ;    
    else                                     return 0               ;
}

bool ScrollWheel::updateIn()
{
    if (mScrolloccured)
    {
        notifyListeners(mWheelScrolledEvent);
        mScrolloccured = false;
    }

    return true;
}
 
} /* namespace AP2I */
