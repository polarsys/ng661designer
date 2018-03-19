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
    BIN_BASE_DIR = $$BIN_SUBDIRS_PATH/ap2i_core
    DESTDIR = $$BIN_BASE_DIR/$$BUILD_DIR
    OBJECTS_DIR = $$DESTDIR/.obj
    MOC_DIR = $$DESTDIR/.moc
    RCC_DIR = $$DESTDIR/.rcc
    UI_DIR = $$DESTDIR/.ui
} else {
    BUILD_DIR = release
    BIN_BASE_DIR = $$BIN_SUBDIRS_PATH/ap2i_core
    DESTDIR = $$BIN_BASE_DIR/$$BUILD_DIR
    OBJECTS_DIR = $$DESTDIR/.obj
    MOC_DIR = $$DESTDIR/.moc
    RCC_DIR = $$DESTDIR/.rcc
    UI_DIR = $$DESTDIR/.ui
}

QT += opengl xml script gui

INCLUDEPATH += "include"
INCLUDEPATH += "include/types"
INCLUDEPATH += "include/GraphicalPrimitives"
INCLUDEPATH += "include/InteractionPrimitives"
INCLUDEPATH += "include/TransformPrimitives"
INCLUDEPATH += "../ap2i_xml/include"
INCLUDEPATH += "../ap2i_hsm/include"
INCLUDEPATH += "../ap2i_core/include"

INCLUDEPATH += $$JDK_PATH"\include"
INCLUDEPATH += $$JDK_PATH"\include\win32"
INCLUDEPATH += $$LIB_EXT_PATH"\ShivaVG\QT\ShivaVG\include"
INCLUDEPATH += $$LIB_EXT_PATH"\ShivaVG\QT\ShivaVG\src"
INCLUDEPATH += $$LIB_EXT_PATH"\ShivaVG\QT\ShivaVG\include\vg"
INCLUDEPATH += $$GNUWIN32_PATH"\include"
INCLUDEPATH += $$LIB_EXT_PATH"\freetype-2.3.5-1-bin\include"
INCLUDEPATH += $$LIB_EXT_PATH"\freetype-2.3.5-1-bin\include\freetype2"
INCLUDEPATH += $$LIB_EXT_PATH"\freetype-2.3.5-1-bin\include\freetype2\freetype"

# Specific for code lib which uses external includes which raises some warnings
QMAKE_CXXFLAGS += -Wno-unknown-pragmas -Wno-unused-function


DEFINES += INTERPRETEURDLL_LIBRARY


unix {
    target.path = /usr/lib
    INSTALLS += target
}

HEADERS += \
    include/ap2i_core.h \
    include/basicitem.h \
    include/basicobject.h \
    include/binding.h \
    include/clippathitem.h \
    include/clippingitem.h \
    include/clock.h \
    include/component.h \
    include/engine.h \
    include/eventcomponent.h \
    include/executeengine.h \
    include/GraphicalPrimitives/arc.h \
    include/GraphicalPrimitives/children.h \
    include/GraphicalPrimitives/circle.h \
    include/GraphicalPrimitives/cliprectangle.h \
    include/GraphicalPrimitives/crown.h \
    include/GraphicalPrimitives/ellipse.h \
    include/GraphicalPrimitives/group.h \
    include/GraphicalPrimitives/image.h \
    include/GraphicalPrimitives/line.h \
    include/GraphicalPrimitives/polarline.h \
    include/GraphicalPrimitives/polygon.h \
    include/GraphicalPrimitives/polyline.h \
    include/GraphicalPrimitives/rectangle.h \
    include/GraphicalPrimitives/text.h \
    include/hsmcondition.h \
    include/hsmscript.h \
    include/InteractionPrimitives/keyboard.h \
    include/InteractionPrimitives/pointer.h \
    include/InteractionPrimitives/pointerarea.h \
    include/InteractionPrimitives/scrollwheel.h \
    include/InteractionPrimitives/keyboardarea.h \
    include/InteractionPrimitives/scrollwheelarea.h \
    include/renderingcontext.h \
    include/renderingengine.h \
    include/runtimecontext.h \
    include/runtimeevent.h \
    include/sendeventec.h \
    include/TransformPrimitives/transformitem.h \
    include/types/a661p2color.h \
    include/types/alignementtype.h \
    include/types/angletype.h \
    include/types/aspectratiotype.h \
    include/types/booleantype.h \
    include/types/colortype.h \
    include/types/datetype.h \
    include/types/distancetype.h \
    include/types/doubletype.h \
    include/types/enumtype.h \
    include/types/expressiontype.h \
    include/types/fonttype.h \
    include/types/frequencytype.h \
    include/types/idtype.h \
    include/types/imagetype.h \
    include/types/integertype.h \
    include/types/keyeventstructtype.h \
    include/types/nametype.h \
    include/types/opacitytype.h \
    include/types/paintstrokecapacities.h \
    include/types/positiontype.h \
    include/types/stippletype.h \
    include/types/stringtype.h \
    include/types/structtype.h \
    include/types/transformcapacities.h \
    include/types/typetype.h \
    include/types/velocitytype.h \
    include/types/visibilitytype.h \
    include/types/wheeleventstructtype.h \
    include/types/zindextype.h \
    include/TransformPrimitives/transformtranslate.h \
    include/TransformPrimitives/transformrotate.h \
    include/TransformPrimitives/transformscale.h \
    include/TransformPrimitives/transformskew.h \
    include/TransformPrimitives/transformmatrix.h \
    include/GraphicalPrimitives/switchnode.h \
    include/types/entrytype.h \
    include/types/arrayentrytype.h \
    include/GraphicalPrimitives/replicate.h \
	include/GraphicalPrimitives/replicateentry.h


SOURCES += \
    src/GraphicalPrimitives/arc.cpp \
    src/GraphicalPrimitives/circle.cpp \
    src/GraphicalPrimitives/crown.cpp \
    src/GraphicalPrimitives/ellipse.cpp \
    src/GraphicalPrimitives/image.cpp \
    src/GraphicalPrimitives/line.cpp \
    src/InteractionPrimitives/pointer.cpp \
    src/InteractionPrimitives/pointerarea.cpp \
    src/GraphicalPrimitives/polarline.cpp \
    src/GraphicalPrimitives/polygon.cpp \
    src/GraphicalPrimitives/polyline.cpp \
    src/GraphicalPrimitives/rectangle.cpp \
    src/GraphicalPrimitives/group.cpp \
    src/GraphicalPrimitives/text.cpp \
    src/GraphicalPrimitives/children.cpp \
    src/types/alignementtype.cpp \
    src/types/angletype.cpp \
    src/types/colortype.cpp \
    src/types/datetype.cpp \
    src/types/distancetype.cpp \
    src/types/doubletype.cpp \
    src/types/enumtype.cpp \
    src/types/expressiontype.cpp \
    src/types/fonttype.cpp \
    src/types/frequencytype.cpp \
    src/types/idtype.cpp \
    src/types/imagetype.cpp \
    src/types/integertype.cpp \
    src/types/opacitytype.cpp \
    src/types/paintstrokecapacities.cpp \
    src/types/positiontype.cpp \
    src/types/stippletype.cpp \
    src/types/stringtype.cpp \
    src/types/structtype.cpp \
    src/types/transformcapacities.cpp \
    src/types/typetype.cpp \
    src/types/velocitytype.cpp \
    src/ap2i_core.cpp \
    src/basicitem.cpp \
    src/basicobject.cpp \
    src/binding.cpp \
    src/clock.cpp \
    src/component.cpp \
    src/engine.cpp \
    src/executeengine.cpp \
    src/InteractionPrimitives/scrollwheelarea.cpp \
    src/hsmcondition.cpp \
    src/hsmscript.cpp \
    src/renderingcontext.cpp \
    src/renderingengine.cpp \
    src/runtimecontext.cpp \
    src/runtimeevent.cpp \
    src/sendeventec.cpp \
    src/InteractionPrimitives/keyboard.cpp \
    src/InteractionPrimitives/keyboardarea.cpp \
    src/types/nametype.cpp \
    src/types/booleantype.cpp \
    src/types/aspectratiotype.cpp \
    src/types/visibilitytype.cpp \
    src/types/zindextype.cpp \
    src/eventcomponent.cpp \
    src/TransformPrimitives/transformitem.cpp \
    src/clippingitem.cpp \
    src/clippathitem.cpp \
    src/GraphicalPrimitives/cliprectangle.cpp \
    src/types/keyeventstructtype.cpp \
    src/InteractionPrimitives/scrollwheel.cpp \
    src/types/wheeleventstructtype.cpp \
    src/TransformPrimitives/transformtranslate.cpp \
    src/TransformPrimitives/transformrotate.cpp \
    src/TransformPrimitives/transformscale.cpp \
    src/TransformPrimitives/transformskew.cpp \
    src/TransformPrimitives/transformmatrix.cpp \
    src/GraphicalPrimitives/switchnode.cpp \
    src/types/entrytype.cpp \
    src/types/arrayentrytype.cpp \
    src/GraphicalPrimitives/replicate.cpp \
    src/GraphicalPrimitives/replicateentry.cpp
