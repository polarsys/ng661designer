/*******************************************************************************
* Copyright (c) 2017 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef SWITCHNODE_H
#define SWITCHNODE_H

#include "basicitem.h"
#include "nametype.h"

namespace AP2I
{

class SwitchNode  : public BasicItem
{
	Q_OBJECT
	Q_PROPERTY(NameType activeChild READ activeChild WRITE setActiveChild)
public:
    explicit SwitchNode(BasicObject *pParent = 0);
	virtual ~SwitchNode() {}
	virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut(RenderingContext &pContext);   

	void setActiveChild(NameType pActiveChild){mActiveChild = pActiveChild;}
    NameType activeChild(){return mActiveChild;}    

	static const char *CLASS_NAME;

protected:
    void setChildrenVisibility(BasicObject *pObject, bool pVisible);

private:
    NameType mActiveChild;
};

} /* namespace AP2I */

#endif // SWITCHNODE_H
