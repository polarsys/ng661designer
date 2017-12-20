/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef COMPONENT_H
#define COMPONENT_H

#include <QList>
#include <QHash>
#include <QVariant>
#include "basicobject.h"
#include "eventcomponent.h"
#include "basicitem.h"
#include "replicateentry.h"

class QScriptEngine;

namespace AP2I
{

class Binding;
class RuntimeEvent;
class StateMachine;

class Component : public BasicObject
{
    Q_OBJECT

public:
    explicit Component(BasicObject *pParent = 0);
    virtual ~Component();

    void addBinding(const QString &pDestComponent,
                    const QString &pDestProperty,
                    const QString &pExpression);

    void registerRepresentationElement(BasicObject *pItem);
    void registerReplicateRepresentationElement(BasicObject *pItem, int pMaxItem);
    void registerReplicateEntryRepresentationElement(BasicObject *pItem, Replicate *pReplicate, int pNb);
    void registerReplicateChildRepresentationElement(BasicObject *pItem, ReplicateEntry *pReplicateEntry, QString pNb);
    void registerBehaviorElement(BasicObject *pItem);

    StateMachine *createStateMachine();

    void addProperty(const QString &pName, QVariant pVal);    

    RuntimeEvent *addEvent(const QString &pEventName);
    const RuntimeEvent *getEvent(const QString &pEventName) const;
    virtual bool handleEvent(RuntimeEvent &pEvent);
    void raiseEvent(RuntimeEvent &pEvent);

    virtual bool updateIn();
    virtual bool updateOut();

    QScriptEngine *scriptEngine() { return mScriptEngine; }

    bool event(QEvent *);

private:
    bool mInitialized;
    QList<Binding *> mBindings;
    QList<RuntimeEvent *> mEvents;
    QHash<QString, QVariant> mProperties;    
    QScriptEngine *mScriptEngine;
    StateMachine *mStateMachine;
    EventComponent *mEventComponent;
};

} /* namespace */

#endif // COMPONENT_H
