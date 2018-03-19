#ifndef TRANSFORMSKEW_H
#define TRANSFORMSKEW_H

#include "basicitem.h"
#include "transformitem.h"
#include "positiontype.h"
#include "angletype.h"
#include <QMetaType>
#include "vg/openvg.h"

namespace AP2I
{

enum SkewTypeEnum
{
    SKEWX = 0,
    SKEWY
};

class TransformSkew : public BasicItem
{
	Q_OBJECT
    
	Q_PROPERTY(AngleType angle READ angle WRITE setAngle)
public:
    explicit TransformSkew(BasicObject *pParent = 0, SkewTypeEnum pSkewType = SKEWX);
	virtual ~TransformSkew() {}
	virtual bool renderIn(RenderingContext &pContext);
    virtual bool renderOut(RenderingContext &);    
	void setAngle(AngleType pAngle) { mAngle = pAngle; }
    AngleType angle() { return mAngle; }
    double getAngle() {return mAngle.getValue();}

    SkewTypeEnum getSkewType() {return mSkewType;}

	static const char *CLASS_NAME;    

private:
    AngleType mAngle;    
    SkewTypeEnum mSkewType;
};

} /* namespace AP2I */

#endif // TRANSFORMSKEW_H
