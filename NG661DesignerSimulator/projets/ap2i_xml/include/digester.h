/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef DIGESTER_H
#define DIGESTER_H

#include <QStack>
#include <QtXml/QDomElement>
#include "digestrule.h"

namespace AP2I
{

class Digester
{
public:
    explicit Digester();

    void digest(QDomElement &pRoot);
    void addRule(DigestRule pRule);

private:
    void processNode(QDomElement &pElement, QList<DigestRule> pRules);

    QList<DigestRule> mRules;
};

} /* namespace AP2I */

#endif // DIGESTER_H


