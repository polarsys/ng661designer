/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef HSMCONDITION_H
#define HSMCONDITION_H

#include "condition.h"

#include <QString>
#include <QScriptProgram>

class QScriptEngine;

namespace AP2I
{

class HSMCondition : public Condition
{
public:
    HSMCondition(QScriptEngine *pScriptEngine,
                 const QString &pCondStr);
    HSMCondition(const HSMCondition &pCondition);
    virtual ~HSMCondition();
    virtual bool evaluate() const;
private:
    QScriptEngine *mScriptEngine;
    QString mCondStr;
    QScriptProgram mProgram;
};

} /* namespace AP2I */

#endif // HSMCONDITIONPROCESSOR_H


