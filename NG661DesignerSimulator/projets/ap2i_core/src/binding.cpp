/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "binding.h"

#include <QString>
#include <qdebug.h>

namespace AP2I
{

Binding::Binding(const QString &pDestComponent,
                 const QString &pDestProperty,
                 const QString &pExpression)
{

    QString lExpression = pExpression.trimmed();
    lExpression.replace("{", "", Qt::CaseSensitive);
    lExpression.replace("}", "", Qt::CaseSensitive);

    mScript = pDestComponent + "." + pDestProperty + " = " + lExpression + ";";
    mScript.replace("Tree.", "Tree_", Qt::CaseSensitive);
    mScript.replace("Behavior.", "Behavior_", Qt::CaseSensitive);
    mProgram = QScriptProgram(mScript);
}

} /* namespace AP2I */
