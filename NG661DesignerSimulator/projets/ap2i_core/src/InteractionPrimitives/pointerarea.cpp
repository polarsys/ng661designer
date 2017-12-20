/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#include "pointerarea.h"

#include "transition.h"
#include "condition.h"
#include "executablecontent.h"
#include "runtimecontext.h"
#include "renderingcontext.h"
#include "transformitem.h"
#include "transformrotate.h"
#include "transformtranslate.h"
#include "transformscale.h"
#include "transformskew.h"
#include "group.h"

#include <QStack>
#include <QDebug>
#include <QMatrix>

namespace AP2I
{

const char *PointerArea::CLASS_NAME = "PointerArea";

class PointerAreaCondition : public Condition
{
public:
    PointerArea &mArea;
    PointerArea::T_PACondition mEvalFunc;
    PointerAreaCondition(PointerArea &pArea,
                    PointerArea::T_PACondition pFunc) : mArea(pArea), mEvalFunc(pFunc) {}
    bool evaluate() const
    {
        return mEvalFunc(mArea);
    }
};

class PointerAreaAction : public ExecutableContent
{
public:
    PointerArea &mArea;
    PointerArea::T_PAAction mAction;
    PointerAreaAction(PointerArea &pArea,
                      PointerArea::T_PAAction pAction) : mArea(pArea), mAction(pAction) {}

    void execute()
    {
        mAction(mArea);
    }
};

bool PointerArea::isEnable(PointerArea &pArea)  {
    if (pArea.enable() && pArea.visibility().getValue() == "visible")
    {
        return true;
    }
    else
    {
        return false;
    }
}
bool PointerArea::isDisabled(PointerArea &pArea) {
    if (!(pArea.enable() && pArea.visibility().getValue() == "visible"))
    {
        return true;
    }
    else
    {
        return false;
    }
}
bool PointerArea::isFocused(PointerArea &pArea)  { return pArea.mFocused;   }
bool PointerArea::isUnfocused(PointerArea &pArea){ return !pArea.mFocused;  }
bool PointerArea::isPreventStealing(PointerArea &pArea){ return pArea.preventStealing();  }

void PointerArea::raiseEnterEvent(PointerArea &pArea)
{
    pArea.mEnterEvent.setParamValue("x", QVariant::fromValue(pArea.mPointerPositionX));
    pArea.mEnterEvent.setParamValue("y", QVariant::fromValue(pArea.mPointerPositionY));
    pArea.notifyListeners(pArea.mEnterEvent);
}

void PointerArea::raiseLeaveEvent(PointerArea &pArea)
{
    pArea.mLeaveEvent.setParamValue("x", QVariant::fromValue(pArea.mPointerPositionX));
    pArea.mLeaveEvent.setParamValue("y", QVariant::fromValue(pArea.mPointerPositionY));
    pArea.notifyListeners(pArea.mLeaveEvent);
}

void PointerArea::forceLeave()
{
    this->mFocused = false;
}

void PointerArea::raiseMoveEvent(PointerArea &pArea)
{
    pArea.mMoveEvent.setParamValue("x", pArea.mPointerPositionX.getValue());
    pArea.mMoveEvent.setParamValue("y", pArea.mPointerPositionY.getValue());
    pArea.notifyListeners(pArea.mMoveEvent);
}
void PointerArea::raisePressEvent(PointerArea &pArea)
{
    pArea.mPressEvent.setParamValue("x", pArea.mPointerPositionX.getValue());
    pArea.mPressEvent.setParamValue("y", pArea.mPointerPositionY.getValue());
    pArea.notifyListeners(pArea.mPressEvent);
}
void PointerArea::raiseReleaseEvent(PointerArea &pArea)
{
    pArea.mReleaseEvent.setParamValue("x", pArea.mPointerPositionX.getValue());
    pArea.mReleaseEvent.setParamValue("y", pArea.mPointerPositionY.getValue());
    pArea.notifyListeners(pArea.mReleaseEvent);
}

PointerArea::PointerArea(BasicObject *pParent)
    : BasicItem(pParent),
      mEnable(true),
      mEnterEvent  ("EnterEvent", this),
      mLeaveEvent  ("LeaveEvent", this),
      mMoveEvent   ("MoveEvent", this),
      mPressEvent  ("PressEvent", this),
      mReleaseEvent("ReleaseEvent", this),
      mPreventStealing(false),
      mPassThrough(false),
      mFocused(false),
      mAcceptedButtons("0"),
      mPointerPositionX(0),
      mPointerPositionY(0)
{
    setClassName(CLASS_NAME);

    State *lDisabled = new State("DISABLED", mStateMachine.rootState());
    State *lEnabled  = new State("ENABLED" , mStateMachine.rootState());

    // TODO : confirmer qu'il faille bien lever l'event Exit lorsque la PointerArea passe disabled
    // lDisabled->addOnEntryAction(new PointerAreaAction(*this, raiseLeaveEvent));

    //Enabled state Transition
    Transition *lDisable = new Transition(
                               lEnabled,
                               lDisabled,
                               NULL,
                               new PointerAreaCondition(*this, isDisabled));
    lEnabled->addTransition(lDisable);

    //Disable state Transition
    Transition *lEnable = new Transition(
                              lDisabled,
                              lEnabled,
                              NULL,
                              new PointerAreaCondition(*this, isEnable));
    lDisabled->addTransition(lEnable);

    State *lEIdle    = new State("E_IDLE"   , lEnabled);
    State *lEFocused = new State("E_FOCUSED", lEnabled);

    lEFocused->addOnEntryAction(new PointerAreaAction(*this, raiseEnterEvent));

    lEFocused->addOnExitAction(new PointerAreaAction(*this, raiseLeaveEvent));

    // EnabledIdle state Transition
    Transition *lGainFocus = new Transition(
                                 lEIdle,
                                 lEFocused,
                                 NULL,
                                 new PointerAreaCondition(*this, isFocused));
    lEIdle->addTransition(lGainFocus);

    // EnabledFocused state Transition
    Transition *lLoseFocus = new Transition(
                                 lEFocused,
                                 lEIdle,
                                 NULL,
                                 new PointerAreaCondition(*this, isUnfocused));
    lEFocused->addTransition(lLoseFocus);

    State *lFIdle    = new State("E_F_IDLE"   , lEFocused);
    State *lFPressed = new State("E_F_PRESSED", lEFocused);

    // EnabledFocusedIdle state Transitions
    Transition *lFIdleMove = new Transition(
                                 lFIdle,
                                 NULL,
                                 &context().pointer()->moveEvent(),
                                 NULL);
    lFIdleMove->addAction(new PointerAreaAction(*this, raiseMoveEvent));
    lFIdle->addTransition(lFIdleMove);

    Transition *lFIdleRelease = new Transition(
                                 lFIdle,
                                 NULL,
                                 &context().pointer()->releasedEvent(),
                                 NULL);
    lFIdleRelease->addAction(new PointerAreaAction(*this, raiseReleaseEvent));
    lFIdle->addTransition(lFIdleRelease);

    Transition *lFIdlePress = new Transition(
                                 lFIdle,
                                 lFPressed,
                                 &context().pointer()->pressedEvent(),
                                 NULL);
    lFIdlePress->addAction(new PointerAreaAction(*this, raisePressEvent));
    lFIdle->addTransition(lFIdlePress);

    // EnabledFocusedPressed state Transitions
    Transition *lFPressedMove = new Transition(
                                 lFPressed,
                                 NULL,
                                 &context().pointer()->moveEvent(),
                                 NULL);
    lFPressedMove->addAction(new PointerAreaAction(*this, raiseMoveEvent));
    lFPressed->addTransition(lFPressedMove);

    Transition *lFPressedRelease = new Transition(
                                 lFPressed,
                                 lFIdle,
                                 &context().pointer()->releasedEvent(),
                                 NULL);
    lFPressedRelease->addAction(new PointerAreaAction(*this, raiseReleaseEvent));
    lFPressed->addTransition(lFPressedRelease);

    mEnterEvent.addParameter("x", qMetaTypeId<PositionType>());
    mEnterEvent.addParameter("y", qMetaTypeId<PositionType>());
    mLeaveEvent.addParameter("x", qMetaTypeId<PositionType>());
    mLeaveEvent.addParameter("y", qMetaTypeId<PositionType>());
    mMoveEvent.addParameter("x", qMetaTypeId<PositionType>());
    mMoveEvent.addParameter("y", qMetaTypeId<PositionType>());
    mPressEvent.addParameter("x", qMetaTypeId<PositionType>());
    mPressEvent.addParameter("y", qMetaTypeId<PositionType>());
    mReleaseEvent.addParameter("x", qMetaTypeId<PositionType>());
    mReleaseEvent.addParameter("y", qMetaTypeId<PositionType>());

    context().pointer()->addEventsListener(this);

    mStateMachine.start();
}

bool PointerArea::handleEvent(RuntimeEvent &pEvent)
{
    bool lPassThrought;
    computeFocus();
    if((mFocused == true))
    {
        /* Taking focus focused */
        mStateMachine.enqueueEvent(pEvent);
        context().focusedPointerAreas()->append(this);
        lPassThrought = mPassThrough.value();
    }
    else
    {
        lPassThrought = true;
    }
    return lPassThrought;
}

const RuntimeEvent *PointerArea::getEvent(const QString &pEventName) const
{
         if (pEventName == "EnterEvent"  ) return &mEnterEvent  ;
    else if (pEventName == "LeaveEvent"  ) return &mLeaveEvent  ;
    else if (pEventName == "MoveEvent"   ) return &mMoveEvent   ;
    else if (pEventName == "PressEvent"  ) return &mPressEvent  ;
    else if (pEventName == "ReleaseEvent") return &mReleaseEvent;
    else                                   return 0             ;
}

bool PointerArea::updateIn()
{
    mPointerPositionX.setValue(context().pointer()->x());
    mPointerPositionY.setValue(context().pointer()->y());

    mStateMachine.executeIteration();
    return true;
}

void PointerArea::computeFocus()
{
    QPoint lPointerPos(context().pointer()->x(),
                       context().pointer()->y());
    QMatrix lMatrix;
    QObject *lCur = this;
    QStack<QObject *>lAncestors;
    QObjectList lChildren;

    while(lCur)
    {
        lAncestors.push(lCur);
        lCur = lCur->parent();
    }

    while(!lAncestors.isEmpty())
    {
        lCur = lAncestors.pop();
        BasicItem *lItem = dynamic_cast<BasicItem *>(lCur);
        if (lItem)
        {
            Group *lGrp = dynamic_cast<Group *>(lItem);
            if (lGrp)
            {
                lMatrix.translate(lGrp->getTx(), lGrp->getTy());
            }


            TransformItem *lTi = dynamic_cast<TransformItem *>(lItem);
            if (lTi)
            {
                lChildren = lTi->children();

                for (int i = 0; i<lChildren.size(); i++)
                {
                    TransformRotate *lTr = dynamic_cast<TransformRotate *>(lChildren[i]);
                    if (lTr)
                    {
                        lMatrix.translate(lTr->getCx(), lTr->getCy());
                        lMatrix.rotate(lTr->getAngle());
                        lMatrix.translate(-lTr->getCx(), -lTr->getCy());
                    }

                    TransformTranslate *lTt = dynamic_cast<TransformTranslate *>(lChildren[i]);
                    if (lTt)
                    {
                        lMatrix.translate(lTt->getTx(), lTt->getTy());
                    }

                    TransformScale *lTs = dynamic_cast<TransformScale *>(lChildren[i]);
                    if (lTs)
                    {
                        lMatrix.translate(lTs->getSx(), lTs->getSy());
                    }

                    TransformSkew *lTsk = dynamic_cast<TransformSkew *>(lChildren[i]);
                    if (lTsk)
                    {
                        if(lTsk->getSkewType() == SKEWX)
                        {
                            lMatrix.shear(0,tan(lTsk->getAngle()));
                        }
                        else
                        {
                            lMatrix.shear(tan(lTsk->getAngle()),0);
                        }
                    }
                }
            }
        }
    }
    lMatrix.translate(getX(), getY());

    if (lMatrix.m11() != 1.0F || lMatrix.m12() != 0.0F
     || lMatrix.m21() != 0.0F || lMatrix.m22() != 1.0F)
    {
        QPolygonF lBox = lMatrix.mapToPolygon(QRect(0,0, width().getValue(), height().getValue()));
        mFocused = lBox.containsPoint(lPointerPos, Qt::OddEvenFill);
    }
    else
    {        
        mFocused = QRect(lMatrix.dx(), lMatrix.dy(), width().getValue(), height().getValue()).contains(lPointerPos);
    }
}

} /* namespace AP2I */
