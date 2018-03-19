/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef BASICOBJECT_H
#define BASICOBJECT_H

#include <QObject>
#include <QString>
#include <QList>
#include <QMetaType>
#include <QVariant>
#include "visibilitytype.h"
#include "CapacitiesMacros.h"

namespace AP2I
{
class RenderingContext;
class RuntimeContext;
class RuntimeEvent;

class BasicObject : public QObject
{
    Q_OBJECT
    CORE_PROPERTIES
    GRAPHICS_PROPERTIES

    Q_PROPERTY(QString className READ className WRITE setClassName)
    Q_PROPERTY(QString type READ type WRITE setType)

public:

    CORE_METHODS

    enum SetPropertyResult
    {
        CorrectlySet = 0,
        UnknownProperty,
        UnknownType,
        ValueIsABinding
    };

    explicit BasicObject(BasicObject *pParent = 0);

    virtual ~BasicObject();

    virtual bool updateIn()  { return true; }
    virtual bool updateOut() { return true; }

    QString toString();

    /*QString id() const { return objectName(); }
    void setId(QString pId) { setObjectName(pId); }*/

    QString className() const { return mClassName; }
    void setClassName(QString pClassName) { mClassName = pClassName; }

    QString type() const { return mType; }
    void setType(QString pType) { mType = pType; }

    GRAPHICS_METHODS

    BasicObject *defaultContent() { return mDefaultContent; }
    void setDefaultContent(BasicObject *pContent);

    BasicObject *owner() { return mOwner; }
    void setOwner(BasicObject *pOwner) { mOwner = pOwner; }

    BasicObject *originComponent() { return mOriginComponent; }
    void setOriginComponent(BasicObject *pOriginComponent) { mOriginComponent = pOriginComponent; }

    RuntimeContext &context();
    void setContext(RuntimeContext &pContext);

    void addEventsListener(BasicObject *pListener);

    virtual const RuntimeEvent *getEvent(const QString &) const { return 0; }

    // called for all BasicObject registered as Listeners of this object
    // throught addEventsListener
    virtual bool handleEvent(RuntimeEvent &/*pEvent*/) {return true;}

    Q_INVOKABLE SetPropertyResult setPropertyValue(const QString &pPropName,
                                                   const QString &pPropValue);

    Q_INVOKABLE QVariant getPropertyValue(const QString &pPropName);

    // make parent available from scripts
    Q_INVOKABLE BasicObject *getParent();

    // make children list available from script
    Q_INVOKABLE QVariantList getChildren();

    // Get a Children object which is child of the current object
    BasicObject *getChildrenObject();

    static const char *CLASS_NAME;

protected:
    CORE_FIELDS
    GRAPHICS_FIELDS

    void notifyListeners(RuntimeEvent &pEvent);

    // Get a Children object which is child of the current object
    BasicObject *getChildrenObjectOf(const QString &pOriginComponentName);

    QString mClassName;
    QString mType;
    BasicObject *mDefaultContent;
    BasicObject *mOwner;
    BasicObject *mOriginComponent;
    RuntimeContext &mContext;
    QList<BasicObject *> mEventsListeners;
};

} /* namespace AP2I */

Q_DECLARE_METATYPE(AP2I::BasicObject*)
Q_DECLARE_METATYPE(AP2I::BasicObject::SetPropertyResult)

#endif // BASICOBJECT_H


