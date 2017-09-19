/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef ELLIPSE_H
#define ELLIPSE_H

#include "basicitem.h"
#include "distancetype.h"
#include "positiontype.h"

namespace AP2I
{

class Ellipse : public BasicItem
{
    Q_OBJECT
    Q_PROPERTY(PositionType cx READ cx WRITE setCx)
    Q_PROPERTY(PositionType cy READ cy WRITE setCy)
    Q_PROPERTY(DistanceType rx READ rx WRITE setRx)
    Q_PROPERTY(DistanceType ry READ ry WRITE setRy)

public:
    explicit Ellipse(BasicObject *pParent = 0);

    virtual ~Ellipse() {}

    virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut(RenderingContext &pContext);
    virtual void    initDefaultFields();
    virtual void    createPrimitive(RenderingContext &pContext);
    virtual void    drawPrimitive(RenderingContext &pContext);

    void setCx(PositionType pCx){mCx = pCx;}
    PositionType cx(){return mCx;}
    double getCx() {return mCx.getValue();}

    void setCy(PositionType pCy){mCy = pCy;}
    PositionType cy(){return mCy;}
    double getCy() {return mCy.getValue();}

    void setRx(DistanceType pRx){mRx = pRx;}
    DistanceType rx(){return mRx;}
    double getRx() {return mRx.getValue();}

    void setRy(DistanceType pRy){mRy = pRy;}
    DistanceType ry(){return mRy;}
    double getRy() {return mRy.getValue();}

    static const char *CLASS_NAME;

private:
    PositionType mCx;
    PositionType mCy;
    DistanceType mRx;
    DistanceType mRy;
    VGPath mEllipsePath;

};

} /* namespace AP2I */

#endif // ELLIPSE_H
