/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "ellipse.h"

#include "renderingcontext.h"
#include <iostream>
#include "debug_macros.h"
#include <QDebug>
#include "vg/openvg.h"
#include "vg/vgu.h"

namespace AP2I
{

const char *Ellipse::CLASS_NAME = "Ellipse";


Ellipse::Ellipse(BasicObject *pParent)
    : BasicItem(pParent)
{
    setClassName(CLASS_NAME);
}

bool Ellipse::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);

    initDefaultFields();

    createPrimitive(pContext);

    drawPrimitive(pContext);

    return true;
}

bool Ellipse::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);

    vgDestroyPath(mEllipsePath);

    return true;
}

void Ellipse::initDefaultFields(){
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

    if (!mRx.isDefined())
    {
        if(!mRy.isDefined())
        {
            // rx and ry are both undefined => rx = 0 , ry = 0
            mRx = 0.0;
            mRy = 0.0;
        }
        else
        {
            // rx is undefined and ry is defined => rx = ry
            mRx = mRy;
        }
    }
    else if (!mRy.isDefined())
    {
        // ry is undefined and rx is defined => ry = rx
        mRy = mRx;
    }
}

void Ellipse::createPrimitive(RenderingContext &pContext)
{
    BasicItem::createPrimitive(pContext);

    mEllipsePath = vgCreatePath(VG_PATH_FORMAT_STANDARD, VG_PATH_DATATYPE_F,1,0,0,0, VG_PATH_CAPABILITY_ALL);
    vguEllipse(mEllipsePath, pContext.currentX()+getCx(), pContext.currentY()+getCy(), getRx(), getRy());

    return;
}

void Ellipse::drawPrimitive(RenderingContext &pContext)
{
    BasicItem::drawPrimitive(pContext);

    vgDrawPath(mEllipsePath, VG_FILL_PATH | VG_STROKE_PATH);
}
} /* namespace AP2I */

