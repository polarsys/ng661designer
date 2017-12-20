/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "group.h"

#include "renderingcontext.h"
#include <stdarg.h>
#include <iostream>
#include "debug_macros.h"
#include <QDebug>

extern "C" {
#include "GL/gl.h"
}

namespace AP2I {
    const char *Group::CLASS_NAME = "Group";

    Group::Group(BasicObject *pParent)
        : BasicItem(pParent),
          mTx(0.0F),
          mTy(0.0F)
    {
        setClassName(CLASS_NAME);
    }

    bool Group::renderIn(RenderingContext &pContext)
    {
        BasicItem::renderIn(pContext);

        initDefaultFields();

        createPrimitive(pContext);

        drawPrimitive(pContext);

        glPushMatrix();

        glTranslatef(pContext.currentX() + getTx(), pContext.currentY() + getTy(), 0.0F);

        return true;
    }

    bool Group::renderOut(RenderingContext &pContext)
    {
        BasicItem::renderOut(pContext);

        glPopMatrix();

        return true;
    }

    void Group::initDefaultFields()
    {
        BasicItem::initDefaultFields();
    }

    void Group::createPrimitive(RenderingContext &pContext)
    {
        BasicItem::createPrimitive(pContext);
    }

    void Group::drawPrimitive(RenderingContext &pContext)
    {
        BasicItem::drawPrimitive(pContext);
    }

}

