/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef POLARLINE_H
#define POLARLINE_H

#include "basicitem.h"
#include "distancetype.h"
#include "positiontype.h"
#include "angletype.h"

namespace AP2I
{

class Polarline : public BasicItem
{
    Q_OBJECT
    Q_PROPERTY(PositionType x1 READ x1 WRITE setX1)
    Q_PROPERTY(PositionType y1 READ y1 WRITE setY1)
    Q_PROPERTY(DistanceType r READ r WRITE setR)
    Q_PROPERTY(AngleType angle READ angle WRITE setAngle)

public:
    explicit Polarline(BasicObject *pParent = 0);
    virtual ~Polarline() {}

    virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut(RenderingContext &pContext);
    virtual void    initDefaultFields();
    virtual void    createPrimitive(RenderingContext &pContext);
    virtual void    drawPrimitive(RenderingContext &pContext);

    void setX1(PositionType pX1){mX1 = pX1;}
    PositionType x1(){return mX1;}
    double getX1() {return mX1.getValue();}

    void setY1(PositionType pY1){mY1 = pY1;}
    PositionType y1(){return mY1;}
    double getY1() {return mY1.getValue();}

    void setR(DistanceType pR){mR = pR;}
    DistanceType r(){return mR;}
    double getR() {return mR.getValue();}

    void setAngle(AngleType pAngle){mAngle = pAngle; }
    AngleType angle(){return mAngle;}
    double getAngle() {return mAngle.getValue();}

    static const char *CLASS_NAME;

private:
    PositionType mX1;
    PositionType mY1;
    AngleType mAngle;
    DistanceType mR;
    VGPath mPolarlinePath;

};


} /* namespace AP2I */

#endif // POLARLINE_H
