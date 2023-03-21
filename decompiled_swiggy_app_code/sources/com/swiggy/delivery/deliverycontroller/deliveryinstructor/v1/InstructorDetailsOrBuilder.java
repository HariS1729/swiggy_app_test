package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface InstructorDetailsOrBuilder extends MessageOrBuilder {
    String getInstructorId();

    ByteString getInstructorIdBytes();

    InstructorType getInstructorType();

    int getInstructorTypeValue();
}
