/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef PARSINGUTILS_H
#define PARSINGUTILS_H

class QDomElement;

namespace AP2I
{

class BasicObject;
class Component;

class ParsingUtils
{
public:

    /*
     * Parse the attributes of pElement and for each one, try to set the corresponding
     * property of pItem. If the value is a binding, it adds a binding to pOwner
     */
    static void parseItemProperties(Component &pOwner,
                                    BasicObject &pItem,
                                    QDomElement &pElement);
};

} /* namespace AP2I */

#endif // PARSINGUTILS_H


