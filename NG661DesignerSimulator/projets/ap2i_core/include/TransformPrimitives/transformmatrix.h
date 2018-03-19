#ifndef TRANSFORMMATRIX_H
#define TRANSFORMMATRIX_H

#include "basicitem.h"
#include "doubletype.h"
#include <QMetaType>
#include "vg/openvg.h"

namespace AP2I
{

class TransformMatrix : public BasicItem
{
    Q_OBJECT

    Q_PROPERTY(DoubleType a READ a WRITE setA)
    Q_PROPERTY(DoubleType b READ b WRITE setB)
    Q_PROPERTY(DoubleType c READ c WRITE setC)
    Q_PROPERTY(DoubleType d READ d WRITE setD)
    Q_PROPERTY(DoubleType e READ e WRITE setE)
    Q_PROPERTY(DoubleType f READ f WRITE setF)

public:
    explicit TransformMatrix(BasicObject *pParent = 0);
    virtual ~TransformMatrix() {}
	virtual bool renderIn(RenderingContext &pContext);
    virtual bool renderOut(RenderingContext &);  
  
    void setA(DoubleType pA) { mA = pA; }
    DoubleType a() { return mA; }
    double getA() {return mA.getValue();}
    void setB(DoubleType pB) { mB = pB; }
    DoubleType b() { return mB; }
    double getB() {return mB.getValue();}
    void setC(DoubleType pC) { mC = pC; }
    DoubleType c() { return mC; }
    double getC() {return mC.getValue();}
    void setD(DoubleType pD) { mD = pD; }
    DoubleType d() { return mD; }
    double getD() {return mD.getValue();}
    void setE(DoubleType pE) { mE = pE; }
    DoubleType e() { return mE; }
    double getE() {return mE.getValue();}
    void setF(DoubleType pF) { mF = pF; }
    DoubleType f() { return mF; }
    double getF() {return mF.getValue();}

	static const char *CLASS_NAME;     

private:
    DoubleType mA;
    DoubleType mB;
    DoubleType mC;
    DoubleType mD;
    DoubleType mE;
    DoubleType mF;
};

} /* namespace AP2I */

#endif // TRANSFORMMATRIX_H
