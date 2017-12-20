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
#include "transformskew.h"
#include "transformmatrix.h"

#include "renderingcontext.h"
extern "C" {
#include "GL/gl.h"
}

namespace AP2I
{

const char *TransformItem::CLASS_NAME = "TransformItem";

TransformItem::TransformItem(BasicObject *pParent)
    : BasicItem(pParent)
{    
    setClassName(CLASS_NAME);
}

bool TransformItem::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);
    glPushMatrix();    
    return true;
}

bool TransformItem::renderOut(RenderingContext &pContext)
{            
    BasicItem::renderOut(pContext);
    glPopMatrix();

    return true;
}

} /* namespace AP2I */
