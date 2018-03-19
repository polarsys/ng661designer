/*******************************************************************************
* Copyright (c) 2015, 2016, 2017 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "replicateentry.h"

#include "renderingcontext.h"
#include "text.h"

namespace AP2I
{

const char *ReplicateEntry::CLASS_NAME = "ReplicateEntry";

ReplicateEntry::ReplicateEntry(BasicObject *pParent)
    : BasicItem(pParent),
     mVisible("visible")
{
	setClassName(CLASS_NAME);    
}

bool ReplicateEntry::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);    

    return true;
}

bool ReplicateEntry::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);

    return true;
}

} /* namespace AP2I */
