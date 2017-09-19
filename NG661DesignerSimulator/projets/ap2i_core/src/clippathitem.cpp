#include "clippathitem.h"

#include "renderingcontext.h"
extern "C" {
#include "GL/gl.h"
}


namespace AP2I
{
	
const char *ClipPathItem::CLASS_NAME = "ClipPathItem";

ClipPathItem::ClipPathItem(BasicObject *pParent)
    : BasicItem(pParent)
{
	 setClassName(CLASS_NAME);
}

bool ClipPathItem::renderIn(RenderingContext &pContext)
{
    BasicItem::renderIn(pContext);
    //vgSetiv(VG_SCISSOR_RECTS, 0, NULL);
    return true;
}

bool ClipPathItem::renderOut()
{
    return true;
}


} /* namespace AP2I */
