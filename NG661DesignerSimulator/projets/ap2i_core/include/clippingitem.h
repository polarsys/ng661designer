/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef CLIPPINGITEM_H
#define CLIPPINGITEM_H

#include "basicitem.h"

namespace AP2I
{

class ClippingItem : public BasicItem
{
   Q_OBJECT
   
public:
	explicit ClippingItem(BasicObject *pParent = 0);

    virtual ~ClippingItem() {}

    virtual bool renderIn(RenderingContext &pContext);
    virtual bool renderOut(RenderingContext &);

    static const char *CLASS_NAME;

private:

};

} /* namespace AP2I */

#endif // CLIPPINGITEM_H
