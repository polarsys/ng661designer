/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "digester.h"

namespace AP2I 
{

Digester::Digester()
{
}

void Digester::addRule(DigestRule pRule)
{
    mRules.append(pRule);
}

void Digester::digest(QDomElement &pRoot)
{
    // rules are copied at each recursion so that their state is consistent with parsing state
    processNode(pRoot, mRules);
}

void Digester::processNode(QDomElement &pElement, QList<DigestRule> pRules)
{
    DigestRule::MatchingResult lRes = DigestRule::RULE_NOT_MATCHED;
    QList<DigestRule>::iterator it = pRules.begin();
    while (it != pRules.end())
    {
        lRes = (*it).update(pElement.localName());
        switch(lRes)
        {
        case DigestRule::TOKEN_MATCHED:
            ++it;
            break;
        case DigestRule::RULE_MATCHED:
            (*it).callHandler(pElement);
            it = pRules.erase(it);
            break;
        case DigestRule::RULE_NOT_MATCHED:
            it = pRules.erase(it);
            break;
        }
    }

    QDomElement lCurrent = pElement.firstChildElement();
    while (!lCurrent.isNull())
    {
        processNode(lCurrent, pRules);
        lCurrent = lCurrent.nextSiblingElement();
    }
}

} /* namespace AP2I */
