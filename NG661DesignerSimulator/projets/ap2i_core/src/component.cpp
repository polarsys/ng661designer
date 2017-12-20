/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "component.h"

#include <QDebug>
#include <QScriptEngine>
#include <QDynamicPropertyChangeEvent>

#include "binding.h"
#include "statemachine.h"
#include "runtimecontext.h"
#include "runtimeevent.h"
#include "eventcomponent.h"

#include "alignementtype.h"
#include "angletype.h"
#include "aspectratiotype.h"
#include "booleantype.h"
#include "colortype.h"
#include "datetype.h"
#include "distancetype.h"
#include "doubletype.h"
#include "enumtype.h"
#include "expressiontype.h"
#include "fonttype.h"
#include "frequencytype.h"
#include "idtype.h"
#include "imagetype.h"
#include "integertype.h"
#include "nametype.h"
#include "opacitytype.h"
#include "positiontype.h"
#include "stippletype.h"
#include "stringtype.h"
#include "typetype.h"
#include "velocitytype.h"
#include "visibilitytype.h"
#include "zindextype.h"
#include "arrayentrytype.h"
#include "entrytype.h"

namespace AP2I
{

Component::Component(BasicObject *pParent)
    : BasicObject(pParent),
      mInitialized(false),
      mStateMachine(NULL)

{
    mScriptEngine = new QScriptEngine();

    //register pointer object in script engine if any
    if (context().pointer())
    {
        QScriptValue lElementValue = mScriptEngine->newQObject(context().pointer());
        mScriptEngine->globalObject().setProperty("POINTER", lElementValue);
    }

    //register keyboard object in script engine if any
    if (context().keyboard())
    {
        QScriptValue lElementValue = mScriptEngine->newQObject(context().keyboard());
        mScriptEngine->globalObject().setProperty("KEYBOARD", lElementValue);
    }



    //register AlignementType type de script engine
    qScriptRegisterMetaType(mScriptEngine,
                            AlignementType::toScriptValue,
                            AlignementType::fromScriptValue);

    //register AngleType type de script engine
    qScriptRegisterMetaType(mScriptEngine,
                            AngleType::toScriptValue,
                            AngleType::fromScriptValue);

    //register AspectRatioType type de script engine
    qScriptRegisterMetaType(mScriptEngine,
                            AspectRatioType::toScriptValue,
                            AspectRatioType::fromScriptValue);

    //register BooleanType type de script engine
    qScriptRegisterMetaType(mScriptEngine,
                            BooleanType::toScriptValue,
                            BooleanType::fromScriptValue);

    //register ColorType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            ColorType::toScriptValue,
                            ColorType::fromScriptValue);

    //register DateType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            DateType::toScriptValue,
                            DateType::fromScriptValue);

    //register DistanceType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            DistanceType::toScriptValue,
                            DistanceType::fromScriptValue);

    //register DoubleType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            DoubleType::toScriptValue,
                            DoubleType::fromScriptValue);

    //register EnumType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            EnumType::toScriptValue,
                            EnumType::fromScriptValue);

    //register ExpressionType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            ExpressionType::toScriptValue,
                            ExpressionType::fromScriptValue);

    //register FontType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            FontType::toScriptValue,
                            FontType::fromScriptValue);

    //register FrequencyType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            FrequencyType::toScriptValue,
                            FrequencyType::fromScriptValue);

    //register IdType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            IdType::toScriptValue,
                            IdType::fromScriptValue);

    //register ImageType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            ImageType::toScriptValue,
                            ImageType::fromScriptValue);

    //register IntegerType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            IntegerType::toScriptValue,
                            IntegerType::fromScriptValue);

    //register NameType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            NameType::toScriptValue,
                            NameType::fromScriptValue);

    //register OpacityType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            OpacityType::toScriptValue,
                            OpacityType::fromScriptValue);

    //register PositionType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            PositionType::toScriptValue,
                            PositionType::fromScriptValue);

    //register StippleType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            StippleType::toScriptValue,
                            StippleType::fromScriptValue);

    //register StringType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            StringType::toScriptValue,
                            StringType::fromScriptValue);

    //register TypeType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            TypeType::toScriptValue,
                            TypeType::fromScriptValue);

    //register VelocityType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            VelocityType::toScriptValue,
                            VelocityType::fromScriptValue);

    //register VisibilityType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            VisibilityType::toScriptValue,
                            VisibilityType::fromScriptValue);

    //register ZIndexType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            ZIndexType::toScriptValue,
                            ZIndexType::fromScriptValue);

    //register EntryType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            EntryType::toScriptValue,
                            EntryType::fromScriptValue);

    //register ArrayEntryType type to script engine
    qScriptRegisterMetaType(mScriptEngine,
                            ArrayEntryType::toScriptValue,
                            ArrayEntryType::fromScriptValue);

    //register ColorType getColorValues helper
    mScriptEngine->globalObject().setProperty("getColorValues",
                mScriptEngine->newFunction(ColorType::getColorValues));


    // register Component to scriptEngine so that the properties of the interface
    // are accessible
    QScriptValue lElementValue = mScriptEngine->newQObject(this);
    mScriptEngine->globalObject().setProperty("Interface", lElementValue);

    // register EventComponent to scriptEngine so that the events are accessible
    mEventComponent = new EventComponent(mScriptEngine);
    QScriptValue lEventsValue = mScriptEngine->newQObject(mEventComponent);
    mScriptEngine->globalObject().setProperty("_event", lEventsValue);
}

Component::~Component()
{
    for (Binding *lBinding : mBindings)
    {
        delete lBinding;
    }
    for (RuntimeEvent *lEvent : mEvents)
    {
        delete lEvent;
    }

    delete mScriptEngine;
    if (mStateMachine)
        delete mStateMachine;
}

void Component::addBinding(const QString &pDestComponent,
                           const QString &pDestProperty,
                           const QString &pExpression)
{
    Binding *lNewBinding;

    lNewBinding = new Binding(pDestComponent, pDestProperty, pExpression);
    if (lNewBinding)
    {
        mBindings.append(lNewBinding);
    }
}

void Component::registerRepresentationElement(BasicObject *pItem)
{
    // Register pItem to the scriptEngine so its properties can be accessed
    // through scripts using "Tree.<obj_id>.<prop_name>"
    QScriptValue lElementValue = mScriptEngine->newQObject(pItem);    
    mScriptEngine->globalObject().setProperty("Tree_" + pItem->id(),
                                             lElementValue);
}

void Component::registerReplicateRepresentationElement(BasicObject *pItem, int pMaxItem)
{
    // Création d'un tableau dans le moteur de script pour pouvoir accéder aux diverses entrées du replicate
    QScriptValue lElementArray = mScriptEngine->newArray(pMaxItem);
    QScriptValue lElementValue = mScriptEngine->newQObject(pItem);

    mScriptEngine->globalObject().setProperty("Tree_" + pItem->id(), lElementArray);
    mScriptEngine->globalObject().setProperty("Tree__" + pItem->id(), lElementValue);
}

void Component::registerReplicateEntryRepresentationElement(BasicObject *pItem, Replicate *pReplicate, int pNb)
{
    //Ajout des replicateEntry comme éléments du tableau créé pour la classe Replicate
    QString lArrayName = "Tree_" + pReplicate->id();
    QScriptValue lElementValue = mScriptEngine->newQObject(pItem);
    QScriptValue lArray = mScriptEngine->globalObject().property(lArrayName);
    lArray.setProperty(pNb, lElementValue);

    mScriptEngine->globalObject().setProperty(lArrayName, lArray);
    mScriptEngine->globalObject().setProperty("Tree_" + pItem->id(), lElementValue);
}

void Component::registerReplicateChildRepresentationElement(BasicObject *pItem, ReplicateEntry *pReplicateEntry, QString pNb)
{
    //Ajout des éléments enfants d'un replicateEntry comme propriété de celui là et on directement dans le moteur de script
    //de manière à pouvoir les appeler dans le script par Tree_nomdureplicate[index].NomDuChild
    pReplicateEntry->setProperty(pItem->id().toLatin1(), QVariant::fromValue(pItem));
}

void Component::registerBehaviorElement(BasicObject *pItem)
{
    // Register pItem to the scriptEngine so its properties can be accessed
    // through scripts using "Behavior.<obj_id>.<prop_name>"
    QScriptValue lElementValue = mScriptEngine->newQObject(pItem);
    mScriptEngine->globalObject().setProperty("Behavior_" + pItem->id(),
                                              lElementValue);
}

StateMachine *Component::createStateMachine()
{
    if (!mStateMachine)
    {
        mStateMachine = new StateMachine();
    }
    else
    {
        qDebug() << "ERROR: StateMachine already created.";
    }
    return mStateMachine;
}

void Component::addProperty(const QString &pName, QVariant pVal)
{
    if (!mProperties.contains(pName))
    {
        mProperties.insert(pName, pVal);
        setProperty(pName.toLatin1().data(), pVal);
    }
    else
    {
        qDebug() << "ERROR: " << className() << " already have a property named "
                 << pName;
    }
}

RuntimeEvent *Component::addEvent(const QString &pEventName)
{
    RuntimeEvent *lNewEvent = new RuntimeEvent(pEventName, this);
    mEvents.append(lNewEvent);
    return lNewEvent;
}

const RuntimeEvent *Component::getEvent(const QString &pEventName) const
{
    const RuntimeEvent *lEvent = 0;
    auto it = mEvents.begin();

    while (!lEvent && it != mEvents.end())
    {
        if ((*it)->name() == pEventName)
        {
            lEvent = *it;
        }
        it++;
    }
    return lEvent;
}

bool Component::handleEvent(RuntimeEvent &pEvent)
{
    //add event data to script env
    if (pEvent.beginParam() != pEvent.endParam())
    {
        for (auto it = pEvent.beginParam(); it != pEvent.endParam(); it++)
        {
            mEventComponent->addEvent(it->name, it->value);
        }
    }
    mStateMachine->enqueueEvent(pEvent);
    return true;
}

void Component::raiseEvent(RuntimeEvent &pEvent)
{
    // add event to its stateMachine eventsQueue
    handleEvent(pEvent);
    // add event to all registered elements' eventsQueues
    notifyListeners(pEvent);
}

bool Component::updateIn()
{
    // refresh bindings
    for (Binding *lBinding : mBindings)
    {
        QScriptProgram lProgram = lBinding->program();

        QScriptValue lRes = mScriptEngine->evaluate(lBinding->program());
        if (mScriptEngine->hasUncaughtException())
        {
            qDebug() << "ERROR: Script exception for component "
                     + id() + "(" + className() + ") :" << lRes.toString()
                     << "in binding : " << lBinding->script() << "\n";
        }
        else if (lRes.isUndefined())
        {
            qDebug() << "WARNING: Script undefined result for component "
                     + id() + "(" + className() + ") in binding : "
                     << lBinding->script() << "\n";
        }
    }

    // execute behavior (state machine...)
    if (mStateMachine)
    {
        if (!mInitialized)
        {
            mStateMachine->start();
            mInitialized = true;
        }
        mStateMachine->executeIteration();
    }
    // TODO execute representation ? (anchors...)


    return true;
}

bool Component::updateOut()
{
    mScriptEngine->collectGarbage();
    return true;
}

bool Component::event(QEvent *pEvent)
{
    QDynamicPropertyChangeEvent *lEv = dynamic_cast<QDynamicPropertyChangeEvent *>(pEvent);

    if (lEv)
    {
        //whenever a component's property changes, we ensure its type is preserved
        QVariant &lOldVal = mProperties[lEv->propertyName()];
        QVariant lNewVal = property(lEv->propertyName());
        if (lNewVal.userType() != lOldVal.userType())
        {
            if (lOldVal.userType() == qMetaTypeId<AlignementType>())
            {
                AlignementType lAlignement = lOldVal.value<AlignementType>();
                lAlignement.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lAlignement);
            }
            else if (lOldVal.userType() == qMetaTypeId<AngleType>())
            {
                AngleType lAngle = lOldVal.value<AngleType>();
                lAngle.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lAngle);
            }
            else if (lOldVal.userType() == qMetaTypeId<AspectRatioType>())
            {
                AspectRatioType lAspectRatio = lOldVal.value<AspectRatioType>();
                lAspectRatio.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lAspectRatio);
            }
            else if (lOldVal.userType() == qMetaTypeId<BooleanType>())
            {
                BooleanType lBoolean = lOldVal.value<BooleanType>();
                lBoolean.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lBoolean);
            }
            else if (lOldVal.userType() == qMetaTypeId<ColorType>())
            {
                ColorType lColor;

                if (lColor.setBySVGName(lNewVal.toString()))
                {
                    lColor.setIsDefined(true);
                    lNewVal = QVariant::fromValue(lColor);
                }
                else
                {
                    qDebug() << "ERROR: invalid color value :" + lNewVal.toString();
                }
            }
            else if (lOldVal.userType() == qMetaTypeId<DateType>())
            {
               DateType lDate = lOldVal.value<DateType>();
               lDate.setExpression(lNewVal.toString());
               lNewVal = QVariant::fromValue(lDate);
            }
            else if (lOldVal.userType() == qMetaTypeId<DistanceType>())
            {
                DistanceType lDistance = lOldVal.value<DistanceType>();
                lDistance.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lDistance);
            }
            else if (lOldVal.userType() == qMetaTypeId<DoubleType>())
            {
                DoubleType lDouble = lOldVal.value<DoubleType>();
                lDouble.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lDouble);
            }
            else if (lOldVal.userType() == qMetaTypeId<EnumType>())
            {
                EnumType lEnum = lOldVal.value<EnumType>();
                lEnum.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lEnum);
            }
            else if (lOldVal.userType() == qMetaTypeId<ExpressionType>())
            {
                ExpressionType lExpression = lOldVal.value<ExpressionType>();
                lExpression.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lExpression);
            }
            else if (lOldVal.userType() == qMetaTypeId<FontType>())
            {
                FontType lFont = lOldVal.value<FontType>();
                lFont.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lFont);
            }
            else if (lOldVal.userType() == qMetaTypeId<FrequencyType>())
            {
                FrequencyType lFrequency = lOldVal.value<FrequencyType>();
                lFrequency.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lFrequency);
            }
            else if (lOldVal.userType() == qMetaTypeId<IdType>())
            {
               IdType lId = lOldVal.value<IdType>();
               lId.setId(lNewVal.toString());
               lNewVal = QVariant::fromValue(lId);
            }
            else if (lOldVal.userType() == qMetaTypeId<ImageType>())
            {
               ImageType lImage = lOldVal.value<ImageType>();
               lImage.setAnyURI(lNewVal.toString());
               lNewVal = QVariant::fromValue(lImage);
            }
            else if (lOldVal.userType() == qMetaTypeId<IntegerType>())
            {
                IntegerType lInteger = lOldVal.value<IntegerType>();
                lInteger.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lInteger);
            }
            else if (lOldVal.userType() == qMetaTypeId<NameType>())
            {
                NameType lName = lOldVal.value<NameType>();
                lName.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lName);
            }
            else if (lOldVal.userType() == qMetaTypeId<OpacityType>())
            {
                OpacityType lOpacity = lOldVal.value<OpacityType>();
                lOpacity.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lOpacity);
            }
            else if (lOldVal.userType() == qMetaTypeId<PositionType>())
            {
                PositionType lPosition = lOldVal.value<PositionType>();
                lPosition.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lPosition);
            }
            else if (lOldVal.userType() == qMetaTypeId<StippleType>())
            {
                StippleType lStipple = lOldVal.value<StippleType>();
                lStipple.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lStipple);
            }
            else if (lOldVal.userType() == qMetaTypeId<StringType>())
            {
                StringType lString = lOldVal.value<StringType>();
                lString.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lString);
            }
            else if (lOldVal.userType() == qMetaTypeId<TypeType>())
            {
               TypeType lType = lOldVal.value<TypeType>();
               lType.setValue(lNewVal.toString());
               lNewVal = QVariant::fromValue(lType);
            }
            else if (lOldVal.userType() == qMetaTypeId<VelocityType>())
            {
                VelocityType lVelocity = lOldVal.value<VelocityType>();
                lVelocity.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lVelocity);
            }
            else if (lOldVal.userType() == qMetaTypeId<VisibilityType>())
            {
                VisibilityType lVisibility = lOldVal.value<VisibilityType>();
                lVisibility.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lVisibility);
            }
            else if (lOldVal.userType() == qMetaTypeId<ZIndexType>())
            {
                ZIndexType lZIndex = lOldVal.value<ZIndexType>();
                lZIndex.setValue(lNewVal.toString());
                lNewVal = QVariant::fromValue(lZIndex);
            }
            else if(lOldVal.userType() == qMetaTypeId<ArrayEntryType>())
            {
                ArrayEntryType lArrayEntryType = lOldVal.value<ArrayEntryType>();
                /* TO DO */
                lNewVal = QVariant::fromValue(lArrayEntryType);
            }
            else
            {
                if (!lNewVal.convert(lOldVal.userType()))
                    qDebug() << "ERROR: cannot set the value " << lNewVal
                             << " to " + lEv->propertyName() + "("
                             << QMetaType::typeName(lOldVal.userType()) << ")";
            }
            lOldVal = lNewVal;
            setProperty(lEv->propertyName().data(), lNewVal);
        }

        return true;
    }
    return QObject::event(pEvent);
}

} /* namespace AP2I */
