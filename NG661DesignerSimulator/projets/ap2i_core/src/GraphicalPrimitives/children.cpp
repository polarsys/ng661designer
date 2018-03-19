/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "children.h"

#include "renderingcontext.h"
#include <stdarg.h>
#include <iostream>
#include "debug_macros.h"
#include <QDebug>

namespace AP2I {
    const char *Children::CLASS_NAME = "Children";

    Children::Children(BasicObject *pParent)
        : BasicItem(pParent)
    {
        setClassName(CLASS_NAME);
    }

    bool Children::renderIn(RenderingContext &pContext)
    {
        BasicItem::renderIn(pContext);

        initDefaultFields();

        createPrimitive(pContext);

        drawPrimitive(pContext);

        return true;
    }

    bool Children::renderOut(RenderingContext &pContext)
    {
        BasicItem::renderOut(pContext);

        return true;
    }

    void Children::initDefaultFields()
    {
        BasicItem::initDefaultFields();

    }

    void Children::createPrimitive(RenderingContext &pContext)
    {
        BasicItem::createPrimitive(pContext);
    }

    void Children::drawPrimitive(RenderingContext &pContext)
    {
        BasicItem::drawPrimitive(pContext);
    }

}

