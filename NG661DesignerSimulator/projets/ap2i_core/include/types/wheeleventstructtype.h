#ifndef WHEELEVENTSTRUCTTYPE_H
#define WHEELEVENTSTRUCTTYPE_H

#include <QObject>
#include "integertype.h"

namespace AP2I
{

class WheelEventStructType : public QObject
{
	Q_OBJECT
	Q_PROPERTY(IntegerType nbOfIncrement READ nbOfIncrement WRITE setNbOfIncrement)
public:
    WheelEventStructType();
	virtual ~WheelEventStructType() {}
    void setNbOfIncrement(IntegerType pNbOfIncrement){mNbOfIncrement = pNbOfIncrement;}
    IntegerType nbOfIncrement(){return mNbOfIncrement;}
    double getNbOfIncrement() {return mNbOfIncrement.getValue();}
private:
    IntegerType mNbOfIncrement;
};

} /* namespace AP2I */

#endif // WHEELEVENTSTRUCTTYPE_H
