/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef CHILDEN_H
#define CHILDREN_H



#include "basicitem.h"
namespace AP2I
{
class Children : public BasicItem
{
    Q_OBJECT
    Q_PROPERTY(IntegerType priority READ priority WRITE setPriority)
    Q_PROPERTY(IntegerType maxNumberOfChildren READ maxNumberOfChildren WRITE setMaxNumberOfChildren)

public:
    explicit Children(BasicObject *pParent = 0);
    virtual ~Children() {}
    virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut(RenderingContext &pContext);
    virtual void    initDefaultFields();
    virtual void    createPrimitive(RenderingContext &pContext);
    virtual void    drawPrimitive(RenderingContext &pContext);

    void setPriority(IntegerType pPriority){mPriority = pPriority;}
    IntegerType priority(){return mPriority;}
    double getPriority() {return mPriority.getValue();}

    void setMaxNumberOfChildren(IntegerType pMaxNumberOfChildren){mMaxNumberOfChildren = pMaxNumberOfChildren;}
    IntegerType maxNumberOfChildren(){return mMaxNumberOfChildren;}
    double getMaxNumberOfChildren() {return mMaxNumberOfChildren.getValue();}


    static const char *CLASS_NAME;

private:
    IntegerType mPriority;
    IntegerType mMaxNumberOfChildren;


};
}



#endif // CHILDREN_H
