/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef EXECUTEENGINE_H
#define EXECUTEENGINE_H

#include "engine.h"

namespace AP2I
{
class BasicObject;
class ExecuteEngine : public Engine
{
public:
    explicit ExecuteEngine();

    bool in(BasicObject *);
    bool out(BasicObject *);
};

} /* namespace AP2I */

#endif // EXECUTEENGINE_H


