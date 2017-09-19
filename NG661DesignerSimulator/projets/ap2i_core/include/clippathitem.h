/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef CLIPPATHITEM_H
#define CLIPPATHITEM_H

#include "basicitem.h"

namespace AP2I
{

class ClipPathItem : public BasicItem
{
    Q_OBJECT
public:
    explicit ClipPathItem(BasicObject *pParent = 0);

    virtual ~ClipPathItem() {}
	
    virtual bool renderIn(RenderingContext &pContext);
    virtual bool renderOut();

    static const char *CLASS_NAME;

private:

};

} /* namespace AP2I */

#endif // CLIPPATHITEM_H
