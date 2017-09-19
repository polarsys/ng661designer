#include "keyeventstructtype.h"

namespace AP2I
{

KeyEventStructType::KeyEventStructType()
{    
    mKeycode = 0;
    mCharacter = "";
    mFunctionKeycode = 0;
    mDeadKeycode = 0;
    mRepeat = 0;
    mPreviousState = false;
    mPressed = false;
}

} /* namespace AP2I */
