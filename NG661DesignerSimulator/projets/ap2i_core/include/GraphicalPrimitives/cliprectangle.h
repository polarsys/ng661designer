#ifndef CLIPRECTANGLE_H
#define CLIPRECTANGLE_H

#include "rectangle.h"

namespace AP2I
{

class ClipRectangle : public Rectangle
{
public:
    ClipRectangle(BasicObject *pParent = 0);
    virtual ~ClipRectangle() {}

    virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut();
    virtual void    createPrimitive(RenderingContext &pContext);

    static const char *CLASS_NAME;
};

} /* namespace AP2I */

#endif // CLIPRECTANGLE_H
