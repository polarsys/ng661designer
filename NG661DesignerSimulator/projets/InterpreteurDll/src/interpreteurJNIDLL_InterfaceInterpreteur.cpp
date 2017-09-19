/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include <QApplication>
#include <QFileDialog>

#include "rectangle.h"
#include "componentfactory.h"
#include "component.h"
#include "runtimecontext.h"

#include "fonctionsdll.h"
#include "interpreteurJNIDLL_InterfaceInterpreteur.h"

#include <iostream>
#include <QDebug>
#include <QThread>
#include <QWindow>
#include <QWidget>
#include <QHBoxLayout>

//Attention, des "_" ont été ajoutés au début des fonctions pour convenir au compilateur de QtCreator

using namespace AP2I;


const char *argv[] = {"program name", "arg1", "arg2", NULL};
int argc = sizeof(argv) / sizeof(char*) - 1;

static QApplication app(argc, (char **)argv);
static FonctionsDLL* gFunctionDLL = 0;


extern "C" {

/*
 * Class:     interpreteurJNIDLL_InterfaceInterpreteur
 * Method:    createInterpreterWindow
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL _Java_interpreteurJNIDLL_InterfaceInterpreteur_createScene
  (JNIEnv * pEnv, jobject , jstring pName, jlong hwnd, jint width, jint height)
{



    //char *lName2 = "Z:/IDEs/eclipse/eclipse/work/interpreteurJNIDLL/examples_original/Anchors.xml";
    //char *lName2 =str.toLatin1().data();
    //QString lFileStr = QFileDialog::getOpenFileName(0, "Open File", "", "A661 part 2 files (*.xml)");


    const char *lName2 = pEnv->GetStringUTFChars(pName, JNI_FALSE);

    gFunctionDLL = new FonctionsDLL(lName2,(WId)hwnd);
    gFunctionDLL->resizeGL((int)width, (int)height);

    app.processEvents();

    return (jboolean) true;
}

/*
 * Class:     interpreteurJNIDLL_InterfaceInterpreteur
 * Method:    getObjectId
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL _Java_interpreteurJNIDLL_InterfaceInterpreteur_getObjectId
  (JNIEnv * , jobject )
{
        //TODO
        return (jstring)NULL;
}


/*
 * Class:     interpreteurJNIDLL_InterfaceInterpreteur
 * Method:    reloadScene
 * Signature: ()V
 */
JNIEXPORT void JNICALL _Java_interpreteurJNIDLL_InterfaceInterpreteur_reloadScene
  (JNIEnv * , jobject )
{
    gFunctionDLL->reload();
}


/*
 * Class:     interpreteurJNIDLL_InterfaceInterpreteur
 * Method:    drawScene
 * Signature: ()V
 */
JNIEXPORT void JNICALL _Java_interpreteurJNIDLL_InterfaceInterpreteur_drawScene
  (JNIEnv * , jobject , jlong pId)
{

    gFunctionDLL->paintGL((WId)pId);
    app.processEvents();
}

/*
 * Class:     interpreteurJNIDLL_InterfaceInterpreteur
 * Method:    setSceneSize
 * Signature: (II)V
 */
JNIEXPORT void JNICALL _Java_interpreteurJNIDLL_InterfaceInterpreteur_setSceneSize
  (JNIEnv * , jobject , jint pX, jint pY)
{
    gFunctionDLL->resizeGL(pX, pY);
}


/*
 * Class:     interpreteurJNIDLL_InterfaceInterpreteur
 * Method:    setResizeMode
 * Signature: (Z)V
 */
JNIEXPORT void JNICALL _Java_interpreteurJNIDLL_InterfaceInterpreteur_setResizeMode
  (JNIEnv * , jobject , jboolean pMode)
{
    gFunctionDLL->setResizeMode((bool)pMode);
}


/*
 * Class:     interpreteurJNIDLL_InterfaceInterpreteur
 * Method:    zoom
 * Signature: (D)V
 */
JNIEXPORT void JNICALL _Java_interpreteurJNIDLL_InterfaceInterpreteur_zoom
  (JNIEnv * , jobject , jdouble pFactor)
{
    gFunctionDLL->zoom((double)pFactor);

}

/*
 * Class:     interpreteurJNIDLL_InterfaceInterpreteur
 * Method:    pointerPressedEvent
 * Signature: (I)V
 */
JNIEXPORT void JNICALL _Java_interpreteurJNIDLL_InterfaceInterpreteur_pointerPressedEvent
  (JNIEnv * , jobject , jint pState)
{
    gFunctionDLL->setButtonState((int)pState, true);
}

/*
 * Class:     interpreteurJNIDLL_InterfaceInterpreteur
 * Method:    pointerReleasedEvent
 * Signature: (I)V
 */
JNIEXPORT void JNICALL _Java_interpreteurJNIDLL_InterfaceInterpreteur_pointerReleasedEvent
  (JNIEnv * , jobject , jint pState)
{
     gFunctionDLL->setButtonState((int)pState, false);
}

/*
 * Class:     interpreteurJNIDLL_InterfaceInterpreteur
 * Method:    pointerMovedEvent
 * Signature: (II)V
 */
JNIEXPORT void JNICALL _Java_interpreteurJNIDLL_InterfaceInterpreteur_pointerMovedEvent
  (JNIEnv * , jobject , jint pX, jint pY)
{
    gFunctionDLL->setXPointer((int)pX);
    gFunctionDLL->setYPointer((int)pY);
}

/*
 * Class:     interpreteurJNIDLL_InterfaceInterpreteur
 * Method:    keyboardPressedEvent
 * Signature: (I)V
 */
JNIEXPORT void JNICALL _Java_interpreteurJNIDLL_InterfaceInterpreteur_keyboardPressedEvent
  (JNIEnv * , jobject , jint )
{
    //TODO
}

/*
 * Class:     interpreteurJNIDLL_InterfaceInterpreteur
 * Method:    keyboardReleasedEvent
 * Signature: (I)V
 */
JNIEXPORT void JNICALL _Java_interpreteurJNIDLL_InterfaceInterpreteur_keyboardReleasedEvent
  (JNIEnv * , jobject , jint )
{
    //TODO
}

/*
 * Class:     interpreteurJNIDLL_InterfaceInterpreteur
 * Method:    wheelEvent
 * Signature: (I)V
 */
JNIEXPORT void JNICALL _Java_interpreteurJNIDLL_InterfaceInterpreteur_wheelEvent
  (JNIEnv *, jobject, jint)
{
    //TODO
}

}
