/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "crown.h"

#include "renderingcontext.h"
#include <iostream>
#include "debug_macros.h"
#include <QDebug>
#include "vg/openvg.h"
#include "vg/vgu.h"

extern "C" {
#include "GL/gl.h"
}

namespace AP2I
{

const char *Crown::CLASS_NAME = "Crown";


Crown::Crown(BasicObject *pParent)
    : BasicItem(pParent)
{
    setClassName(CLASS_NAME);
}

bool Crown::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);

    initDefaultFields();

    createPrimitive(pContext);

    runTransformCapacities();

    drawPrimitive(pContext);

    return true;
}

bool Crown::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);

    vgDestroyPaint(mCrownPath);

    undoTransformCapacities();
    return true;
}

void Crown::initDefaultFields(){
    BasicItem::initDefaultFields();
}

void Crown::createPrimitive(RenderingContext &pContext)
{
    BasicItem::createPrimitive(pContext);

    mCrownPath = vgCreatePath(VG_PATH_FORMAT_STANDARD, VG_PATH_DATATYPE_F,1,0,0,0, VG_PATH_CAPABILITY_ALL);

    vguEllipse(mCrownPath, pContext.currentX()+getX(), pContext.currentY()+getY(), getInnerRadius()*2.0, getInnerRadius()*2.0);
    vguEllipse(mCrownPath, pContext.currentX()+getX(), pContext.currentY()+getY(), getOuterRadius()*2.0, getOuterRadius()*2.0);

    return;
}

void Crown::drawPrimitive(RenderingContext &pContext)
{
    BasicItem::drawPrimitive(pContext);

    bool lIsFillDefined = fill().isDefined();
    if(lIsFillDefined)
    {
        vgDrawPath(mCrownPath, VG_FILL_PATH | VG_STROKE_PATH);
    }
    else
    {
        vgDrawPath(mCrownPath, VG_STROKE_PATH);
    }

}
} /* namespace AP2I */

