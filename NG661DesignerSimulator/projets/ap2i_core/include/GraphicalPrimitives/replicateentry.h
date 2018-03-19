/*******************************************************************************
* Copyright (c) 2017 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef REPLICATEENTRY_H
#define REPLICATEENTRY_H
#include "basicobject.h"
#include "basicitem.h"
#include "visibilitytype.h"
#include "replicate.h"
namespace AP2I
{

class ReplicateEntry  : public BasicItem
{
	Q_OBJECT	    
    Q_PROPERTY(IntegerType index READ index WRITE setIndex)

public:
    explicit ReplicateEntry(BasicObject *pParent = 0);
	virtual ~ReplicateEntry() {}
    virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut(RenderingContext &pContext);
	void setVisible(VisibilityType pVisible){mVisible = pVisible;}
    VisibilityType visible(){return mVisible;}

    void setIndex(IntegerType pIndex){mIndex = pIndex;}
    IntegerType index(){return mIndex;}

	static const char *CLASS_NAME;

private:
    VisibilityType mVisible;
    IntegerType mIndex;
};

} /* namespace AP2I */

#endif // REPLICATEENTRY_H
