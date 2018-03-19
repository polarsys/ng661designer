#ifndef TRANSFORMSCALE_H
#define TRANSFORMSCALE_H

#include "basicitem.h"
#include "positiontype.h"
#include <QMetaType>

namespace AP2I
{

class TransformScale : public BasicItem
{
    Q_OBJECT

    Q_PROPERTY(PositionType sx READ sx WRITE setSx)
    Q_PROPERTY(PositionType sy READ sy WRITE setSy)

public:
    explicit TransformScale(BasicObject *pParent = 0);

    virtual ~TransformScale() {}

    virtual bool renderIn(RenderingContext &pContext);
    virtual bool renderOut(RenderingContext &);

    void setSx(PositionType pSx) { mSx = pSx; }
    PositionType sx(){return mSx;}
    double getSx() {return mSx.getValue();}

    void setSy(PositionType pSy) { mSy = pSy; }
    PositionType sy() { return mSy; }
    double getSy() {return mSy.getValue();}    

    static const char *CLASS_NAME;

private:
    PositionType mSx;
    PositionType mSy;

};

} /* namespace AP2I */

#endif // TRANSFORMSCALE_H
