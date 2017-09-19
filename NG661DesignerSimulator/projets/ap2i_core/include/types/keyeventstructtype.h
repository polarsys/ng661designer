#ifndef KEYEVENTSTRUCTTYPE_H
#define KEYEVENTSTRUCTTYPE_H

#include <QObject>
#include "integertype.h"
#include "booleantype.h"
#include "stringtype.h"

namespace AP2I
{

class KeyEventStructType : public QObject
{
    Q_OBJECT
    Q_PROPERTY(IntegerType keycode READ keycode WRITE setKeycode)
    Q_PROPERTY(StringType character READ character WRITE setCharacter)
    Q_PROPERTY(IntegerType functionKeycode READ functionKeycode WRITE setFunctionKeycode)
    Q_PROPERTY(IntegerType deadKeycode READ deadKeycode WRITE setDeadKeycode)
    Q_PROPERTY(IntegerType repeat READ repeat WRITE setRepeat)
    Q_PROPERTY(BooleanType previousState READ previousState WRITE setPreviousState)
    Q_PROPERTY(BooleanType pressed READ pressed WRITE setPressed)

public:
    KeyEventStructType();
    virtual ~KeyEventStructType() {}

    void setKeycode(IntegerType pKeycode){mKeycode = pKeycode;}
    IntegerType keycode(){return mKeycode;}
    double getKeycode() {return mKeycode.getValue();}

    void setCharacter(StringType pCharacter){mCharacter = pCharacter;}
    StringType character(){return mCharacter;}
    std::string getCharacter() {return mCharacter.getValue();}

    void setFunctionKeycode(IntegerType pFunctionKeycode){mFunctionKeycode = pFunctionKeycode;}
    IntegerType functionKeycode(){return mFunctionKeycode;}
    double getFunctionKeycode() {return mFunctionKeycode.getValue();}

    void setDeadKeycode(IntegerType pDeadKeycode){mDeadKeycode = pDeadKeycode;}
    IntegerType deadKeycode(){return mDeadKeycode;}
    double getdeadKeycode() {return mDeadKeycode.getValue();}

    void setRepeat(IntegerType pRepeat){mRepeat = pRepeat;}
    IntegerType repeat(){return mRepeat;}
    double getRepeat() {return mRepeat.getValue();}

    void setPreviousState(BooleanType pPreviousState){mPreviousState = pPreviousState;}
    BooleanType previousState(){return mPreviousState;}
    bool getPreviousState() {return mPreviousState.value();}

    void setPressed(BooleanType pPressed){mPressed = pPressed;}
    BooleanType pressed(){return mPressed;}
    bool getPressed() {return mPressed.value();}

private:
    IntegerType mKeycode;
    StringType mCharacter;
    IntegerType mFunctionKeycode;
    IntegerType mDeadKeycode;
    IntegerType mRepeat;
    BooleanType mPreviousState;
    BooleanType mPressed;

};

} /* namespace AP2I */

//Q_DECLARE_METATYPE(AP2I::KeyEventStructType)

#endif // KEYEVENTSTRUCTTYPE_H
