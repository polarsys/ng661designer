#include "transformskew.h"

#include "renderingcontext.h"
extern "C" {
#include "GL/gl.h"
}

namespace AP2I
{

const char *TransformSkew::CLASS_NAME = "TransformSkew";

TransformSkew::TransformSkew(BasicObject *pParent, SkewTypeEnum pSkewType)
	: BasicItem(pParent),      
	  mAngle(0.0F)
{	
    setClassName(CLASS_NAME);
    mSkewType = pSkewType;
}

bool TransformSkew::renderIn(RenderingContext &pContext)
{
	BasicItem::renderIn(pContext);        

    double lTan = tan(getAngle());

    if (getSkewType() == SKEWX)
    {
        GLdouble lSkew[16] = {1,lTan,0,0,0,1,0,0,0,0,1,0,0,0,0,1};
        glMultMatrixd(lSkew);
    }
    else
    {
        GLdouble lSkew[16] = {1,0,0,0,lTan,1,0,0,0,0,1,0,0,0,0,1};
        glMultMatrixd(lSkew);
    }

	return true;
}

bool TransformSkew::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);
    return true;
}


} /* namespace AP2I */
