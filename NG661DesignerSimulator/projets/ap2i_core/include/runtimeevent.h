/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef RUNTIMEEVENT_H
#define RUNTIMEEVENT_H

#include "event.h"

#include <QString>
#include <QVariant>
#include <QList>

namespace AP2I
{

class BasicObject;

class RuntimeEvent : public Event
{
public:

    struct EventParam
    {
        QString name;
        int type;
        QVariant value;
    };

    RuntimeEvent(const QString &pName, BasicObject *pSource);

    virtual ~RuntimeEvent() {}

    bool matchEvent(const Event &pEvent) const;

    BasicObject *source() const { return mSource; }

    void addParameter(const QString &pName, int pType);

    void setParamValue(const QString &pParamName,
                       const QVariant &pValue);

    QList<EventParam>::iterator beginParam() { return mParameters.begin(); }
    QList<EventParam>::iterator endParam()   { return mParameters.end(); }

    QList<EventParam>::const_iterator beginParam() const { return mParameters.begin(); }
    QList<EventParam>::const_iterator endParam()   const { return mParameters.end(); }

private:
    RuntimeEvent();
    BasicObject *mSource;
    QList<EventParam> mParameters;
};

} /* namespace AP2I */

#endif // RUNTIMEEVENT_H


