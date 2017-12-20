/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "polyline.h"

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

const char *Polyline::CLASS_NAME = "Polyline";

Polyline::Polyline(BasicObject *pParent)
    : BasicItem(pParent)
{
    setClassName(CLASS_NAME);
}

void Polyline::setPointsVector(StringType pPoints){
    if(( !pPoints.isDefined()) || (pPoints.getValue().size() == 0))
        return;

    mPointsVector.clear();

    std::string lPointsString = pPoints.getValue();

    std::size_t found1=lPointsString.find_first_of(",");
    std::size_t found2=lPointsString.find_first_of(" ");

    for( ; (found1 != std::string::npos) || (found2 != std::string::npos);){
        if( found1 < found2){
            std::string lPoint = lPointsString.substr(0, found1);
            mPointsVector.push_back(lPoint);
            lPointsString = lPointsString.substr(found1 + 1, lPointsString.length());
        }else {
            std::string lPoint = lPointsString.substr(0, found2);
            mPointsVector.push_back(lPoint);
            lPointsString = lPointsString.substr(found2 + 1, lPointsString.length());
        }

        found1=lPointsString.find_first_of(",");
        found2=lPointsString.find_first_of(" ");
    }
    mPointsVector.push_back(lPointsString);
}


bool Polyline::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);

    initDefaultFields();

    createPrimitive(pContext);

    drawPrimitive(pContext);

    return true;
}

bool Polyline::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);

    vgTranslate(-pContext.currentX()-getX(), -pContext.currentY()-getY());

    vgDestroyPath(mPolylinePath);

    return true;
}

void Polyline::initDefaultFields()
{
    BasicItem::initDefaultFields();

}

void Polyline::createPrimitive(RenderingContext &pContext)
{
    BasicItem::createPrimitive(pContext);

    mPolylinePath = vgCreatePath(VG_PATH_FORMAT_STANDARD, VG_PATH_DATATYPE_F,1,0,0,0, VG_PATH_CAPABILITY_ALL);

    if(( points().isDefined()) && (points().getValue().size() != 0)){
        VGfloat lPoints[mPointsVector.size()];
        for( unsigned int i=0; i < mPointsVector.size(); i++){
            lPoints[i] = (VGfloat)std::stof(mPointsVector.at(i));
        }

        int lNbPoints = (int)mPointsVector.size()/2;
        vguPolygon(mPolylinePath, lPoints, lNbPoints, VG_FALSE);

        vgTranslate(pContext.currentX()+getX(), pContext.currentY()+getY());

    }
    return;
}

void Polyline::drawPrimitive(RenderingContext &pContext)
{
    BasicItem::drawPrimitive(pContext);
    vgDrawPath(mPolylinePath, VG_STROKE_PATH);
}

} /* namespace AP2I */

