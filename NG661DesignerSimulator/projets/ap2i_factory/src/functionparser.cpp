/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "functionparser.h"

#include "parsingcontext.h"
#include "component.h"
#include <QDomElement>
#include <QScriptEngine>
#include <QDebug>

namespace AP2I
{

FunctionParser::FunctionParser(ParsingContext &pContext)
    : mContext(pContext),
      mScript(""),
      mReturnVarName("")
{
}

void FunctionParser::digest(QDomElement &pElement)
{
    QString lElemName = pElement.localName();

    if (lElemName == "Function")
    {
        mFuncName = pElement.attribute("name");
        mScript = "function " + mFuncName + "(";
    }
    else if (lElemName == "Param")
    {
        QString lModality = pElement.attribute("modality");
        if (lModality == "In")
        {
            /* Function argument */
            digestInParam(pElement);
        }
        else if (lModality == "Out")
        {
            digestOutParam(pElement);
        }
    }
    else if (lElemName == "Script")
    {
       /* Function argument */
        if (!mReturnVarName.isEmpty())
            mScript += "\n return " + mReturnVarName + ";";
        mScript += "\n}";

        mContext.mComponent.scriptEngine()->evaluate(mScript);
        if (mContext.mComponent.scriptEngine()->hasUncaughtException())
        {
            qDebug() << "ERROR: Script exception for function " << mFuncName
                     << "in script : \n" + mScript;
        }
    }
}

void FunctionParser::digestInParam(QDomElement &pElement)
{
    /* Function argument */
    if (mScript[mScript.length() - 1] != '(')
    {
        mScript += ",";
    }
    mScript += pElement.attribute("name");
}

void FunctionParser::digestOutParam(QDomElement &pElement)
{
    /* Function return value */
    if (!mReturnVarName.isEmpty())
        qDebug() << "ERROR: Function " + mFuncName +
                    " have more than one OUT parameter.";
    mReturnVarName = pElement.attribute("name");
}


} /* namespace AP2I */
