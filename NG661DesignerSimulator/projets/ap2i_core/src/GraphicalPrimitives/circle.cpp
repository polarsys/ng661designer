/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "circle.h"

#include "renderingcontext.h"
#include <iostream>
#include "debug_macros.h"
#include <QDebug>
#include "vg/openvg.h"
#include "vg/vgu.h"

namespace AP2I
{

const char *Circle::CLASS_NAME = "Circle";


Circle::Circle(BasicObject *pParent)
    : BasicItem(pParent)
{
    setClassName(CLASS_NAME);
}

bool Circle::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);

    initDefaultFields();

    createPrimitive(pContext);

    runTransformCapacities();

    drawPrimitive(pContext);

    return true;
}

bool Circle::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);

    vgDestroyPath(mCirclePath);

    undoTransformCapacities();
    return true;
}

void Circle::initDefaultFields(){
    BasicItem::initDefaultFields();

    // Implicit bindings management
    if (!mCx.isDefined())
    {
        mCx = 0.0;
    }

    if (!mCy.isDefined())
    {
        mCy = 0.0;
    }

    if (!mR.isDefined())
    {
        mR = 0.0;
    }
}

void Circle::createPrimitive(RenderingContext &pContext)
{
    BasicItem::createPrimitive(pContext);

    mCirclePath = vgCreatePath(VG_PATH_FORMAT_STANDARD, VG_PATH_DATATYPE_F,1,0,0,0, VG_PATH_CAPABILITY_ALL);
    vguEllipse(mCirclePath, pContext.currentX()+getCx(), pContext.currentY()+getCy(), getR()*2.0, getR()*2.0);

    return;
}

void Circle::drawPrimitive(RenderingContext &pContext)
{
    BasicItem::drawPrimitive(pContext);

    vgDrawPath(mCirclePath, VG_FILL_PATH | VG_STROKE_PATH);
}
} /* namespace AP2I */

