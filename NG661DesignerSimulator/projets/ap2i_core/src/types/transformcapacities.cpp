/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "transformcapacities.h"

#include "renderingcontext.h"
#include "runtimecontext.h"

#include <QPaintDevice>
extern "C" {
#include "GL/gl.h"
}
#include <iostream>
#include <math.h>

namespace AP2I
{

const char *TransformCapacities::CLASS_NAME = "TransformCapacities";

std::vector<std::string> TransformCapacities::getOperationsFromTransformCapacities( QString pTransformString){
    std::vector<std::string> lTransformationsString;

    return getTransforms( lTransformationsString, 0, pTransformString.toLatin1().data());
}

std::vector<std::string>  TransformCapacities::getTransforms( std::vector<std::string> pTransformationsString, int pPreviousIndice, std::string pStringToAnalyzed){
    std::size_t found=pStringToAnalyzed.find_first_of(")");
    if( found == std::string::npos){
        return pTransformationsString; // no Transformation found.
    }

    std::string lTransformation = pStringToAnalyzed.substr(0, found + 1);
    pTransformationsString.push_back(lTransformation);

    // is there another operation to push ?
    if( (found + 1) < pStringToAnalyzed.size())
        return getTransforms( pTransformationsString, pPreviousIndice + 1, pStringToAnalyzed.substr(found + 2));
    return pTransformationsString;
}

std::vector<std::string> TransformCapacities::getTransformationParams(std::string pTransformation){
    std::vector<std::string> lParams;

    std::size_t found1=pTransformation.find_first_of("(");
    std::size_t found2=pTransformation.find_first_of(")");

    std::string lParamsString = pTransformation.substr(found1 + 1, found2 - found1 - 1);
    for( std::size_t found3=lParamsString.find_first_of(" "); found3 != std::string::npos;){
        std::string lParam = lParamsString.substr(0, found3);
        lParams.push_back(lParam);
        lParamsString = lParamsString.substr(found3 + 1, lParamsString.length());
        found3=lParamsString.find_first_of(" ");
    }
    lParams.push_back(lParamsString);

    return lParams;
}

bool TransformCapacities::isMatrixTransformation(std::string pTransformation){
    std::size_t found=pTransformation.find("matrix");
    return ( found != std::string::npos);
}

bool TransformCapacities::isTranslateTransformation(std::string pTransformation){
    std::size_t found=pTransformation.find("translate");
    return ( found != std::string::npos);
}

bool TransformCapacities::isRotateTransformation(std::string pTransformation){
    std::size_t found=pTransformation.find("rotate");
    return ( found != std::string::npos);
}

bool TransformCapacities::isScaleTransformation(std::string pTransformation){
    std::size_t found=pTransformation.find("scale");
    return ( found != std::string::npos);
}

bool TransformCapacities::isSkewXTransformation(std::string pTransformation){
    std::size_t found=pTransformation.find("skewX");
    return ( found != std::string::npos);
}

bool TransformCapacities::isSkewYTransformation(std::string pTransformation){
    std::size_t found=pTransformation.find("skewY");
    return ( found != std::string::npos);
}

void TransformCapacities::runTransformCapacities( int pCoeff,  QString pTransformString){
    std::vector<std::string> lOperations = getOperationsFromTransformCapacities( pTransformString);
    int lNbOperations = lOperations.size();
    if(lNbOperations != 0){
        for(int i =0; i < lNbOperations; i++){
            std::string lOperation = lOperations.at(i);
            std::vector<std::string> lParams = getTransformationParams(lOperation);
            if( isMatrixTransformation(lOperation)){
                runMatrixTransformation( lParams, pCoeff);
            }else if( isTranslateTransformation(lOperation)){
                runTranslateTransformation( lParams, pCoeff);
            }else if( isRotateTransformation(lOperation)){
                runRotateTransformation( lParams, pCoeff);
            }else if( isScaleTransformation(lOperation)){
                runScaleTransformation( lParams, pCoeff);
            }else if( isSkewXTransformation(lOperation)){
                runSkewXTransformation( lParams, pCoeff);
            }else if( isSkewYTransformation(lOperation)){
                runSkewYTransformation( lParams, pCoeff);
            }

        }
    }
}

void TransformCapacities::runMatrixTransformation( std::vector<std::string> pParams, int pCoeff){


    int lMatrixSize = 9;
    VGfloat lMatrix[lMatrixSize];
    for ( int i=0, j=0; i<lMatrixSize; i++){
        if( (i==2) || (i==5)){
            lMatrix[i] = 0;
            continue;
        }else if(i==8){
            lMatrix[i] = 1;
            continue;
        }

        VGfloat lValue = (VGfloat)std::stof(pParams.at(j));
        lMatrix[i] = lValue;
        j++;
    }


    if(pCoeff <0){
        // We must invert the matrix.

        float lDeterminant = computeMatrixDeterminant(lMatrix);
        VGfloat lInvertMatrix[lMatrixSize];

        lInvertMatrix[0] =   ((lMatrix[4] * lMatrix[8]) - (lMatrix[5] * lMatrix[7]))  / lDeterminant;
        lInvertMatrix[1] = -(lMatrix[1] * lMatrix[8] - lMatrix[7] * lMatrix[2]) / lDeterminant;
        lInvertMatrix[2] =   lMatrix[1] * lMatrix[5] - lMatrix[4] * lMatrix[2]  / lDeterminant;

        lInvertMatrix[3] = -(lMatrix[3] * lMatrix[8] - lMatrix[5] * lMatrix[6]) / lDeterminant;
        lInvertMatrix[4] =   lMatrix[0] * lMatrix[8] - lMatrix[6] * lMatrix[2]  / lDeterminant;
        lInvertMatrix[5] = -(lMatrix[0] * lMatrix[5] - lMatrix[3] * lMatrix[2]) / lDeterminant;

        lInvertMatrix[6] =   lMatrix[3] * lMatrix[7] - lMatrix[6] * lMatrix[4]  / lDeterminant;
        lInvertMatrix[7] = -(lMatrix[0] * lMatrix[7] - lMatrix[6] * lMatrix[1]) / lDeterminant;
        lInvertMatrix[8] =   lMatrix[0] * lMatrix[4] - lMatrix[1] * lMatrix[3]  / lDeterminant;

        vgSeti(VG_MATRIX_MODE, VG_MATRIX_PATH_USER_TO_SURFACE);
        vgLoadMatrix(lInvertMatrix);
    }

    VGfloat lCurrentMatrix[lMatrixSize];
    vgGetMatrix(lCurrentMatrix);

    // matrix multiplication
    VGfloat lMultipliedMatrix[lMatrixSize];

    lMultipliedMatrix[0] = lCurrentMatrix[0] * lMatrix[0] + lCurrentMatrix[3] * lMatrix[1] + lCurrentMatrix[6] * lMatrix[2];
    lMultipliedMatrix[3] = lCurrentMatrix[0] * lMatrix[3] + lCurrentMatrix[3] * lMatrix[4] + lCurrentMatrix[6] * lMatrix[5];
    lMultipliedMatrix[6] = lCurrentMatrix[0] * lMatrix[6] + lCurrentMatrix[3] * lMatrix[7] + lCurrentMatrix[6] * lMatrix[8];

    lMultipliedMatrix[1] = lCurrentMatrix[1] * lMatrix[0] + lCurrentMatrix[4] * lMatrix[1] + lCurrentMatrix[7] * lMatrix[2];
    lMultipliedMatrix[4] = lCurrentMatrix[1] * lMatrix[3] + lCurrentMatrix[4] * lMatrix[4] + lCurrentMatrix[7] * lMatrix[5];
    lMultipliedMatrix[7] = lCurrentMatrix[1] * lMatrix[6] + lCurrentMatrix[4] * lMatrix[7] + lCurrentMatrix[7] * lMatrix[8];

    lMultipliedMatrix[2] = lCurrentMatrix[2] * lMatrix[0] + lCurrentMatrix[2] * lMatrix[1] + lCurrentMatrix[2] * lMatrix[2];
    lMultipliedMatrix[5] = lCurrentMatrix[5] * lMatrix[3] + lCurrentMatrix[5] * lMatrix[4] + lCurrentMatrix[5] * lMatrix[5];
    lMultipliedMatrix[8] = lCurrentMatrix[8] * lMatrix[6] + lCurrentMatrix[8] * lMatrix[7] + lCurrentMatrix[8] * lMatrix[8];

    vgLoadMatrix(lMultipliedMatrix);

}

float TransformCapacities::computeMatrixDeterminant(float* pMatrix){

    float lDeterminant = pMatrix[0] * (pMatrix[4] * pMatrix[8] - pMatrix[7] * pMatrix[5])
            - pMatrix[1] * (pMatrix[3] * pMatrix[8] - pMatrix[6] * pMatrix[5])
            + pMatrix[2] * (pMatrix[3] * pMatrix[7] - pMatrix[6] * pMatrix[4]);
    return lDeterminant;
}


void TransformCapacities::runTranslateTransformation( std::vector<std::string> pParams, int pCoeff){
    float lX = atof(pParams[0].c_str()) * pCoeff;
    float lY = 0;
    if(pParams.size() > 1)
        lY = atof(pParams[1].c_str()) * pCoeff;
    vgTranslate(lX, lY);
}
void TransformCapacities::runRotateTransformation( std::vector<std::string> pParams, int pCoeff){
    float lAngle = atof(pParams[0].c_str()) * pCoeff;
    float lX = 0;
    float lY = 0;

    if(pParams.size() > 1){
        lX = atof(pParams[1].c_str()) * pCoeff;
        lY = atof(pParams[2].c_str()) * pCoeff;
    }

    if( lX != 0)
        vgTranslate(lX, lY);

        vgRotate(lAngle);
    if( lX != 0)
        vgTranslate( - lX, - lY);

}
void TransformCapacities::runScaleTransformation( std::vector<std::string> pParams, int pCoeff){
    float lX = atof(pParams[0].c_str());
    float lY = lX;

    if(pParams.size() > 1){
        lY = atof(pParams[1].c_str());
    }

    if(pCoeff < 0){
        lX = 1/lX;
        lY = 1/lY;
    }

        vgScale(lX, lY);
}
void TransformCapacities::runSkewXTransformation( std::vector<std::string> pParams, int pCoeff){
    double lAngle = (double)atof(pParams[0].c_str());
    double lTan = tan(lAngle);

    std::vector<std::string> lSkewXParams;
    lSkewXParams.push_back("1");
    lSkewXParams.push_back("0");
    lSkewXParams.push_back(std::to_string(lTan));
    lSkewXParams.push_back("1");
    lSkewXParams.push_back("0");
    lSkewXParams.push_back("0");

        runMatrixTransformation( lSkewXParams, pCoeff);
}
void TransformCapacities::runSkewYTransformation( std::vector<std::string> pParams, int pCoeff){
    double lAngle = (double)atof(pParams[0].c_str());
    double lTan = tan(lAngle);

    std::vector<std::string> lSkewXParams;
    lSkewXParams.push_back("1");
    lSkewXParams.push_back(std::to_string(lTan));
    lSkewXParams.push_back("0");
    lSkewXParams.push_back("1");
    lSkewXParams.push_back("0");
    lSkewXParams.push_back("0");

        runMatrixTransformation( lSkewXParams, pCoeff);
}

void TransformCapacities::runOpenGLTransformCapacities( QString pTransformString){
    glPushMatrix();
    runOpenGLTransformCapacities( 1, pTransformString);
}
void TransformCapacities::undoOpenGLTransformCapacities( QString pTransformString){
    runOpenGLTransformCapacities( -1, pTransformString);
    glPopMatrix();
}

void TransformCapacities::runOpenGLTransformCapacities( int pCoeff,  QString pTransformString){
    std::vector<std::string> lOperations = getOperationsFromTransformCapacities( pTransformString);
    int lNbOperations = lOperations.size();
    if(lNbOperations != 0){
        for(int i =0; i < lNbOperations; i++){
            std::string lOperation = lOperations.at(i);
            std::vector<std::string> lParams = getTransformationParams(lOperation);
            if( isMatrixTransformation(lOperation)){
            }else if( isTranslateTransformation(lOperation)){
                runOpenGLTranslateTransformation( lParams, pCoeff);
            }else if( isRotateTransformation(lOperation)){
                runOpenGLRotateTransformation( lParams, pCoeff);
            }else if( isScaleTransformation(lOperation)){
                runOpenGLScaleTransformation( lParams, pCoeff);
            }else if( isSkewXTransformation(lOperation)){
            }else if( isSkewYTransformation(lOperation)){
            }

        }
    }
}

void TransformCapacities::runOpenGLTranslateTransformation( std::vector<std::string> pParams, int pCoeff){
    float lX = atof(pParams[0].c_str()) * pCoeff;
    float lY = 0;
    if(pParams.size() > 1)
        lY = atof(pParams[1].c_str()) * pCoeff;

    float k = 0.15;

    glLoadIdentity();
    glTranslatef(lX, lY, 0);
    glScalef(k,k,k);
}

void TransformCapacities::runOpenGLRotateTransformation( std::vector<std::string> pParams, int pCoeff){
    float lAngle = atof(pParams[0].c_str()) * pCoeff;
    float lX = 0;
    float lY = 0;

    if(pParams.size() > 1){
        lX = atof(pParams[1].c_str()) * pCoeff;
        lY = atof(pParams[2].c_str()) * pCoeff;
    }

    glLoadIdentity();

    glTranslatef(lX, lY, 0.0f);
    glRotatef(lAngle, 1.0f, 0.0f, 0.0f);
    glRotatef(lAngle, 0.0f, 1.0f, 0.0f);
    glTranslatef( - lX, -lY, 0.0f);
}

void TransformCapacities::runOpenGLScaleTransformation( std::vector<std::string> pParams, int pCoeff){
    float lX = atof(pParams[0].c_str());
    float lY = lX;

    if(pParams.size() > 1){
        lY = atof(pParams[1].c_str());
    }

    if(pCoeff < 0){
        lX = 1/lX;
        lY = 1/lY;
    }

    float k = 0.15;

    glLoadIdentity();
    glScalef(k,k,k);
    glScalef(lX,lY,1);
}
} /* namespace AP2I */

