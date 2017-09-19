/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef FONCTIONSDLL_H
#define FONCTIONSDLL_H

#include <QString>
#include "renderingengine.h"
#include "executeengine.h"
#include "pointer.h"
#include "keyboard.h"
#include "scrollwheel.h"

namespace AP2I
{
class FonctionsDLL
{
public:
    enum FonctionsDLLOption {
        XMLValidationAgainstXSD = 0x0001
    };

    FonctionsDLL(){}
    FonctionsDLL(QString, WId, int pOptions = 0);
    ~FonctionsDLL();
    void setXPointer(uint);
    void setYPointer(uint);
    void reload();
    void initializeGL();
    void resizeGL(int width, int height);
    virtual void paintGL(WId id);
    void setButtonState(int, bool);
    void setKeyState(int, bool);
    void setKeyChar(int);
    void setDeadKeyCode(int);
    void setWheelIncrement(int);
    void updateInPointer();
    void updateInKeyboard();
    void executeEngineLeftToRightTransversal();
    void renderingEngineLeftToRightTransversal();
    void getImage();
    bool getEnableTouch();
    void setResizeMode(bool);
    void zoom(double);
    bool isXmlValidationAgainstXsd() { return mXmlValidationAgainstXsd; }

private:

    BasicObject* mRoot;
    QString mMainFile;
    RenderingEngine mRenderingEngine;
    ExecuteEngine mExecuteEngine;
    Pointer mPointer;
    Keyboard mKeyboard;
    ScrollWheel mScrollWheel;
    bool mMode;
    double mFactor;
    double mWidth;
    double mHeight;
    double mX;
    double mY;
    double mRW;
    double mRH;
    bool   mXmlValidationAgainstXsd;
};

}

#endif // FONCTIONSDLL_H


