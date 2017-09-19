/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "enumparser.h"

#include <QDomElement>
#include <QStringList>

#include "enumtype.h"
#include "component.h"
#include "parsingcontext.h"

namespace AP2I
{

EnumParser::EnumParser(ParsingContext &pContext)
    : mContext(pContext)
{
}

void EnumParser::digest(QDomElement &pElement)
{
    QString lEnumName = mContext.mComponent.className() + "::" + pElement.attribute("name");
    QStringList lValues;
    QDomElement lCurrent = pElement.firstChildElement();
    while (!lCurrent.isNull())
    {
        lValues.append(lCurrent.attribute("value"));
        lCurrent = lCurrent.nextSiblingElement();
    }
    EnumType::addEnumeration(lEnumName, lValues);
    mContext.mTypes.insert(lEnumName, qMetaTypeId<EnumType>());
}

} /* namespace AP2I */
