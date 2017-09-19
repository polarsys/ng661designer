/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef PARSINGCONTEXT_H
#define PARSINGCONTEXT_H

#include <QMap>
#include <QString>

namespace AP2I
{

class BasicObject;
class Component;
class ComponentFactory;

class ParsingContext
{
public:

    explicit ParsingContext(Component &pComponent, ComponentFactory &pFactory);

    Component &mComponent;
    ComponentFactory &mFactory;
    QMap<QString, BasicObject *> mRepresentation;
    QMap<QString, BasicObject *> mBehavior;
    QMap<QString, int> mTypes;
};

} /* namespace AP2I */

#endif // PARSINGCONTEXT_H


