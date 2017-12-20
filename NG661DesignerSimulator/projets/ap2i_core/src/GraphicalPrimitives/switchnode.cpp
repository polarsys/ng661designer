/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "switchnode.h"

#include "renderingcontext.h"
#include "children.h"
#include <Qstring>

namespace AP2I
{

const char *SwitchNode::CLASS_NAME = "SwitchNode";

SwitchNode::SwitchNode(BasicObject *pParent)
	: BasicItem(pParent)
{
	setClassName(CLASS_NAME);
}

bool SwitchNode::renderIn(RenderingContext &pContext)
{
    QObjectList lChildren;
    BasicItem::renderIn(pContext);

    lChildren = this->children();

    if (lChildren.size() == 1)
    {
        Children * lChildrenPrimitive = dynamic_cast<Children *>(lChildren[0]);
        if (lChildrenPrimitive)
        {
            lChildren = lChildrenPrimitive->children();
        }
    }

    for (int i = 0; i<lChildren.size(); i++)
    {
        BasicObject *lObject = dynamic_cast<BasicObject *>(lChildren[i]);
        if (lObject)
        {            
            if(lObject->id().compare(QString(activeChild().getValue().c_str()), Qt::CaseInsensitive) == 0)
            {                
                setChildrenVisibility(lObject, true);
            }
            else
            {             
                setChildrenVisibility(lObject, false);
            }
        }
        else
        {
            /* Nothing to do */
        }
    }

    return true;
}

bool SwitchNode::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);    

    return true;
}

void SwitchNode::setChildrenVisibility(BasicObject *pObject, bool pVisible)
{
    QObjectList lChildren;
    BasicItem *lItem = dynamic_cast<BasicItem *>(pObject);
    if(lItem)
    {
        if (pVisible == true)
        {
            lItem->setVisibility("visible");
        }
        else
        {
            lItem->setVisibility("hidden");
        }
    }
    else
    {
        lChildren = pObject->children();
        for (int i = 0; i<lChildren.size(); i++)
        {
            BasicObject *lObject = dynamic_cast<BasicObject *>(lChildren[i]);
            SwitchNode::setChildrenVisibility(lObject, pVisible);
        }
    }
}

} /* namespace AP2I */
