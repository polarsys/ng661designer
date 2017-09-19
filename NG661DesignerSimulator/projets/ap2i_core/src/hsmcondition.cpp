/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "hsmcondition.h"

#include <QDebug>
#include <QtScript/QScriptEngine>

namespace AP2I
{

HSMCondition::HSMCondition(QScriptEngine *pScriptEngine,
                           const QString &pCondStr)
    : mScriptEngine(pScriptEngine),
      mCondStr(pCondStr)
{
    mProgram = QScriptProgram(mCondStr);
}


HSMCondition::HSMCondition(const HSMCondition &pCondition)
    : mScriptEngine(pCondition.mScriptEngine),
      mCondStr(pCondition.mCondStr)
{
    mProgram = QScriptProgram(mCondStr);
}

HSMCondition::~HSMCondition()
{
}

bool HSMCondition::evaluate() const
{
    bool lReturnValue = false;

    if (mScriptEngine)
    {
        QScriptValue lVal = mScriptEngine->evaluate(mProgram);
        if (mScriptEngine->hasUncaughtException())
        {
            qDebug() << "Transition condition exception : "
                     << lVal.toString();;
        }
        else if (lVal.isUndefined())
        {
            qDebug() << "WARNING: Transition condition undefined result in condition : "
                     << mCondStr << "\n";
        }
        else
        {
            lReturnValue = lVal.toBool();
        }
    }
    else
    {
        qDebug() << "ERROR: component don't have a ScriptEngine.";
    }
    return lReturnValue;
}

} /* namespace AP2I */
