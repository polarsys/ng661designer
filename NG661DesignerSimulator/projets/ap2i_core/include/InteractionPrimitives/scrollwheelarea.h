/*******************************************************************************
* Copyright (c) 2015, 2016, 2017 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef SCROLLWHEELAREA_H
#define SCROLLWHEELAREA_H

#include "basicitem.h"
#include "statemachine.h"
#include "runtimeevent.h"
#include "wheeleventstructtype.h"
#include "booleantype.h"

namespace AP2I
{

class ScrollWheelArea : public BasicItem
{
	Q_OBJECT
	Q_PROPERTY(bool enabled READ enabled WRITE setEnabled)
    Q_PROPERTY(bool needFocus READ needFocus WRITE setNeedFocus)
    Q_PROPERTY(bool focused READ focused)
	Q_PROPERTY(WheelEventStructType* data READ data)
public:
    explicit ScrollWheelArea(BasicObject *pParent = 0);
	bool enabled() { return mEnabled.value(); }
    void setEnabled(bool pEnabled) { mEnabled = BooleanType(pEnabled); }
    bool needFocus() { return mFocusNeeded.value(); }
    void setNeedFocus(bool pNeedFocus) { mFocusNeeded = BooleanType(pNeedFocus); }
	bool focused() {return mFocused.value(); }

    WheelEventStructType* data() const { return mData; }
	Q_INVOKABLE bool requestFocus();
    Q_INVOKABLE bool releaseFocus();

    void handleEvent(RuntimeEvent &pEvent);

    const RuntimeEvent *getEvent(const QString &pEventName) const;

    bool updateIn();

    static const char *CLASS_NAME;

	typedef bool (*T_PACondition)(ScrollWheelArea &);
    typedef void (*T_PAAction)(ScrollWheelArea &);

private:
	// fonctions for transitions conditions
	static bool isEnabled(ScrollWheelArea &pArea);
    static bool isDisabled(ScrollWheelArea &pArea);
    static bool isFocusNeeded(ScrollWheelArea &pArea);
    static bool isFocusNotNeeded(ScrollWheelArea &pArea);
    static bool isFocused(ScrollWheelArea &pArea);
    static bool isUnfocused(ScrollWheelArea &pArea);

    // statesMachine actions functions
    static void raiseFocusInEvent(ScrollWheelArea &pArea);
    static void raiseFocusOutEvent(ScrollWheelArea &pArea);
    static void raiseWheelScrolledEvent(ScrollWheelArea &pArea);    

	BooleanType mEnabled;
    BooleanType mFocusNeeded;    

    StateMachine mStateMachine;
    RuntimeEvent mFocusInEvent;
    RuntimeEvent mFocusOutEvent;
    RuntimeEvent mWheelScrolledEvent;    

    BooleanType mFocused;    
    WheelEventStructType* mData;
};

} /* namespace AP2I */

#endif // SCROLLWHEELAREA_H
