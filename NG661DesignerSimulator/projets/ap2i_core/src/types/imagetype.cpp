/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include <QString>
#include <QDebug>
#include <QScriptEngine>
#include <QScriptContext>
#include "imagetype.h"


namespace AP2I
{

ImageType::ImageType()
{
}

ImageType::ImageType(const QString &pAnyURI)
{
    this->setAnyURI( pAnyURI);
}

ImageType::ImageType(const char *pAnyURI)
{
    this->setAnyURI( QString(pAnyURI));
}

ImageType::ImageType(const ImageType &pImage)
{
    mAnyURI = pImage.mAnyURI;
}


ImageType::~ImageType()
{
}


ImageType &ImageType::operator=(ImageType pImage)
{
    mAnyURI = pImage.mAnyURI;
    return *this;
}

ImageType &ImageType::operator=(const QString &pAnyURI)
{
    *this = ImageType(pAnyURI);
    return *this;
}

ImageType &ImageType::operator=(const char *pAnyURI)
{
    *this = ImageType(pAnyURI);
    return *this;
}

// used by QScriptEngine to convert a ImageType to a generic QScriptValue
QScriptValue ImageType::toScriptValue(QScriptEngine  *,
                                     const ImageType &pImage)
{
    return QScriptValue(pImage.anyURI());
}

// used by QScriptEngine to convert a generic QScriptValue to an ImageType
void ImageType::fromScriptValue(const QScriptValue &pValue,
                                  ImageType &pImage)
{
    if (pValue.isString())
    {
        pImage.setAnyURI(pValue.toString());
    }
    else
    {
        pImage = pValue.toVariant().value<ImageType>();
    }
}

QScriptValue ImageType::getImageValue(QScriptContext *pCtx,
                                    QScriptEngine  *)
{

    if (pCtx->argumentCount() == 1)
    {
        ImageType lImage;
        fromScriptValue(pCtx->argument(0), lImage);

        return lImage.anyURI();
    }
    else
    {
        return pCtx->throwError("getDateValue takes only 1 argument : the date.");
    }
}

}
