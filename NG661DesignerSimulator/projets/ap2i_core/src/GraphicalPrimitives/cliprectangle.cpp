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
//    VGint lCoordnumber = vgGetVectorSize(VG_SCISSOR_RECTS);
//    if (lCoordnumber < 4)
//    {
//        VGint singlecoords[4] = {pContext.currentX()+getX(),  pContext.currentY()+getY(),  getWidth(),  getHeight()};
//        vgSetiv(VG_SCISSOR_RECTS, 4, singlecoords);
//    }
//    else
//    {
//        VGint coords[lCoordnumber + 4];
//        vgGetiv(VG_SCISSOR_RECTS, lCoordnumber, coords);
//        coords[lCoordnumber] = pContext.currentX()+getX();
//        coords[lCoordnumber + 1] = pContext.currentY()+getY();
//        coords[lCoordnumber + 2] = getWidth();
//        coords[lCoordnumber + 3] = getHeight();
//        vgSetiv(VG_SCISSOR_RECTS, lCoordnumber + 4, coords);
//    }

    glScissor(pContext.currentX()+getX(), pContext.currentY()+getY(), getWidth(), getHeight());

    return;
}

} /* namespace AP2I */
