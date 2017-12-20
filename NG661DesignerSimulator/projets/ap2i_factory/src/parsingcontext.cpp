/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "parsingcontext.h"

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
#include "arrayentrytype.h"

#include <QVariant>

namespace AP2I 
{

ParsingContext::ParsingContext(Component &pComponent, ComponentFactory &pFactory)
    : mComponent(pComponent),
      mFactory(pFactory)
{
      mTypes =
      {
          { "alignment", qMetaTypeId<AlignementType>() },
          { "AlignmentType", qMetaTypeId<AlignementType>() },
          { "angle", qMetaTypeId<AngleType>() },
          { "AngleType", qMetaTypeId<AngleType>() },
          { "aspectRatio", qMetaTypeId<AspectRatioType>() },
          { "AspectRatioType", qMetaTypeId<AspectRatioType>() },
          { "bool",   QVariant::Bool               },
          { "boolean", qMetaTypeId<BooleanType>() },
          { "BooleanType", qMetaTypeId<BooleanType>() },
          { "color",  qMetaTypeId<ColorType>()     },
          { "ColorType",  qMetaTypeId<ColorType>()     },
          { "DateType", qMetaTypeId<DateType>() },
          { "DateTimeType", qMetaTypeId<DateType>() },
          { "distance",  qMetaTypeId<DistanceType>()     },
          { "DistanceType",  qMetaTypeId<DistanceType>()     },
          { "DoubleType", qMetaTypeId<DoubleType>() },
          { "ExpressionType", qMetaTypeId<ExpressionType>() },
          { "font", qMetaTypeId<FontType>() },
          { "FontType", qMetaTypeId<FontType>() },
          { "float",  QVariant::Double             },
          { "frequency", qMetaTypeId<FrequencyType>() },
          { "FrequencyType", qMetaTypeId<FrequencyType>() },
          { "IdType",  qMetaTypeId<IdType>()      },
          { "ImageType", qMetaTypeId<ImageType>() },
          { "uint",   QVariant::UInt               },
          { "ulong",  QVariant::UInt               },
          { "int",    QVariant::Int                },
          { "long",   QVariant::Int                },
          { "IntegerType",  qMetaTypeId<IntegerType>()      },
          { "NameType", qMetaTypeId<NameType>() },
          { "OpacityType", qMetaTypeId<OpacityType>() },
          { "position", qMetaTypeId<PositionType>() },
          { "PositionType", qMetaTypeId<PositionType>() },
          { "RealType", QVariant::Double },
          { "stipple", qMetaTypeId<StippleType>() },
          { "StippleType", qMetaTypeId<StippleType>() },
          { "string", QVariant::String             },
          { "StringType", qMetaTypeId<StringType>() },
          { "type", qMetaTypeId<TypeType>() },
          { "TypeType", qMetaTypeId<TypeType>() },
          { "velocity", qMetaTypeId<VelocityType>() },
          { "VelocityType", qMetaTypeId<VelocityType>() },
          { "VisibilityType", qMetaTypeId<VisibilityType>() },
          { "ZIndexType", qMetaTypeId<ZIndexType>() },
          { "EntryType", qMetaTypeId<EntryType>() },
          { "ArrayEntryType", qMetaTypeId<ArrayEntryType>() },

          { "FillRuleType", QVariant::String },

          { "ObjectType", qMetaTypeId<BasicObject *>() },
          { "object", qMetaTypeId<BasicObject *>() }
      };
}

} /* namespace AP2I */
