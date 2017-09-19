/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "translationItem.h"

#include "renderingcontext.h"
extern "C" {
#include "GL/gl.h"
}
#include "transformcapacities.h"

namespace AP2I
{

const char *TranslationItem::CLASS_NAME = "TranslationItem";

/*TranslationItem::TranslationItem(BasicObject *pParent)
    : BasicItem(pParent),
    setClassName(CLASS_NAME);
}



bool TranslationItem::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);

    if ( mScaleX != 1.0f || mScaleY != 1.0f || mAngle != 0.0f)
    {
        int lX, lY;
        QMatrix &lMatrix = pContext.currentMatrix();

        getOrigin(lX, lY);
        lMatrix.translate(pContext.currentX() + lX, pContext.currentY() + lY);
        lMatrix.scale(mScaleX, mScaleY);
        lMatrix.rotate(mAngle);
        lMatrix.translate(-lX, -lY);

        //glPushMatrix();
        glTranslatef(pContext.currentX() + lX, pContext.currentY() + lY, 0.0F);
        glScalef(mScaleX, mScaleY, 1.0F);
        glRotatef(mAngle, 0.0F, 0.0F, 1.0F);
        glTranslatef(-lX, -lY, 0.0F);

        pContext.setCurrentX(0);
        pContext.setCurrentY(0);
    }
    return true;
}

bool TranslationItem::renderOut(RenderingContext &pContext)
{

    if ( mScaleX != 1.0f || mScaleY != 1.0f || mAngle != 0.0f)
    {
        //glPopMatrix();
    }
    pContext.setCurrentX(pContext.get);
    pContext.setCurrentY(0);
    return true;
}


*/
TranslationItem::TranslationItem(BasicObject *pParent)
        : BasicItem(pParent)
    {
        setClassName(CLASS_NAME);
    }

    bool TranslationItem::renderIn(RenderingContext &pContext)
    {
        BasicItem::renderIn(pContext);

        initDefaultFields();

        createPrimitive(pContext);

        runTransformCapacities();

        pContext.setCurrentX(pContext.currentX()+getX());
        pContext.setCurrentY(pContext.currentY()+getY());
        glTranslatef(getX(), getY(), 0.0F);

        drawPrimitive(pContext);

//        TransformCapacities::runTransformCapacities(transform());
        return true;
    }

    bool TranslationItem::renderOut(RenderingContext &pContext)
    {
        BasicItem::renderOut(pContext);

       pContext.setCurrentX(pContext.currentX() - getX());
        pContext.setCurrentY(pContext.currentY() - getY());
        glTranslatef(-getX(), -getY(), 0.0F);
        undoTransformCapacities();

//        TransformCapacities::undoTransformCapacities(transform());
        return true;
    }

    void TranslationItem::initDefaultFields()
    {
        BasicItem::initDefaultFields();

    }

    void TranslationItem::createPrimitive(RenderingContext &pContext)
    {
        BasicItem::createPrimitive(pContext);


        //pContext.setCurrentX(pContext.currentX() + getX());
        //pContext.setCurrentY(pContext.currentY() + getY());

        //VGPath arcPath = vgCreatePath(VG_PATH_FORMAT_STANDARD, VG_PATH_DATATYPE_F,1,0,0,0, VG_PATH_CAPABILITY_ALL);
    }

    void TranslationItem::drawPrimitive(RenderingContext &pContext)
    {
        BasicItem::drawPrimitive(pContext);

        //vgDrawPath(pPrimitivePath, VG_FILL_PATH | VG_STROKE_PATH);
    }



} /* namespace AP2I */

