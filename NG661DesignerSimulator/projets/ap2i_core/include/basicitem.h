/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef BASICITEM_H
#define BASICITEM_H

#include "basicobject.h"
#include "CapacitiesMacros.h"
#include "vg/openvg.h"
#include <string>

namespace AP2I
{

class BasicItem : public BasicObject
{
    Q_OBJECT
    PAINTFILL_PROPERTIES
    PAINTSTROKE_PROPERTIES
    CLIP_PROPERTIES
    FILTER_PROPERTIES
    TRANSFORM_PROPERTIES

    Q_PROPERTY(PositionType x READ x WRITE setX)
    Q_PROPERTY(PositionType y READ y WRITE setY)
    Q_PROPERTY(DistanceType width READ width WRITE setWidth)
    Q_PROPERTY(DistanceType height READ height WRITE setHeight)
    Q_PROPERTY(float opacity READ opacity WRITE setOpacity)    

public:
    explicit BasicItem(BasicObject *pParent = 0);

    virtual ~BasicItem();

    PAINTFILL_METHODS
    PAINTSTROKE_METHODS
    GRAPHICS_METHODS
    CLIP_METHODS
    FILTER_METHODS
    TRANSFORM_METHODS

    virtual bool renderIn(RenderingContext &pContext);
    virtual bool renderOut(RenderingContext &);

    void setX(PositionType pX){mX = pX;}
    PositionType x(){return mX;}
    double getX() {return mX.getValue();}

    void setY(PositionType pY){mY = pY;}
    PositionType y(){return mY;}
    double getY() {return mY.getValue();}

    void setWidth(DistanceType pWidth){mWidth = pWidth;}
    DistanceType width(){return mWidth;}
    double getWidth() {return mWidth.getValue();}

    void setHeight(DistanceType pHeight){mHeight = pHeight;}
    DistanceType height(){return mHeight;}
    double getHeight() {return mHeight.getValue();}

    virtual float opacity() const { return mOpacity; }
    virtual void setOpacity(float pOpacity) { mOpacity = pOpacity; }    

    static const char *CLASS_NAME;

protected :
    void    initDefaultFields();
    void    createPrimitive(RenderingContext &pContext);
    void    drawPrimitive(RenderingContext &pContext);

private:
    PAINTFILL_FIELDS
    PAINTSTROKE_FIELDS
    CLIP_FIELDS
    FILTER_FIELDS
    TRANSFORM_FIELDS

    VGPaint myFillPaint;
    VGPaint myStrokePaint;

    PositionType mX;
    PositionType mY;
    DistanceType mWidth;
    DistanceType mHeight;
    float mOpacity;    

    VGImage mImage;
};

} /* namespace AP2I */

#endif // BASICITEM_H


