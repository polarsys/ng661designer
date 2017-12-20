#ifndef TRANSFORMTRANSLATE_H
#define TRANSFORMTRANSLATE_H

#include "basicitem.h"
#include "transformitem.h"
#include "positiontype.h"
#include <QMetaType>

namespace AP2I
{

class TransformTranslate : public BasicItem
{
    Q_OBJECT

    Q_PROPERTY(PositionType tx READ tx WRITE setTx)
    Q_PROPERTY(PositionType ty READ ty WRITE setTy)

public:
    explicit TransformTranslate(BasicObject *pParent = 0);

    virtual ~TransformTranslate() {}

    virtual bool renderIn(RenderingContext &pContext);
    virtual bool renderOut(RenderingContext &);

    void setTx(PositionType pTx) { mTx = pTx; }
    PositionType tx(){return mTx;}
    double getTx() {return mTx.getValue();}

    void setTy(PositionType pTy) { mTy = pTy; }
    PositionType ty() { return mTy; }
    double getTy() {return mTy.getValue();}    

    static const char *CLASS_NAME;

private:
    PositionType mTx;
    PositionType mTy;

};

} /* namespace AP2I */

#endif // TRANSFORMTRANSLATE_H
