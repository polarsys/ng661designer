/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef EVENTCOMPONENT_H
#define EVENTCOMPONENT_H

#include <QList>
#include <QHash>
#include <QVariant>

class QScriptEngine;

namespace AP2I
{

class RuntimeEvent;
class StateMachine;

class EventComponent : public QObject
{
    Q_OBJECT

public:
    explicit EventComponent(QScriptEngine *pScriptEngine);
    virtual ~EventComponent();

    void addEvent(const QString &pEventName, QVariant pVal);

    void clearEvents();

    bool event(QEvent *);

private:
    bool mInitialized;
    bool mClearInProgress;
    QHash<QString, QVariant> mEvents;
};

} /* namespace */

#endif // EVENTCOMPONENT_H
