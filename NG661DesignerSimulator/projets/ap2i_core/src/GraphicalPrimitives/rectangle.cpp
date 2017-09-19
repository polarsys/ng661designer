/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "rectangle.h"

#include "renderingcontext.h"
extern "C" {
#include "vg/openvg.h"
#include "vg/vgu.h"
}
#include <stdarg.h>
#include <iostream>
#include "debug_macros.h"
#include <QDebug>

namespace AP2I
{

const char *Rectangle::CLASS_NAME = "Rectangle";

Rectangle::Rectangle(BasicObject *pParent)
    : BasicItem(pParent)
{
    setClassName(CLASS_NAME);
}

bool Rectangle::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);

    initDefaultFields();

    createPrimitive(pContext);

    runTransformCapacities();

    drawPrimitive(pContext);

    return true;
}

bool Rectangle::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);

    undoTransformCapacities();

    vgDestroyPath(mRectRound);

    return true;
}

void Rectangle::initDefaultFields()
{
    BasicItem::initDefaultFields();

    // Implicit bindings management
    if (!x().isDefined())
    {
       setX(0);
    }
    if (!y().isDefined())
    {
        setY(0);
    }

    if (!mRx.isDefined())
    {
        if(!mRy.isDefined())
        {
            // rx and ry are both undefined => rx = 0 , ry = 0
            mRx.setValue(0);
            mRy.setValue(0);
        }
        else
        {
            // rx is undefined and ry is defined => rx = ry
            mRx.setValue(getRy());
        }
    }
    else if (!mRy.isDefined())
    {
        // ry is undefined and rx is defined => ry = rx
        mRy.setValue(getRx());
    }


    if (!width().isDefined())
    {
        if(!height().isDefined())
        {
            // width and height are both undefined => width = 0, height = 0
            setWidth(0);
            setHeight(0);
        }
        else
        {
            // width is undefined and height is defined => width = height
            setWidth(height());
        }
    }
    else if (!height().isDefined())
    {
        // height is undefined and width is defined => height = width
        setHeight(width());
    }

    if (getRx() > (getWidth() / 2.0))
    {
        mRx.setValue(getWidth() / 2.0);
    }

    if (getRy() > (getHeight() / 2.0))
    {
        mRy.setValue(getHeight() / 2.0);
    }
}

void Rectangle::createPrimitive(RenderingContext &pContext)
{
    BasicItem::createPrimitive(pContext);

    mRectRound = vgCreatePath(VG_PATH_FORMAT_STANDARD, VG_PATH_DATATYPE_F,1,0,0,0, VG_PATH_CAPABILITY_ALL);

    vguRoundRect(mRectRound, pContext.currentX()+getX(), pContext.currentY()+getY(), getWidth(), getHeight(), getRx(), getRy());

    return;
}

void Rectangle::drawPrimitive(RenderingContext &pContext)
{
    BasicItem::drawPrimitive(pContext);
    vgDrawPath(mRectRound, VG_FILL_PATH | VG_STROKE_PATH);
}

} /* namespace AP2I */

