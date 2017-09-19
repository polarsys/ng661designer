/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef LINE_H
#define LINE_H

#include "basicitem.h"
#include "distancetype.h"
#include "positiontype.h"

namespace AP2I
{

class Line : public BasicItem
{
    Q_OBJECT
    Q_PROPERTY(PositionType x1 READ x1 WRITE setX1)
    Q_PROPERTY(PositionType y1 READ y1 WRITE setY1)
    Q_PROPERTY(PositionType x2 READ x2 WRITE setX2)
    Q_PROPERTY(PositionType y2 READ y2 WRITE setY2)

public:
    explicit Line(BasicObject *pParent = 0);

    virtual ~Line() {}

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

    void setX2(PositionType pX2){mX2 = pX2;}
    PositionType x2(){return mX2;}
    double getX2() {return mX2.getValue();}

    void setY2(PositionType pY2){mY2 = pY2;}
    PositionType y2(){return mY2;}
    double getY2() {return mY2.getValue();}

    static const char *CLASS_NAME;

private:
    PositionType mX1;
    PositionType mY1;
    PositionType mX2;
    PositionType mY2;
    VGPath mLinePath;

};

} /* namespace AP2I */

#endif // LINE_H
