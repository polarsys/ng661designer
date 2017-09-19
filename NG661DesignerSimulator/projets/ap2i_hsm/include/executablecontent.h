/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef EXECUTABLECONTENT_H
#define EXECUTABLECONTENT_H

namespace AP2I
{

class ExecutableContent
{
public:
    virtual ~ExecutableContent() {}

    virtual void execute() = 0;
};

} /* namespace AP2I */

#endif // EXECUTABLECONTENT_H


