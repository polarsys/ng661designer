/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "cliprectangle.h"

#include "renderingcontext.h"
extern "C" {
#include "GL/gl.h"
}

namespace AP2I
{

const char *ClipRectangle::CLASS_NAME = "ClipRectangle";

ClipRectangle::ClipRectangle(BasicObject *pParent)
    : Rectangle(pParent)
{
    setClassName(CLASS_NAME);
}

bool ClipRectangle::renderIn(RenderingContext &pContext)
{
    createPrimitive(pContext);

    return true;
}

bool ClipRectangle::renderOut()
{
    return true;
}

void ClipRectangle::createPrimitive(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);
    glScissor(pContext.currentX()+getX(), pContext.currentY()+getY(), getWidth(), getHeight());

    return;
}

} /* namespace AP2I */
