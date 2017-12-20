/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef TRANSFORMITEM_H
#define TRANSFORMITEM_H

#include "basicitem.h"
#include <QMetaType>

namespace AP2I
{

class TransformItem : public BasicItem
{
    Q_OBJECT

public:
    explicit TransformItem(BasicObject *pParent = 0);

    virtual ~TransformItem() {}

    virtual bool renderIn(RenderingContext &pContext);
    virtual bool renderOut(RenderingContext &);

    static const char *CLASS_NAME;

private:    
    int   mCurrentX;
    int   mCurrentY;
};

} /* namespace AP2I */

#endif // TRANSFORMITEM_H


