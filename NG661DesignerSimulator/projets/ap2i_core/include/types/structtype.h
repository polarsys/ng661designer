/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef STRUCTTYPE_H
#define STRUCTTYPE_H

#include <QMap>
#include <QString>

namespace AP2I
{

class StructType
{
public:

    struct StructFieldDescription
    {
        QString name;
        QString type;
        QString value;
    };

    typedef QList<StructFieldDescription> StructDescription;

    StructType(const QString &pTypeName = "");
    StructType(const StructType &) = default;
    ~StructType() = default;

    static bool registerStructType(const QString &pName);

private:
    static QMap<QString, StructDescription> STRUCT_TYPES;
};

} /* namespace AP2I */

#endif // STRUCTTYPE_H


