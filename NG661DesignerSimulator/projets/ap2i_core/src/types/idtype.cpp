/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "idtype.h"
#include <QString>
#include <QDebug>
#include <QScriptEngine>
#include <QScriptContext>


namespace AP2I
{

IdType::IdType()
{
}

IdType::IdType(const QString &pId)
{
    this->setId( pId);
}

IdType::IdType(const char *pId)
{
    this->setId( QString(pId));
}

IdType::IdType(const IdType &pId)
{
    mId = pId.mId;
}


IdType::~IdType()
{
}


IdType &IdType::operator=(IdType pId)
{
    mId = pId.mId;
    return *this;
}

IdType &IdType::operator=(const QString &pId)
{
    *this = IdType(pId);
    return *this;
}

IdType &IdType::operator=(const char *pId)
{
    *this = IdType(pId);
    return *this;
}

// used by QScriptEngine to convert a IdType to a generic QScriptValue
QScriptValue IdType::toScriptValue(QScriptEngine  *pEngine,
                                     const IdType &pId)
{
     return pEngine->newVariant(QVariant::fromValue(pId));
}

// used by QScriptEngine to convert a generic QScriptValue to an IdType
void IdType::fromScriptValue(const QScriptValue &pValue,
                                  IdType &pId)
{
    if (pValue.isString())
    {
        pId.setId(pValue.toString());
    }
    else
    {
        pId = pValue.toVariant().value<IdType>();
    }
}

QScriptValue IdType::getTypeValue(QScriptContext *pCtx,
                                    QScriptEngine  *)
{

    if (pCtx->argumentCount() == 1)
    {
        IdType lId;
        fromScriptValue(pCtx->argument(0), lId);

        return lId.id();
    }
    else
    {
        return pCtx->throwError("getTypeValue takes only 1 argument : the type.");
    }
}

} /* namespace AP2I */
