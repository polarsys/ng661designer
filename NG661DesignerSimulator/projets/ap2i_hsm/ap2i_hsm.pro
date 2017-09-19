#############################################################################
# Copyright (c) 2015, 2016 Thales.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
# Contributors:
#    Thales Avionics - initial design and implementation
#############################################################################

! include( ../common.pri ) {
    error(Failed to include ../common.pri)
}

TEMPLATE = lib
CONFIG += staticlib

BIN_SUBDIRS_PATH=../../../bin

CONFIG(debug, debug|release){
    BUILD_DIR = debug
    BIN_BASE_DIR = $$BIN_SUBDIRS_PATH/ap2i_hsm
    DESTDIR = $$BIN_BASE_DIR/$$BUILD_DIR
    OBJECTS_DIR = $$DESTDIR/.obj
    MOC_DIR = $$DESTDIR/.moc
    RCC_DIR = $$DESTDIR/.rcc
    UI_DIR = $$DESTDIR/.ui
} else {
    BUILD_DIR = release
    BIN_BASE_DIR = $$BIN_SUBDIRS_PATH/ap2i_hsm
    DESTDIR = $$BIN_BASE_DIR/$$BUILD_DIR
    OBJECTS_DIR = $$DESTDIR/.obj
    MOC_DIR = $$DESTDIR/.moc
    RCC_DIR = $$DESTDIR/.rcc
    UI_DIR = $$DESTDIR/.ui
}

QT += opengl xml script gui

INCLUDEPATH += "./include"

INCLUDEPATH += $$JDK_PATH"\include"
INCLUDEPATH += $$JDK_PATH"\include\win32"
INCLUDEPATH += $$LIB_EXT_PATH"\ShivaVG\QT\ShivaVG\include"
INCLUDEPATH += $$LIB_EXT_PATH"\ShivaVG\QT\ShivaVG\src"
INCLUDEPATH += $$LIB_EXT_PATH"\ShivaVG\QT\ShivaVG\include\vg"
INCLUDEPATH += $$GNUWIN32_PATH"\include"


DEFINES += INTERPRETEURDLL_LIBRARY

unix {
    target.path = /usr/lib
    INSTALLS += target
}

HEADERS += \
    include/condition.h \
    include/event.h \
    include/executablecontent.h \
    include/state.h \
    include/statemachine.h \
    include/transition.h

SOURCES += \
    src/event.cpp \
    src/state.cpp \
    src/statemachine.cpp \
    src/transition.cpp

















