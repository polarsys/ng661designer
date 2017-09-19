/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef BINDING_H
#define BINDING_H

#include <QString>
#include <QScriptProgram>

namespace AP2I
{

class Binding
{
public:
    explicit Binding(const QString &pDestComponent,
                     const QString &pDestProperty,
                     const QString &pExpression);

    const QString &script() { return mScript; }
    const QScriptProgram &program() { return mProgram; }


private:
    Binding(){}
    Binding(const Binding &){}

    QString mScript;
    QScriptProgram mProgram;
};

} /* namespace AP2I */

#endif // BINDING_H


