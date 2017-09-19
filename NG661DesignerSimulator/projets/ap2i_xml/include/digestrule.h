/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef DIGESTRULE_H
#define DIGESTRULE_H

#include <QStringList>

class QDomElement;

namespace AP2I
{

class AbstractDigestHandler;

class DigestRule
{
public:

    enum MatchingResult
    {
        RULE_NOT_MATCHED = 0,
        TOKEN_MATCHED,
        RULE_MATCHED
    };

    DigestRule(const QString &pPattern, AbstractDigestHandler *pHandler);
    DigestRule(const DigestRule &pRule);

    MatchingResult update(const QString &pLocalName);
    void reset();
    void callHandler(QDomElement &pElement);

private:
    DigestRule(){}

    QStringList mTokens;
    QStringList::const_iterator mTokensIterator;
    AbstractDigestHandler *mHandler;
};

} /* namespace AP2I */

#endif // DIGESTRULE_H


