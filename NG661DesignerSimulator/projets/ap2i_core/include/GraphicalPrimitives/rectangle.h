/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef RECTANGLE_H
#define RECTANGLE_H

#include "basicitem.h"
//#include "datetype.h"
#include "distancetype.h"
#include "positiontype.h"
#include "expressiontype.h"

namespace AP2I
{

class Rectangle : public BasicItem
{
    Q_OBJECT
    Q_PROPERTY(DistanceType rx READ rx WRITE setRx)
    Q_PROPERTY(DistanceType ry READ ry WRITE setRy)
    Q_PROPERTY(ExpressionType expression READ expression WRITE setExpression)
    //    Q_PROPERTY(DateType date READ date WRITE setDate)

public:
    explicit Rectangle(BasicObject *pParent = 0);
    virtual ~Rectangle() {}

    virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut(RenderingContext &pContext);
    virtual void    initDefaultFields();
    virtual void    createPrimitive(RenderingContext &pContext);
    virtual void    drawPrimitive(RenderingContext &pContext);

    void setRx(DistanceType pRx){mRx = pRx;}
    DistanceType rx(){return mRx;}
    double getRx() {return mRx.getValue();}

    void setRy(DistanceType pRy){mRy = pRy;}
    DistanceType ry(){return mRy;}
    double getRy() {return mRy.getValue();}

    //    void setDate(DateType pDate){mDate = pDate;}
    //    DateType date(){return mDate;}
    void setExpression(ExpressionType pExpression){mExpression = pExpression;}
    ExpressionType expression(){return mExpression;}

    static const char *CLASS_NAME;

private:
    DistanceType mRx;
    DistanceType mRy;
    ExpressionType mExpression;
    VGPath mRectRound;
    //    DateType mDate;
};

} /* namespace AP2I */

#endif // RECTANGLE_H
