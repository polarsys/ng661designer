/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef CAPACITIESMACROS_H
#define CAPACITIESMACROS_H

#include "colortype.h"
#include "DoubleType.h"
#include "DistanceType.h"
#include "PositionType.h"
#include "OpacityType.h"
#include "StringType.h"
#include "IntegerType.h"
#include "paintstrokecapacities.h"

#define CORE_PROPERTIES \
    Q_PROPERTY(QString id READ id WRITE setId)

#define PAINTFILL_PROPERTIES \
    Q_PROPERTY(ColorType fill READ fill WRITE setFill) \
    Q_PROPERTY(StringType fillRule READ fillRule WRITE setFillRule) \
    Q_PROPERTY(OpacityType fillOpacity READ fillOpacity WRITE setFillOpacity)

#define PAINTSTROKE_PROPERTIES \
    Q_PROPERTY(ColorType stroke READ stroke WRITE setStroke) \
    Q_PROPERTY(DistanceType strokewidth READ strokeWidth WRITE setStrokeWidth) \
    Q_PROPERTY(StringType strokeLinecap READ strokeLineCap WRITE setStrokeLineCap) \
    Q_PROPERTY(StringType strokeLinejoin READ strokeLineJoin WRITE setStrokeLineJoin) \
    Q_PROPERTY(DoubleType strokeMiterlimit READ strokeMiterLimit WRITE setStrokeMiterLimit) \
    Q_PROPERTY(QString strokeDasharray READ strokeDashArray WRITE setStrokeDashArray) \
    Q_PROPERTY(float strokeDashoffset READ strokeDashOffset WRITE setStrokeDashOffset) \
    Q_PROPERTY(OpacityType strokeOpacity READ strokeOpacity WRITE setStrokeOpacity)

#define GRAPHICS_PROPERTIES \
    Q_PROPERTY(QString visibility READ visibility WRITE setVisibility) \
    Q_PROPERTY(int drawingPriority READ drawingPriority WRITE setDrawingPriority)

#define CLIP_PROPERTIES \
    Q_PROPERTY(QString clipPath READ clipPath WRITE setClipPath) \
    Q_PROPERTY(QString clipRule READ clipRule WRITE setClipRule)

#define FILTER_PROPERTIES
    /* No properties for filter capacities */

#define TRANSFORM_PROPERTIES \
    Q_PROPERTY(QString transform READ transform WRITE setTransform)

#define CORE_METHODS \
    QString id(){return mId;}\
    void setId(QString pId){mId = pId; setObjectName(pId);}

#define PAINTFILL_METHODS \
    ColorType fill(){return mFill;} \
    void setFill(ColorType pFill){mFill = pFill;} \
    StringType fillRule(){return mFillRule;} \
    void setFillRule(StringType pFillRule){mFillRule = pFillRule;} \
    OpacityType fillOpacity(){return mFillOpacity;} \
    void setFillOpacity(OpacityType pFillOpacity){mFillOpacity = pFillOpacity;}

#define PAINTSTROKE_METHODS \
    ColorType stroke(){return mStroke;} \
    void setStroke(ColorType pStroke){mStroke = pStroke;} \
    DistanceType strokeWidth(){return mStrokeWidth;} \
    void setStrokeWidth(DistanceType pStrokeWidth){mStrokeWidth = pStrokeWidth;} \
    StringType strokeLineCap(){return mStrokeLineCap;} \
    void setStrokeLineCap(StringType pStrokeLineCap){mStrokeLineCap = pStrokeLineCap;} \
    StringType strokeLineJoin(){return mStrokeLineJoin;} \
    void setStrokeLineJoin(StringType pStrokeLineJoin){mStrokeLineJoin = pStrokeLineJoin;} \
    DoubleType strokeMiterLimit(){return mStrokeMiterLimit;} \
    void setStrokeMiterLimit(DoubleType pStrokeMiterLimit){mStrokeMiterLimit = pStrokeMiterLimit;} \
    QString strokeDashArray(){return mStrokeDashArray;} \
    void setStrokeDashArray(QString pStrokeDashArray){mStrokeDashArray = pStrokeDashArray;} \
    std::vector<std::string> getStrokeDashArray(){return PaintStrokeCapacities::getDashPatternArray(mStrokeDashArray);} \
    float strokeDashOffset(){return mStrokeDashOffset;} \
    void setStrokeDashOffset(float pStrokeDashOffset){mStrokeDashOffset = pStrokeDashOffset;} \
    OpacityType strokeOpacity(){return mStrokeOpacity;} \
    void setStrokeOpacity(OpacityType pStrokeOpacity){mStrokeOpacity = pStrokeOpacity;}

#define GRAPHICS_METHODS \
    QString visibility(){return mVisibility;} \
    void setVisibility(QString pVisibility){mVisibility = pVisibility; \
            if(pVisibility.compare("visible", Qt::CaseInsensitive) == 0){setVisible(true);} \
            else if(pVisibility.compare("hidden", Qt::CaseInsensitive) == 0){setVisible(false);} \
            else if(pVisibility.compare("collapse", Qt::CaseInsensitive) == 0){setVisible(false);} \
            else if(pVisibility.compare("inherit", Qt::CaseInsensitive) == 0){if(getParent() != NULL){setVisible(getParent()->visible());}} \
            else {setVisible(false);}} \
    int drawingPriority(){return mDrawingPriority;} \
    void setDrawingPriority(int pDrawingPriority){mDrawingPriority = pDrawingPriority;}

#define CLIP_METHODS \
    QString clipPath(){return mClipPath;} \
    void setClipPath(QString pClipPath){mClipPath = pClipPath;} \
    QString clipRule(){return mClipRule;}\
    void setClipRule(QString pClipRule){mClipRule = pClipRule;}

#define FILTER_METHODS
    /* No methods for filter capacities */

#define TRANSFORM_METHODS \
    QString transform(){return mTransform;} \
    void setTransform(QString pTransform){mTransform = pTransform;}

#define CORE_FIELDS \
    QString mId;

#define PAINTFILL_FIELDS \
    ColorType mFill; \
    StringType mFillRule; \
    OpacityType mFillOpacity;

#define PAINTSTROKE_FIELDS \
    ColorType mStroke; \
    DistanceType mStrokeWidth; \
    StringType mStrokeLineCap; \
    StringType mStrokeLineJoin; \
    DoubleType mStrokeMiterLimit; \
    QString mStrokeDashArray; \
    float mStrokeDashOffset; \
    OpacityType mStrokeOpacity;

#define GRAPHICS_FIELDS \
    QString mVisibility; \
    int mDrawingPriority;

#define CLIP_FIELDS \
    QString mClipPath; \
    QString mClipRule;

#define FILTER_FIELDS
    /* No fields for filter capacities */

#define TRANSFORM_FIELDS \
    QString mTransform;


#define PAINTFILL_INITIALIZERS \
    setFill("none"), \
    setFillRule("nonzero"), \
    setFillOpacity(1.0)

#define PAINTSTROKE_INITIALIZERS \
    setStroke("white"), \
    setStrokeWidth(1.0), \
    setStrokeLineCap("butt"), \
    setStrokeLineJoin("miter"), \
    setStrokeMiterLimit(4.0), \
    setStrokeDashArray(""), \
    setStrokeDashOffset(0.0), \
    setStrokeOpacity(1.0)


#define GRAPHICS_INITIALIZERS \
    mVisibility("visible"), \
    mDrawingPriority(0)

#define CLIP_INITIALIZERS \
    mClipPath("none"), \
    mClipRule("nonzero")

#define TRANSFORM_INITIALIZERS \
    mTransform("none")

#endif // CAPACITIESMACROS_H
