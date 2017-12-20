/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "executeengine.h"

#include "basicobject.h"

namespace AP2I
{

ExecuteEngine::ExecuteEngine()
    : Engine()
{
}


bool ExecuteEngine::in(BasicObject *pItem)
{
    if (pItem->visibility().getValue().compare("visible") == 0)
    {
        return pItem->updateIn();
    }
    else
    {
        return false;
    }
}

bool ExecuteEngine::out(BasicObject *pItem)
{
    if (pItem->visibility().getValue().compare("visible") == 0)
    {
        return pItem->updateOut();
    }
    else
    {
        return true;
    }
}

} /* namespace AP2I */
