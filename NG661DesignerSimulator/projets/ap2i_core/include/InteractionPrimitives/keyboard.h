/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef KEYBOARD_H
#define KEYBOARD_H
#include "basicobject.h"
#include "runtimeevent.h"
#include "stringtype.h"
#include "Integertype.h"
#include "keyboardarea.h"

namespace AP2I
{

class Keyboard : public BasicObject
{
    Q_OBJECT
    Q_PROPERTY(char lastKey READ lastKey WRITE setLastKey)

public:

    Keyboard();

    int lastKey() const { return mLastKey; }
    void setLastKey(quint32 pLastKey) { mLastKey = pLastKey; }    

    void setKeyState(int pKeyId, bool pIsPressed);
    void setKeyChar(int pKeyId);
    void setDeadKeyCode(int pKeyId);
    Q_INVOKABLE bool isKeyPressed(int pKeyId);

    const RuntimeEvent &keyPressedEvent  () const { return mKeyPressedEvent  ; }
    const RuntimeEvent &keyReleasedEvent () const { return mKeyReleasedEvent ; }

    IntegerType keycode(){return mKeyCode;}
    StringType character(){return mCharacter;}
    IntegerType functionkeycode(){return mFunctionKeyCode;}
    IntegerType deadkeycode(){return mDeadKeyCode;}

    void reset();

    const RuntimeEvent *getEvent(const QString &pEventName) const;

    bool updateIn();

    bool requestFocus(KeyboardArea *pKeyboardArea);
    bool releaseFocus(KeyboardArea *pKeyboardArea);
    KeyboardArea* IsFocused();

    static const char *CLASS_NAME;

    static const char *EVENT_KEY_PRESS;
    static const char *EVENT_KEY_RELEASE;

private:
    quint32 mKeys;
    quint32 mPrevKeys;
    quint32 mLastKey;

    IntegerType mKeyCode;
    StringType mCharacter;
    IntegerType mFunctionKeyCode;
    IntegerType mDeadKeyCode;

    KeyboardArea* mFocusedKeyboardArea;

    bool mKeyPress;
    bool mKeyRelease;

    RuntimeEvent mKeyPressedEvent;
    RuntimeEvent mKeyReleasedEvent;  
};

} /* namespace AP2I */

#endif // KEYBOARD_H
