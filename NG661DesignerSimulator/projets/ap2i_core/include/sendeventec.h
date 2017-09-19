/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef SENDEVENTEC_H
#define SENDEVENTEC_H

#include "executablecontent.h"
#include "runtimeevent.h"
#include <QMap>
#include <QString>
#include <QScriptProgram>

namespace AP2I
{

class Component;

class SendEventEC : public ExecutableContent
{
public:
    SendEventEC(Component &pComponent,
                const QString &pEventName);
    virtual ~SendEventEC();

    void setParamExpression(const QString &pParamName,
                            const QString &pExpr);

    void execute();

private:
    SendEventEC();
    SendEventEC(const SendEventEC &);

    Component &mComponent;
    RuntimeEvent mEvent;
    QMap<QString, QScriptProgram> mParamsExpr;
};

} /* namespace AP2I */

#endif // SENDEVENTEC_H


