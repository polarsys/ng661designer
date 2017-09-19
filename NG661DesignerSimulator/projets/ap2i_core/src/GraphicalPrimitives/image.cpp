/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "image.h"

#include "renderingcontext.h"
#include <iostream>
#include "debug_macros.h"
#include <QDebug>
#include <QFile>
#include "vg/openvg.h"
#include "vg/vgu.h"
#include <jpeglib.h>
//#include <png.h>
#include <string>
#include <cstring>


#define MIN(a, b) ((a)<(b) ? (a) : (b))
#define MAX(a, b) ((a)>(b) ? (a) : (b))


namespace AP2I
{

const char *Image::CLASS_NAME = "Image";


Image::Image( const QString* currentFolder, BasicObject *pParent)
    : BasicItem(pParent)
{
    setClassName(CLASS_NAME);
    mCurrentFolder = *currentFolder;
    mData = NULL;

}

Image::~Image()
{
    // suppression des données de l'image
    if(mData !=NULL){
        free(mData);
    }
}

void Image::setSource(ImageType pSource)
{
    if ( mSource.anyURI().compare(pSource.anyURI()) != 0 )
    {
        mSource = pSource;

        if (mData != NULL)
        {
            vgDestroyImage(mImg);
            vgDestroyImage(mSubImg);
            free(mData);
            mData = NULL;
        }
    }
}


bool Image::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);

    if (mData == NULL){
        struct jpeg_decompress_struct jdc;
        struct jpeg_error_mgr jerr;
        JSAMPARRAY buffer;
        unsigned int bstride;
        unsigned int bbpp;
        mData = NULL;
        unsigned int dbpp;

        VGubyte *brow;
        VGubyte *drow;
        unsigned int lilEndianTest = 1;

        /* Check for endianness */
        if (((unsigned char*)&lilEndianTest)[0] == 1)
          mLImageFormat = VG_lABGR_8888;
        else mLImageFormat = VG_lRGBA_8888;

        /* Try to open image file */
        std::string lFileNameString = getSource().toStdString();
        char * filename = new char [lFileNameString.length()+1];
        std::strcpy (filename, lFileNameString.c_str());
        FILE *infile = fopen(filename, "rb");
        if (infile == NULL) {
            QString globalFilePath = mCurrentFolder + "/" +getSource();
            std::string globalFilePathString = globalFilePath.toStdString();
            char * globalfilename = new char [globalFilePathString.length()+1];
            std::strcpy (globalfilename, globalFilePathString.c_str());
            infile = fopen(globalfilename, "rb");
            if (infile == NULL) {
                printf("Failed opening '%s' for reading!\n", filename);
                mImageDataCreation = VG_INVALID_HANDLE;
                return mImageDataCreation;
            }
        }

        /* Setup default error handling */
        jdc.err = jpeg_std_error(&jerr);
        jpeg_create_decompress(&jdc);

        /* Set input file */
        jpeg_stdio_src(&jdc, infile);

        /* Read header and start */
        jpeg_read_header(&jdc, TRUE);
        jpeg_start_decompress(&jdc);



        mIWidth = jdc.output_width;
        mIHeight = jdc.output_height;

        /* Allocate buffer using jpeg allocator */
        bbpp = jdc.output_components;
        bstride = mIWidth * bbpp;
        buffer = (*jdc.mem->alloc_sarray)
          ((j_common_ptr) &jdc, JPOOL_IMAGE, bstride, 1);

        /* Allocate image mData buffer */
        dbpp = 4;
        mIDstride = mIWidth * dbpp;
        mData = (VGubyte*)malloc(mIDstride * mIHeight);

        /* Iterate until all scanlines processed */
        while (jdc.output_scanline < mIHeight) {

          /* Read scanline into buffer */
          jpeg_read_scanlines(&jdc, buffer, 1);
          drow = mData + (mIHeight-jdc.output_scanline) * mIDstride;
          brow = buffer[0];
          /* Expand to RGBA */
          for (unsigned int x=0; x<mIWidth; ++x, drow+=dbpp, brow+=bbpp) {
            switch (bbpp) {
                case 4:
                  drow[0] = brow[0];
                  drow[1] = brow[1];
                  drow[2] = brow[2];
                  drow[3] = brow[3];
                  break;
                case 3:
                  drow[0] = brow[0];
                  drow[1] = brow[1];
                  drow[2] = brow[2];
                  drow[3] = 255;
                  break;
            }
          }

        }

        fclose(infile);

        /* Create VG image */
        mImg = vgCreateImage(mLImageFormat, mIWidth, mIHeight, VG_IMAGE_QUALITY_BETTER);
        vgImageSubData(mImg, mData, mIDstride, mLImageFormat, 0, 0, mIWidth, mIHeight);

        mSubImg = vgCreateImage(mLImageFormat, mIWidth, mIHeight, VG_IMAGE_QUALITY_BETTER);

        mImageDataCreation = true;
    }

    if (mImageDataCreation)
    {
        VGint lX, lY, lWidth, lHeight;

        switch ( mAspectRatio.value() )
        {
        case (AspectRatioType::meet):
            /* scale to the right width and height */
            /* minimum ratio is used as the whole image shall be displayed */
            mWidthRapport =  MIN(mWidth.getValue() / mIWidth, mHeight.getValue() / mIHeight);
            mHeightRapport = mWidthRapport;

            /* The whole image is displayed */
            lX = 0;
            lY = 0;
            lWidth = mIWidth;
            lHeight = mIHeight;

            switch ( mAlignment.value() )
            {
            case (AlignementType::bottomLeft):
                mTranslateX = 0;
                mTranslateY = 0;
                break;
            case (AlignementType::bottomCenter):
                mTranslateX = (mWidth.getValue() * ( 1 - mWidthRapport / (mWidth.getValue() / mIWidth))) / 2;
                mTranslateY = 0;
                break;
            case (AlignementType::bottomRight):
                mTranslateX = mWidth.getValue() * ( 1 - mWidthRapport / (mWidth.getValue() / mIWidth));
                mTranslateY = 0;
                break;
            case (AlignementType::centerLeft):
                mTranslateX = 0;
                mTranslateY = (mHeight.getValue() * ( 1 - mHeightRapport / (mHeight.getValue() / mIHeight))) / 2;
                break;
            case (AlignementType::center):
                mTranslateX = (mWidth.getValue() * ( 1 - mWidthRapport / (mWidth.getValue() / mIWidth))) / 2;
                mTranslateY = (mHeight.getValue() * ( 1 - mHeightRapport / (mHeight.getValue() / mIHeight))) / 2;
                break;
            case (AlignementType::centerRight):
                mTranslateX = mWidth.getValue() * ( 1 - mWidthRapport / (mWidth.getValue() / mIWidth));
                mTranslateY = (mHeight.getValue() * ( 1 - mHeightRapport / (mHeight.getValue() / mIHeight))) / 2;
                break;
            case (AlignementType::topCenter):
                mTranslateX = (mWidth.getValue() * ( 1 - mWidthRapport / (mWidth.getValue() / mIWidth))) / 2;
                mTranslateY = mHeight.getValue() * ( 1 - mHeightRapport / (mHeight.getValue() / mIHeight));
                break;
            case (AlignementType::topRight):
                mTranslateX = mWidth.getValue() * ( 1 - mWidthRapport / (mWidth.getValue() / mIWidth));
                mTranslateY = mHeight.getValue() * ( 1 - mHeightRapport / (mHeight.getValue() / mIHeight));
                break;
            default: // AlignmentType::topLeft
                mTranslateX = 0;
                mTranslateY = mHeight.getValue() * ( 1 - mHeightRapport / (mHeight.getValue() / mIHeight));
                break;
            }
            break;

        case (AspectRatioType::slice):
            /* scale to the right width and height */
            /* maximum ratio is used as the whole image bounding box shall be filled */
            mWidthRapport =  MAX( mWidth.getValue() / mIWidth, mHeight.getValue() / mIHeight );
            mHeightRapport = mWidthRapport;

            /* no translation of the image, only a subset of the image shall be used */
            mTranslateX = 0;
            mTranslateY = 0;

            /* According to the ratio, compute maximum width and height to display */
            lWidth = MIN( mIWidth, mIWidth * ( (mWidth.getValue() / (double)mIWidth) / mWidthRapport ) );
            lHeight = MIN( mIHeight, mIHeight * ( (mHeight.getValue() / (double)mIHeight) / mHeightRapport ) );

            switch ( mAlignment.value() )
            {
            case (AlignementType::bottomLeft):
                lX = 0;
                lY = 0;
                break;
            case (AlignementType::bottomCenter):
                lX = ( mIWidth - lWidth ) / 2;
                lY = 0;
                break;
            case (AlignementType::bottomRight):
                lX = mIWidth - lWidth;
                lY = 0;
                break;
            case (AlignementType::centerLeft):
                lX = 0;
                lY = ( mIHeight - lHeight ) / 2;
                break;
            case (AlignementType::center):
                lX = ( mIWidth - lWidth ) / 2;
                lY = ( mIHeight - lHeight ) / 2;
                break;
            case (AlignementType::centerRight):
                lX =  mIWidth - lWidth;
                lY = ( mIHeight - lHeight ) / 2;
                break;
            case (AlignementType::topCenter):
                lX = ( mIWidth - lWidth ) / 2;
                lY = mIHeight - lHeight;
                break;
            case (AlignementType::topRight):
                lX = mIWidth - lWidth;
                lY = mIHeight - lHeight;
                break;
            default: // AlignmentType::topLeft
                lX = 0;
                lY = mIHeight - lHeight;
                break;
            }
            break;

        default: //AspectRatioType::none
            /* The whole image is displayed */
            lX = 0;
            lY = 0;
            lWidth = mIWidth;
            lHeight = mIHeight;

            /* scale to the right width and height */
            mWidthRapport =  mWidth.getValue() / mIWidth;
            mHeightRapport = mHeight.getValue() / mIHeight;

            mTranslateX = 0;
            mTranslateY = 0;
            break;
        }

        vgClearImage(mSubImg, 0, 0, mIWidth, mIHeight);

        vgCopyImage(mSubImg, 0, 0, mImg, lX, lY, lWidth, lHeight, VG_TRUE);

        vgSeti(VG_MATRIX_MODE, VG_MATRIX_IMAGE_USER_TO_SURFACE);

        vgTranslate(pContext.currentX() + getX() + mTranslateX, pContext.currentY() + getY() + mTranslateY);

        vgScale(mWidthRapport, mHeightRapport);

        vgDrawImage(mSubImg);
    }
    else
    {
        return mImageDataCreation;
    }
    return true;
}

bool Image::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);

    vgScale( 1/mWidthRapport, 1/mHeightRapport);

    vgTranslate( -(pContext.currentX() + getX() + mTranslateX), -(pContext.currentY() + getY() + mTranslateY));

    return true;
}
} /* namespace AP2I */

