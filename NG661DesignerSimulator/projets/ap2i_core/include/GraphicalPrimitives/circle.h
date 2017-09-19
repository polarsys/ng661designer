/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef CIRCLE_H
#define CIRCLE_H

#include "basicitem.h"
#include "distancetype.h"
#include "positiontype.h"

namespace AP2I
{

class Circle : public BasicItem
{
    Q_OBJECT
    Q_PROPERTY(PositionType cx READ cx WRITE setCx)
    Q_PROPERTY(PositionType cy READ cy WRITE setCy)
    Q_PROPERTY(DistanceType r READ r WRITE setR)

public:
    explicit Circle(BasicObject *pParent = 0);

    virtual ~Circle() {}

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

    void setR(DistanceType pR){mR = pR;}
    DistanceType r(){return mR;}
    double getR() {return mR.getValue();}

    static const char *CLASS_NAME;

private:
    PositionType mCx;
    PositionType mCy;
    DistanceType mR;
    VGPath mCirclePath;

};

} /* namespace AP2I */

#endif // CIRCLE_H
