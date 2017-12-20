/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef RUNTIMECONTEXT_H
#define RUNTIMECONTEXT_H

#include "pointer.h"
#include "keyboard.h"
#include "scrollwheel.h"
#include "pointerarea.h"
#include <QMap>
#include <QString>

//class QImage;

namespace AP2I
{

class RuntimeContext
{
public:
    explicit RuntimeContext();

    ~RuntimeContext();

    Pointer *pointer() { return mPointer; }
    const Pointer *pointer() const { return mPointer; }
    void setPointer(Pointer *pPointer) { mPointer = pPointer; }

    Keyboard *keyboard() { return mKeyboard; }
    const Keyboard *keyboard() const { return mKeyboard; }
    void setKeyboard(Keyboard *pKeyboard) { mKeyboard = pKeyboard; }

    ScrollWheel *scrollwheel() { return mScrollWheel; }
    const ScrollWheel *scrollwheel() const { return mScrollWheel; }
    void setScrollWheel(ScrollWheel *pScrollWheel) { mScrollWheel = pScrollWheel; }
    // load the image in pImageFile and return it
    // if pImageFile has already been loaded, returns the existing QImage
    QImage *loadImage(const QString &pImageFile);

    QList<PointerArea *> *focusedPointerAreas(){return &mFocusedPointerAreas;}
    QList<PointerArea *> *previousFocusedPointerAreas(){return &mPreviousFocusedPointerAreas;}

    static RuntimeContext defaultContext;

private:
    Pointer *mPointer;
    Keyboard *mKeyboard;
    ScrollWheel *mScrollWheel;    
    QList<PointerArea *>mFocusedPointerAreas;
    QList<PointerArea *>mPreviousFocusedPointerAreas;
    QMap<QString, QImage *> mImages;
};

} /* namespace AP2I */

#endif // RUNTIMECONTEXT_H


