/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "sendeventec.h"

#include "runtimeevent.h"
#include "component.h"
#include "runtimecontext.h"

#include <QScriptEngine>
#include <QScriptValue>
#include <QDebug>

namespace AP2I 
{

// Each Send Event Executable Content creates its own copy of the event
// because each copy can have differents parameters expressions;
SendEventEC::SendEventEC(Component &pComponent,
                         const QString &pEventName)
    : mComponent(pComponent),
      mEvent(pEventName, &pComponent)
{
    const RuntimeEvent *lEvent = pComponent.getEvent(pEventName);
    if (lEvent)
    {
        for (auto it = lEvent->beginParam(); it != lEvent->endParam(); ++it)
        {
            mEvent.addParameter(it->name, it->type);
        }
    }
    else
    {
        qDebug() << "ERROR: No event named " << pEventName
                 << "to raise for component " + pComponent.id() +
                    "(" + pComponent.className() + ")";
    }
}

SendEventEC::~SendEventEC()
{
}

void SendEventEC::setParamExpression(const QString &pParamName,
                                     const QString &pExpr)
{
    QString lScript(pExpr);
    lScript.replace("Tree.", "Tree_", Qt::CaseSensitive);
    lScript.replace("Behavior.", "Behavior_", Qt::CaseSensitive);

    mParamsExpr.insert(pParamName, QScriptProgram(lScript));
}

void SendEventEC::execute()
{
    for (auto it = mParamsExpr.begin(); it != mParamsExpr.end(); ++it)
    {
        QScriptValue lVal = mComponent.scriptEngine()->evaluate(it.value());
        if (mComponent.scriptEngine()->hasUncaughtException())
        {
            qDebug() << "ERROR: Parameter exception for event " + mEvent.name() + " of "
                     + mComponent.id() + "(" + mComponent.className() + ") :"
                     << lVal.toString() << "\n";
        }
        else
        {
            mEvent.setParamValue(it.key(), lVal.toVariant());
        }
    }

    mComponent.raiseEvent(mEvent);
}

} /* namespace AP2I */
