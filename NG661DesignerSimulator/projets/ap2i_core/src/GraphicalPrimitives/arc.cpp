/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "arc.h"

#include "renderingcontext.h"
extern "C" {
#include "vg/openvg.h"
#include "vg/vgu.h"
}
#include <stdarg.h>
#include <iostream>
#include "debug_macros.h"
#include <QDebug>
#include <vector>

namespace AP2I
{

const char *Arc::CLASS_NAME = "Arc";

Arc::Arc(BasicObject *pParent)
    : BasicItem(pParent)
{
    setClassName(CLASS_NAME);
}


bool Arc::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);

    initDefaultFields();

    createPrimitive(pContext);

    runTransformCapacities();

    drawPrimitive(pContext);

    return true;
}

bool Arc::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);

    vgDestroyPath(mArcPath);

    undoTransformCapacities();

    return true;
}

void Arc::initDefaultFields()
{
    BasicItem::initDefaultFields();

}

void Arc::createPrimitive(RenderingContext &pContext)
{
    BasicItem::createPrimitive(pContext);

    mArcPath = vgCreatePath(VG_PATH_FORMAT_STANDARD, VG_PATH_DATATYPE_F,1,0,0,0, VG_PATH_CAPABILITY_ALL);

    bool lIsFillDefined = fill().isDefined();
    if(lIsFillDefined){
        vguArc(mArcPath, pContext.currentX()+getX(), pContext.currentY()+getY(), 2 * radius().getValue(), 2 * radius().getValue(), inboundAngle().getValue(), -angle().getValue(), VGU_ARC_PIE);
    }else{
        vguArc(mArcPath, pContext.currentX()+getX(), pContext.currentY()+getY(), 2 * radius().getValue(), 2 * radius().getValue(), inboundAngle().getValue(), -angle().getValue(), VGU_ARC_OPEN);
    }

    return;
}

void Arc::drawPrimitive(RenderingContext &pContext)
{
    BasicItem::drawPrimitive(pContext);
    bool lIsFillDefined = fill().isDefined();
    if(lIsFillDefined){
        vgDrawPath(mArcPath, VG_FILL_PATH | VG_STROKE_PATH);
    }else{
        vgDrawPath(mArcPath, VG_STROKE_PATH);
    }
}
}/* namespace AP2I */

