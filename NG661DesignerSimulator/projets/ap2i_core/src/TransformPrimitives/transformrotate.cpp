#include "transformrotate.h"

#include "renderingcontext.h"
extern "C" {
#include "GL/gl.h"
}

namespace AP2I
{

const char *TransformRotate::CLASS_NAME = "TransformRotate";

TransformRotate::TransformRotate(BasicObject *pParent)
    : BasicItem(pParent),
      mCx(0.0F),
      mCy(0.0F),
	  mAngle(0.0F)
{	
    setClassName(CLASS_NAME);
}

bool TransformRotate::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);    

    glTranslatef(cx().getValue(), cy().getValue(), 0.0F);
    glRotatef(angle().getValue(), 0.0F, 0.0F, 1.0F);
    glTranslatef(-cx().getValue(), -cy().getValue(), 0.0F);
    return true;
}

bool TransformRotate::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);
    return true;
}

} /* namespace AP2I */
