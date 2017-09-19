/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef FUNCTIONPARSER_H
#define FUNCTIONPARSER_H

#include "abstractdigesthandler.h"
#include <QString>

namespace AP2I
{

class ParsingContext;

class FunctionParser  : public AbstractDigestHandler
{
public:
    explicit FunctionParser(ParsingContext &pContext);
    virtual ~FunctionParser() = default;

    FunctionParser() = delete;
    FunctionParser(const FunctionParser &) = delete;

    void digest(QDomElement &pElement);

private:
    ParsingContext &mContext;
    QString mScript;
    QString mFuncName;
    QString mReturnVarName;

    void digestInParam(QDomElement &pElement);
    void digestOutParam(QDomElement &pElement);
};

} /* namespace AP2I */

#endif // FUNCTIONPARSER_H


