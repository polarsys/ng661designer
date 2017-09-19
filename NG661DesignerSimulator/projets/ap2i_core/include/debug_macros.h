/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef DEBUG_MACROS_H
#define DEBUG_MACROS_H
#include <QString>
#define GL_GET_ERROR(errorName) \
{                                                                                                                    \
    GLenum lErr = glGetError();                                                                                      \
    if (lErr != GL_NO_ERROR)                                                                                         \
    {                                                                                                                \
        qDebug() << "ERROR: openGL error (error code = " +                                                              \
                    QString("0x%1").arg(lErr, 4, 16, QChar('0')) +  ") " + "on " #errorName ;                                 \
    }                                                                                                                \
}                                                                                                                    \



#define GET_WINDOWS_OGL_ERROR(errorName)            \
{                                                   \
    DWORD error = GetLastError();                   \
    QString errorMessage;                           \
    LPVOID lpMsgBuf;                                \
    DWORD bufLen = FormatMessage(                   \
    FORMAT_MESSAGE_ALLOCATE_BUFFER |                \
    FORMAT_MESSAGE_FROM_SYSTEM |                    \
    FORMAT_MESSAGE_IGNORE_INSERTS,                  \
    NULL,                                           \
    error,                                          \
    MAKELANGID(LANG_NEUTRAL, SUBLANG_DEFAULT),      \
    (LPTSTR) &lpMsgBuf,                             \
    0, NULL );                                      \
    if (bufLen)                                                 \
    {                                                           \
        LPCSTR lpMsgStr = (LPCSTR)lpMsgBuf;                     \
        std::string result(lpMsgStr, lpMsgStr+bufLen);      \
        errorMessage.fromStdString(result);                         \
        std::cout << "ERROR: " << result << " on " << errorName << std::endl ;          \
    }                                                                                       \
    else{                                                                                   \
        /* NOTHING TO DO */                                                                 \
    }                                                                                       \
}                                                                                           \

#endif // DEBUG_MACROS_H
