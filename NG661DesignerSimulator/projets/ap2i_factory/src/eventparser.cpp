/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "eventparser.h"

#include "component.h"
#include "parsingcontext.h"
#include "runtimeevent.h"
#include <QDomElement>
#include <QDebug>

namespace AP2I 
{

EventParser::EventParser(ParsingContext &pContext)
    : mContext(pContext),
      mCurrentEvent(0)
{
}

void EventParser::digest(QDomElement &pElement)
{
    QString lElemName = pElement.localName();

    if (lElemName == "Event")
    {
        QString lEventName = pElement.attribute("name");
        if (!lEventName.isEmpty())
        {
            mCurrentEvent = mContext.mComponent.addEvent(lEventName);
        }
        else
        {
            qDebug() << "ERROR: The <event> element doesn't have a \"name\" atribute.";
        }
    }
    else if (lElemName == "Param")
    {
        QString lType = pElement.attribute("type").section(":", -1);
        if (mContext.mTypes.contains(lType))
        {
            mCurrentEvent->addParameter(pElement.attribute("name"),
                                        mContext.mTypes[lType]);
        }
        else
        {
            qDebug() << "ERROR: Unknown parameter type " << lType << " for event "
                     << mCurrentEvent->name();
        }
    }
}

} /* namespace AP2I */
