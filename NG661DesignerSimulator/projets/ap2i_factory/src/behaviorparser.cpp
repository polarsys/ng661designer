/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "behaviorparser.h"

#include "component.h"
#include "basicobject.h"
#include "parsingcontext.h"
#include "parsingutils.h"
#include "clock.h"
#include "componentfactory.h"
#include <QDebug>
#include <QString>
#include <iostream>

namespace AP2I 
{

BehaviorParser::BehaviorParser(ParsingContext &pContext)
    : DomParser(),
      mContext(pContext)
{
}

void BehaviorParser::digest(QDomElement &pElement)
{
    mParents.push(QPair<BasicObject *, QDomElement>(&mContext.mComponent, pElement));
    parse(pElement);
}

bool BehaviorParser::startElement(QDomElement &pElement)
{
    BasicObject *lNewObject = 0;
    BasicObject *lCurrentParent = mParents.top().first;
    QString pElemName = pElement.localName();
    /*Patch pour le Scxml*/
    QString pElemNameLC = pElemName.toLower();
    if (pElemName == "Behavior")
    {
        //ignore
        return true;
    }
    else if (pElemNameLC == "scxml" || pElemName == "Function" )
    {
        // don't parse children
        return false;
    }
    else if (pElemName == "Clock")
    {
        lNewObject = new Clock(lCurrentParent);
    }
    else if (pElemName == "component")
    {
        // others possible elements are component instances
        lNewObject = mContext.mFactory.instantiateComponent(
                                 lCurrentParent, pElement.attribute("type"));
    }

    // set Properties for created item
    if (lNewObject)
    {
        lNewObject->setOwner(&mContext.mComponent);
        lNewObject->setOriginComponent(&mContext.mComponent);
        ParsingUtils::parseItemProperties(mContext.mComponent, *lNewObject, pElement);
        mContext.mComponent.registerBehaviorElement(lNewObject);
        mContext.mBehavior.insert(lNewObject->id(), lNewObject);
        mParents.push(QPair<BasicObject *, QDomElement>(lNewObject, pElement));
    }
    return true;
}

void BehaviorParser::endElement(QDomElement &pElement)
{
    if (mParents.top().second == pElement)
    {
        mParents.pop();
    }
}

} /* namespace AP2I */
