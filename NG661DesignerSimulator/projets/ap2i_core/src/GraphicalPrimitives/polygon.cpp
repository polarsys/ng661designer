/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "polygon.h"

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

const char *Polygon::CLASS_NAME = "Polygon";

Polygon::Polygon(BasicObject *pParent)
    : BasicItem(pParent)
{
    setClassName(CLASS_NAME);
}

void Polygon::setPointsVector(StringType pPoints){
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


bool Polygon::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);

    initDefaultFields();

    createPrimitive(pContext);

    drawPrimitive(pContext);

    return true;
}

bool Polygon::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);

    vgTranslate(-pContext.currentX()-getX(), -pContext.currentY()-getY());

    vgDestroyPath(mPolygonPath);

    return true;
}

void Polygon::initDefaultFields()
{
    BasicItem::initDefaultFields();

}

void Polygon::createPrimitive(RenderingContext &pContext)
{
    BasicItem::createPrimitive(pContext);

    mPolygonPath = vgCreatePath(VG_PATH_FORMAT_STANDARD, VG_PATH_DATATYPE_F,1,0,0,0, VG_PATH_CAPABILITY_ALL);

    if(( points().isDefined()) && (points().getValue().size() != 0)){
        VGfloat lPoints[mPointsVector.size()];
        for( uint i=0; i < mPointsVector.size(); i++){
            lPoints[i] = (VGfloat)std::stof(mPointsVector.at(i));
        }

        int lNbPoints = (int)mPointsVector.size()/2;
        vguPolygon(mPolygonPath, lPoints, lNbPoints, VG_TRUE);

        vgTranslate(pContext.currentX()+getX(), pContext.currentY()+getY());

    }
    return;
}

void Polygon::drawPrimitive(RenderingContext &pContext)
{
    BasicItem::drawPrimitive(pContext);
    vgDrawPath(mPolygonPath, VG_FILL_PATH | VG_STROKE_PATH);
}

} /* namespace AP2I */


