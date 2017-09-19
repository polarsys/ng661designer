/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef POINTERAREA_H
#define POINTERAREA_H

#include "basicitem.h"
#include "statemachine.h"
#include "runtimeevent.h"
#include "booleantype.h"

namespace AP2I
{

class PointerArea : public BasicItem
{
    Q_OBJECT

    Q_PROPERTY(bool enabled READ enabled WRITE setEnabled)
    Q_PROPERTY(bool focused READ focused)
    Q_PROPERTY(bool preventStealing READ preventStealing WRITE setPreventStealing)
    Q_PROPERTY(bool passThrough READ passThrough WRITE setPassThrough)
    Q_PROPERTY(StringType acceptedButtons READ acceptedButtons WRITE setAcceptedButtons)


public:
    explicit PointerArea(BasicObject *pParent = 0);

    virtual ~PointerArea() {}

    bool enabled() { return mEnabled.value(); }
    void setEnabled(bool pEnabled) { mEnabled = BooleanType(pEnabled); }

    bool focused() const {return mFocused; }

    void handleEvent(RuntimeEvent &pEvent);


    bool preventStealing() { return mPreventStealing.value(); }
    void setPreventStealing(bool pPreventStealing) { mPreventStealing = BooleanType(pPreventStealing); }

    bool passThrough() { return mPassThrough.value(); }
    void setPassThrough(bool pPassThrough) { mPassThrough = BooleanType(pPassThrough); }


    void setAcceptedButtons(StringType pAcceptedButtons){mAcceptedButtons = pAcceptedButtons;}
    StringType acceptedButtons(){return mAcceptedButtons;}
    std::string getAcceptedButtons() {return mAcceptedButtons.getValue();}


    const RuntimeEvent *getEvent(const QString &pEventName) const;

    bool updateIn();

    static const char *CLASS_NAME;

    typedef bool (*T_PACondition)(PointerArea &);
    typedef void (*T_PAAction)(PointerArea &);

private:
    // fonctions for transitions conditions
    static bool isEnabled(PointerArea &pArea);
    static bool isDisabled(PointerArea &pArea);
    static bool isFocused(PointerArea &pArea);
    static bool isUnfocused(PointerArea &pArea);
    static bool isPreventStealing(PointerArea &pArea);

    // statesMachine actions functions
    static void raiseEnterEvent(PointerArea &pArea);
    static void raiseLeaveEvent(PointerArea &pArea);
    static void raiseMoveEvent(PointerArea &pArea);
    static void raisePressEvent(PointerArea &pArea);
    static void raiseReleaseEvent(PointerArea &pArea);

    BooleanType mEnabled;

    StateMachine mStateMachine;
    RuntimeEvent mEnterEvent;
    RuntimeEvent mLeaveEvent;
    RuntimeEvent mMoveEvent;
    RuntimeEvent mPressEvent;
    RuntimeEvent mReleaseEvent;

    BooleanType mPreventStealing;
    BooleanType mPassThrough;
    bool mFocused;
    StringType mAcceptedButtons;
    PositionType    mPointerPositionX;
    PositionType    mPointerPositionY;

};

} /* namespace AP2I */

#endif // POINTERAREA_H


