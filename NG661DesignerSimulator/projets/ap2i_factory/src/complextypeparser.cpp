/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "complextypeparser.h"

#include <QDomElement>

#include "parsingcontext.h"

namespace AP2I
{

ComplexTypeParser::ComplexTypeParser(ParsingContext &pContext)
    : mContext(pContext)
{
}

void digest(QDomElement &pElement)
{
    QString lElemName = pElement.localName();

    if (lElemName == "Struct")
    {
        QDomElement lCurrent = pElement.firstChildElement();
        while (!lCurrent.isNull())
        {
            lCurrent = lCurrent.nextSiblingElement();
        }
    }
    else if (lElemName == "Array")
    {

    }
}

} /* namespace AP2I */
