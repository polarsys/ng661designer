/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef ARC_H
#define ARC_H

#include "basicitem.h"
#include "angletype.h"
#include "distancetype.h"
#include "positiontype.h"
#include "expressiontype.h"

namespace AP2I
{

class Arc : public BasicItem
{
    Q_OBJECT
    Q_PROPERTY(AngleType inboundAngle READ inboundAngle WRITE setInboundAngle)
    Q_PROPERTY(AngleType angle READ angle WRITE setAngle)
    Q_PROPERTY(DistanceType radius READ radius WRITE setRadius)

public:
    explicit Arc(BasicObject *pParent = 0);
    virtual ~Arc() {}

    virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut(RenderingContext &pContext);
    virtual void    initDefaultFields();
    virtual void    createPrimitive(RenderingContext &pContext);
    virtual void    drawPrimitive(RenderingContext &pContext);

    void setInboundAngle(AngleType pInboundAngle){mInboundAngle = pInboundAngle; }
    AngleType inboundAngle(){return mInboundAngle;}
    void setAngle(AngleType pAngle){mAngle = pAngle; }
    AngleType angle(){return mAngle;}
    void setRadius(DistanceType pRadius){mRadius = pRadius; }
    DistanceType radius(){return mRadius;}

    static const char *CLASS_NAME;

private:
    AngleType mInboundAngle;
    AngleType mAngle;
    DistanceType mRadius;
    VGPath mArcPath;

};

} /* namespace AP2I */

#endif // ARC_H
