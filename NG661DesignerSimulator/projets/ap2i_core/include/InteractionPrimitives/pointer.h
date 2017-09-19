/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef POINTER_H
#define POINTER_H

#include "basicobject.h"
#include "runtimeevent.h"

namespace AP2I
{

class Pointer : public BasicObject
{
    Q_OBJECT

    Q_PROPERTY(int x READ x WRITE setX)
    Q_PROPERTY(int y READ y WRITE setY)
    Q_PROPERTY(quint32 buttons READ buttons WRITE setButtons)
public:
    Pointer();

    int x() const { return mX; }
    void setX(int pX) { mX = pX; }

    int y() const { return mY; }
    void setY(int pY) { mY = pY; }

    quint32 buttons() const { return mButtons; }
    void setButtons(quint32 pButtons) { mButtons = pButtons; }

    void setButtonState(int pButtonId, bool pIsPressed);
    Q_INVOKABLE bool isButtonPressed(int pButtonId);

    const RuntimeEvent &moveEvent     () const { return mMoveEvent     ; }
    const RuntimeEvent &pressedEvent  () const { return mPressedEvent  ; }
    const RuntimeEvent &releasedEvent () const { return mReleasedEvent ; }
    const RuntimeEvent &wheelUpEvent  () const { return mWheelUpEvent  ; }
    const RuntimeEvent &wheelDownEvent() const { return mWheelDownEvent; }

    void reset();

    const RuntimeEvent *getEvent(const QString &pEventName) const;

    bool updateIn();

    static const char *CLASS_NAME;

    static const char *EVENT_MOVE      ;
    static const char *EVENT_PRESS     ;
    static const char *EVENT_RELEASE   ;
    static const char *EVENT_WHEEL_UP  ;
    static const char *EVENT_WHEEL_DOWN;

private:
    int mX;
    int mY;
    quint32 mButtons;

    int mPrevX;
    int mPrevY;
    quint32 mPrevButtons;

    RuntimeEvent mMoveEvent      ;
    RuntimeEvent mPressedEvent   ;
    RuntimeEvent mReleasedEvent  ;
    RuntimeEvent mWheelUpEvent   ;
    RuntimeEvent mWheelDownEvent ;
};

} /* namespace AP2I */

#endif // POINTER_H


