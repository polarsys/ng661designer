/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "domparser.h"

#include <QDomElement>

namespace AP2I 
{

DomParser::DomParser()
{
}

void DomParser::parse(QDomElement &pRoot)
{
    parseElement(pRoot);
}

void DomParser::parseElement(QDomElement &pElement)
{
    bool lParseChildren = startElement(pElement);

    QDomElement lCurrent = pElement.firstChildElement();
    while (lParseChildren && !lCurrent.isNull())
    {
        parseElement(lCurrent);
        lCurrent = lCurrent.nextSiblingElement();
    }

    endElement(pElement);
}

} /* namespace AP2I */
