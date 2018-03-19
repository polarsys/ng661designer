/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "statemachineparser.h"

#include "hsmcondition.h"
#include "statemachine.h"
#include "transition.h"
#include "state.h"
#include "component.h"
#include "hsmscript.h"
#include "runtimecontext.h"
#include "runtimeevent.h"
#include "sendeventec.h"
#include "parsingcontext.h"

#include <QDomElement>
#include <QStringList>
#include <QString>
#include <QDebug>

namespace AP2I 
{

StateMachineParser::StateMachineParser(ParsingContext &pContext)
    : DomParser(),
      mContext(pContext),
      mScriptEngine(mContext.mComponent.scriptEngine()),
      mCurrentParentState(NULL)
{
}

void StateMachineParser::digest(QDomElement &pElement)
{
    parse(pElement);
}

bool StateMachineParser::startElement(QDomElement &pElement)
{
    QString lNodeName = pElement.localName();
    /*Patch pour le Scxml*/
    QString lNodeNameLC = lNodeName.toLower();

    if(lNodeNameLC == "scxml")
    {
        StateMachine *lStateMachine = mContext.mComponent.createStateMachine();

        mCurrentParentState = lStateMachine->rootState();
    }
    else if(lNodeName == "state")
    {
        QString lStateName = pElement.attribute("id");
        State *lNewState = new State(lStateName, mCurrentParentState);
        mCurrentParentState = lNewState;

        // keep states in a map for transition target state retrieval
        mStates.insert(lStateName, lNewState);
    }
    else if(lNodeName == "transition")
    {
        const RuntimeEvent *lEvent = parseEvent(pElement.attribute("event"));
        QString lTarget = pElement.attribute("target");
        QString lCondStr = pElement.attribute("cond");
        HSMCondition *lCond = NULL;

        if (lCondStr != "")
        {
            lCondStr.replace("Tree.", "Tree_", Qt::CaseSensitive);
            lCondStr.replace("Behavior.", "Behavior_", Qt::CaseSensitive);
            lCond = new HSMCondition(mScriptEngine, lCondStr);
        }
        Transition *lNewTransition =
                new Transition(mCurrentParentState,
                               NULL, // target will be set at the end of parsing
                               lEvent,
                               lCond);
        mCurrentParentState->addTransition(lNewTransition);

        if (lEvent && lEvent->source() != &mContext.mComponent)
            lEvent->source()->addEventsListener(&mContext.mComponent);

        // we have to wait the end of the parsing in case the target state
        // haven't been parsed yet
        mTransitions.append(QPair<Transition *, QString>(
                                lNewTransition, lTarget));
    }
    else if(lNodeName == "script")
    {
        HSMScript *lScript = new HSMScript(pElement.text(),
                                           mScriptEngine);
        if (pElement.parentNode().localName() == "onentry")
        {
            mCurrentParentState->addOnEntryAction(lScript);
        }
        else if (pElement.parentNode().localName() == "onexit")
        {
            mCurrentParentState->addOnExitAction(lScript);
        }
        else
        {
            // transition action script
            mTransitions.last().first->addAction(lScript);
        }
    }
    else if(lNodeName == "send")
    {
        QString lEvent = pElement.attribute("event");
        QStringList lTokens = lEvent.split(".", QString::SkipEmptyParts);

        if (lTokens.size() == 2 && lTokens[0] == "Interface")
        {
            // deletion will be managed by State or Transition owner
            mCurrentSendEvent = new SendEventEC(mContext.mComponent, lTokens[1]);
            if (pElement.parentNode().localName() == "onentry")
            {
                mCurrentParentState->addOnEntryAction(mCurrentSendEvent);
            }
            else if (pElement.parentNode().localName() == "onexit")
            {
                mCurrentParentState->addOnEntryAction(mCurrentSendEvent);
            }
            else
            {
                mTransitions.last().first->addAction(mCurrentSendEvent);
            }
        }
        else
        {
            qDebug() << "ERROR: Invalid event name " << lEvent
                     << "; it shall be of the form Interface.<event_name>";
        }
    }
    else if (lNodeName == "param")
    {
        mCurrentSendEvent->setParamExpression(pElement.attribute("name"),
                                              pElement.attribute("expr"));
    }
    return true;
}

void StateMachineParser::endElement(QDomElement &pElement)
{
    QString lNodeName = pElement.localName();
    /*Patch pour le Scxml*/
    QString lNodeNameLC = lNodeName.toLower();

    if (lNodeNameLC == "scxml"
     || lNodeName == "state")
    {
        QString lInitialState = pElement.attribute("initial");
        if (lInitialState != "")
        {
            mCurrentParentState->setInitialState(lInitialState);
        }
        if (lNodeNameLC == "scxml")
        {
            //end of the parsing, update transitions with target states
            for (auto it = mTransitions.begin(); it != mTransitions.end(); it++)
            {
                (*it).first->setTarget(mStates[(*it).second]);
            }
        }
        mCurrentParentState = mCurrentParentState->parent();
    }
}

const RuntimeEvent *StateMachineParser::parseEvent(const QString &pEventField)
{
    const RuntimeEvent *lReturnValue = 0;

    if (pEventField != "")
    {
        BasicObject *lSource = NULL;
        QString lEventName;

        //event expression is of the form :
        //     {Tree, Behavior}.<item_name>.<event_name>
        QStringList lTokens = pEventField.split(".", QString::SkipEmptyParts);
        if (lTokens[0] == "Tree")
        {
            lSource = mContext.mRepresentation[lTokens[1]];
            lEventName = lTokens[2];
        }
        else if (lTokens[0] == "Behavior")
        {
            lSource = mContext.mBehavior[lTokens[1]];
            lEventName = lTokens[2];
        }
        else if (lTokens[0] == "POINTER")
        {
            lSource = mContext.mComponent.context().pointer();
            lEventName = lTokens[1];
        }
        else if (lTokens[0] == "KEYBOARD")
        {
            lSource = mContext.mComponent.context().keyboard();
            lEventName = lTokens[1];
        }
        if (lSource)
        {
            lReturnValue = lSource->getEvent(lEventName);
            if (!lReturnValue)
            {
                qDebug() << "ERROR: unknown event " << lEventName
                         << " for item " + lSource->id() +"(" + lSource->className() + ")";
            }
        }
        else
        {
            qDebug() << "ERROR: unknown event source "
                     << lTokens[0] + "." + lTokens[1];
        }
    }

    return lReturnValue;
}

} /* namespace AP2I */
