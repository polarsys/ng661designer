/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef HSMSCRIPT_H
#define HSMSCRIPT_H

#include "executablecontent.h"

#include <QString>
#include <QScriptProgram>

class QScriptEngine;

namespace AP2I
{

class HSMScript : public ExecutableContent
{
public:
    HSMScript(const QString &pScript, QScriptEngine *pEngine);

    void execute();

private:
    QString mScript;
    QScriptProgram mProgram;
    QScriptEngine *mScriptEngine;
};

} /* namespace AP2I */

#endif // HSMSCRIPT_H


