/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef CROWN_H
#define CROWN_H

#include "basicitem.h"
#include "distancetype.h"

namespace AP2I
{

class Crown : public BasicItem
{
    Q_OBJECT
    Q_PROPERTY(DistanceType outerRadius READ outerRadius WRITE setOuterRadius)
    Q_PROPERTY(DistanceType innerRadius READ innerRadius WRITE setInnerRadius)

public:
    explicit Crown(BasicObject *pParent = 0);

    virtual ~Crown() {}

    virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut(RenderingContext &pContext);
    virtual void    initDefaultFields();
    virtual void    createPrimitive(RenderingContext &pContext);
    virtual void    drawPrimitive(RenderingContext &pContext);

    void setOuterRadius(DistanceType pOuterRadius){mOuterRadius = pOuterRadius;}
    DistanceType outerRadius(){return mOuterRadius;}
    double getOuterRadius() {return mOuterRadius.getValue();}

    void setInnerRadius(DistanceType pInnerRadius){mInnerRadius = pInnerRadius;}
    DistanceType innerRadius(){return mInnerRadius;}
    double getInnerRadius() {return mInnerRadius.getValue();}

    static const char *CLASS_NAME;

private:
    DistanceType mOuterRadius;
    DistanceType mInnerRadius;
    VGPath       mCrownPath;
};

} /* namespace AP2I */

#endif // CROWN_H
