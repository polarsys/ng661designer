/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "colortype.h"
#include <QString>
#include <QDebug>
#include <QScriptEngine>
#include <QScriptContext>

namespace AP2I
{
ColorType::ColorType(unsigned char pRed,
                         unsigned char pGreen,
                         unsigned char pBlue,
                         unsigned char pAlpha)
{
    setRGBA(pRed, pGreen, pBlue, pAlpha);
    mIsDefined = true;
}

ColorType::ColorType(const QString &pName)
{
    if (!setBySVGName(pName))
    {
        qDebug() << "WARNING: unknown color " << pName << ", default to \"magenta\".";
        qDebug() << "Color name shall be either an SVG Color name or an ARGB value formatted as follow: #AARRGGBB or an RGB value formatted as follow: #RRGGBB.";
        setRGBA(255, 0, 255, 255);
        mIsDefined = false;
    }else{
        mIsDefined = true;
    }
}

ColorType::ColorType(const char *pName)
{
    if (!setBySVGName(pName))
    {
        qDebug() << "WARNING: unknown color " << pName << ", default to \"magenta\".";
        qDebug() << "Color name shall be either an SVG Color name or an ARGB value formatted as follow: #AARRGGBB or an RGB value formatted as follow: #RRGGBB.";
        setRGBA(255, 0, 255, 255);
        mIsDefined = false;
    }else{
        mIsDefined = true;
    }
}

ColorType::ColorType(const ColorType &pColor)
{
    mRed = pColor.mRed;
    mGreen = pColor.mGreen;
    mBlue = pColor.mBlue;
    mAlpha = pColor.mAlpha;
    mIsDefined = pColor.mIsDefined;
}

ColorType::~ColorType()
{
}

ColorType &ColorType::operator=(ColorType pColor)
{
    mRed = pColor.mRed;
    mGreen = pColor.mGreen;
    mBlue = pColor.mBlue;
    mAlpha = pColor.mAlpha;
    mIsDefined = pColor.mIsDefined;
    return *this;
}

ColorType &ColorType::operator=(const QString &pColorName)
{
    *this = ColorType(pColorName);
    return *this;
}

ColorType &ColorType::operator=(const char *pColorName)
{
    *this = ColorType(pColorName);
    return *this;
}

void ColorType::setRGBA(unsigned char pRed,
                          unsigned char pGreen,
                          unsigned char pBlue,
                          unsigned char pAlpha)
{
    mRed = pRed;
    mGreen = pGreen;
    mBlue = pBlue;
    mAlpha = pAlpha;
}

bool ColorType::setBySVGName(const QString &pName)
{
    bool lReturnValue = false;
    if (pName[0] == '#')
    {
        //html style #AARRGGBB
        if (pName.length() == 9)
        {
            bool lLocalOK;
            uint lAlpha = pName.mid(1, 2).toUInt(&lReturnValue, 16);
            uint lRed   = pName.mid(3, 2).toUInt(&lLocalOK, 16);
            lReturnValue = lReturnValue && lLocalOK;
            uint lGreen = pName.mid(5, 2).toUInt(&lLocalOK, 16);
            lReturnValue = lReturnValue && lLocalOK;
            uint lBlue  = pName.mid(7, 2).toUInt(&lLocalOK, 16);
            lReturnValue = lReturnValue && lLocalOK;

            if (lReturnValue)
            {
                mRed = lRed;
                mGreen = lGreen;
                mBlue = lBlue;
                mAlpha = lAlpha;
            }
        }
        //html style #RRGGBB
        else if (pName.length() == 7)
        {
            bool lLocalOK;
            uint lRed = pName.mid(1, 2).toUInt(&lReturnValue, 16);
            uint lGreen   = pName.mid(3, 2).toUInt(&lLocalOK, 16);
            lReturnValue = lReturnValue && lLocalOK;
            uint lBlue = pName.mid(5, 2).toUInt(&lLocalOK, 16);
            lReturnValue = lReturnValue && lLocalOK;

            if (lReturnValue)
            {
                mRed = lRed;
                mGreen = lGreen;
                mBlue = lBlue;
                mAlpha = 255;
            }
        }
    }
    else
    {
        //svg named color
        int lNbColor = sizeof(svg_colors_table) / sizeof(svg_colors_table[0]);
        int i =  0;
        while (lReturnValue == false && i < lNbColor)
        {
            if (pName == svg_colors_table[i].name)
            {
                lReturnValue = true;
                mRed = svg_colors_table[i].red;
                mGreen = svg_colors_table[i].green;
                mBlue = svg_colors_table[i].blue;
                mAlpha = svg_colors_table[i].alpha;
            }
            else
            {
                i++;
            }
        }
    }
    return lReturnValue;
}

// used by QScriptEngine to convert a ColorType to a generic QScriptValue
QScriptValue ColorType::toScriptValue(QScriptEngine *,
                                        const ColorType &pColor)
{
     //return pEngine->newVariant(QVariant::fromValue(pColor));
    return QScriptValue(pColor.toString());
}

// used by QScriptEngine to convert a generic QScriptValue to an ColorType
// it allows to set color properties in scripts by giving another color property :
//      Representation.rect1.fillColor = Representation.rect2.fillColor
// or to set the color directly by giving the its name :
//      Representation.rect1.fillColor = "red";
//      Representation.rect1.fillColor = "#FF0000";
//      Representation.rect1.fillColor = "#FFFF0000";
void ColorType::fromScriptValue(const QScriptValue &pValue,
                                  ColorType &pColor)
{
    if (pValue.isString())
    {
        pColor.setBySVGName(pValue.toString());
    }
    else
    {
        pColor = pValue.toVariant().value<ColorType>();
    }
}


QScriptValue ColorType::getColorValues(QScriptContext *pCtx,
                                         QScriptEngine *pEngine)
{

    if (pCtx->argumentCount() == 1)
    {
        ColorType lColor;
        fromScriptValue(pCtx->argument(0), lColor);

        QScriptValue lValues = pEngine->newArray(4);
        lValues.setProperty(0, lColor.alpha());
        lValues.setProperty(1, lColor.red()  );
        lValues.setProperty(2, lColor.green());
        lValues.setProperty(3, lColor.blue() );
        return lValues;
    }
    else
    {
        return pCtx->throwError("getColorValues takes only 1 argument : the color.");
    }
}

QString ColorType::toString() const
{
    QString lReturn;
    QString lAlpha, lRed, lBlue, lGreen;

    lAlpha.setNum(mAlpha, 16);
    lRed.setNum(mRed, 16);
    lBlue.setNum(mBlue, 16);
    lGreen.setNum(mGreen, 16);

    lReturn = "#" + lAlpha.toUpper() + lRed.toUpper() + lBlue.toUpper() + lGreen.toUpper();

    return lReturn;
}
} /* namespace AP2I */
