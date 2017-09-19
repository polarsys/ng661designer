/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef ENGINE_H
#define ENGINE_H

#include "basicobject.h"

namespace AP2I
{

class Engine
{
public:
    explicit Engine();

    bool leftToRightTraversal(BasicObject *pRoot);

    virtual bool in(BasicObject *) { return true; }
    virtual bool out(BasicObject *) { return true; }

};

} /* namespace AP2I */

#endif // ENGINE_H


