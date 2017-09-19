/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "runtimeevent.h"

#include "basicobject.h"

#include <QDebug>

namespace AP2I 
{

RuntimeEvent::RuntimeEvent(const QString &pName, BasicObject *pSource)
    : Event(pName),
      mSource(pSource)
{
}

void RuntimeEvent::addParameter(const QString &pName, int pType)
{
    EventParam lNewParam = { pName, pType, QVariant()};
    mParameters.append(lNewParam);
}

void RuntimeEvent::setParamValue(const QString &pParamName,
                                 const QVariant &pValue)
{
    bool lFound = false;
    auto it = mParameters.begin();

    while (!lFound && it != mParameters.end())
    {
        if (it->name == pParamName)
            lFound = true;
        else
            it++;
    }

    if(lFound && pValue.canConvert(it->type))
    {
        // here we take care of keeping original type of the QVariant it->value
        it->value = pValue;
        it->value.convert(it->type);
    }
    else
    {
        qDebug() << (uint)pValue.userType() << " " << it->type;
        qDebug() << "ERROR: Invalid parameter " << pParamName << " for event "
                 << name() << "of object " + mSource->id() + "(" + mSource->className() + ")";
    }
}

bool RuntimeEvent::matchEvent(const Event &pEvent) const
{
    bool lReturnValue = false;
    const RuntimeEvent *lEvent = dynamic_cast<const RuntimeEvent *>(&pEvent);
    if (lEvent)
    {
        lReturnValue = (lEvent->name() == name() &&
                        lEvent->source() == mSource);
    }
    return lReturnValue;
}

} /* namespace AP2I */
