/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "importparser.h"

#include "parsingcontext.h"
#include "componentfactory.h"
#include <QDomElement>

namespace AP2I 
{

ImportParser::ImportParser(ParsingContext &pContext)
    : mContext(pContext)
{
}

void ImportParser::digest(QDomElement &pElement)
{
    mContext.mFactory.registerComponent(pElement.attribute("file"));
}

} /* namespace AP2I */
