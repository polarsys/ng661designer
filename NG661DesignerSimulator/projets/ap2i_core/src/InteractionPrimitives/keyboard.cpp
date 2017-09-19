/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "keyboard.h"

#include <QDebug>

namespace AP2I
{

const char *Keyboard::CLASS_NAME = "Keyboard";

const char *Keyboard::EVENT_KEY_PRESS      = "KeyPressed";
const char *Keyboard::EVENT_KEY_RELEASE    = "KeyReleased";

Keyboard::Keyboard()
    : BasicObject(),
      mKeys(0),
      mPrevKeys(0),
      mKeyCode(0),
      mCharacter(""),
      mFunctionKeyCode(0),
      mDeadKeyCode(0),
      mFocusedKeyboardArea(NULL),
      mKeyPress(0),
      mKeyRelease(0),
      mKeyPressedEvent  (EVENT_KEY_PRESS, this),
      mKeyReleasedEvent (EVENT_KEY_RELEASE, this)
{
    setClassName(CLASS_NAME);
}

void Keyboard::setKeyState(int pKeyId, bool pIsPressed)
{        
    quint32 lMask = 0x00000001 << pKeyId;    
    mKeys = pIsPressed
               ? mKeys | lMask
               : mKeys & ~lMask;

    if(pIsPressed)
    {
        //mKeyPress = true;
        mFunctionKeyCode.setValue(pKeyId);
        mCharacter.setValue("");
        mKeyCode.setValue(0);
        mDeadKeyCode.setValue(0);
    }
    else
    {
        //mKeyRelease = true;
    }


//    if (pIsPressed && pKeyId)
//    {
//        mCharacter.setValue("");
//        mKeyCode.setValue(0);
//        mDeadKeyCode.setValue(0);
//    }

    mFunctionKeyCode.setValue(pKeyId);
}

void Keyboard::setKeyChar(int pKeyId)
{    
    mCharacter.setValue(QString(QChar(pKeyId)).toStdString());    
    mKeyCode.setValue(pKeyId);
}

void Keyboard::setDeadKeyCode(int pKeyId)
{
    mDeadKeyCode.setValue(pKeyId);
    mKeyCode.setValue(pKeyId);
}

bool Keyboard::isKeyPressed(int pKeyId)
{
    return (((mKeys >> pKeyId) & 0x00000001) == 0x00000001)
            ? true : false;
}

bool Keyboard::requestFocus(KeyboardArea *pKeyboardArea)
{
    mFocusedKeyboardArea = pKeyboardArea;
    return true;
}

bool Keyboard::releaseFocus(KeyboardArea *pKeyboardArea)
{
    if (mFocusedKeyboardArea == pKeyboardArea)
    {
        mFocusedKeyboardArea = NULL;
    }
    else
    {
        /* Nothing to do */
    }

    return true;
}

KeyboardArea* Keyboard::IsFocused()
{
    return mFocusedKeyboardArea;
}

void Keyboard::reset()
{
    mEventsListeners.clear();
}

const RuntimeEvent *Keyboard::getEvent(const QString &pEventName) const
{
    if (pEventName == EVENT_KEY_PRESS     ) return &mKeyPressedEvent  ;
    else if (pEventName == EVENT_KEY_RELEASE   ) return &mKeyReleasedEvent ;
    else                                     return 0               ;
}

bool Keyboard::updateIn()
{
    if (mPrevKeys > mKeys)
        notifyListeners(mKeyReleasedEvent);

    if (mPrevKeys < mKeys)
    {
        notifyListeners(mKeyPressedEvent);
        mLastKey = mKeys - mPrevKeys;
    }

//    if (mKeyPress)
//    {
//        notifyListeners(mKeyPressedEvent);
//        mKeyPress = false;
//    }
//    if (mKeyRelease)
//    {
//        notifyListeners(mKeyReleasedEvent);
//        mKeyRelease = false;
//    }

    mPrevKeys = mKeys;

    return true;
}

} /* namespace AP2I */
