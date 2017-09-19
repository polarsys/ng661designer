#############################################################################
# Copyright (c) 2015, 2016 Thales.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
# Contributors:
#    Thales Avionics - initial design and implementation
#############################################################################

TEMPLATE = subdirs
CONFIG += ordered

SUBDIRS = \
    projets/ap2i_xml \
    projets/ap2i_hsm \
    projets/ap2i_core \
    projets/ap2i_factory \
    projets/ap2i_app \
    projets/InterpreteurDll
