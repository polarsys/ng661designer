/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef STIPPLETYPE_H
#define STIPPLETYPE_H


#include "stringtype.h"
#include "vg/openvg.h"
#include <QScriptValue>


namespace AP2I
{

class StippleType : public StringType
{
public:

    StippleType();
    StippleType(const QString &pValue);
    StippleType(const std::string pValue);
    StippleType(const char * pValue);

    void setValue(std::string pValue);
    void setValue(const QString pValue);
    void setValue(const char * pValue);

    std::vector<std::string> getArray(){return mArray;}

    /**
     * @brief set a stipple with the value of the script QML
     * @param pValue the script value
     * @param pStipple the stipple
     */
    static void fromScriptValue(const QScriptValue &pValue, StippleType &pStipple);
    /**
     * @brief set the stipple value to script QML.
     * @param pEngine the script engine
     * @param pStipple the stipple to set
     * @return the script value.
     */
    static QScriptValue toScriptValue(QScriptEngine *pEngine, const StippleType &pStipple);

protected :
    void getArrayFromValue();

    std::vector<std::string> mArray;
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::StippleType)


#endif // STIPPLETYPE_H
