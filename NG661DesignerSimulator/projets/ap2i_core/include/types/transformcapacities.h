/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef TRANSFORMCAPACITIES_H
#define TRANSFORMCAPACITIES_H


#include "basicobject.h"
#include "CapacitiesMacros.h"
#include "vg/openvg.h"
#include <string>

namespace AP2I
{

class TransformCapacities
{

public:
    static const char *CLASS_NAME;

    static void runTransformCapacities( QString pTransformString);
    static void undoTransformCapacities( QString pTransformString);

    static void runOpenGLTransformCapacities( QString pTransformString);
    static void undoOpenGLTransformCapacities( QString pTransformString);

protected:
    static void runTransformCapacities( int pCoeff, QString pTransformString);
    static void runMatrixTransformation( std::vector<std::string> pParams, int pCoeff);
    static void runTranslateTransformation( std::vector<std::string> pParams, int pCoeff);
    static void runRotateTransformation( std::vector<std::string> pParams, int pCoeff);
    static void runScaleTransformation( std::vector<std::string> pParams, int pCoeff);
    static void runSkewXTransformation( std::vector<std::string> pParams, int pCoeff);
    static void runSkewYTransformation( std::vector<std::string> pParams, int pCoeff);

    static void runOpenGLTransformCapacities( int pCoeff, QString pTransformString);
    static void runOpenGLTranslateTransformation( std::vector<std::string> pParams, int pCoeff);
    static void runOpenGLRotateTransformation( std::vector<std::string> pParams, int pCoeff);
    static void runOpenGLScaleTransformation( std::vector<std::string> pParams, int pCoeff);

    static float computeMatrixDeterminant(float* pMatrix);

    static bool isMatrixTransformation(std::string pTransformation);
    static bool isTranslateTransformation(std::string pTransformation);
    static bool isRotateTransformation(std::string pTransformation);
    static bool isScaleTransformation(std::string pTransformation);
    static bool isSkewXTransformation(std::string pTransformation);
    static bool isSkewYTransformation(std::string pTransformation);

    static std::vector<std::string> getOperationsFromTransformCapacities( QString pTransformString);
    static std::vector<std::string> getTransforms( std::vector<std::string> pTransformationsString, int pPreviousIndice, std::string pStringToAnalyzed);
    static std::vector<std::string> getTransformationParams(std::string pTransformation);

};

} /* namespace AP2I */



#endif // TRANSFORMCAPACITIES_H
