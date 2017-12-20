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
#include <png.h>
#include <string>
#include <cstring>
extern "C" {
#include "GL/gl.h"
#include "GL/glext.h"
}

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

        /* Commun */
        mData = NULL;
        unsigned int bbpp;
        unsigned int lilEndianTest = 1;
        bool lSuccess = false;

        /* Jpg */
        struct jpeg_decompress_struct jdc;
        struct jpeg_error_mgr jerr;
        JSAMPARRAY buffer;
        unsigned int bstride;               
        unsigned int dbpp;
        VGubyte *brow;
        VGubyte *drow;

        /* Png */
        png_structp png_ptr;
        png_infop info_ptr;
        unsigned int sig_read = 0;
        int bit_depth, color_type;
        png_bytep *row_pointers;
        uint i;

        /* Check for endianness */
        if (((unsigned char*)&lilEndianTest)[0] == 1)
          mLImageFormat = VG_lABGR_8888;
        else mLImageFormat = VG_lRGBA_8888;

        /* Try to open image file */
        std::string lFileNameString = getSource().toStdString();
        char filename[lFileNameString.length()+1];
        std::strcpy (filename, lFileNameString.c_str());
        FILE *infile = fopen(filename, "rb");
        if (infile == NULL) {
            QString globalFilePath = mCurrentFolder + "/" +getSource();
            std::string globalFilePathString = globalFilePath.toStdString();
            char globalfilename[globalFilePathString.length()+1];
            std::strcpy (globalfilename, globalFilePathString.c_str());
            infile = fopen(globalfilename, "rb");
            if (infile == NULL) {
                printf("Failed opening '%s' for reading!\n", filename);
                mImageDataCreation = VG_INVALID_HANDLE;
                return mImageDataCreation;
            }
        }

        if (getSource().endsWith(".jpg", Qt::CaseInsensitive))
        {
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
           lSuccess = true;

        }
        else if(getSource().endsWith(".png", Qt::CaseInsensitive))
        {           
           png_ptr = png_create_read_struct(PNG_LIBPNG_VER_STRING, NULL, NULL, NULL);

           if (png_ptr == NULL)
           {
              fclose(infile);
              mImageDataCreation = VG_INVALID_HANDLE;
              return mImageDataCreation;
           }
           else
           {
               /* Nothing to do */
           }

           /* Allocate/initialize the memory for image information.  REQUIRED. */
           info_ptr = png_create_info_struct(png_ptr);
           if (info_ptr == NULL)
           {
              fclose(infile);
              png_destroy_read_struct(&png_ptr, png_infopp_NULL, png_infopp_NULL);
              mImageDataCreation = VG_INVALID_HANDLE;
              return mImageDataCreation;
           }
           else
           {
               /* Nothing to do */
           }

           if (setjmp(png_jmpbuf(png_ptr)))
           {
              /* Free all of the memory associated with the png_ptr and info_ptr */
              png_destroy_read_struct(&png_ptr, &info_ptr, png_infopp_NULL);
              fclose(infile);
              /* If we get here, we had a problem reading the file */
              mImageDataCreation = VG_INVALID_HANDLE;
              return mImageDataCreation;
           }
           else
           {
               /* Nothing to do */
           }

           png_init_io(png_ptr, infile);
           /* If we have already read some of the signature */
           png_set_sig_bytes(png_ptr, sig_read);

           /* Read png info */
           png_read_info (png_ptr, info_ptr);          

           /* Get some usefull information from header */
           bit_depth = png_get_bit_depth (png_ptr, info_ptr);
           color_type = png_get_color_type (png_ptr, info_ptr);

           /* Convert index color images to RGB images */
           if (color_type == PNG_COLOR_TYPE_PALETTE)
           {
                 png_set_palette_to_rgb (png_ptr);
           }
           else
           {
               /*Nothing to do */
           }

           /* Convert 1-2-4 bits grayscale images to 8 bits grayscale. */
           if (color_type == PNG_COLOR_TYPE_GRAY && bit_depth < 8)
           {
                png_set_gray_1_2_4_to_8 (png_ptr);
           }
           else
           {
               /*Nothing to do */
           }

           if (png_get_valid (png_ptr, info_ptr, PNG_INFO_tRNS))
           {
             png_set_tRNS_to_alpha (png_ptr);
           }
           else
           {
               /*Nothing to do */
           }

           if (bit_depth == 16)
           {
                png_set_strip_16 (png_ptr);
           }
           else if (bit_depth < 8)
           {
                png_set_packing (png_ptr);
           }
           else
           {
               /*Nothing to do */
           }

           if (color_type == PNG_COLOR_TYPE_GRAY || PNG_COLOR_TYPE_GRAY_ALPHA)
           {
               png_set_gray_to_rgb(png_ptr);
           }
           else
           {
               /*Nothing to do */
           }

           if (color_type == PNG_COLOR_TYPE_RGB || PNG_COLOR_TYPE_GRAY)
           {
               png_set_add_alpha(png_ptr, 255, PNG_FILLER_AFTER);
           }
           else
           {
               /*Nothing to do */
           }

           /* Update info structure to apply transformations */
           png_read_update_info (png_ptr, info_ptr);

           /* Retrieve updated information */
           png_get_IHDR (png_ptr, info_ptr, (png_uint_32*)&mIWidth, (png_uint_32*)&mIHeight, &bit_depth,
                         &color_type, NULL, NULL, NULL);        

           dbpp = 4;
           mLImageFormat = VG_lABGR_8888;
           mIDstride = mIWidth * dbpp;
           mData = (VGubyte*)malloc(mIDstride * mIHeight);

           /* Setup a pointer array.  Each one points at the begening of a row. */
           row_pointers = (png_bytep *)malloc (sizeof (png_bytep) * mIHeight);

           for (i = 0; i < mIHeight; ++i)
           {
              row_pointers[i] = (png_bytep)(mData + ((mIHeight - (i + 1)) * mIDstride));
           }

           /* Read pixel data using row pointers */
           png_read_image (png_ptr, row_pointers);

           /* We don't need row pointers anymore */
           free (row_pointers);

           /* Finish decompression and release memory */
           png_read_end (png_ptr, NULL);
           png_destroy_read_struct (&png_ptr, &info_ptr, NULL);          

           lSuccess = true;
        }
        else
        {
            qDebug() << "ERROR: Format d'image non reconnu\n";
        }

        if (lSuccess == true)
        {
            /* Create VG image */
            mImg = vgCreateImage(mLImageFormat, mIWidth, mIHeight, VG_IMAGE_QUALITY_BETTER);
            vgImageSubData(mImg, mData, mIDstride, mLImageFormat, 0, 0, mIWidth, mIHeight);
            mSubImg = vgCreateImage(mLImageFormat, mIWidth, mIHeight, VG_IMAGE_QUALITY_BETTER);
            mImageDataCreation = true;
            fclose(infile);
        }
        else
        {
            mImageDataCreation = VG_INVALID_HANDLE;
            fclose(infile);
            return mImageDataCreation;
        }

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

