/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef TOUCH_H
#define TOUCH_H

#include "basicobject.h"
#include "runtimeevent.h"

namespace AP2I
{

class Touch : public BasicObject
{
    Q_OBJECT

    Q_PROPERTY(int x READ x WRITE setX)
    Q_PROPERTY(int y READ y WRITE setY)
    
public:
    Touch();

    int x() const { return mX; }
    void setX(int pX) { mX = pX; }

    int y() const { return mY; }
    void setY(int pY) { mY = pY; }   

    const RuntimeEvent &pressedEvent  () const { return mPressedEvent  ; }
    const RuntimeEvent &releasedEvent () const { return mReleasedEvent ; }
    const RuntimeEvent &updateEvent  () const { return mUpdateEvent  ; }
    const RuntimeEvent &touchupdateEvent() const { return mTouchUpdateEvent; }

    void reset();

    const RuntimeEvent *getEvent(const QString &pEventName) const;

    bool updateIn();

    static const char *CLASS_NAME;

    static const char *EVENT_PRESS     ;
    static const char *EVENT_RELEASE   ;
    static const char *EVENT_UPDATE  ;
    static const char *EVENT_TOUCHUPDATE;

private:
    int mX;
    int mY;    	

    int mPrevX;
    int mPrevY;    

    RuntimeEvent mPressedEvent   ;
    RuntimeEvent mReleasedEvent  ;
    RuntimeEvent mUpdateEvent   ;
    RuntimeEvent mTouchUpdateEvent ;
};

} /* namespace AP2I */

#endif // TOUCH_H


