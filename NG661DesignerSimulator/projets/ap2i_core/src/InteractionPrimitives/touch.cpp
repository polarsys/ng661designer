/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "touch.h"
#include "basicobject.h"
#include "runtimecontext.h"
#include <QDebug>

namespace AP2I
{

const char *Touch::CLASS_NAME = "Touch";

const char *Touch::EVENT_PRESS       = "Press";
const char *Touch::EVENT_RELEASE      = "Release";
const char *Touch::EVENT_UPDATE    = "Update";
const char *Touch::EVENT_TOUCHUPDATE   = "TouchUpdate";

Touch::Touch()
    : BasicObject(),
      mX(0),
      mY(0),      
      mPrevX(0),
      mPrevY(0),    
      mPressedEvent  (EVENT_PRESS, this),
      mReleasedEvent (EVENT_RELEASE, this),      
      mUpdateEvent (EVENT_UPDATE, this),
      mTouchUpdateEvent (EVENT_TOUCHUPDATE, this)
{
    setClassName(CLASS_NAME);
}

void Touch::reset()
{
    mEventsListeners.clear();
}

const RuntimeEvent *Touch::getEvent(const QString &pEventName) const
{
         if (pEventName == EVENT_PRESS     ) return &mPressedEvent  ;
    else if (pEventName == EVENT_RELEASE   ) return &mReleasedEvent ;
    else if (pEventName == EVENT_UPDATE  ) return &mUpdateEvent  ;
    else if (pEventName == EVENT_TOUCHUPDATE) return &mTouchUpdateEvent;
    else                                     return 0               ;
}

bool Touch::updateIn()
{    

    return true;
}

} /* namespace AP2I */
