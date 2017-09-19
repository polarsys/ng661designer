/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef ASPECTRATIO_H
#define ASPECTRATIO_H


#include "stringtype.h"
#include <QScriptValue>

/**
 * @brief Namespace A661 part 2.
 */
namespace AP2I
{

/**
 * @brief Manage aspect ratio type attribute.
 */
class AspectRatioType : public StringType
{
public:

    /**
     * @brief type of aspect ratio which can be used.
     */
    enum AspectRatio { none, meet, slice };

    /** @brief Default Constructor **/
    AspectRatioType();
    /**
     * @brief Constructor
     * @param pValue the value of aspect ratio to copy.
     */
    AspectRatioType(const QString &pValue);
    /**
     * @brief Constructor
     * @param pValue the value of aspect ratio to copy.
     */
    AspectRatioType(const std::string pValue);
    /**
     * @brief Constructor
     * @param pValue the value of aspect ratio to copy.
     */
    AspectRatioType(const char * pValue);

    /**
     * @brief aspect ratio value setter.
     * @param pValue the value to set.
     */
    virtual void setValue(const QString pValue);
    /**
     * @brief aspect ratio value setter.
     * @param pValue the value to set.
     */
    virtual void setValue(std::string pValue);
    /**
     * @brief aspect ratio value setter.
     * @param pValue the value to set.
     */
    virtual void setValue(const char * pValue);

    /**
     * @brief aspect ratio value getter.
     * @return the aspect ratio value.
     */
    AspectRatio value();

    /**
     * @brief set an aspect ratio with the value of the script QML
     * @param pValue the script value
     * @param pAspectRatio the aspect ratio
     */
    static void fromScriptValue(const QScriptValue &pValue, AspectRatioType &pAspectRatio);
    /**
     * @brief set the type value to script QML.
     * @param pEngine the script engine
     * @param pAspectRatio the aspect ratio to set
     * @return the script value.
     */
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const AspectRatioType &pAspectRatio);

protected:
    /**
     * @brief Define if the value setted is valid.
     * @param pValue the value to verify
     * @return true if the value is valid, false else.
     */
    bool isValueValid(const std::string pValue);

    /**
     * @brief aspect ratio value setter.
     * @param pValue the value to set.
     */
    bool setEnumValue(const std::string pValue);

    /**
     * @brief the enum value of the aspect ratio.
     */
    AspectRatio mValueEnum;
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::AspectRatioType)

#endif // ASPECTRATIO_H
