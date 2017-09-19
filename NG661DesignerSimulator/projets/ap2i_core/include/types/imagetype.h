/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef IMAGETYPE_H
#define IMAGETYPE_H

#include <QMetaType>

#include <QScriptValue>
#include <Qstring>
#include <string>

class QString;
class QScriptEngine;
class QScriptContext;


namespace AP2I
{

class ImageType
{
public:

    ImageType();
    ImageType(const QString &pAnyURI);
    ImageType(const char *pAnyURI);
    ImageType(const ImageType &pImage);

    ~ImageType();

    ImageType &operator=(ImageType pImage);
    ImageType &operator=(const QString &pAnyURI);
    ImageType &operator=(const char *pAnyURI);

    QString anyURI() const  { return mAnyURI; }
    void setAnyURI(QString pAnyURI) { mAnyURI = pAnyURI; }

    static QScriptValue toScriptValue(QScriptEngine *pEngine,
                                      const ImageType &pImage);

    static void fromScriptValue(const QScriptValue &pValue,
                                ImageType &pImage);

    static QScriptValue getImageValue(QScriptContext *pCtx,
                                     QScriptEngine *pEngine);

private:
    QString mAnyURI;
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::ImageType)

#endif // IMAGETYPE_H
