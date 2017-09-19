/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "engine.h"

namespace AP2I
{

Engine::Engine()
{
}

bool Engine::leftToRightTraversal(BasicObject *pRoot)
{
    bool lContinueTraversal = true;
    if (pRoot != NULL)
    {
        bool lVisitChildren = this->in(pRoot);

        if (lVisitChildren)
        {
            for (QList<QObject *>::const_iterator it = pRoot->children().begin();
                 lContinueTraversal && it != pRoot->children().end();
                 it++)
            {
                BasicObject *lCurrentChild = dynamic_cast<BasicObject *>(*it);
                lContinueTraversal = leftToRightTraversal(lCurrentChild);
            }
        }
        lContinueTraversal = this->out(pRoot) && lContinueTraversal;
    }
    return lContinueTraversal;
}

} /* namespace AP2I */
