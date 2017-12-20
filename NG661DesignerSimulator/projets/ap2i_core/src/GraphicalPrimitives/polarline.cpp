#include "polarline.h"

#include "renderingcontext.h"
#include <iostream>
#include "debug_macros.h"
#include <QDebug>
#include "vg/openvg.h"
#include "vg/vgu.h"
#include <QtMath>

namespace AP2I
{

const char *Polarline::CLASS_NAME = "Polarline";


Polarline::Polarline(BasicObject *pParent) :
    BasicItem(pParent)
{
    setClassName(CLASS_NAME);
}

bool Polarline::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);

    initDefaultFields();

    createPrimitive(pContext);

    drawPrimitive(pContext);

    return true;
}

bool Polarline::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);

    vgDestroyPath(mPolarlinePath);

    return true;
}

void Polarline::initDefaultFields()
{
    BasicItem::initDefaultFields();

    // Implicit bindings management
    if (!mX1.isDefined())
    {
        mX1 = 0.0;
    }

    if (!mY1.isDefined())
    {
        mY1 = 0.0;
    }

    if (!mR.isDefined())
    {
        mR = 0.0;
    }

    if (!mAngle.isDefined())
    {
        mAngle = 0.0;
    }
}

void Polarline::createPrimitive(RenderingContext &pContext)
{
    BasicItem::createPrimitive(pContext);

    mPolarlinePath = vgCreatePath(VG_PATH_FORMAT_STANDARD, VG_PATH_DATATYPE_F,1,0,0,0, VG_PATH_CAPABILITY_ALL);
    vguLine(mPolarlinePath, pContext.currentX()+getX1(), pContext.currentY()+getY1(), pContext.currentX()+getX1()+(qCos(qDegreesToRadians(getAngle()))*getR()), pContext.currentY()+getY1()+(qSin(qDegreesToRadians(getAngle()))*getR()));

    return;
}

void Polarline::drawPrimitive(RenderingContext &pContext)
{
    BasicItem::drawPrimitive(pContext);
    vgDrawPath(mPolarlinePath, VG_FILL_PATH | VG_STROKE_PATH);
}

} /* namespace AP2I */
