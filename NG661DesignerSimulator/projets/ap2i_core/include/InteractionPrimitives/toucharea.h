/*******************************************************************************
* Copyright (c) 2015, 2016, 2017 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef TOUCHAREA_H
#define TOUCHAREA_H

#include "basicitem.h"
#include "statemachine.h"
#include "runtimeevent.h"
#include "booleantype.h"

namespace AP2I
{

class TouchArea : public BasicItem
{
    Q_OBJECT

    Q_PROPERTY(bool enable READ enable WRITE setEnable)        
    Q_PROPERTY(IntegerType minimumTouchPoints READ minimumTouchPoints WRITE setMinimumTouchPoints)
    Q_PROPERTY(IntegerType maximumTouchPoints READ maximumTouchPoints WRITE setMaximumTouchPoints)


public:
    explicit TouchArea(BasicObject *pParent = 0);

    virtual ~TouchArea() {}

    bool enable() { return mEnable.value(); }
    void setEnable(bool pEnable) { mEnable = BooleanType(pEnable); }    

    bool handleEvent(RuntimeEvent &pEvent);

    void setMinimumTouchPoints(IntegerType pMinimumTouchPoints){mMinimumTouchPoints = pMinimumTouchPoints;}
    IntegerType minimumTouchPoints(){return mMinimumTouchPoints;}
    long getMinimumTouchPoints() {return mMinimumTouchPoints.getValue();}

    void setMaximumTouchPoints(IntegerType pMaximumTouchPoints){mMaximumTouchPoints = pMaximumTouchPoints;}
    IntegerType maximumTouchPoints(){return mMaximumTouchPoints;}
    long getMaximumTouchPoints() {return mMaximumTouchPoints.getValue();}

    const RuntimeEvent *getEvent(const QString &pEventName) const;

    bool updateIn();

    void forceLeave();

    static const char *CLASS_NAME;

    typedef bool (*T_TACondition)(TouchArea &);
    typedef void (*T_TAAction)(TouchArea &);

private:
    // fonctions for transitions conditions
    static bool isEnable(TouchArea &pArea);
    static bool isDisabled(TouchArea &pArea);

    // statesMachine actions functions    
    static void raisePressEvent(TouchArea &pArea);
    static void raiseReleaseEvent(TouchArea &pArea);
    static void raiseUpdateEvent(TouchArea &pArea);
    static void raiseTouchUpdateEvent(TouchArea &pArea);

    BooleanType mEnable;
    BooleanType mFocused;

    IntegerType mMinimumTouchPoints;
    IntegerType mMaximumTouchPoints;

    StateMachine mStateMachine;    
    RuntimeEvent mPressEvent;
    RuntimeEvent mReleaseEvent;
    RuntimeEvent mUpdateEvent;
    RuntimeEvent mTouchUpdateEvent;

    PositionType    mPointerPositionX;
    PositionType    mPointerPositionY;
};

} /* namespace AP2I */

#endif // TOUCHAREA_H


