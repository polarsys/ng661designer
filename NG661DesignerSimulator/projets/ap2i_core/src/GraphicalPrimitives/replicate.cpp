/*******************************************************************************
* Copyright (c) 2015, 2016, 2017 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "replicate.h"
#include "replicateentry.h"
#include "component.h"

#include "renderingcontext.h"
namespace AP2I
{

const char *Replicate::CLASS_NAME = "Replicate";

Replicate::Replicate(BasicObject *pParent)
	: BasicItem(pParent)
{    
	setClassName(CLASS_NAME);
}

bool Replicate::renderIn(RenderingContext &pContext)
{  
    BasicItem::renderIn(pContext);    

    QObjectList lChildren;
    lChildren = this->children();
    int lVisibleIndex = 0;

    for (int j = 0; j<lChildren.size(); j++)
    {
        BasicItem *lItem = dynamic_cast<BasicItem *>(lChildren.at(j));
        if (j< firstIndex().getValue() || j > firstIndex().getValue() + numberOfInstance().getValue() - 1)
        {
            lItem->setVisibility("hidden");
        }
        else
        {
            lItem->setVisibility("visible");
            ReplicateEntry *lRe = dynamic_cast<ReplicateEntry *>(lItem);
            lRe->setIndex(lVisibleIndex);
            lVisibleIndex = lVisibleIndex + 1;
        }
    }    

    return true;
}

bool Replicate::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);        

    return true;
}
} /* namespace AP2I */
