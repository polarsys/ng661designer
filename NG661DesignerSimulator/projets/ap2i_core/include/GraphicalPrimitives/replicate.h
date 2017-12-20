/*******************************************************************************
* Copyright (c) 2017 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef REPLICATE_H
#define REPLICATE_H
#include "basicitem.h"
#include "nametype.h"
namespace AP2I
{

class Replicate  : public BasicItem
{
    Q_OBJECT
	Q_PROPERTY(NameType datamodel READ datamodel WRITE setDatamodel)
	Q_PROPERTY(NameType instanceAlias READ instanceAlias WRITE setInstanceAlias)
	Q_PROPERTY(NameType indexAlias READ indexAlias WRITE setIndexAlias)
	Q_PROPERTY(IntegerType firstIndex READ firstIndex WRITE setFirstIndex)
	Q_PROPERTY(IntegerType numberOfInstance READ numberOfInstance WRITE setNumberOfInstance)
	Q_PROPERTY(IntegerType maxNumberOfInstance READ maxNumberOfInstance WRITE setMaxNumberOfInstance)    

public:
    explicit Replicate(BasicObject *pParent = 0);
	virtual ~Replicate() {}
	virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut(RenderingContext &pContext);   
	void setDatamodel(NameType pDatamodel){mDatamodel = pDatamodel;}
    NameType datamodel(){return mDatamodel;}    
	void setInstanceAlias(NameType pInstanceAlias){mInstanceAlias = pInstanceAlias;}
    NameType instanceAlias(){return mInstanceAlias;}    
	void setIndexAlias(NameType pIndexAlias){mIndexAlias = pIndexAlias;}
    NameType indexAlias(){return mIndexAlias;} 
    void setFirstIndex(IntegerType pFirstIndex){mFirstIndex = pFirstIndex;}
    IntegerType firstIndex(){return mFirstIndex;}    
	void setNumberOfInstance(IntegerType pNumberOfInstance){mNumberOfInstance = pNumberOfInstance;}
    IntegerType numberOfInstance(){return mNumberOfInstance;}    
	void setMaxNumberOfInstance(IntegerType pMaxNumberOfInstance){mMaxNumberOfInstance = pMaxNumberOfInstance;}
    IntegerType maxNumberOfInstance(){return mMaxNumberOfInstance;}    

	static const char *CLASS_NAME;

private:
    NameType mDatamodel;
	NameType mInstanceAlias;
	NameType mIndexAlias;
	IntegerType mFirstIndex;
	IntegerType mNumberOfInstance;
	IntegerType mMaxNumberOfInstance;    
};

} /* namespace AP2I */

#endif // REPLICATE_H
