/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef TEXT_H
#define TEXT_H

#include "basicitem.h"
#include "distancetype.h"
#include "positiontype.h"
#include "stringtype.h"
#include "integertype.h"
#include "alignementtype.h"
#include "opacityType.h"
#include "colortype.h"
extern "C" {
#include <ft2build.h>
#include FT_FREETYPE_H
}

namespace AP2I
{

class Text : public BasicItem
{
    Q_OBJECT
    Q_PROPERTY(StringType fontName READ fontName WRITE setFontName)
    Q_PROPERTY(DistanceType fontSize READ fontSize WRITE setFontSize)
    Q_PROPERTY(StringType value READ value WRITE setValue)
    Q_PROPERTY(AlignementType alignment READ alignment WRITE setAlignment)
    Q_PROPERTY(ColorType backgroundColor READ backgroundColor WRITE setBackgroundColor)
    Q_PROPERTY(OpacityType backgroundOpacity READ backgroundOpacity WRITE setBackgroundOpacity)
    Q_PROPERTY(StringType flowDirection READ flowDirection WRITE setFlowDirection)
    Q_PROPERTY(StringType textFlow READ textFlow WRITE setTextFlow)

public:
    explicit Text(BasicObject *pParent = 0);

    virtual ~Text() {}

    virtual bool renderIn(RenderingContext &pContext);
    virtual bool renderOut(RenderingContext &pContext);    
    virtual void initDefaultFields();


    void setFontName(StringType pFontName){mFontName = pFontName;}
    StringType fontName(){return mFontName;}
    std::string getFontName() {return mFontName.getValue();}

    void setFontSize(DistanceType pFontSize){mFontSize = pFontSize;}
    DistanceType fontSize(){return mFontSize;}
    double getFontSize() {return mFontSize.getValue();}

    void setValue(StringType pValue){mValue = pValue;}
    StringType value(){return mValue;}
    std::string getValue() {return mValue.getValue();}

    void setAlignment(AlignementType pValue){mAlignment = pValue;}
    AlignementType alignment(){return mAlignment;}
    std::string getAlignment() {return mAlignment.getValue();}

    void setBackgroundColor(ColorType pBackgroundColor){mBackgroundColor = pBackgroundColor;}
    ColorType backgroundColor(){return mBackgroundColor;}
    QString getBackgroundColor() {return mBackgroundColor.toString();}

    void setBackgroundOpacity(OpacityType pBackgroundOpacity){mBackgroundOpacity = pBackgroundOpacity;}
    OpacityType backgroundOpacity(){return mBackgroundOpacity;}
    double getBackgroundOpacity() {return mBackgroundOpacity.getValue();}

    void setFlowDirection(StringType pFlowDirection){mFlowDirection = pFlowDirection;}
    StringType flowDirection(){return mFlowDirection;}
    std::string getFlowDirection() {return mFlowDirection.getValue();}

    void setTextFlow(StringType pTextFlow){mTextFlow = pTextFlow;}
    StringType textFlow(){return mTextFlow;}
    std::string getTextFlow() {return mTextFlow.getValue();}

    static const char *CLASS_NAME;

protected :
    void drawStringInOpenGL(float x, float y, const char *format);

private:
    StringType mFontName;
    DistanceType mFontSize;
    StringType mValue;
    AlignementType mAlignment;
    ColorType mBackgroundColor;
    OpacityType mBackgroundOpacity;
    StringType mFlowDirection;
    StringType mTextFlow;
    FT_Library mFtlibrary;
    FT_Face mFtface;
    StringType mFontLoaded;
};

} /* namespace AP2I */

#endif // TEXT_H
