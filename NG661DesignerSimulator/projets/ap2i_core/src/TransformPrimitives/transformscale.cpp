#include "transformscale.h"

#include "renderingcontext.h"
extern "C" {
#include "GL/gl.h"
}

namespace AP2I
{

const char *TransformScale::CLASS_NAME = "TransformScale";

TransformScale::TransformScale(BasicObject *pParent)
    : BasicItem(pParent),
      mSx(1.0F),
      mSy(1.0F)
{        
    setClassName(CLASS_NAME);
}

bool TransformScale::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);    
    glScalef(getSx(), getSy(), 1.0F);

    return true;
}

bool TransformScale::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);
    return true;
}

} /* namespace AP2I */
