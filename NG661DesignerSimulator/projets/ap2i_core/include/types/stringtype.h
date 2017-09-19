/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef STRINGTYPE_H
#define STRINGTYPE_H

#include <QMetaType>
#include <Qstring>
#include <string>
#include <QScriptValue>


namespace AP2I
{

/**
 * @brief Manage string type attribute.
 */
class StringType
{

public:
    /** StringType Default Constructor.*/
    StringType();
    /** StringType Constructor.
     * @param pName The string to copy.
    */
    StringType(const QString &pName);
    /** StringType Constructor.
     * @param pValue The string to copy.
    */
    StringType(const std::string pValue);
    /** StringType Constructor.
     * @param pValue The string to copy.
    */
    StringType(const char * pValue);
    /** StringType Destructor.*/
    virtual ~StringType() {}

    /** StringType value setter.
     * @param pValue The string to copy.
    */
    virtual void setValue(const QString pValue);
    /** StringType value setter.
     * @param pValue The string to copy.
    */
    virtual void setValue(std::string pValue);
    /** StringType value setter.
     * @param pValue The string to copy.
    */
    virtual void setValue(const char * pValue);
    /** StringType value getter.
     * @return The string value.
    */
    std::string getValue() const { return mValue; }
    /** Ask for the type is defined. That is to say, set on xml file.
     * @return true if the type is defined, false else.
    */
    bool isDefined() const { return mDefined; }

    /**
     * @brief operator =
     * @param pOther the type to copy.
     * @return the final type.
     */
    StringType &operator=(const StringType &pOther);
    /**
     * @brief operator ==
     * @param pOther the type to verify.
     * @return true if types are equal, false else.
     */
    bool operator==(const StringType &pOther) const;
    /**
     * @brief operator <
     * @param pOther the type to verify.
     * @return true if pOther is the greatest, false else.
     */
    bool operator<(const StringType &pOther) const;
    /**
     * @brief operator <
     * @param pOther the type to verify.
     * @return true if pOther is not the greatest, false else.
     */
    bool operator>(const StringType &pOther) const;

    /**
     * @brief set a string with the value of the script QML
     * @param pValue the script value
     * @param pString the string
     */
    static void fromScriptValue(const QScriptValue &pValue, StringType &pString);
    /**
     * @brief set the string value to script QML.
     * @param pEngine the script engine
     * @param String the string to set
     * @return the script value.
     */
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const StringType &pString);

protected:
    /**
     * @brief Define if the value setted is valid.
     * @param pValue the value to verify
     * @return true if the value is valid, false else.
     */
    virtual bool isValueValid(const std::string pValue);

    /**
     * @brief The value associated to the type.
     */
    std::string mValue;
    /**
     * @brief Ask for the type is defined. true if value is set by user (not default value)
     */
    bool mDefined; // true if value is set by user (not default value)
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::StringType)

#endif // STRINGTYPE_H
