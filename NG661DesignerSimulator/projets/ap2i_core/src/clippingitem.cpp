/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "clippingitem.h"

#include "renderingcontext.h"
extern "C" {
#include "GL/gl.h"
}

namespace AP2I
{
	
const char *ClippingItem::CLASS_NAME = "ClippingItem";

ClippingItem::ClippingItem(BasicObject *pParent)
    : BasicItem(pParent)
{
    setClassName(CLASS_NAME);
}

bool ClippingItem::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);
    //vgSeti(VG_MAX_SCISSOR_RECTS, 32);
    //vgSeti(VG_SCISSORING, VG_TRUE);
    glEnable(GL_SCISSOR_TEST);
    return true;
}

bool ClippingItem::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);
    //vgSeti(VG_SCISSORING, VG_FALSE);
    glDisable(GL_SCISSOR_TEST);
    return true;
}

} /* namespace AP2I */
