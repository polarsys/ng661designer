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
#include <windows.h>
extern "C" {
#include "GL/gl.h"
}
#include <QApplication>
#include <QFileDialog>
#include <iostream>
#include <QDebug>

using namespace AP2I;

static FonctionsDLL *gFunctionDLL = 0;
static HWND hwnd;
static HDC hdc;
static char gMode = FALSE;
static long gCanvasWidth = 1024;
static long gCanvasHeight = 768;
static long gX = 1024;
static long gY = 768;


LRESULT CALLBACK my_wnd_proc(HWND hwnd, UINT msg, WPARAM wParam, LPARAM lParam)
{
    switch (msg) {
        case WM_CREATE:
        break;
        case WM_DESTROY:
        break;
        case WM_SIZING:
            if (gFunctionDLL != NULL)
            {
                RECT* lRectangle = (RECT *)lParam;
                gCanvasWidth = lRectangle->right  - lRectangle->left;
                gCanvasHeight = lRectangle->bottom - lRectangle->top;
                gX = lRectangle->left;
                gY = lRectangle->bottom;
                gFunctionDLL->resizeGL(gCanvasWidth, gCanvasHeight);
            }
        break;
        case WM_SIZE:
        case WM_PALETTECHANGED:
            break;
        case WM_QUERYNEWPALETTE:
            break;
        case WM_PAINT:
            if (gFunctionDLL != NULL)
            {
                    gFunctionDLL->paintGL((WId)hdc);
            }
            break;
        case WM_LBUTTONDOWN :
            if (gFunctionDLL != NULL)
            {
                if ( (LOWORD(lParam) < gX + gCanvasWidth) && (HIWORD(lParam) < gY + gCanvasHeight)){
                    gFunctionDLL->setButtonState(1, TRUE);
                }
            }
            break;
        case WM_LBUTTONUP :
            if (gFunctionDLL != NULL)
            {
                gFunctionDLL->setButtonState(1, FALSE);
            }
        break;
        case WM_MOUSEMOVE :
            if (gFunctionDLL != NULL)
            {
                POINT mpos;
                GetCursorPos(&mpos);
                gFunctionDLL->setXPointer((LOWORD(lParam))/* - gX*/);
                gFunctionDLL->setYPointer((HIWORD(lParam)) + 2 * GetSystemMetrics(SM_CYCAPTION));
            }
        break;
        case WM_MOUSEWHEEL :
            if (gFunctionDLL != NULL)
            {
                gFunctionDLL->setWheelIncrement(GET_WHEEL_DELTA_WPARAM(wParam));
            }
        break;
        case WM_DEADCHAR :
        if (gFunctionDLL != NULL)
        {
            gFunctionDLL->setDeadKeyCode(wParam);
        }
        break;
        case WM_CHAR :
        if (gFunctionDLL != NULL)
        {
            if (wParam == '+') {
                    gFunctionDLL->zoom(0.1);
            } else if (wParam == '-') {
                gFunctionDLL->zoom(-0.1);
            } else if (wParam == '*') {
                gMode = !gMode;
                gFunctionDLL->setResizeMode(gMode);
            }else{
                /* Nothing to do */
            }

            gFunctionDLL->setKeyChar(wParam);
        }
        break;
        case WM_KEYDOWN:
        if (gFunctionDLL != NULL)
        {
            gFunctionDLL->setKeyState(wParam, TRUE);
        }
        break;
        case WM_KEYUP:
        if (gFunctionDLL != NULL)
        {
            gFunctionDLL->setKeyState(wParam, FALSE);
        }
        break;
        default:
            return DefWindowProc(hwnd, msg, wParam, lParam);
            break;
    }
    return 0;
}



HDC open_window (long par_ws, long par_hs)
{
    WNDCLASS wndClass;
    HINSTANCE loc_hInstance;

    loc_hInstance = (HINSTANCE) GetModuleHandle(NULL);

    /* register window class */
    wndClass.style = CS_OWNDC | CS_HREDRAW | CS_VREDRAW;
    wndClass.lpfnWndProc = my_wnd_proc;
    wndClass.cbClsExtra = 0;
    wndClass.cbWndExtra = 0;
    wndClass.hInstance = loc_hInstance;
    wndClass.hIcon = LoadIcon(NULL, IDI_APPLICATION);
    wndClass.hCursor = LoadCursor(NULL, IDC_ARROW);
    wndClass.hbrBackground = (HBRUSH)GetStockObject(GRAY_BRUSH);
    wndClass.lpszMenuName = NULL;
    wndClass.lpszClassName = (LPCWSTR)"A661 part 2 interpreter";
    RegisterClass(&wndClass);

    /* create window */
    hwnd = CreateWindow(
        (LPCWSTR)"A661 part 2 interpreter", L"A661 part 2 interpreter",
        (WS_OVERLAPPEDWINDOW | WS_CAPTION | WS_SYSMENU | WS_CLIPCHILDREN | WS_CLIPSIBLINGS ),
        0, 0, par_ws, par_hs,
        NULL, NULL, loc_hInstance, NULL);

    /* display window */
    ShowWindow(hwnd, SW_SHOWDEFAULT);
    UpdateWindow(hwnd);
    hdc = GetDC(hwnd);

    if (hdc==NULL)
    {
        printf ("No device context\n");
        return NULL;
    }
    else
    {
            /* NOTHING TO DO */
    }

    return hdc;
}



int main(int argc, char *argv[])
{
    MSG msg;
    QApplication app(argc, argv);

    uint lCycleDuration = 20;
    char *lFileName = 0;
    //bool lEnableTouch = false;
    //bool lDump = false;
    int lFonctionsDLLOptions = 0;

     argv++;
     argc--;
     while(argc > 0)
     {

         if (QString(*argv) == "-c" && argc > 1)
         {
             argv++;
             argc--;
             lCycleDuration = QString(*argv).toUInt();
             lCycleDuration = lCycleDuration ? lCycleDuration : 20;
         }
         else if (QString(*argv) == "-touch")
         {
             //lEnableTouch = true;
         }
         else if (QString(*argv) == "-dump")
         {
             //lDump = true;
         }
         else if (QString(*argv) == "-xmlValidation")
         {
             lFonctionsDLLOptions |= FonctionsDLL::XMLValidationAgainstXSD;
         }
         else
         {
           lFileName = *argv;
         }
         argv++;
         argc--;
     }

     QByteArray ba ;
     if (!lFileName)
     {
         QString lFileStr = QFileDialog::getOpenFileName(0, "Open File", "", "A661 part 2 files (*.part2)");
         ba =lFileStr.toLatin1();
         lFileName = ba.data();
     }


    // Create the graphical Window.
    HDC hdc = open_window(gCanvasWidth,gCanvasHeight);

    // Read XML file and draw primitives.
    gFunctionDLL = new FonctionsDLL(QString::fromLatin1(lFileName),(WId)hdc, lFonctionsDLLOptions);

    // Draw content
    if (gFunctionDLL != NULL)
    {
            gFunctionDLL->resizeGL(gCanvasWidth, gCanvasHeight);
            gFunctionDLL->paintGL((WId)hdc);
    }

    while (GetMessage(&msg, NULL, 0, 0) > 0) {
            TranslateMessage(&msg);
            DispatchMessage(&msg);
        }
    return msg.wParam;
}
