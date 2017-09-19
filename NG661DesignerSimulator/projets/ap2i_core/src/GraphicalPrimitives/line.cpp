/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "line.h"

#include "renderingcontext.h"
#include <iostream>
#include "debug_macros.h"
#include <QDebug>
#include "vg/openvg.h"
#include "vg/vgu.h"

namespace AP2I
{

const char *Line::CLASS_NAME = "Line";


Line::Line(BasicObject *pParent)
    : BasicItem(pParent)
{
    setClassName(CLASS_NAME);
}

bool Line::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);

    createPrimitive(pContext);

    runTransformCapacities();

    drawPrimitive(pContext);
    return true;
}

bool Line::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);

    vgDestroyPath(mLinePath);

    undoTransformCapacities();
    return true;
}

void Line::initDefaultFields()
{
    BasicItem::initDefaultFields();
    // Implicit bindings management
    if (!mX1.isDefined())
    {
        mX1 = 0.0;
    }
    if (!mY1.isDefined())
    {
        mY1 = 0.0;
    }
    if (!mX2.isDefined())
    {
        mX2 = 0.0;
    }
    if (!mY2.isDefined())
    {
        mY2 = 0.0;
    }
}

void Line::createPrimitive(RenderingContext &pContext)
{
    BasicItem::createPrimitive(pContext);

    mLinePath = vgCreatePath(VG_PATH_FORMAT_STANDARD, VG_PATH_DATATYPE_F,1,0,0,0, VG_PATH_CAPABILITY_ALL);
    vguLine(mLinePath, pContext.currentX()+getX1(), pContext.currentY()+getY1(), pContext.currentX()+getX2(), pContext.currentY()+getY2());
    return;
}

void Line::drawPrimitive(RenderingContext &pContext)
{
    BasicItem::drawPrimitive(pContext);

    vgDrawPath(mLinePath, VG_FILL_PATH | VG_STROKE_PATH);
}
} /* namespace AP2I */

