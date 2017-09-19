/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef EVENT_H
#define EVENT_H

#include <QString>

namespace AP2I
{

class Event
{
public:
    Event(const QString &pName);

    virtual ~Event() {}

    const QString &name() const { return mName; }
    void setName(const QString &pName) { mName = pName; }

    virtual bool matchEvent(const Event &pEvent) const;

private:
    QString mName;
};

} /* namespace AP2I */

#endif // EVENT_H


