/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef IMAGE_H
#define IMAGE_H

#include "alignementtype.h"
#include "aspectratiotype.h"
#include "basicitem.h"
#include "distancetype.h"
#include "positiontype.h"
#include "stringtype.h"
#include "imagetype.h"

//#include "jpeglib.h"

namespace AP2I
{

class Image : public BasicItem
{
    Q_OBJECT
    Q_PROPERTY(PositionType x READ x WRITE setX)
    Q_PROPERTY(PositionType y READ y WRITE setY)
    Q_PROPERTY(DistanceType width READ width WRITE setWidth)
    Q_PROPERTY(DistanceType height READ height WRITE setHeight)
    Q_PROPERTY(ImageType source READ source WRITE setSource)
    Q_PROPERTY(AspectRatioType aspectRatio READ aspectRatio WRITE setAspectRatio)
    Q_PROPERTY(AlignementType alignment READ alignment WRITE setAlignment)

public:
    explicit Image( const QString *curentFolder, BasicObject *pParent = 0);

    virtual ~Image();

    virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut(RenderingContext &pContext);

    void setX(PositionType pX){mX = pX;}
    PositionType x(){return mX;}
    double getX() {return mX.getValue();}

    void setY(PositionType pY){mY = pY;}
    PositionType y(){return mY;}
    double getY() {return mY.getValue();}

    void setWidth(DistanceType pWidth){mWidth = pWidth;}
    DistanceType width(){return mWidth;}
    double getWidth() {return mWidth.getValue();}

    void setHeight(DistanceType pHeight){mHeight = pHeight;}
    DistanceType height(){return mHeight;}
    double getHeight() {return mHeight.getValue();}

    void setSource(ImageType pSource);
    ImageType source(){return mSource;}
    QString getSource() {return mSource.anyURI();}

    void setAspectRatio(AspectRatioType pAspectRatio){mAspectRatio = pAspectRatio;}
    AspectRatioType aspectRatio(){return mAspectRatio;}
    int getAspectRatio() {return int(mAspectRatio.value());}

    void setAlignment(AlignementType pAlignment){mAlignment = pAlignment;}
    AlignementType alignment(){return mAlignment;}
    int getAlignment() {return int(mAlignment.value());}


    static const char *CLASS_NAME;

private:
    PositionType    mX;
    PositionType    mY;
    DistanceType    mWidth;
    DistanceType    mHeight;
    ImageType       mSource;
    AspectRatioType mAspectRatio;
    AlignementType  mAlignment;

    unsigned int    mTranslateX;
    unsigned int    mTranslateY;
    double          mWidthRapport;
    double          mHeightRapport;
    QString         mCurrentFolder;
    VGubyte        *mData;
    VGImage         mImg;
    VGImage         mSubImg;
    VGImageFormat   mLImageFormat;
    unsigned int    mIWidth;
    unsigned int    mIHeight;
    unsigned int    mIDstride;
    bool            mImageDataCreation;

};

} /* namespace AP2I */

#endif // IMAGE_H
