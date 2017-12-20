#include "transformmatrix.h"

#include "renderingcontext.h"
extern "C" {
#include "GL/gl.h"
}

namespace AP2I
{

const char *TransformMatrix::CLASS_NAME = "TransformMatrix";



TransformMatrix::TransformMatrix(BasicObject *pParent)
    : BasicItem(pParent),
	mA(0.0F),
	mB(0.0F),
	mC(0.0F),
	mD(0.0F),
	mE(0.0F),
	mF(0.0F)
{
	setClassName(CLASS_NAME);
}

bool TransformMatrix::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);
    GLdouble lMatrix[16] = {getA(),getB(),0,0,getC(),getD(),0,0,getE(),getF(),1,0,0,0,0,1};
    glMultMatrixd(lMatrix);

    return true;
}

bool TransformMatrix::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);
    return true;
}

} /* namespace AP2I */
