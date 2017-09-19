/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef RENDERINGENGINE_H
#define RENDERINGENGINE_H

#include "engine.h"
#include "renderingcontext.h"
#include <QStack>

//class QPaintDevice;

namespace AP2I
{
class BasicObject;
class RenderingEngine : public Engine
{
public:
    explicit RenderingEngine(/*QPaintDevice *pDevice = 0*/);

    void setPaintDevice(QPaintDevice *pDevice);

    bool in(BasicObject *pObject);
    bool out(BasicObject *pObject);


private:
    QStack<RenderingContext> mContexts;
};

} /* namespace AP2I */

#endif // RENDERINGENGINE_H


