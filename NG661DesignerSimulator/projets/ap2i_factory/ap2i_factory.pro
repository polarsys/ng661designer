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
    BIN_BASE_DIR = $$BIN_SUBDIRS_PATH/ap2i_factory
    DESTDIR = $$BIN_BASE_DIR/$$BUILD_DIR
    OBJECTS_DIR = $$DESTDIR/.obj
    MOC_DIR = $$DESTDIR/.moc
    RCC_DIR = $$DESTDIR/.rcc
    UI_DIR = $$DESTDIR/.ui
} else {
    BUILD_DIR = release
    BIN_BASE_DIR = $$BIN_SUBDIRS_PATH/ap2i_factory
    DESTDIR = $$BIN_BASE_DIR/$$BUILD_DIR
    OBJECTS_DIR = $$DESTDIR/.obj
    MOC_DIR = $$DESTDIR/.moc
    RCC_DIR = $$DESTDIR/.rcc
    UI_DIR = $$DESTDIR/.ui
}

QT += opengl xml script gui xmlpatterns

INCLUDEPATH += "./include"

INCLUDEPATH += ../ap2i_xml/include
INCLUDEPATH += ../ap2i_hsm/include
INCLUDEPATH += ../ap2i_core/include
INCLUDEPATH += ../ap2i_core/include/GraphicalPrimitives
INCLUDEPATH += ../ap2i_core/include/InteractionPrimitives
INCLUDEPATH += ../ap2i_core/include/types

INCLUDEPATH += $$JDK_PATH"\include"
INCLUDEPATH += $$JDK_PATH"\include\win32"
INCLUDEPATH += $$LIB_EXT_PATH"\ShivaVG\QT\ShivaVG\include"
INCLUDEPATH += $$LIB_EXT_PATH"\ShivaVG\QT\ShivaVG\src"
INCLUDEPATH += $$LIB_EXT_PATH"\ShivaVG\QT\ShivaVG\include\vg"
INCLUDEPATH += $$GNUWIN32_PATH"\include"
INCLUDEPATH += $$LIB_EXT_PATH"\freetype-2.3.5-1-bin\include"
INCLUDEPATH += $$LIB_EXT_PATH"\freetype-2.3.5-1-bin\include\freetype2"


DEFINES += INTERPRETEURDLL_LIBRARY

unix {
    target.path = /usr/lib
    INSTALLS += target
}

HEADERS += \
    include/behaviorparser.h \
    include/componentfactory.h \
    include/enumparser.h \
    include/eventparser.h \
    include/functionparser.h \
    include/importparser.h \
    include/parsingcontext.h \
    include/parsingutils.h \
    include/propertyparser.h \
    include/representationparser.h \
    include/statemachineparser.h \
    include/complextypeparser.h \
    include/fonctionsdll.h \
   # include/interpreteurJNIDLL_InterfaceInterpreteur.h

SOURCES += \
    src/behaviorparser.cpp \
    src/componentfactory.cpp \
    src/enumparser.cpp \
    src/eventparser.cpp \
    src/functionparser.cpp \
    src/importparser.cpp \
    src/parsingcontext.cpp \
    src/parsingutils.cpp \
    src/propertyparser.cpp \
    src/representationparser.cpp \
    src/statemachineparser.cpp \
    src/complextypeparser.cpp \
    src/fonctionsdll.cpp \
    #src/interpreteurJNIDLL_InterfaceInterpreteur.cpp












