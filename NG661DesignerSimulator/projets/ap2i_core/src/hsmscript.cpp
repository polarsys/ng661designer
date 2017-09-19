/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "hsmscript.h"

#include <QScriptEngine>
#include <QDebug>

namespace AP2I
{

HSMScript::HSMScript(const QString &pScript, QScriptEngine *pEngine)
    : mScript(pScript),
      mScriptEngine(pEngine)
{
    mScript.replace("Representation.", "Representation_", Qt::CaseSensitive);
    mScript.replace("Behavior.", "Behavior_", Qt::CaseSensitive);
    mProgram = QScriptProgram(mScript);
}

void HSMScript::execute()
{
    if (mScriptEngine)
    {
        QScriptValue lVal = mScriptEngine->evaluate(mProgram);
        if (mScriptEngine->hasUncaughtException())
        {
            qDebug() << "scxml Script exception :" << lVal.toString()
                     << "in script : " << mScript << "\n";
        }
    }
}

} /* namespace AP2I */
