/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef ALIGNEMENT_H
#define ALIGNEMENT_H


#include "stringtype.h"
#include <QScriptValue>

/**
 * @brief Namespace A661 part 2.
 */
namespace AP2I
{

/**
 * @brief Manage alignement type attribute.
 */
class AlignementType : public StringType
{
public:

    /**
     * @brief type of alignements which can be used.
     */
    enum Alignement { topLeft, topCenter, topRight, centerLeft, center, centerRight, bottomLeft, bottomRight, bottomCenter, leftOnly, rightOnly, centerOnly, notDefined};

    /** @brief Default Constructor **/
    AlignementType();
    /**
     * @brief Constructor
     * @param pValue the value of alignement to copy.
     */
    AlignementType(const QString &pValue);
    /**
     * @brief Constructor
     * @param pValue the value of alignement to copy.
     */
    AlignementType(const std::string pValue);
    /**
     * @brief Constructor
     * @param pValue the value of alignement to copy.
     */
    AlignementType(const char * pValue);

    /**
     * @brief alignement value setter.
     * @param pValue the value to set.
     */
    virtual void setValue(const QString pValue);
    /**
     * @brief alignement value setter.
     * @param pValue the value to set.
     */
    virtual void setValue(std::string pValue);
    /**
     * @brief alignement value setter.
     * @param pValue the value to set.
     */
    virtual void setValue(const char * pValue);

    /**
     * @brief alignement value getter.
     * @return the alignement value.
     */
    Alignement value();

    /**
     * @brief set a color withe the value of the script QML
     * @param pValue the script value
     * @param pAlignement the alignement
     */
    static void fromScriptValue(const QScriptValue &pValue, AlignementType &pAlignement);
    /**
     * @brief set the type value to script QML.
     * @param pEngine the script engine
     * @param pAlignement the alignement to set
     * @return the script value.
     */
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const AlignementType &pAlignement);

protected:
    /**
     * @brief Define if the value setted is valid.
     * @param pValue the value to verify
     * @return true if the value is valid, false else.
     */
    bool isValueValid(const std::string pValue);

    /**
     * @brief alignement value setter.
     * @param pValue the value to set.
     */
    bool setEnumValue(const std::string pValue);

    /**
     * @brief the enum value of the alignement.
     */
    Alignement mValueEnum;
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::AlignementType)

#endif // ALIGNEMENT_H
