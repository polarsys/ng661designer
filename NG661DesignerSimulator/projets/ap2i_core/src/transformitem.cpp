/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "transformitem.h"

#include "renderingcontext.h"
extern "C" {
#include "GL/gl.h"
}

namespace AP2I
{

const char *TransformItem::CLASS_NAME = "TransformItem";

TransformItem::TransformItem(BasicObject *pParent)
    : BasicItem(pParent),
      mAngle(0.0F),
      mScaleX(1.0F),
      mScaleY(1.0F),
      mOrigin(TRANSFORM_TOP_LEFT)
{
    setClassName(CLASS_NAME);
}

void TransformItem::getOrigin(int &pX, int &pY)
{
    switch(mOrigin)
    {
    case TRANSFORM_LEFT:         pX = 0;                                pY = (int)height().getValue() >> 1;  break;
    case TRANSFORM_RIGHT:        pX = (int)width().getValue();          pY = (int)height().getValue() >> 1;  break;
    case TRANSFORM_TOP:          pX = (int)width().getValue() >> 1;     pY = 0;                         break;
    case TRANSFORM_BOTTOM:       pX = (int)width().getValue() >> 1;     pY = (int)height().getValue();       break;
    case TRANSFORM_TOP_LEFT:     pX = 0;                                pY = 0;                         break;
    case TRANSFORM_TOP_RIGHT:    pX = (int)width().getValue() >> 1;     pY = 0;                         break;
    case TRANSFORM_BOTTOM_LEFT:  pX = 0;                                pY = (int)height().getValue();       break;
    case TRANSFORM_BOTTOM_RIGHT: pX = (int)width().getValue();          pY = (int)height().getValue();       break;
    case TRANSFORM_CENTER:
    default:                     pX = (int)width().getValue() >> 1;     pY = (int)height().getValue() >> 1;  break;
    }
}

bool TransformItem::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);

    if ( mScaleX != 1.0f || mScaleY != 1.0f || mAngle != 0.0f)
    {
        int lX, lY;

        getOrigin(lX, lY);

        glPushMatrix();
        glTranslatef(pContext.currentX() + lX + getX(), pContext.currentY() + lY + getY(), 0.0F);
        glScalef(mScaleX, mScaleY, 1.0F);
        glRotatef(mAngle, 0.0F, 0.0F, 1.0F);
        glTranslatef(-lX, -lY, 0.0F);

        mCurrentX = pContext.currentX();
        mCurrentY = pContext.currentY();

        pContext.setCurrentX(0);
        pContext.setCurrentY(0);
    }
    else
    {
        pContext.setCurrentX( pContext.currentX() + getX());
        pContext.setCurrentY( pContext.currentY() + getY());
    }

    return true;
}

bool TransformItem::renderOut(RenderingContext &pContext)
{

    if ( mScaleX != 1.0f || mScaleY != 1.0f || mAngle != 0.0f)
    {
        glPopMatrix();

    }
    else
    {
        pContext.setCurrentX( pContext.currentX() - getX());
        pContext.setCurrentY( pContext.currentY() - getY());
    }
    return true;
}

} /* namespace AP2I */
