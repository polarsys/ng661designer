/*******************************************************************************
* Copyright (c) 2015, 2016, 2017 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef SCROLLWHEEL_H
#define SCROLLWHEEL_H
#include "basicobject.h"
#include "runtimeevent.h"
#include "Integertype.h"
#include "scrollwheelarea.h"

namespace AP2I
{

class ScrollWheel : public BasicObject
{
	Q_OBJECT
public:
    ScrollWheel();
	void setWheelDelta(int pDeltaWheel);

	const RuntimeEvent &wheelScrolledEvent  () const { return mWheelScrolledEvent  ; }
	IntegerType nbOfIncrements(){return mNbOfIncrements;}
	void reset();
	const RuntimeEvent *getEvent(const QString &pEventName) const;
	bool updateIn();
	
    bool requestFocus(ScrollWheelArea *pScrollWheelArea);
    bool releaseFocus(ScrollWheelArea *pScrollWheelArea);
    ScrollWheelArea* IsFocused();

    static const char *CLASS_NAME;

    static const char *EVENT_WHEEL_SCROLLED;
private: 
    IntegerType mNbOfIncrements;
    IntegerType mPrevNbOfIncrements;
    ScrollWheelArea* mFocusedScrollWheelArea;
    RuntimeEvent mWheelScrolledEvent;
    bool mScrolloccured;    
};

} /* namespace AP2I */

#endif // SCROLLWHEEL_H
