/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "paintstrokecapacities.h"

#include "renderingcontext.h"
#include "runtimecontext.h"

#include <QPaintDevice>
extern "C" {
#include "GL/gl.h"
}
#include <iostream>

namespace AP2I
{
    const char *PaintStrokeCapacities::CLASS_NAME = "PaintstrokeCapacities";

    std::vector<std::string> PaintStrokeCapacities::getDashPatternArray( QString pDashPatternString){
        std::vector<std::string> lStringDashArray;

        if(pDashPatternString.isEmpty() || pDashPatternString.toLower().compare("none") == 0){
            return lStringDashArray;
        }

        std::string lDashPatternString = pDashPatternString.toStdString();

        for( std::size_t found=lDashPatternString.find_first_of(","); found != std::string::npos;){
            std::string lParam = lDashPatternString.substr(0, found);
            lStringDashArray.push_back(lParam);

            lDashPatternString = lDashPatternString.substr(found + 1, lDashPatternString.length());
            found=lDashPatternString.find_first_of(",");
        }
        lStringDashArray.push_back(lDashPatternString);
        return lStringDashArray;
    }

} /* namespace AP2I */


