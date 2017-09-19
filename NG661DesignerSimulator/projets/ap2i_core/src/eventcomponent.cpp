/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "eventcomponent.h"

#include <QDebug>
#include <QScriptEngine>
#include <QDynamicPropertyChangeEvent>

#include "runtimecontext.h"
#include "runtimeevent.h"

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

namespace AP2I
{

EventComponent::EventComponent(QScriptEngine *pScriptEngine)
    : mInitialized(false), mClearInProgress(false)

{
    // register EventComponent to scriptEngine so that the properties of the interface
    // are accessibles
    QScriptValue lElementValue = pScriptEngine->newQObject(this, QScriptEngine::QtOwnership,
                                                           QScriptEngine::ExcludeSuperClassMethods |
                                                           QScriptEngine::ExcludeSuperClassProperties |
                                                           QScriptEngine::SkipMethodsInEnumeration);
    pScriptEngine->globalObject().setProperty("_event", lElementValue);

}

EventComponent::~EventComponent()
{
}

void EventComponent::addEvent(const QString &pEventName, QVariant pVal)
{
    if (!mEvents.contains(pEventName))
    {
        mEvents.insert(pEventName, pVal);
    }
    setProperty(pEventName.toLatin1().data(), pVal);
}

void EventComponent::clearEvents()
{
    mClearInProgress = true;
    for (QHash<QString, QVariant>::const_iterator it = mEvents.begin(); it != mEvents.end(); it++)
    {
        //Remove property from object
        setProperty(it.key().toLatin1().data(), QVariant());
    }
    mEvents.clear();
    mClearInProgress = false;
}


bool EventComponent::event(QEvent *pEvent)
{
    QDynamicPropertyChangeEvent *lEv = dynamic_cast<QDynamicPropertyChangeEvent *>(pEvent);

    if (lEv && !mClearInProgress)
    {
        //whenever a component's property changes, we ensure its type is preserved
        QVariant &lOldVal = mEvents[lEv->propertyName()];
        QVariant lNewVal = property(lEv->propertyName());
        if (lNewVal.userType() != lOldVal.userType())
        {
            if (lOldVal.userType() == qMetaTypeId<AlignementType>())
            {
                AlignementType lAlignement = lOldVal.value<AlignementType>();
                lAlignement.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lAlignement);
            }
            else if (lOldVal.userType() == qMetaTypeId<AngleType>())
            {
                AngleType lAngle = lOldVal.value<AngleType>();
                lAngle.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lAngle);
            }
            else if (lOldVal.userType() == qMetaTypeId<AspectRatioType>())
            {
                AspectRatioType lAspectRatio = lOldVal.value<AspectRatioType>();
                lAspectRatio.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lAspectRatio);
            }
            else if (lOldVal.userType() == qMetaTypeId<BooleanType>())
            {
                BooleanType lBoolean = lOldVal.value<BooleanType>();
                lBoolean.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lBoolean);
            }
            else if (lOldVal.userType() == qMetaTypeId<ColorType>())
            {
                ColorType lColor;

                if (lColor.setBySVGName(lNewVal.toString()))
                {
                    lColor.setIsDefined(true);
                    lNewVal = QVariant::fromValue(lColor);
                }
                else
                {
                    qDebug() << "ERROR: invalid color value :" + lNewVal.toString();
                }
            }
            else if (lOldVal.userType() == qMetaTypeId<DateType>())
            {
               DateType lDate = lOldVal.value<DateType>();
               lDate.setExpression(lNewVal.toString());
               lNewVal = QVariant::fromValue(lDate);
            }
            else if (lOldVal.userType() == qMetaTypeId<DistanceType>())
            {
                DistanceType lDistance = lOldVal.value<DistanceType>();
                lDistance.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lDistance);
            }
            else if (lOldVal.userType() == qMetaTypeId<DoubleType>())
            {
                DoubleType lDouble = lOldVal.value<DoubleType>();
                lDouble.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lDouble);
            }
            else if (lOldVal.userType() == qMetaTypeId<EnumType>())
            {
                EnumType lEnum = lOldVal.value<EnumType>();
                lEnum.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lEnum);
            }
            else if (lOldVal.userType() == qMetaTypeId<ExpressionType>())
            {
                ExpressionType lExpression = lOldVal.value<ExpressionType>();
                lExpression.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lExpression);
            }
            else if (lOldVal.userType() == qMetaTypeId<FontType>())
            {
                FontType lFont = lOldVal.value<FontType>();
                lFont.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lFont);
            }
            else if (lOldVal.userType() == qMetaTypeId<FrequencyType>())
            {
                FrequencyType lFrequency = lOldVal.value<FrequencyType>();
                lFrequency.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lFrequency);
            }
            else if (lOldVal.userType() == qMetaTypeId<IdType>())
            {
               IdType lId = lOldVal.value<IdType>();
               lId.setId(lNewVal.toString());
               lNewVal = QVariant::fromValue(lId);
            }
            else if (lOldVal.userType() == qMetaTypeId<ImageType>())
            {
               ImageType lImage = lOldVal.value<ImageType>();
               lImage.setAnyURI(lNewVal.toString());
               lNewVal = QVariant::fromValue(lImage);
            }
            else if (lOldVal.userType() == qMetaTypeId<IntegerType>())
            {
                IntegerType lInteger = lOldVal.value<IntegerType>();
                lInteger.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lInteger);
            }
            else if (lOldVal.userType() == qMetaTypeId<NameType>())
            {
                NameType lName = lOldVal.value<NameType>();
                lName.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lName);
            }
            else if (lOldVal.userType() == qMetaTypeId<OpacityType>())
            {
                OpacityType lOpacity = lOldVal.value<OpacityType>();
                lOpacity.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lOpacity);
            }
            else if (lOldVal.userType() == qMetaTypeId<PositionType>())
            {
                PositionType lPosition = lOldVal.value<PositionType>();
                lPosition.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lPosition);
            }
            else if (lOldVal.userType() == qMetaTypeId<StippleType>())
            {
                StippleType lStipple = lOldVal.value<StippleType>();
                lStipple.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lStipple);
            }
            else if (lOldVal.userType() == qMetaTypeId<StringType>())
            {
                StringType lString = lOldVal.value<StringType>();
                lString.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lString);
            }
            else if (lOldVal.userType() == qMetaTypeId<TypeType>())
            {
               TypeType lType = lOldVal.value<TypeType>();
               lType.setValue(lNewVal.toString());
               lNewVal = QVariant::fromValue(lType);
            }
            else if (lOldVal.userType() == qMetaTypeId<VelocityType>())
            {
                VelocityType lVelocity = lOldVal.value<VelocityType>();
                lVelocity.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lVelocity);
            }
            else if (lOldVal.userType() == qMetaTypeId<VisibilityType>())
            {
                VisibilityType lVisibility = lOldVal.value<VisibilityType>();
                lVisibility.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lVisibility);
            }
            else if (lOldVal.userType() == qMetaTypeId<ZIndexType>())
            {
                ZIndexType lZIndex = lOldVal.value<ZIndexType>();
                lZIndex.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lZIndex);
            }
            else
            {
                if (!lNewVal.convert(lOldVal.userType()))
                    qDebug() << "ERROR: cannot set the value " << lNewVal
                             << " to " + lEv->propertyName() + "("
                             << QMetaType::typeName(lOldVal.userType()) << ")";
            }
            lOldVal = lNewVal;
            setProperty(lEv->propertyName().data(), lNewVal);
        }

        return true;
    }
    return QObject::event(pEvent);
}

} /* namespace AP2I */
