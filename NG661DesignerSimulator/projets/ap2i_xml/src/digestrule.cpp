/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "digestrule.h"
#include "abstractdigesthandler.h"

namespace AP2I 
{

DigestRule::DigestRule(const QString &pPattern, AbstractDigestHandler *pHandler)
{
    mHandler = pHandler;
    mTokens = pPattern.split("/", QString::SkipEmptyParts);
    mTokensIterator = mTokens.begin();
}

DigestRule::DigestRule(const DigestRule &pRule)
{
    mHandler = pRule.mHandler;
    mTokens = pRule.mTokens;

    //increment the iterator until it correspond to the same position as pRule
    mTokensIterator = mTokens.begin();
    for (QList<QString>::const_iterator it = pRule.mTokens.begin();
         it != pRule.mTokensIterator;
         it++)
    {
        mTokensIterator++;
    }
}

void DigestRule::reset()
{
    mTokensIterator = mTokens.begin();
}

void DigestRule::callHandler(QDomElement &pElement)
{
    if (mHandler)
    {
        mHandler->digest(pElement);
    }
}

DigestRule::MatchingResult DigestRule::update(const QString &pLocalName)
{
    MatchingResult lReturnValue;

    if (mTokensIterator != mTokens.end() && pLocalName == *mTokensIterator)
    {
        lReturnValue = TOKEN_MATCHED;
    }
    else
    {
        lReturnValue = RULE_NOT_MATCHED;
    }
    mTokensIterator++;

    if (lReturnValue == TOKEN_MATCHED && mTokensIterator == mTokens.end())
    {
        lReturnValue = RULE_MATCHED;
    }

    return lReturnValue;
}

} /* namespace AP2I */
