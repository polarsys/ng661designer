/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "renderingengine.h"

#include "basicitem.h"
#include <QDebug>

namespace AP2I 
{

RenderingEngine::RenderingEngine(/*QPaintDevice *pDevice*/)
    : Engine()
{
    mContexts.push(RenderingContext(/*pDevice*/));
}


bool RenderingEngine::in(BasicObject *pObject)
{
    BasicItem *lItem = dynamic_cast<BasicItem *>(pObject);
    if (lItem)
    {
        if (lItem->visible())
        {
            mContexts.push(mContexts.top());
            return lItem->renderIn(mContexts.top());
        }
        else
        {
            return false;
        }
    }
    else
    {
        // not a graphic object
        return pObject->visible();
    }
}

bool RenderingEngine::out(BasicObject *pObject)
{
    BasicItem *lItem = dynamic_cast<BasicItem *>(pObject);
    if (lItem && lItem->visible())
    {
        bool lRes = lItem->renderOut(mContexts.top());
        mContexts.pop();
        return lRes;
    }
    else
    {
        return true;
    }
}

} /* namespace AP2I */
