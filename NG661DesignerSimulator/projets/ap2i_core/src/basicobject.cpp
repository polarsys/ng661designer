/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "basicobject.h"
#include "runtimecontext.h"
#include "runtimeevent.h"
#include "component.h"

#include <QMetaObject>
#include <QMetaProperty>
#include <QDebug>

#include <iostream>

#include "alignementtype.h"
#include "angletype.h"
#include "aspectratiotype.h"
#include "booleantype.h"
#include "colortype.h"
#include "datetype.h"
#include "distancetype.h"
#include "doubletype.h"
#include "enumtype.h"
#include "expressiontype.h"
#include "fonttype.h"
#include "frequencytype.h"
#include "idtype.h"
#include "imagetype.h"
#include "integertype.h"
#include "nametype.h"
#include "opacitytype.h"
#include "positiontype.h"
#include "stippletype.h"
#include "stringtype.h"
#include "typetype.h"
#include "velocitytype.h"
#include "visibilitytype.h"
#include "zindextype.h"

#include "children.h"


namespace AP2I
{

const char *BasicObject::CLASS_NAME = "BasicObject";

BasicObject::BasicObject(BasicObject *pParent)
    : QObject(),
      mDefaultContent(this),
      mOwner(0),
      mOriginComponent(0),
      mContext(RuntimeContext::defaultContext),
      GRAPHICS_INITIALIZERS
{

    setClassName(CLASS_NAME);
    setId("unknown");

    if (pParent)
    {
        mContext = pParent->context();
        mOwner = pParent;
        pParent = pParent->defaultContent();
        setParent(pParent);
        mOriginComponent = pParent->originComponent();
    }
}

BasicObject::~BasicObject()
{
}

void BasicObject::setDefaultContent(BasicObject *pContent)
{
    if (pContent)
        mDefaultContent = pContent;
}

RuntimeContext &BasicObject::context()
{
    return mContext;
}

void BasicObject::setContext(RuntimeContext &pContext)
{
    mContext = pContext;
}

void BasicObject::addEventsListener(BasicObject *pListener)
{
    if (pListener && !mEventsListeners.contains(pListener))
        mEventsListeners.prepend(pListener);
}

void BasicObject::notifyListeners(RuntimeEvent &pEvent)
{
    bool lReturn;
    for (BasicObject *lObj : mEventsListeners)
    {
        lReturn = lObj->handleEvent(pEvent);
        if(lReturn == false)
        {
			/* One object is opaque */
            break;
        }
        else
        {
            /* NOTHING TO DO */
        }
    }
}

BasicObject::SetPropertyResult BasicObject::setPropertyValue(const QString &pPropName,
                                                         const QString &pPropValue)
{
    SetPropertyResult lReturnValue = CorrectlySet;
    QVariant lPropVal = property(pPropName.toLatin1().data());
    if (lPropVal.isValid())
    {
        if (pPropValue.indexOf("Interface.")      == -1
         && pPropValue.indexOf("Tree.") == -1
         && pPropValue.indexOf("Behavior.")       == -1)
        {
            uint lType = lPropVal.type();
            if( lType == QVariant::Int
             || lType == QVariant::UInt
             || lType == QMetaType::Float
             || lType == QVariant::Double
             || lType == QVariant::Bool
             || lType == QVariant::String
             || lType == QVariant::Font)
            {
                if (metaObject()->indexOfProperty(pPropName.toLatin1().data()) < 0)
                {
                    // dynamic property : cannot use pPropValue with setProperty
                    // because it would change the type of the property to a
                    // string property.
                    QVariant lVal(pPropValue);
                    if (lVal.convert(lPropVal.userType()))
                    {
                        setProperty(pPropName.toLatin1().data(), lVal);
                    }
                    else
                    {
                        qDebug() << "ERROR: failed to set " + id() + "." + pPropName +
                                    " to the value " + pPropValue;
                    }
                }
                else
                {
                    setProperty(pPropName.toLatin1().data(), pPropValue);
                }
            }
            else if (lPropVal.userType() == qMetaTypeId<BasicObject *>())
            {
                //TODO this is specific to Component object and should not be here
                BasicObject *lRefObj(0);

                QList<QObject*> QObjectList = mOwner->children();

                if (mOwner)
                    lRefObj = mOwner->findChild<BasicObject *>(pPropValue);
                if (!lRefObj)
                {
                    qDebug() << "ERROR: " + pPropValue + " object doesn't exists.";
                }
                setProperty(pPropName.toLatin1().data(),
                            QVariant::fromValue(lRefObj));
            }
            else if (lPropVal.userType() == qMetaTypeId<AlignementType>())
            {
                AlignementType lAlignement = lPropVal.value<AlignementType>();
                lAlignement.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lAlignement));
            }
            else if (lPropVal.userType() == qMetaTypeId<AngleType>())
            {
                AngleType lAngle = lPropVal.value<AngleType>();
                lAngle.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lAngle));
            }
            else if (lPropVal.userType() == qMetaTypeId<AspectRatioType>())
            {
                AspectRatioType lAspectRatio = lPropVal.value<AspectRatioType>();
                lAspectRatio.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lAspectRatio));
            }
            else if (lPropVal.userType() == qMetaTypeId<BooleanType>())
            {
                BooleanType lBoolean = lPropVal.value<BooleanType>();
                lBoolean.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lBoolean));
            }
            else if (lPropVal.userType() == qMetaTypeId<ColorType>())
            {
                ColorType lColor;

                if (lColor.setBySVGName(pPropValue))
                {
                    lColor.setIsDefined(true);
                    setProperty(pPropName.toLatin1().data(),
                                QVariant::fromValue(lColor));
                }
                else
                {
                    qDebug() << "ERROR: invalid color value :" + pPropValue;
                }
            }
            else if (lPropVal.userType() == qMetaTypeId<DateType>())
            {
               DateType lDate = lPropVal.value<DateType>();
               lDate.setExpression(pPropValue);
               setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lDate));
            }
            else if (lPropVal.userType() == qMetaTypeId<DistanceType>())
            {
                DistanceType lDistance = lPropVal.value<DistanceType>();
                lDistance.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lDistance));
            }
            else if (lPropVal.userType() == qMetaTypeId<DoubleType>())
            {
                DoubleType lDouble = lPropVal.value<DoubleType>();
                lDouble.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lDouble));
            }
            else if (lPropVal.userType() == qMetaTypeId<EnumType>())
            {
                EnumType lEnum = lPropVal.value<EnumType>();
                lEnum.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lEnum));
            }
            else if (lPropVal.userType() == qMetaTypeId<ExpressionType>())
            {
                ExpressionType lExpression = lPropVal.value<ExpressionType>();
                lExpression.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lExpression));
            }
            else if (lPropVal.userType() == qMetaTypeId<FontType>())
            {
                FontType lFont = lPropVal.value<FontType>();
                lFont.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lFont));
            }
            else if (lPropVal.userType() == qMetaTypeId<FrequencyType>())
            {
                FrequencyType lFrequency = lPropVal.value<FrequencyType>();
                lFrequency.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lFrequency));
            }
            else if (lPropVal.userType() == qMetaTypeId<IdType>())
            {
               IdType lId = lPropVal.value<IdType>();
               lId.setId(pPropValue);
               setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lId));
            }
            else if (lPropVal.userType() == qMetaTypeId<ImageType>())
            {
               ImageType lImage = lPropVal.value<ImageType>();
               lImage.setAnyURI(pPropValue);
               setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lImage));
            }
            else if (lPropVal.userType() == qMetaTypeId<IntegerType>())
            {
                IntegerType lInteger = lPropVal.value<IntegerType>();
                lInteger.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lInteger));
            }
            else if (lPropVal.userType() == qMetaTypeId<NameType>())
            {
                NameType lName = lPropVal.value<NameType>();
                lName.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lName));
            }
            else if (lPropVal.userType() == qMetaTypeId<OpacityType>())
            {
                OpacityType lOpacity = lPropVal.value<OpacityType>();
                lOpacity.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lOpacity));
            }
            else if (lPropVal.userType() == qMetaTypeId<PositionType>())
            {
                PositionType lPosition = lPropVal.value<PositionType>();
                lPosition.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lPosition));
            }
            else if (lPropVal.userType() == qMetaTypeId<StippleType>())
            {
                StippleType lStipple = lPropVal.value<StippleType>();
                lStipple.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lStipple));
            }
            else if (lPropVal.userType() == qMetaTypeId<StringType>())
            {
                StringType lString = lPropVal.value<StringType>();
                lString.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lString));
            }
            else if (lPropVal.userType() == qMetaTypeId<TypeType>())
            {
               TypeType lType = lPropVal.value<TypeType>();
               lType.setValue(pPropValue);
               setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lType));
            }
            else if (lPropVal.userType() == qMetaTypeId<VelocityType>())
            {
                VelocityType lVelocity = lPropVal.value<VelocityType>();
                lVelocity.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lVelocity));
            }
            else if (lPropVal.userType() == qMetaTypeId<VisibilityType>())
            {
                VisibilityType lVisibility = lPropVal.value<VisibilityType>();
                lVisibility.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lVisibility));
            }
            else if (lPropVal.userType() == qMetaTypeId<ZIndexType>())
            {
                ZIndexType lZIndex = lPropVal.value<ZIndexType>();
                lZIndex.setValue(pPropValue);
                setProperty(pPropName.toLatin1().data(), QVariant::fromValue(lZIndex));
            }
            else
            {
                lReturnValue = UnknownType;
            }
        }
        else
        {
            lReturnValue = ValueIsABinding;
        }
    }
    else
    {
        lReturnValue = UnknownProperty;
    }
    return lReturnValue;
}

QVariant BasicObject::getPropertyValue(const QString &pPropName)
{
    return property(pPropName.toLatin1().data());
}

BasicObject *BasicObject::getParent()
{
    return dynamic_cast<BasicObject *>(parent());
}

QVariantList BasicObject::getChildren()
{
    QVariantList lReturnValue;

    for (QObject *lChild : children())
    {
        BasicObject *lBasicObj = dynamic_cast<BasicObject *>(lChild);
        if (lBasicObj)
        {
            lReturnValue.append(QVariant::fromValue(lBasicObj));
        }
    }
    return lReturnValue;
}

BasicObject *BasicObject::getChildrenObject()
{
    return getChildrenObjectOf(className());
}

BasicObject *BasicObject::getChildrenObjectOf(const QString &pOriginComponentName)
{
    BasicObject *lChildrenBasicObjectFound = NULL;
    Children *lChildrenObjectFound = NULL;
    QListIterator<QObject*> lChildrenList(children());

    while( lChildrenBasicObjectFound == NULL && lChildrenList.hasNext() )
    {
        BasicObject *lCurrentBasicObj = dynamic_cast<BasicObject *> (lChildrenList.next());
        try {
            lChildrenObjectFound = dynamic_cast<Children *> (lCurrentBasicObj);
        } catch(std::bad_cast e)
        {
            lChildrenObjectFound = NULL;
        }
        if (lChildrenObjectFound != NULL)
        {
            // A Children object has been found
            // Test if its origin component name corresponds to the searched origin component name
            if (lCurrentBasicObj->originComponent()->className() == pOriginComponentName)
            {
                // The right Children has been found

                lChildrenBasicObjectFound = lCurrentBasicObj;
            }
        }
        else
        {
            // Try to find a Children object inside this object.
            lChildrenBasicObjectFound = lCurrentBasicObj->getChildrenObjectOf(pOriginComponentName);
        }
    }

    return lChildrenBasicObjectFound;
}


QString BasicObject::toString()
{
    QString lReturnValue;

    lReturnValue = mClassName + "(";

    lReturnValue = lReturnValue + "OriginComponentName=" + originComponent()->className() + ",";

    const QMetaObject *meta = metaObject();

    for (int i = 0; i < meta->propertyCount(); i++)
    {
        lReturnValue += meta->property(i).name();
        if (meta->property(i).type() != QVariant::UserType)
        {
            lReturnValue += "=";
            lReturnValue += meta->property(i).read(this).toString();
        }
        if (i <meta->propertyCount() - 1)
            lReturnValue += ",";
    }

    for (int i = 0; i < this->dynamicPropertyNames().size(); i++)
    {
        lReturnValue += ",";
        lReturnValue += QString(this->dynamicPropertyNames().at(i)).toLatin1().data();
        lReturnValue += "=";
        lReturnValue += this->property(this->dynamicPropertyNames().at(i)).toString();
    }

    lReturnValue += ")";

    return lReturnValue;
}

} /* namespace AP2I */
