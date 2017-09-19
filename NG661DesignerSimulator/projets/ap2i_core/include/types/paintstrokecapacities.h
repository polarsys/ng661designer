/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef PAINTSTROKECAPACITIES_H
#define PAINTSTROKECAPACITIES_H


#include "basicobject.h"
#include "CapacitiesMacros.h"
#include "vg/openvg.h"
#include <string>
#include <vector>

namespace AP2I
{

class PaintStrokeCapacities
{

public:
    static const char *CLASS_NAME;

    static std::vector<std::string> getDashPatternArray( QString pDashPatternString);

protected:
};

} /* namespace AP2I */


#endif // PAINTSTROKECAPACITIES_H
