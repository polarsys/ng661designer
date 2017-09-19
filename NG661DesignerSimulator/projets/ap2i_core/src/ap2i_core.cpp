/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "ap2i_core.h"

#include "basicobject.h"

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
#include "keyeventstructtype.h"

#include <QDebug>
#include <string>

namespace AP2I
{

void initializeCoreTypes()
{
    qRegisterMetaType<AP2I::BasicObject *>("BasicObject*");
    qRegisterMetaType<AP2I::BasicObject::SetPropertyResult>("SetPropertyResult");

    qRegisterMetaType<AP2I::AlignementType>("AlignementType");
    qRegisterMetaType<AP2I::AngleType>("AngleType");
    qRegisterMetaType<AP2I::AspectRatioType>("AspectRatioType");
    qRegisterMetaType<AP2I::BooleanType>("BooleanType");
    qRegisterMetaType<AP2I::ColorType>("ColorType");
    qRegisterMetaType<AP2I::DateType>("DateType");
    qRegisterMetaType<AP2I::DistanceType>("DistanceType");
    qRegisterMetaType<AP2I::DoubleType>("DoubleType");
    qRegisterMetaType<AP2I::EnumType>("EnumType");
    qRegisterMetaType<AP2I::ExpressionType>("ExpressionType");
    qRegisterMetaType<AP2I::FontType>("FontType");
    qRegisterMetaType<AP2I::FrequencyType>("FrequencyType");
    qRegisterMetaType<AP2I::IdType>("IdType");
    qRegisterMetaType<AP2I::ImageType>("ImageType");
    qRegisterMetaType<AP2I::IntegerType>("IntegerType");
    qRegisterMetaType<AP2I::NameType>("NameType");
    qRegisterMetaType<AP2I::OpacityType>("OpacityType");
    qRegisterMetaType<AP2I::PositionType>("PositionType");
    qRegisterMetaType<AP2I::StippleType>("StippleType");
    qRegisterMetaType<AP2I::StringType>("StringType");
    qRegisterMetaType<AP2I::TypeType>("TypeType");
    qRegisterMetaType<AP2I::VelocityType>("VelocityType");
    qRegisterMetaType<AP2I::VisibilityType>("VisibilityType");
    qRegisterMetaType<AP2I::ZIndexType>("ZIndexType");

    //uses implicit conversion through constructor : "DistanceType(const double &pValue);"
    QMetaType::registerConverter<double,AP2I::AngleType>();
    QMetaType::registerConverter<int,AP2I::AngleType>();
    QMetaType::registerConverter<long,AP2I::AngleType>();
    QMetaType::registerConverter<double,AP2I::DistanceType>();
    QMetaType::registerConverter<int,AP2I::DistanceType>();
    QMetaType::registerConverter<long,AP2I::DistanceType>();
    QMetaType::registerConverter<double,AP2I::DoubleType>();
    QMetaType::registerConverter<int,AP2I::DoubleType>();
    QMetaType::registerConverter<long,AP2I::DoubleType>();
    QMetaType::registerConverter<double,AP2I::FrequencyType>();
    QMetaType::registerConverter<int,AP2I::FrequencyType>();
    QMetaType::registerConverter<long,AP2I::FrequencyType>();
    QMetaType::registerConverter<int,AP2I::IntegerType>();
    QMetaType::registerConverter<long,AP2I::IntegerType>();
    QMetaType::registerConverter<double,AP2I::OpacityType>();
    QMetaType::registerConverter<int,AP2I::OpacityType>();
    QMetaType::registerConverter<long,AP2I::OpacityType>();
    QMetaType::registerConverter<double,AP2I::PositionType>();
    QMetaType::registerConverter<int,AP2I::PositionType>();
    QMetaType::registerConverter<long,AP2I::PositionType>();
    QMetaType::registerConverter<double,AP2I::VelocityType>();
    QMetaType::registerConverter<int,AP2I::VelocityType>();
    QMetaType::registerConverter<long,AP2I::VelocityType>();
    QMetaType::registerConverter<int,AP2I::ZIndexType>();
    QMetaType::registerConverter<long,AP2I::ZIndexType>();

    QMetaType::registerConverter<AP2I::EnumType, QString>(&AP2I::EnumType::value);
    QMetaType::registerComparators<AP2I::EnumType>();
}

} /* namespace AP2I */
