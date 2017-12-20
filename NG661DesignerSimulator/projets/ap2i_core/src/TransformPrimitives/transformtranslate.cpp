#include "Transformtranslate.h"

#include "renderingcontext.h"
extern "C" {
#include "GL/gl.h"
}

namespace AP2I
{

const char *TransformTranslate::CLASS_NAME = "TransformTranslate";

TransformTranslate::TransformTranslate(BasicObject *pParent)
    : BasicItem(pParent),
      mTx(0.0F),
      mTy(0.0F)
{        
    setClassName(CLASS_NAME);
}

bool TransformTranslate::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);    
    glTranslatef(pContext.currentX() + getTx(), pContext.currentY() + getTy(), 0.0F);

    return true;
}

bool TransformTranslate::renderOut(RenderingContext &pContext)
{
    BasicItem::renderOut(pContext);
    return true;
}

} /* namespace AP2I */
