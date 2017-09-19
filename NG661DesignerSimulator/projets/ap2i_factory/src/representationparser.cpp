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

    // find if this element is a child that need to be added to the children element of parent node
    BasicObject *lCurrentParent = mParents.top().first;
    if (mContext.mComponent.objectName() != lCurrentParent->objectName()){
        BasicObject *lChildrenBasicObject = lCurrentParent->getChildrenObject();
        if (lChildrenBasicObject != NULL)
        {
            lCurrentParent = lChildrenBasicObject;
        }
    }


    if (lElemName == "Representation")
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
        if(lParentName  == "ClipPath")
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
    else if (lElemName == "Text")
    {
        lNewObject = new Text(lCurrentParent);
    }
    else if (lElemName == "PointerArea")
    {
        lNewObject = new PointerArea(lCurrentParent);
    }
    else if (lElemName == "KeyboardArea")
    {
        lNewObject = new KeyboardArea(lCurrentParent);
    }
    else if (lElemName == "ScrollWheelArea")
    {
        lNewObject = new ScrollWheelArea(lCurrentParent);
    }
/*    else if (lElemName == "SimpleText")
    {
        lNewObject = new SimpleText(lCurrentParent);
    }
    else if (lElemName == "BorderImage")
    {
        BorderImage *lImg = new BorderImage(lCurrentParent);
        lImg->setReferenceFolder(mContext.mFactory.currentFolder());
        lNewObject = lImg;
    }
*/    else if(lElemName == "TransformItem")
    {
        lNewObject = new TransformItem(lCurrentParent);
    }
    else if(lElemName == "ClippingItem")
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
        ParsingUtils::parseItemProperties(mContext.mComponent, *lNewObject, pElement);
        mContext.mComponent.registerRepresentationElement(lNewObject);
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
    if (pElement.localName() == "Representation")
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
