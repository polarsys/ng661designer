/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "renderingcontext.h"

extern "C" {
#include "GL/gl.h"
}
#include <QImage>
#include <QDebug>

namespace AP2I
{

RenderingContext::RenderingContext(/*QPaintDevice *pDevice*/)
    : mCurrentX(0),
      mCurrentY(0),
      mCurrentOpacity(1.0),
      mCurrentClipbox(),
      mCurrentMatrix()
//      mDevice(pDevice),
//      mTextures(new TexturesMap())
{
}

void RenderingContext::cumulateClipbox(int pX, int pY, int pWidth, int pHeight)
{
    if (mCurrentClipbox.isNull())
    {
        mCurrentClipbox = QRect(pX, pY, pWidth, pHeight);
    }
    else
    {
        //        mCurrentClipbox = mCurrentClipbox.intersected(QRect(pX, pY, pWidth, pHeight));
        QRect lIntersectedRect = mCurrentClipbox.intersected(QRect(pX, pY, pWidth, pHeight));
        mCurrentClipbox = mCurrentClipbox.united( lIntersectedRect);
    }
}

uint RenderingContext::loadTexture(const QImage &)
{
//    uint lReturnValue = 0;

//    if(mTextures.data()->contains(&pImage))
//    {
//        lReturnValue = mTextures.data()->value(&pImage);
//    }
//    else
//    {
//        glEnable(GL_TEXTURE_2D);
//        glGenTextures(1, &lReturnValue);
//        glBindTexture(GL_TEXTURE_2D, lReturnValue);
//        glTexEnvi(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
//        glTexImage2D(GL_TEXTURE_2D,
//                     0,
//                     GL_RGBA,
//                     pImage.width(),
//                     pImage.height(),
//                     0,
//                     GL_RGBA,
//                     GL_UNSIGNED_BYTE,
//                     pImage.bits());
//        GLenum lErr = glGetError();
//        if (lErr != GL_NO_ERROR)
//        {
//            qDebug() << "ERROR: failed to load texture in GPU (error code = " +
//                        QString("0x%1").arg(lErr, 4, 16, QChar('0')) +  ")";
//        }
//        mTextures.data()->insert(&pImage, lReturnValue);
//    }
//    return lReturnValue;
    return 0;
}

} /* namespace AP2I */
