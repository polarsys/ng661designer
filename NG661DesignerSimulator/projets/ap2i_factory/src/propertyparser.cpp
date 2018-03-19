/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "propertyparser.h"

#include <QDebug>
#include <QDomElement>
#include <QVariant>
#include <QMetaType>

#include "component.h"
#include "parsingcontext.h"

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

PropertyParser::PropertyParser(ParsingContext &pContext)
    : mContext(pContext)
{
}

void PropertyParser::digest(QDomElement &pElement)
{
    // Remove namespace prefix for type attribute as it can refer to a standard type
    QString lValueType = pElement.attribute("type").section(":", -1);
    QString lValueStr = pElement.attribute("value");
    QString lPropName = pElement.attribute("name");

    if (mContext.mTypes.contains(lValueType))
    {
        if (lValueStr.indexOf("Interface.")      == -1
         && lValueStr.indexOf("Tree.") == -1
         && lValueStr.indexOf("Behavior.")       == -1)
        {
            int lType = mContext.mTypes[lValueType];
            QVariant lNewVal(lValueStr);
            if (lType == qMetaTypeId<AlignementType>())
            {
                AlignementType lAlignement(lValueStr.toStdString());
                lNewVal = QVariant::fromValue(lAlignement);
            }
            else if (lType == qMetaTypeId<AngleType>())
            {
                AngleType lAngle(lValueStr.toDouble());
                lNewVal = QVariant::fromValue(lAngle);
            }
            else if (lType == qMetaTypeId<AspectRatioType>())
            {
                AspectRatioType lAspectRatio(lValueStr.toStdString());
                lNewVal = QVariant::fromValue(lAspectRatio);
            }
            else if (lType == qMetaTypeId<BooleanType>())
            {
                BooleanType lBoolean(lValueStr);
                lNewVal = QVariant::fromValue(lBoolean);
            }
            else if (lType == qMetaTypeId<ColorType>())
            {
                ColorType lColor;
                if (!lColor.setBySVGName(lValueStr))
                {
                    qDebug() << "ERROR: Invalid color value " << lValueStr;
                }
                lNewVal = QVariant::fromValue(lColor);
            }
            else if (lType == qMetaTypeId<DateType>())
            {
                DateType lDate(lValueStr);
                lNewVal = QVariant::fromValue(lDate);
            }
            else if (lType == qMetaTypeId<DistanceType>())
            {
                DistanceType lDistance(lValueStr.toDouble());
                lNewVal = QVariant::fromValue(lDistance);
            }
            else if (lType == qMetaTypeId<DoubleType>())
            {
                DoubleType lDouble(lValueStr.toDouble());
                lNewVal = QVariant::fromValue(lDouble);
            }
            else if (lType == qMetaTypeId<EnumType>())
            {
                EnumType lEnum(lValueType);
                lEnum.setValue(lValueStr);
                lNewVal = QVariant::fromValue(lEnum);
            }
            else if (lType == qMetaTypeId<ExpressionType>())
            {
                ExpressionType lExpression(lValueStr);
                lNewVal = QVariant::fromValue(lExpression);
            }
            else if (lType == qMetaTypeId<FontType>())
            {
                FontType lFont(lValueStr);
                lNewVal = QVariant::fromValue(lFont);
            }
            else if (lType == qMetaTypeId<FrequencyType>())
            {
                FrequencyType lFrequency(lValueStr.toDouble());
                lNewVal = QVariant::fromValue(lFrequency);
            }
            else if (lType == qMetaTypeId<IdType>())
            {
                IdType lId(lValueStr);
                lNewVal = QVariant::fromValue(lId);
            }
            else if (lType == qMetaTypeId<ImageType>())
            {
                ImageType lImage(lValueStr);
                lNewVal = QVariant::fromValue(lImage);
            }
            else if (lType == qMetaTypeId<IntegerType>())
            {
                IntegerType lInteger(lValueStr.toLong());
                lNewVal = QVariant::fromValue(lInteger);
            }
            else if (lType == qMetaTypeId<NameType>())
            {
                NameType lName(lValueStr);
                lNewVal = QVariant::fromValue(lName);
            }
            else if (lType == qMetaTypeId<OpacityType>())
            {
                OpacityType lOpacity(lValueStr.toDouble());
                lNewVal = QVariant::fromValue(lOpacity);
            }
            else if (lType == qMetaTypeId<PositionType>())
            {
                PositionType lPosition(lValueStr.toDouble());
                lNewVal = QVariant::fromValue(lPosition);
            }
            else if (lType == qMetaTypeId<StippleType>())
            {
                StippleType lStipple(lValueStr);
                lNewVal = QVariant::fromValue(lStipple);
            }
            else if (lType == qMetaTypeId<StringType>())
            {
                StringType lString(lValueStr);
                lNewVal = QVariant::fromValue(lString);
            }
            else if (lType == qMetaTypeId<TypeType>())
            {
                TypeType lType(lValueStr);
                lNewVal = QVariant::fromValue(lType);
            }
            else if (lType == qMetaTypeId<VelocityType>())
            {
                VelocityType lVelocity(lValueStr.toDouble());
                lNewVal = QVariant::fromValue(lVelocity);
            }
            else if (lType == qMetaTypeId<VisibilityType>())
            {
                VisibilityType lVisibility(lValueStr);
                lNewVal = QVariant::fromValue(lVisibility);
            }
            else if (lType == qMetaTypeId<ZIndexType>())
            {
                ZIndexType lZIndex(lValueStr.toLong());
                lNewVal = QVariant::fromValue(lZIndex);
            }
            else if (lType == qMetaTypeId<BasicObject *>())
            {
                if (lValueStr != "NIL")
                {
                    qDebug() << "ERROR: Object property default value shall be NIL";
                }
                lNewVal = QVariant(qMetaTypeId<BasicObject *>(), (const void *)0);
            }
            else
            {
                lNewVal.convert(lType);
            }
            mContext.mComponent.addProperty(lPropName.toLatin1().data(), lNewVal);
        }
        else
        {
            mContext.mComponent.addBinding("Interface", lPropName, lValueStr);
        }
    }
    else
    {
        qDebug() << "WARNING: unhandled Property type"
                 << lValueType;
    }
}

} /* namespace AP2I */
