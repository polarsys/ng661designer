/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef KEYBOARDAREA_H
#define KEYBOARDAREA_H
#include "basicitem.h"
#include "statemachine.h"
#include "runtimeevent.h"
#include "booleantype.h"
#include "keyeventstructtype.h"

namespace AP2I
{
class KeyboardArea : public BasicItem
{
    Q_OBJECT

    Q_PROPERTY(bool enable READ enable WRITE setEnable)
    Q_PROPERTY(bool needFocus READ needFocus WRITE setNeedFocus)
    Q_PROPERTY(bool focused READ focused)
    Q_PROPERTY(KeyEventStructType* data READ data)

public:
    explicit KeyboardArea(BasicObject *pParent = 0);

    bool enable() { return mEnable.value(); }
    void setEnable(bool pEnable) { mEnable = BooleanType(pEnable); }
    bool needFocus() { return mFocusNeeded.value(); }
    void setNeedFocus(bool pNeedFocus) { mFocusNeeded = BooleanType(pNeedFocus); }

    bool focused() {return mFocused.value(); }

    KeyEventStructType* data() const { return mData; }

    Q_INVOKABLE bool requestFocus();
    Q_INVOKABLE bool releaseFocus();

    bool handleEvent(RuntimeEvent &pEvent);

    const RuntimeEvent *getEvent(const QString &pEventName) const;

    bool updateIn();

    static const char *CLASS_NAME;

    typedef bool (*T_PACondition)(KeyboardArea &);
    typedef void (*T_PAAction)(KeyboardArea &);

private:
    // fonctions for transitions conditions
    static bool isEnable(KeyboardArea &pArea);
    static bool isDisabled(KeyboardArea &pArea);
    static bool isFocusNeeded(KeyboardArea &pArea);
    static bool isFocusNotNeeded(KeyboardArea &pArea);
    static bool isFocused(KeyboardArea &pArea);
    static bool isUnfocused(KeyboardArea &pArea);

    // statesMachine actions functions
    static void raiseFocusInEvent(KeyboardArea &pArea);
    static void raiseFocusOutEvent(KeyboardArea &pArea);
    static void raisePressedEvent(KeyboardArea &pArea);
    static void raiseReleasedEvent(KeyboardArea &pArea);

    BooleanType mEnable;
    BooleanType mFocusNeeded;    

    StateMachine mStateMachine;
    RuntimeEvent mFocusInEvent;
    RuntimeEvent mFocusOutEvent;
    RuntimeEvent mPressedEvent;
    RuntimeEvent mReleasedEvent;

    BooleanType mFocused;    
    KeyEventStructType* mData;

};

} /* namespace AP2I */


#endif // KEYBOARDAREA_H
