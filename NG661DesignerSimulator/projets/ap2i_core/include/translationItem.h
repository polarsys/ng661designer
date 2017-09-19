/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef TRANSLATIONITEM_H
#define TRANSLATIONITEM_H
#include "basicitem.h"
#include <QMetaType>

namespace AP2I
{
class TranslationItem : public BasicItem
{
    Q_OBJECT
    //CORE_PROPERTIES defini dans la class mere BasicObject
    //GRAPHICS_PROPERTIES
    TRANSFORM_PROPERTIES

public:
    explicit TranslationItem(BasicObject *pParent = 0);
    virtual ~TranslationItem() {}
    virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut(RenderingContext &pContext);
    virtual void    initDefaultFields();
    virtual void    createPrimitive(RenderingContext &pContext);
    virtual void    drawPrimitive(RenderingContext &pContext);


    static const char *CLASS_NAME;
};
}
#endif // TRANSLATIONITEM_H
