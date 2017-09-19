/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef ABSTRACTDIGESTHANDLER_H
#define ABSTRACTDIGESTHANDLER_H

class QDomElement;

namespace AP2I
{

class AbstractDigestHandler
{
public:
    virtual ~AbstractDigestHandler() {}

    //function called whenever the associated DigestRule il fulfilled
    virtual void digest(QDomElement &pElement) = 0;
};

} /* namespace AP2I */

#endif // ABSTRACTDIGESTHANDLER_H


