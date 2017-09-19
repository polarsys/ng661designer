/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef DOMPARSER_H
#define DOMPARSER_H

class QDomElement;

namespace AP2I
{

class DomParser
{
public:
    explicit DomParser();
    virtual ~DomParser() {}

    void parse(QDomElement &pRoot);

    virtual bool startElement(QDomElement &) { return true; }
    virtual void endElement(QDomElement &) {}

private:
    void parseElement(QDomElement &pElement);
};

} /* namespace AP2I */

#endif // DOMPARSER_H


