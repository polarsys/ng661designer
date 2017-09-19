/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef TRANSFORMITEM_H
#define TRANSFORMITEM_H

#include "basicitem.h"
#include <QMetaType>

namespace AP2I
{

class TransformItem : public BasicItem
{
    Q_OBJECT

    Q_PROPERTY(float angle READ angle WRITE setAngle)
    Q_PROPERTY(float scaleX READ scaleX WRITE setScaleX)
    Q_PROPERTY(float scaleY READ scaleY WRITE setScaleY)
    Q_PROPERTY(TransformOrigin origin READ origin WRITE setOrigin)
    Q_ENUMS(TransformOrigin)

public:
    explicit TransformItem(BasicObject *pParent = 0);

    virtual ~TransformItem() {}

    enum TransformOrigin
    {
        TRANSFORM_LEFT = 0,
        TRANSFORM_RIGHT,
        TRANSFORM_TOP,
        TRANSFORM_BOTTOM,
        TRANSFORM_CENTER,
        TRANSFORM_TOP_LEFT,
        TRANSFORM_TOP_RIGHT,
        TRANSFORM_BOTTOM_LEFT,
        TRANSFORM_BOTTOM_RIGHT
    };

    virtual bool renderIn(RenderingContext &pContext);
    virtual bool renderOut(RenderingContext &);

    void getOrigin(int &pX, int &pY);

    float angle() const { return mAngle; }
    void setAngle(float pAngle) { mAngle = pAngle; }

    float scaleX() const { return mScaleX; }
    void setScaleX(float pScaleX) { mScaleX = pScaleX; }

    float scaleY() const { return mScaleY; }
    void setScaleY(float pScaleY) { mScaleY = pScaleY; }

    TransformOrigin origin() { return mOrigin; }
    void setOrigin(TransformOrigin pOrigin) { mOrigin = pOrigin; }

    static const char *CLASS_NAME;

private:
    float mAngle;
    float mScaleX;
    float mScaleY;
    TransformOrigin mOrigin;
    int   mCurrentX;
    int   mCurrentY;
};

} /* namespace AP2I */

#endif // TRANSFORMITEM_H


