/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "basicitem.h"

#include "renderingcontext.h"
#include "runtimecontext.h"

#include <iostream>
#include <QPaintDevice>
extern "C" {
#include "GL/gl.h"
#include "vgu.h"
}
#include "stippletype.h"

namespace AP2I
{

const char *BasicItem::CLASS_NAME = "BasicItem";

BasicItem::BasicItem(BasicObject *pParent)
    : BasicObject(pParent)
{
    setClassName(CLASS_NAME);
    PAINTFILL_INITIALIZERS;
    PAINTSTROKE_INITIALIZERS;
}

BasicItem::~BasicItem()
{
}

bool BasicItem::renderIn(RenderingContext &)
{

    // Set the fill rule
    if (fillRule() == "evenodd")
    {
        vgSeti(VG_FILL_RULE, VG_EVEN_ODD);
    }
    else if (fillRule() == "nonzero")
    {
        vgSeti(VG_FILL_RULE, VG_NON_ZERO);
    }
    else
    {
        std::cout << "Warning : unknown fillRule value" <<std::endl;
    }

    // Set the cap style
    if (strokeLineCap() == "butt")
    {
        vgSeti(VG_STROKE_CAP_STYLE, VG_CAP_BUTT);
    }
    else if (strokeLineCap() == "round")
    {
        vgSeti(VG_STROKE_CAP_STYLE, VG_CAP_ROUND);
    }
    else if (strokeLineCap() == "square")
    {
        vgSeti(VG_STROKE_CAP_STYLE, VG_CAP_SQUARE);
    }
    else
    {
        std::cout << "Warning : unknown strokeLineCap value" <<std::endl;
    }

    // Set the line join style
    if (strokeLineJoin() == "miter")
    {
        vgSeti(VG_STROKE_JOIN_STYLE, VG_JOIN_MITER);
    }
    else if (strokeLineJoin() == "round")
    {
        vgSeti(VG_STROKE_JOIN_STYLE, VG_JOIN_ROUND);
    }
    else if (strokeLineJoin() == "bevel")
    {
        vgSeti(VG_STROKE_JOIN_STYLE, VG_JOIN_BEVEL);
    }
    else
    {
        std::cout << "Warning : unknown strokeLineJoin value" <<std::endl;
    }

    // Set stroke width and miter limit
    vgSetf(VG_STROKE_LINE_WIDTH, strokeWidth().getValue());
    vgSetf(VG_STROKE_MITER_LIMIT, strokeMiterLimit().getValue());

    VGfloat fill_RGBA [4] = {fill().redf(), fill().greenf(), fill().bluef(), fill().alphaf() * (float)fillOpacity().getValue()};
    myFillPaint = vgCreatePaint();

    /* Fill with color paint */
    vgSetParameteri(myFillPaint, VG_PAINT_TYPE, VG_PAINT_TYPE_COLOR);
    vgSetParameterfv(myFillPaint, VG_PAINT_COLOR, 4, fill_RGBA);

    vgSetPaint(myFillPaint, VG_FILL_PATH);

    /* Stroke with color paint */
    ColorType lStrokeColor = stroke();
    if(lStrokeColor.isDefined()){
        VGfloat  stroke_RGBA [4] = {lStrokeColor.redf(), lStrokeColor.greenf(), lStrokeColor.bluef(), lStrokeColor.alphaf() * (float)strokeOpacity().getValue()};
        myStrokePaint = vgCreatePaint();

        vgSetParameteri(myStrokePaint, VG_PAINT_TYPE, VG_PAINT_TYPE_COLOR);
        vgSetParameterfv(myStrokePaint, VG_PAINT_COLOR, 4, stroke_RGBA);



        StippleType lDashArrayStipple = strokeDashArray();
        std::vector<std::string> lDashArray =lDashArrayStipple.getArray();
        int count = lDashArray.size();
        if(count != 0){

            VGfloat dashPattern[count];
            for ( int i=0; i<count; i++){
                VGfloat lValue = (VGfloat)std::stof(lDashArray.at(i));
                dashPattern[i] = lValue;
            }
            vgSetfv(VG_STROKE_DASH_PATTERN, (VGint)count, dashPattern);

            VGfloat dashPhase = strokeDashOffset();
            VGboolean dashPhaseReset = VG_TRUE;

            vgSetf(VG_STROKE_DASH_PHASE, dashPhase);
            vgSeti(VG_STROKE_DASH_PHASE_RESET, dashPhaseReset);
        }else{
            vgSetfv(VG_STROKE_DASH_PATTERN, 0, NULL);
        }

        vgSetPaint(myStrokePaint, VG_STROKE_PATH);
    }


    return true;
}


bool BasicItem::renderOut(RenderingContext &)
{
    vgDestroyPaint(myStrokePaint);
    vgDestroyPaint(myFillPaint);

    return true;
}

void BasicItem::initDefaultFields(){
}

void BasicItem::createPrimitive(RenderingContext &){
}

void BasicItem::drawPrimitive(RenderingContext &){
}

} /* namespace AP2I */
