/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef GROUP_H
#define GROUP_H

#include "basicitem.h"
namespace AP2I
{
class Group : public BasicItem
{
    Q_OBJECT
    //CORE_PROPERTIES defini dans la class mere BasicObject
    //GRAPHICS_PROPERTIES
//    TRANSFORM_PROPERTIES

public:
    explicit Group(BasicObject *pParent = 0);
    virtual ~Group() {}
    virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut(RenderingContext &pContext);
    virtual void    initDefaultFields();
    virtual void    createPrimitive(RenderingContext &pContext);
    virtual void    drawPrimitive(RenderingContext &pContext);


    static const char *CLASS_NAME;


};
}


#endif // GROUP_H
