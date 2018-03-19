/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "representationparser.h"

#include "basicitem.h"
#include "rectangle.h"
#include "circle.h"
#include "rectangle.h"
#include "cliprectangle.h"
#include "ellipse.h"
#include "line.h"
#include "image.h"
#include "text.h"
#include "pointerarea.h"
#include "keyboardarea.h"
//#include "simpletext.h"
#include "transformitem.h"
#include "transformtranslate.h"
#include "transformrotate.h"
#include "transformscale.h"
#include "transformskew.h"
#include "transformmatrix.h"
#include "clippingitem.h"
#include "clippathitem.h"
#include "component.h"
#include "basicobject.h"
#include "parsingcontext.h"
#include "componentfactory.h"
#include "parsingutils.h"
#include "polyline.h"
#include "polygon.h"
#include "arc.h"
#include "crown.h"
#include "group.h"
#include "polarline.h"
#include "children.h"
#include "scrollwheelarea.h"
#include "switchnode.h"
#include "replicate.h"
#include "replicateentry.h"

#include <QVariant>
#include <QDebug>

#include <iostream>

namespace AP2I 
{

RepresentationParser::RepresentationParser(ParsingContext &pContext)
    : DomParser(),
      mContext(pContext)
{
}

void RepresentationParser::digest(QDomElement &pElement)
{
    mParents.push(QPair<BasicObject *, QDomElement>(&mContext.mComponent, pElement));
    parse(pElement);
}

bool RepresentationParser::startElement(QDomElement &pElement)
{
    BasicObject *lNewObject = 0;

    QString lElemName = pElement.localName();
    if (lElemName == "component"){
        lElemName = pElement.attribute("type").section(":", -1);
    }else{
        lElemName.section(":", -1);
    }	

    //Find if the object first parent is a replicate node => the objet to be created is a replicateEntry
    BasicObject *lParent;
    Replicate *lReplicate;
    lParent = mParents.at(mParents.size() - 1).first;
    lReplicate = dynamic_cast<Replicate *>(lParent);

    //Find if the object is a replicate entry child
    ReplicateEntry *lReplicateEntry;
    int i = mParents.size() - 1;

    do
    {
        lParent = mParents.at(i).first;
        lReplicateEntry = dynamic_cast<ReplicateEntry *>(lParent);
        i--;
    } while (!lReplicateEntry &&  i>=0);


    // find if this element is a child that need to be added to the children element of parent node
    BasicObject *lCurrentParent = mParents.top().first;
    if (mContext.mComponent.objectName() != lCurrentParent->objectName()){
        BasicObject *lChildrenBasicObject = lCurrentParent->getChildrenObject();
        if (lChildrenBasicObject != NULL)
        {
            lCurrentParent = lChildrenBasicObject;
        }
    }


    if (lElemName == "Tree")
    {
       //ignore
       return true;
    }
    else if (lElemName == "BasicItem")
    {
        lNewObject = new BasicItem(lCurrentParent);
    }
    else if (lElemName == "Rectangle")
    {
        QDomNode lParentNode = pElement.parentNode();
        QString lParentName = lParentNode.nodeName();
        if(lParentName.contains("ClipPath"))
        {
            lNewObject = new ClipRectangle(lCurrentParent);
        }
        else
        {
            lNewObject = new Rectangle(lCurrentParent);
        }
    }
    else if (lElemName == "Circle")
    {
        lNewObject = new Circle(lCurrentParent);
    }
    else if (lElemName == "Ellipse")
    {
        lNewObject = new Ellipse(lCurrentParent);
    }
    else if (lElemName == "Line")
    {
        lNewObject = new Line(lCurrentParent);
    }
    else if (lElemName == "Image")
    {
        lNewObject = new Image(&mContext.mFactory.currentFolder(), lCurrentParent);
    }
    else if (lElemName == "SimpleText")
    {
        lNewObject = new Text(lCurrentParent);
    }
    else if (lElemName == "PointerArea")
    {
        lNewObject = new PointerArea(lCurrentParent);
    }
    else if (lElemName == "KeyboardInput")
    {
        lNewObject = new KeyboardArea(lCurrentParent);
    }
    else if (lElemName == "ScrollWheelInput")
    {
        lNewObject = new ScrollWheelArea(lCurrentParent);
    }
    else if(lElemName == "TransformGroup")
    {
        lNewObject = new TransformItem(lCurrentParent);
    }
    else if(lElemName == "transform")
    {
        /* Nothing to do */
    }
    else if(lElemName == "TransformRotate")
    {
        lNewObject = new TransformRotate(lCurrentParent);
    }
    else if(lElemName == "TransformTranslate")
    {
        lNewObject = new TransformTranslate(lCurrentParent);
    }
    else if(lElemName == "TransformScale")
    {
        lNewObject = new TransformScale(lCurrentParent);
    }
    else if(lElemName == "TransformMatrix")
    {
        lNewObject = new TransformMatrix(lCurrentParent);
    }
    else if(lElemName == "TransformSkewX")
    {
        lNewObject = new TransformSkew(lCurrentParent, SKEWX);
    }
    else if(lElemName == "TransformSkewY")
    {
        lNewObject = new TransformSkew(lCurrentParent, SKEWY);
    }
    else if(lElemName == "ClippingContainer")
    {
       lNewObject = new ClippingItem(lCurrentParent);
    }
    else if(lElemName == "ClipPath")
    {
       lNewObject = new ClipPathItem(lCurrentParent);
    }
    else if(lElemName == "Polyline")
    {
        lNewObject = new Polyline(lCurrentParent);
    }
    else if(lElemName == "Polygon")
    {
        lNewObject = new Polygon(lCurrentParent);
    }
    else if(lElemName == "Arc")
    {
        lNewObject = new Arc(lCurrentParent);
    }
    else if(lElemName == "Crown")
    {
        lNewObject = new Crown(lCurrentParent);
    }
    else if(lElemName == "PolarLine")
    {
        lNewObject = new Polarline(lCurrentParent);
    }
    else if(lElemName == "Group")
    {
        lNewObject = new Group(lCurrentParent);
    }
    else if(lElemName == "Children")
    {
        lNewObject = new Children(lCurrentParent);
    }
    else if(lElemName == "SwitchNode")
    {
        lNewObject = new SwitchNode(lCurrentParent);
    }
    else if(lElemName == "Replicate")
    {        
        if(lReplicate)
        {
            lNewObject = new ReplicateEntry(lCurrentParent);            
        }
        else
        {            
            lNewObject = new Replicate(lCurrentParent);
        }
    }    
    else
    {
        // others possible elements are component instances
        lNewObject = mContext.mFactory.instantiateComponent(
                                 lCurrentParent, lElemName);
    }

    // set Properties for created item
    if (lNewObject)
    {
        lNewObject->setOriginComponent(&mContext.mComponent);
        
        //Parse properties
        if (lElemName == "Replicate" && !lReplicate)
        {
            //if item is a replicate
            ParsingUtils::parseItemProperties(mContext.mComponent, *lNewObject, pElement, "_", "", "", "");
        }
        if (lReplicateEntry)
        {
            //if item is a replicateEntry child
            Replicate * lRplc = dynamic_cast<Replicate *>(lReplicateEntry->parent());
            QString lReplicateName = lRplc->id() + "[" + QString::number(lRplc->children().size() - 1) + "]." ;
            QString lIndexName = lRplc->indexAlias().getValue().c_str();
            QString lInstanceName = lRplc->instanceAlias().getValue().c_str();
            QString lDatamodelName = lRplc->datamodel().getValue().c_str();
            lDatamodelName = lDatamodelName + "_" + QString::number(lRplc->children().size() - 1);
            ParsingUtils::parseItemProperties(mContext.mComponent, *lNewObject, pElement, lReplicateName, lIndexName, lInstanceName, lDatamodelName);
        }
        else if(!lReplicate)
        {
            ParsingUtils::parseItemProperties(mContext.mComponent, *lNewObject, pElement, "", "", "", "");
        }
        else
        {
            /* Nothing to do */
        }

        //Register element in Component ScriptEngine
        if (lElemName == "Replicate" && !lReplicate)
        {
            //Replicate object
            bool lConvertResult;
            QString lMaxNbOfItem = pElement.attribute("maxNumberOfInstance");
            int lMaxNbOfItemInt = lMaxNbOfItem.toInt(&lConvertResult, 10);
            if (lConvertResult)
            {
                mContext.mComponent.registerReplicateRepresentationElement(lNewObject, lMaxNbOfItemInt);
            }
            else
            {
                qDebug() << "Probleme avec le nombre d'entrées max du Replicate\n";
            }

        }
        else if(lReplicate)
        {
            //ReplicateEntry Object
            mContext.mComponent.registerReplicateEntryRepresentationElement(lNewObject, lReplicate, lReplicate->children().size() - 1);
        }
        else if(lReplicateEntry)
        {
            //Child of a replicate element
            mContext.mComponent.registerReplicateChildRepresentationElement(lNewObject, lReplicateEntry, "");
        }
        else
        {
            //Other
            mContext.mComponent.registerRepresentationElement(lNewObject);
        }

        mContext.mRepresentation.insert(lNewObject->id(), lNewObject);
        mParents.push(QPair<BasicObject *, QDomElement>(lNewObject, pElement));
    }
    return true;

}

void RepresentationParser::endElement(QDomElement &pElement)
{
    if (mParents.top().second == pElement)
    {
        mParents.pop();
    }
    if (pElement.localName() == "Tree")
    {
        QString lDefaultContent = pElement.attribute("defaultContent");
        if (!lDefaultContent.isEmpty())
        {
            if (mContext.mRepresentation.contains(lDefaultContent))
            {
                mContext.mComponent.setDefaultContent(
                        mContext.mRepresentation.value(lDefaultContent));
            }
            else
            {
                qDebug() << "ERROR: invalid defaultContent " << lDefaultContent;
            }
        }
    }
}

} /* namespace AP2I */
