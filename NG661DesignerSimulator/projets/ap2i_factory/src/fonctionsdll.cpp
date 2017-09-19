/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "fonctionsdll.h"
#include <QDebug>
extern "C" {
#include "GL/gl.h"
#include "GL/glext.h"
#include "openvg.h"
#include "vgu.h"
}
#include <iostream>

#include "componentfactory.h"
#include "component.h"
#include "runtimecontext.h"
#include "ap2i_core.h"
#include "debug_macros.h"
#include "shContext.h"

HGLRC lRC;

namespace AP2I
{
/**
 * @brief FonctionsDLL::FonctionsDLL
 *              Charge le fichier xml indiqué, initialise l'arborescence des objets et autres paramètres de la classe
 * @param lName
 *              Nom du fichier xml qui va être interpreté
 * @param id
 *              Contexte de la fenêtre dans laquelle on va dessiner en openGL
 */
FonctionsDLL::FonctionsDLL(QString lName, WId pId, int pOptions)
    :mRoot(0),
      mMainFile(lName),
      mRenderingEngine(),
      mXmlValidationAgainstXsd(false)
{

    mFactor = 1.0;
    mWidth = 1024;
    mHeight = 768;
    mRW = 1;
    mRH = 1;


    //On change le format de pixels du handler récupéré

    PIXELFORMATDESCRIPTOR   lPfd = {
        sizeof(PIXELFORMATDESCRIPTOR),  /* size of this pfd         */
        1,                              /* version number           */
        PFD_DRAW_TO_WINDOW |            /* support window           */
        PFD_DOUBLEBUFFER |              /* double buffered          */
        PFD_SUPPORT_OPENGL,             /* support OpenGL           */
        PFD_TYPE_RGBA,                  /* RGBA type                */
        24,                             /* color depth              */
        0, 0, 0, 0, 0, 0,               /* color bits ignored       */
        0,                              /* no alpha buffer          */
        0,                              /* shift bit ignored        */
        0,                              /* no accumulation buffer   */
        0, 0, 0, 0,                     /* accum bits ignored       */
        32,                             /* 32-bit z-buffer          */
        8,                              /* stencil buffer           */
        0,                              /* no auxiliary buffer      */
        PFD_MAIN_PLANE,                 /* main layer               */
        0,                              /* reserved                 */
        0, 0, 0                         /* layer masks ignored      */
    };



    int lPixelFormat;

    lPixelFormat = ChoosePixelFormat((HDC)pId, &lPfd);
    if (lPixelFormat == 0) {
        std::cout << "choose KO" << std::endl;
    }else{
        /* NOTHING TO DO */
    }

    if (SetPixelFormat((HDC)pId, lPixelFormat, &lPfd) != TRUE) {
        std::cout << "set KO" << std::endl;
    }else{
        /* NOTHING TO DO */
    }


    //On crée un contexte à partir du handler récupéré
    lRC = wglCreateContext((HDC)pId);

    //On indique que ce contexte sera le contexte courrant
    wglMakeCurrent((HDC)pId, lRC);

    GET_WINDOWS_OGL_ERROR("makeCurrent");


    initializeGL();

    GET_WINDOWS_OGL_ERROR("DeleteContext");

    initializeCoreTypes();
    mPointer.setId("MainPointer");
    setXPointer(0xFFFFFFFF);
    setYPointer(0);

    RuntimeContext::defaultContext.setPointer(&mPointer);
    RuntimeContext::defaultContext.setKeyboard(&mKeyboard);
    RuntimeContext::defaultContext.setScrollWheel(&mScrollWheel);

    mXmlValidationAgainstXsd = (pOptions & XMLValidationAgainstXSD ? true : false);

    reload();
}
/**
 * @brief FonctionsDLL::~FonctionsDLL
 *                  Destructeur
 */
FonctionsDLL::~FonctionsDLL(){
    if (mRoot){
        delete mRoot;
    }else{
        /* NOTHING TO DO */
    }

    //TODO finir destructeur
}


/**
 * @brief FonctionsDLL::setXPointer
 *              Les coordonnées du pointeur sont changées différemment selon le type de resize:
 *                  -si on est en mode ou on peut zoomer, on applique le facteur du zoom aux coordonnées
 *                  -si on est en mode proportionnel, on applique le ratio de variation de la taille de la fenêtre
 * @param pX
 *          Nouvelle coordonnée en x
 */
void FonctionsDLL::setXPointer(uint pX){
    mX = pX;
    if(!mMode){
        mX = pX/mFactor;
        mPointer.setX(pX/mFactor);
    }else{
        mX = pX / mRW;
        mPointer.setX(pX / mRW );
    }
}
/**
 * @brief FonctionsDLL::setYPointer
 *              Idem setXPointer
 * @param pY
 *          Nouvelle coordonnée en y
 */
void FonctionsDLL::setYPointer(uint pY){
    mY = mHeight - pY/mFactor;
    if(!mMode){
        mY = mHeight - pY/mFactor;
        mPointer.setY(mHeight - pY/mFactor);
    }else{
        mY = mHeight - pY / mRH;
        mPointer.setY(mHeight - pY / mRH);
    }
}


/**
 * @brief FonctionsDLL::updateInPointer
 *                  Met à jour les coordonnées du pointeur et l'état de ses boutons
 */
void FonctionsDLL::updateInPointer(){
    mPointer.updateIn();
}

/**
 * @brief FonctionsDLL::updateInKeyboard
 *                  Met à jour l'état du clavier
 */
void FonctionsDLL::updateInKeyboard(){
    mKeyboard.updateIn();
}

/**
 * @brief FonctionsDLL::reload
 *              Replace le pointeur dans son état initial et recharge le fichier xml
 */
void FonctionsDLL::reload(){
    ComponentFactory lFactory;
    mPointer.reset();
    mKeyboard.reset();
    mScrollWheel.reset();

    if (mRoot)
    {
        delete mRoot;
    }else{
        /* NOTHING TO DO */
    }
    lFactory.activateXmlValidationAgainstXsd(mXmlValidationAgainstXsd);
    mRoot = lFactory.createScene(mMainFile);
}

/**
 * @brief FonctionsDLL::initializeGL
 *                  Initialise openGL
 */
void FonctionsDLL::initializeGL()
{

    glEnable(GL_BLEND);
    glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    glEnable(GL_SCISSOR_TEST);

    qDebug() << "OpenGL version : " + QString((const char *)glGetString(GL_VERSION));
}
/**
 * @brief FonctionsDLL::resizeGL
 * @param pWidth
 *              Nouvelle largeur de la fenêtre
 * @param pHeight
 *              Nouvelle hauteur de la fenêtre
 */
void FonctionsDLL::resizeGL(int pWidth, int pHeight)
{
    //calculs des ratios de variation de la taille de la fenêtre
    mRW  = mRW + (pWidth - mWidth)/mWidth  ;
    mRH  = mRH + (pHeight - mHeight)/mHeight  ;

    mWidth = pWidth;
    mHeight = pHeight;

    setXPointer(mX);
    setYPointer(mY);
}

/**
 * @brief FonctionsDLL::paintGL
 *              Fonction d'affichage, est appelée à chaque tour de boucle
 * @param id
 *              Handle de la fenêtre ou l'on va dessiner
 */
void FonctionsDLL::paintGL(WId pId)
{
   // wglMakeCurrent((HDC)pId, lRC);
    vgCreateContextSH(mWidth, mHeight);

    //GET_WINDOWS_OGL_ERROR("makeCurrent");

    //resize de la window
    glViewport(0, 0, mWidth, mHeight);
    glScissor(0, 0, mWidth, mHeight);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    glOrtho(0,mWidth, 0, mHeight, -1, 1);

    //suivant le mode de resize, on affiche différement
    if(!mMode){
        //Si on est dans le mode ou le changement de taille de la fenêtre n'affecte pas la représentation,
        //on peut zoomer. On applique donc notre facteur de zoom ici
        glScaled(mFactor, mFactor, -1);
    }else{
        //Dans le mode qui redimentionne la représentation en fonction de la taille de la fenêtre
        //on applique un ratio de changement de taille de la fenêtre (calculé dans resizeGL)
        glScaled(mRW, mRH, -1);
    }


    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();

    glClear(GL_COLOR_BUFFER_BIT);
    glColorMask(GL_TRUE, GL_TRUE, GL_TRUE, GL_TRUE);

    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();

    //Mise à jour du pointeur, tracé du rendu et execution des interactions
    if (mRoot)
    {
        mPointer.updateIn();
        mKeyboard.updateIn();
        mScrollWheel.updateIn();
        mExecuteEngine.leftToRightTraversal(mRoot);
        vgLoadIdentity();
        mRenderingEngine.leftToRightTraversal(mRoot);

    }else{
        /* NOTHING TO DO */
    }

    SwapBuffers((HDC)pId);
    glFlush();
    glFinish();
}

/**
 * @brief FonctionsDLL::executeEngineLeftToRightTransversal
 *                  Execution des interactions
 */
void FonctionsDLL::executeEngineLeftToRightTransversal(){
    mExecuteEngine.leftToRightTraversal(mRoot);
}
/**
 * @brief FonctionsDLL::renderingEngineLeftToRightTransversal
 *                  Tracé du rendu
 */
void FonctionsDLL::renderingEngineLeftToRightTransversal(){
    mRenderingEngine.leftToRightTraversal(mRoot);
}

/**
 * @brief FonctionsDLL::setButtonState
 *                  Permet de changer l'état du pointeur
 * @param pButtonId
 *                  Indique quel boutton a été cliqué
 * @param pIsPressed
 *                  Indique s'il a été cliqué ou relâché
 */
void FonctionsDLL::setButtonState(int pButtonId, bool pIsPressed){
    mPointer.setButtonState(pButtonId, pIsPressed);
}

/**
 * @brief FonctionsDLL::setKeyState
 *                  Permet de changer l'état d'une touche
 * @param pKeyId
 *                  Indique quelle touche a changé d'état
 * @param pIsPressed
 *                  Indique s'il a été pressed ou released
 */
void FonctionsDLL::setKeyState(int pKeyId, bool pIsPressed){
    mKeyboard.setKeyState(pKeyId, pIsPressed);
}


/**
 * @brief FonctionsDLL::setKeyChar
 *                  Permet de mettre à jour le caractère de la touche pressée
 * @param pKeyId
 *                  Indique quelle touche a été pressée
 */
void FonctionsDLL::setKeyChar(int pKeyId){
    mKeyboard.setKeyChar(pKeyId);
}

/**
 * @brief FonctionsDLL::setDeadKeyCode
 *                  Permet de changer l'état du dead key code de la touche pressée
 * @param pKeyId
 *                  Indique quelle touche a été pressée
 */
void FonctionsDLL::setDeadKeyCode(int pKeyId){
    mKeyboard.setDeadKeyCode(pKeyId);
}

/**
 * @brief FonctionsDLL::setWheelIncrement
 *                  Permet de changer l'état de l'incrément de Wheel
 * @param pKeyId
 *                  Indique l'incrément
 */
void FonctionsDLL::setWheelIncrement(int pWheelIncrement){
    mScrollWheel.setWheelDelta(pWheelIncrement);
}


/**
 * @brief FonctionsDLL::setResizeMode
 *              Permet de changer le mode de changement de taille de la fenêtre
 * @param pMode
 *              Indique le nouveau mode
 */
void FonctionsDLL::setResizeMode(bool pMode){
    mMode = pMode;
}
/**
 * @brief FonctionsDLL::zoom
 *              On ajoute le facteur de zoom à celui existant, le facteur est appliqué au prochain paint et le pointeur et mis à jour directement
 * @param pFactor
 *              Facteur de zoom, positif pour zoomer, négatif pour dézoomer
 */
void FonctionsDLL::zoom(double pFactor){
    mFactor += pFactor;
    setXPointer(mX);
    setYPointer(mY);
}


}
