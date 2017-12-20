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

TARGET = A661p2

TEMPLATE = app
CONFIG += console
QT += opengl xml script gui xmlpatterns

INCLUDEPATH += ../ap2i_core/include
INCLUDEPATH += ../ap2i_core/include/GraphicalPrimitives
INCLUDEPATH += ../ap2i_core/include/InteractionPrimitives
INCLUDEPATH += ../ap2i_core/include/types
INCLUDEPATH += ../ap2i_factory/include
INCLUDEPATH += ../ap2i_xml/include
INCLUDEPATH += ../ap2i_hsm/include

BIN_SUBDIRS_PATH=../../../bin

CONFIG(debug, debug|release){
    BUILD_DIR = debug
    BIN_BASE_DIR = $$BIN_SUBDIRS_PATH/ap2i_app
    DESTDIR = $$BIN_BASE_DIR/$$BUILD_DIR
    OBJECTS_DIR = $$DESTDIR/.obj
    MOC_DIR = $$DESTDIR/.moc
    RCC_DIR = $$DESTDIR/.rcc
    UI_DIR = $$DESTDIR/.ui
    SHIVA_DLL_PATH = $$LIB_EXT_PATH"\ShivaVG\QT\ShivaVG\bin\debug"
} else {
    BUILD_DIR = release
    BIN_BASE_DIR = $$BIN_SUBDIRS_PATH/ap2i_app
    DESTDIR = $$BIN_BASE_DIR/$$BUILD_DIR
    OBJECTS_DIR = $$DESTDIR/.obj
    MOC_DIR = $$DESTDIR/.moc
    RCC_DIR = $$DESTDIR/.rcc
    UI_DIR = $$DESTDIR/.ui
    SHIVA_DLL_PATH = $$LIB_EXT_PATH"\ShivaVG\QT\ShivaVG\bin\release"
}

LIBS += -L$$BIN_SUBDIRS_PATH/ap2i_core/$$BUILD_DIR
LIBS += -L$$BIN_SUBDIRS_PATH/ap2i_xml/$$BUILD_DIR
LIBS += -L$$BIN_SUBDIRS_PATH/ap2i_hsm/$$BUILD_DIR
LIBS += -L$$BIN_SUBDIRS_PATH/ap2i_factory/$$BUILD_DIR
LIBS += -lap2i_factory -lap2i_core -lap2i_xml -lap2i_hsm

#force re-link on lib modification
PRE_TARGETDEPS += $$BIN_SUBDIRS_PATH/ap2i_xml/$$BUILD_DIR/libap2i_xml.a
PRE_TARGETDEPS += $$BIN_SUBDIRS_PATH/ap2i_hsm/$$BUILD_DIR/libap2i_hsm.a
PRE_TARGETDEPS += $$BIN_SUBDIRS_PATH/ap2i_core/$$BUILD_DIR/libap2i_core.a
PRE_TARGETDEPS += $$BIN_SUBDIRS_PATH/ap2i_factory/$$BUILD_DIR/libap2i_factory.a

DEPENDPATH += $$BIN_SUBDIRS_PATH/ap2i_xml/$$BUILD_DIR
DEPENDPATH += $$BIN_SUBDIRS_PATH/ap2i_hsm/$$BUILD_DIR
DEPENDPATH += $$BIN_SUBDIRS_PATH/ap2i_core/$$BUILD_DIR
DEPENDPATH += $$BIN_SUBDIRS_PATH/ap2i_factory/$$BUILD_DIR

LIBS += -L$$LIB_EXT_PATH"\freetype-2.3.5-1-bin\lib" -lfreetype
INCLUDEPATH += $$LIB_EXT_PATH"\freetype-2.3.5-1-bin\bin\include"
INCLUDEPATH += $$LIB_EXT_PATH"\freetype-2.3.5-1-bin\include\freetype2\freetype"
INCLUDEPATH += $$LIB_EXT_PATH"\freetype-2.3.5-1-bin\include\freetype2"
DEPENDPATH += -L$$LIB_EXT_PATH"\freetype-2.3.5-1-bin\lib"
DEPENDPATH += -L$$LIB_EXT_PATH"\freetype-2.3.5-1-bin\bin"
PRE_TARGETDEPS += $$LIB_EXT_PATH"\freetype-2.3.5-1-bin\lib\freetype.lib"

PRE_TARGETDEPS += $$SHIVA_DLL_PATH"\libShivaVG.a"
PRE_TARGETDEPS += $$SHIVA_DLL_PATH"\ShivaVG.dll"
DEPENDPATH += $$SHIVA_DLL_PATH
INCLUDEPATH += $$LIB_EXT_PATH"/ShivaVG/QT/ShivaVG/include"
INCLUDEPATH += $$LIB_EXT_PATH"/ShivaVG/QT/ShivaVG/include/vg"
INCLUDEPATH += $$LIB_EXT_PATH"/ShivaVG/QT/ShivaVG/src"
LIBS += -L$$SHIVA_DLL_PATH -lShivaVG

INCLUDEPATH += $$GNUWIN32_PATH"\include"
DEPENDPATH += $$GNUWIN32_PATH"\lib"
DEPENDPATH += $$GNUWIN32_PATH"\bin"
PRE_TARGETDEPS += $$GNUWIN32_PATH"\lib\jpeg.lib"
PRE_TARGETDEPS += $$GNUWIN32_PATH"\lib\libpng.lib"
LIBS += -L$$GNUWIN32_PATH"\bin"

LIBS += -lopengl32 -lgdi32 -ljpeg62 -lpng12

SOURCES += \
    src/main.cpp

HEADERS +=







