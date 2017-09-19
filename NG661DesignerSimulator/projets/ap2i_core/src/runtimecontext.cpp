/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "runtimecontext.h"

#include <QImage>
#include <QGLWidget>
#include <QDebug>

namespace AP2I 
{

RuntimeContext RuntimeContext::defaultContext;

RuntimeContext::RuntimeContext()
    : mPointer(0)
{
}

RuntimeContext::~RuntimeContext()
{
    for (QMap<QString, QImage *>::iterator it = mImages.begin();
         it != mImages.end();
         it++)
    {
        delete it.value();
    }
}

QImage *RuntimeContext::loadImage(const QString &pImageFile)
{
    QImage *lReturnValue = 0;

    if (mImages.contains(pImageFile))
    {
        lReturnValue = mImages.value(pImageFile);
    }
    else
    {
        QImage lImg(pImageFile);
        if (lImg.isNull())
        {
            qDebug() << "ERROR: unable to load image file " << pImageFile;
        }
        else
        {
            lReturnValue = new QImage(QGLWidget::convertToGLFormat(lImg));
            mImages.insert(pImageFile, lReturnValue);
        }
    }
    return lReturnValue;
}

} /* namespace AP2I */
