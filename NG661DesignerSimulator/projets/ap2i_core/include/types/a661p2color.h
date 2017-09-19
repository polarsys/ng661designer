/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef A661P2COLOR_H
#define A661P2COLOR_H

#include <QMetaType>

#include <QScriptValue>

class QString;
class QScriptEngine;
class QScriptContext;

//SVG color constants as described in http://www.w3.org/TR/SVG/types.html#ColorKeywords
const struct
{
    const char *name;
    unsigned char red;
    unsigned char green;
    unsigned char blue;
    unsigned char alpha;
} svg_colors_table [] =
{
    { "aliceblue", 240, 248, 255, 255 },
    { "antiquewhite", 250, 235, 215, 255 },
    { "aqua",  0, 255, 255, 255 },
    { "aquamarine", 127, 255, 212, 255 },
    { "azure", 240, 255, 255, 255 },
    { "beige", 245, 245, 220, 255 },
    { "bisque", 255, 228, 196, 255 },
    { "black",  0, 0, 0, 255 },
    { "blanchedalmond", 255, 235, 205, 255 },
    { "blue",  0, 0, 255, 255 },
    { "blueviolet", 138, 43, 226, 255 },
    { "brown", 165, 42, 42, 255 },
    { "burlywood", 222, 184, 135, 255 },
    { "cadetblue",  95, 158, 160, 255 },
    { "chartreuse", 127, 255, 0, 255 },
    { "chocolate", 210, 105, 30, 255 },
    { "coral", 255, 127, 80, 255 },
    { "cornflowerblue", 100, 149, 237, 255 },
    { "cornsilk", 255, 248, 220, 255 },
    { "crimson", 220, 20, 60, 255 },
    { "cyan",  0, 255, 255, 255 },
    { "darkblue",  0, 0, 139, 255 },
    { "darkcyan",  0, 139, 139, 255 },
    { "darkgoldenrod", 184, 134, 11, 255 },
    { "darkgray", 169, 169, 169, 255 },
    { "darkgreen",  0, 100, 0, 255 },
    { "darkgrey", 169, 169, 169, 255 },
    { "darkkhaki", 189, 183, 107, 255 },
    { "darkmagenta", 139, 0, 139, 255 },
    { "darkolivegreen",  85, 107, 47, 255 },
    { "darkorange", 255, 140, 0, 255 },
    { "darkorchid", 153, 50, 204, 255 },
    { "darkred", 139, 0, 0, 255 },
    { "darksalmon", 233, 150, 122, 255 },
    { "darkseagreen", 143, 188, 143, 255 },
    { "darkslateblue",  72, 61, 139, 255 },
    { "darkslategray",  47, 79, 79, 255 },
    { "darkslategrey",  47, 79, 79, 255 },
    { "darkturquoise",  0, 206, 209, 255 },
    { "darkviolet", 148, 0, 211, 255 },
    { "deeppink", 255, 20, 147, 255 },
    { "deepskyblue",  0, 191, 255, 255 },
    { "dimgray", 105, 105, 105, 255 },
    { "dimgrey", 105, 105, 105, 255 },
    { "dodgerblue",  30, 144, 255, 255 },
    { "firebrick", 178, 34, 34, 255 },
    { "floralwhite", 255, 250, 240, 255 },
    { "forestgreen",  34, 139, 34, 255 },
    { "fuchsia", 255, 0, 255, 255 },
    { "gainsboro", 220, 220, 220, 255 },
    { "ghostwhite", 248, 248, 255, 255 },
    { "gold", 255, 215, 0, 255 },
    { "goldenrod", 218, 165, 32, 255 },
    { "gray", 128, 128, 128, 255 },
    { "grey", 128, 128, 128, 255 },
    { "green",  0, 128, 0, 255 },
    { "greenyellow", 173, 255, 47, 255 },
    { "honeydew", 240, 255, 240, 255 },
    { "hotpink", 255, 105, 180, 255 },
    { "indianred", 205, 92, 92, 255 },
    { "indigo",  75, 0, 130, 255 },
    { "ivory", 255, 255, 240, 255 },
    { "khaki", 240, 230, 140, 255 },
    { "lavender", 230, 230, 250, 255 },
    { "lavenderblush", 255, 240, 245, 255 },
    { "lawngreen", 124, 252, 0, 255 },
    { "lemonchiffon", 255, 250, 205, 255 },
    { "lightblue", 173, 216, 230, 255 },
    { "lightcoral", 240, 128, 128, 255 },
    { "lightcyan", 224, 255, 255, 255 },
    { "lightgoldenrodyellow", 250, 250, 210, 255 },
    { "lightgray", 211, 211, 211, 255 },
    { "lightgreen", 144, 238, 144, 255 },
    { "lightgrey", 211, 211, 211, 255 },
    { "lightpink", 255, 182, 193, 255 },
    { "lightsalmon", 255, 160, 122, 255 },
    { "lightseagreen",  32, 178, 170, 255 },
    { "lightskyblue", 135, 206, 250, 255 },
    { "lightslategray", 119, 136, 153, 255 },
    { "lightslategrey", 119, 136, 153, 255 },
    { "lightsteelblue", 176, 196, 222, 255 },
    { "lightyellow", 255, 255, 224, 255 },
    { "lime",  0, 255, 0, 255 },
    { "limegreen",  50, 205, 50, 255 },
    { "linen", 250, 240, 230, 255 },
    { "magenta", 255, 0, 255, 255 },
    { "maroon", 128, 0, 0, 255 },
    { "mediumaquamarine", 102, 205, 170, 255 },
    { "mediumblue",  0, 0, 205, 255 },
    { "mediumorchid", 186, 85, 211, 255 },
    { "mediumpurple", 147, 112, 219, 255 },
    { "mediumseagreen",  60, 179, 113, 255 },
    { "mediumslateblue", 123, 104, 238, 255 },
    { "mediumspringgreen",  0, 250, 154, 255 },
    { "mediumturquoise",  72, 209, 204, 255 },
    { "mediumvioletred", 199, 21, 133, 255 },
    { "midnightblue",  25, 25, 112, 255 },
    { "mintcream", 245, 255, 250, 255 },
    { "mistyrose", 255, 228, 225, 255 },
    { "moccasin", 255, 228, 181, 255 },
    { "navajowhite", 255, 222, 173, 255 },
    { "navy",  0, 0, 128, 255 },
    { "oldlace", 253, 245, 230, 255 },
    { "olive", 128, 128, 0, 255 },
    { "olivedrab", 107, 142, 35, 255 },
    { "orange", 255, 165, 0, 255 },
    { "orangered", 255, 69, 0, 255 },
    { "orchid", 218, 112, 214, 255 },
    { "palegoldenrod", 238, 232, 170, 255 },
    { "palegreen", 152, 251, 152, 255 },
    { "paleturquoise", 175, 238, 238, 255 },
    { "palevioletred", 219, 112, 147, 255 },
    { "papayawhip", 255, 239, 213, 255 },
    { "peachpuff", 255, 218, 185, 255 },
    { "peru", 205, 133, 63, 255 },
    { "pink", 255, 192, 203, 255 },
    { "plum", 221, 160, 221, 255 },
    { "powderblue", 176, 224, 230, 255 },
    { "purple", 128, 0, 128, 255 },
    { "red", 255, 0, 0, 255 },
    { "rosybrown", 188, 143, 143, 255 },
    { "royalblue",  65, 105, 225, 255 },
    { "saddlebrown", 139, 69, 19, 255 },
    { "salmon", 250, 128, 114, 255 },
    { "sandybrown", 244, 164, 96, 255 },
    { "seagreen",  46, 139, 87, 255 },
    { "seashell", 255, 245, 238, 255 },
    { "sienna", 160, 82, 45, 255 },
    { "silver", 192, 192, 192, 255 },
    { "skyblue", 135, 206, 235, 255 },
    { "slateblue", 106, 90, 205, 255 },
    { "slategray", 112, 128, 144, 255 },
    { "slategrey", 112, 128, 144, 255 },
    { "snow", 255, 250, 250, 255 },
    { "springgreen",  0, 255, 127, 255 },
    { "steelblue",  70, 130, 180, 255 },
    { "tan", 210, 180, 140, 255 },
    { "teal",  0, 128, 128, 255 },
    { "thistle", 216, 191, 216, 255 },
    { "tomato", 255, 99, 71, 255 },
    { "turquoise",  64, 224, 208, 255 },
    { "violet", 238, 130, 238, 255 },
    { "wheat", 245, 222, 179, 255 },
    { "white", 255, 255, 255, 255 },
    { "whitesmoke", 245, 245, 245, 255 },
    { "yellow", 255, 255, 0, 255 },
    { "yellowgreen", 154, 205, 50, 255 },
    { "none",  0, 0, 0, 0 }
};
/**
 * @brief Manage color type attribute.
 */
class A661p2Color
{
public:
    /**
     * @brief A661p2Color Constructor
     * @param pRed the red canal value.
     * @param pGreen the green canal value.
     * @param pBlue the blue canal value.
     * @param pAlpha the alpha canal value.
     */
    A661p2Color(unsigned char pRed = 0,
                unsigned char pGreen = 0,
                unsigned char pBlue = 0,
                unsigned char pAlpha = 0);

    /**
     * @brief A661p2Color Constructor
     * @param pName the string containing canals.
     */
    A661p2Color(const QString &pName);
    /**
     * @brief A661p2Color Constructor
     * @param pName the string containing canals.
     */
    A661p2Color(const char *pName);

    /**
     * @brief A661p2Color copy constructor
     * @param pColor the type to copy.
     */
    A661p2Color(const A661p2Color &pColor);

    /** Destructor */
    ~A661p2Color();

    /**
     * @brief operator =
     * @param pColor the color to set.
     * @return the final type.
     */
    A661p2Color &operator=(A661p2Color pColor);
    /**
     * @brief operator =
     * @param pColorName the name of the color to set.
     * @return the final type.
     */
    A661p2Color &operator=(const QString &pColorName);
    /**
     * @brief operator =
     * @param pColorName the name of the color to set.
     * @return the final type.
     */
    A661p2Color &operator=(const char *pColorName);

    /**
     * @brief red canal getter.
     * @return the red canal.
     */
    unsigned char red()   { return mRed;   }
    /**
     * @brief green canal getter.
     * @return the green canal.
     */
    unsigned char green() { return mGreen; }
    /**
     * @brief blue canal getter.
     * @return the blue canal.
     */
    unsigned char blue()  { return mBlue;  }
    /**
     * @brief alpha canal getter.
     * @return the alpha canal.
     */
    unsigned char alpha() { return mAlpha; }
    /**
     * @brief red canal getter.
     * @return the red canal.
     */
    float redf()   { return ((float)mRed) / 255.0;   }
    /**
     * @brief green canal getter.
     * @return the green canal.
     */
    float greenf() { return ((float)mGreen) / 255.0; }
    /**
     * @brief blue canal getter.
     * @return the blue canal.
     */
    float bluef()  { return ((float)mBlue) / 255.0;  }
    /**
     * @brief alpha canal getter.
     * @return the alpha canal.
     */
    float alphaf() { return ((float)mAlpha) / 255.0; }

    /**
     * @brief red canal setter
     * @param pRed the red value to set.
     */
    void setRed  (unsigned char pRed)   { mRed = pRed;     }
    /**
     * @brief green canal setter
     * @param pGreen the green value to set.
     */
    void setGreen(unsigned char pGreen) { mGreen = pGreen; }
    /**
     * @brief blue canal setter
     * @param pBlue the blue value to set.
     */
    void setBlue (unsigned char pBlue)  { mBlue = pBlue;   }
    /**
     * @brief alpha canal setter
     * @param pAlpha the alpha value to set.
     */
    void setAlpha(unsigned char pAlpha) { mAlpha = pAlpha; }

    /**
     * @brief RGBA setter
     * @param pRed the red value to set.
     * @param pGreen the green value to set.
     * @param pBlue the blue value to set.
     * @param pAlpha the alpha value to set.
     */
    void setRGBA(unsigned char pRed   = 0,
                 unsigned char pGreen = 0,
                 unsigned char pBlue  = 0,
                 unsigned char pAlpha = 0);
    /**
     * @brief color setter with SVG name
     * @param pName the svg name
     * @return true if the svg name is valid, false else.
     */
    bool setBySVGName(const QString &pName);

    /**
     * @brief set the type value to script QML.
     * @param pEngine the script engine
     * @param pColor the color to set
     * @return the script value.
     */
    static QScriptValue toScriptValue(QScriptEngine *pEngine,
                                      const A661p2Color &pColor);

    /**
     * @brief set a color withe the value of the script QML
     * @param pValue the script value
     * @param Color the color setted.
     */
    static void fromScriptValue(const QScriptValue &pValue,
                                A661p2Color &Color);

    /**
     * @brief For scripting, returns an array of 4 values [A,R,G,B]
     * @param pCtx the context
     * @param pEngine the script engine.
     * @return the script value.
     */
    static QScriptValue getColorValues(QScriptContext *pCtx,
                                       QScriptEngine *pEngine);

private:
    /** @brief the red canal.*/
    unsigned char mRed;
    /** @brief the green canal.*/
    unsigned char mGreen;
    /** @brief the blue canal.*/
    unsigned char mBlue;
    /** @brief the alpha canal.*/
    unsigned char mAlpha;
};

Q_DECLARE_METATYPE(A661p2Color)

#endif // A661P2COLOR_H


