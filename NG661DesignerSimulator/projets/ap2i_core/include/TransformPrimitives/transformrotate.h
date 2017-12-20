#ifndef TRANSFORMROTATE_H
#define TRANSFORMROTATE_H

#include "basicitem.h"
#include "transformitem.h"
#include "positiontype.h"
#include "angletype.h"
#include <QMetaType>

namespace AP2I
{

class TransformRotate : public BasicItem
{
    Q_OBJECT

    Q_PROPERTY(PositionType cx READ cx WRITE setCx)
    Q_PROPERTY(PositionType cy READ cy WRITE setCy)
	Q_PROPERTY(AngleType angle READ angle WRITE setAngle)

public:
    explicit TransformRotate(BasicObject *pParent = 0);
	virtual ~TransformRotate() {}
	virtual bool renderIn(RenderingContext &pContext);
    virtual bool renderOut(RenderingContext &);
	void setCx(PositionType pCx) { mCx = pCx; }
    PositionType cx(){return mCx;}
    double getCx() {return mCx.getValue();}

    void setCy(PositionType pCy) { mCy = pCy; }
    PositionType cy() { return mCy; }
    double getCy() {return mCy.getValue();}

	void setAngle(AngleType pAngle) { mAngle = pAngle; }
    AngleType angle() { return mAngle; }
    double getAngle() {return mAngle.getValue();}	

    static const char *CLASS_NAME;
private:
    PositionType mCx;
    PositionType mCy;
    AngleType mAngle;
};

} /* namespace AP2I */

#endif // TRANSFORMROTATE_H
