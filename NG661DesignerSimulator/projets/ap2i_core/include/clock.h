/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef CLOCK_H
#define CLOCK_H

#include "basicobject.h"
#include <QTime>

namespace AP2I
{

class Clock : public BasicObject
{
    Q_OBJECT

    Q_PROPERTY(int milliseconds READ milliseconds WRITE setMilliseconds)

public:
    explicit Clock(BasicObject *pParent = 0);

    virtual bool updateIn();

    int milliseconds() { return mMilliseconds; }
    void setMilliseconds(int pMilliseconds) { mMilliseconds = pMilliseconds; }

    static const char *CLASS_NAME;

private:
    int mMilliseconds;
    QTime mTime;
};

} /* namespace AP2I */

#endif // CLOCK_H


