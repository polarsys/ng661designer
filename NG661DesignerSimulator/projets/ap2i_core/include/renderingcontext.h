/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef RENDERINGCONTEXT_H
#define RENDERINGCONTEXT_H

#include <QSharedPointer>
#include <QMap>
#include <QRect>
#include <QMatrix>

class QPaintDevice;
class QImage;

namespace AP2I
{

//typedef QMap<const QImage *, uint> TexturesMap;

class RenderingContext
{
    // RenderingEngine is the only class allowed to do copies of the context
    // context is copied when rendering children of a node so that they can change
    // it without having to restore it manually
    friend class RenderingEngine;

public:
    RenderingContext(/*QPaintDevice *pDevice = 0*/);

    int currentX() const { return mCurrentX; }
    void setCurrentX(int pNewX) { mCurrentX = pNewX; }

    int currentY() const { return mCurrentY; }
    void setCurrentY(int pNewY) { mCurrentY = pNewY; }

    float currentOpacity() const { return mCurrentOpacity; }
    void setCurrentOpacity(float pNewOpacity) { mCurrentOpacity = pNewOpacity; }

    const QRect &currentClipbox() const { return mCurrentClipbox; }
    void cumulateClipbox(int pX, int pY, int pWidth, int pHeight);

    const QMatrix &currentMatrix() const { return mCurrentMatrix; }
    QMatrix &currentMatrix() { return mCurrentMatrix; }

//    QPaintDevice *device() const { return mDevice; }
//    void setDevice(QPaintDevice *pDevice) { mDevice = pDevice; }

    // load the given pImage in the GPU or return the id of the loaded texture
    // if pImage has already been loaded
    uint loadTexture(const QImage &pImage);

private:
    int mCurrentX;
    int mCurrentY;
    float mCurrentOpacity;
    QRect mCurrentClipbox;
    QMatrix mCurrentMatrix;
//    QPaintDevice *mDevice;
//    QSharedPointer<TexturesMap> mTextures;
};

} /* namespace AP2I */

#endif // RENDERINGCONTEXT_H


