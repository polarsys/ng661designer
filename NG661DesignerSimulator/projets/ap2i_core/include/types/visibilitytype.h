/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef VISIBILITY_H
#define VISIBILITY_H


#include "stringtype.h"
#include <QScriptValue>

/**
 * @brief Namespace A661 part 2.
 */
namespace AP2I
{

/**
 * @brief Manage visibility type attribute.
 */
class VisibilityType : public StringType
{
public:

    /**
     * @brief type of visibility which can be used.
     */
    enum Visibility { visible, hidden, collapse };

    /** @brief Default Constructor **/
    VisibilityType();
    /**
     * @brief Constructor
     * @param pValue the value of visibility to copy.
     */
    VisibilityType(const QString &pValue);
    /**
     * @brief Constructor
     * @param pValue the value of visibility to copy.
     */
    VisibilityType(const std::string pValue);
    /**
     * @brief Constructor
     * @param pValue the value of visibility to copy.
     */
    VisibilityType(const char * pValue);

    /**
     * @brief visibility value setter.
     * @param pValue the value to set.
     */
    virtual void setValue(const QString pValue);
    /**
     * @brief visibility value setter.
     * @param pValue the value to set.
     */
    virtual void setValue(std::string pValue);
    /**
     * @brief visibility value setter.
     * @param pValue the value to set.
     */
    virtual void setValue(const char * pValue);

    /**
     * @brief visibility value getter.
     * @return the visibility value.
     */
    Visibility value();

    /**
     * @brief set an visibility with the value of the script QML
     * @param pValue the script value
     * @param pVisibility the visibility
     */
    static void fromScriptValue(const QScriptValue &pValue, VisibilityType &pVisibility);
    /**
     * @brief set the type value to script QML.
     * @param pEngine the script engine
     * @param pVisibility the visibility to set
     * @return the script value.
     */
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const VisibilityType &pVisibility);

protected:
    /**
     * @brief Define if the value setted is valid.
     * @param pValue the value to verify
     * @return true if the value is valid, false else.
     */
    bool isValueValid(const std::string pValue);

    /**
     * @brief visibility value setter.
     * @param pValue the value to set.
     */
    bool setEnumValue(const std::string pValue);

    /**
     * @brief the enum value of the visibility.
     */
    Visibility mValueEnum;
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::VisibilityType)

#endif // VISIBILITY_H
