package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.swiggy.delivery.deliverycontroller.shared.v1.TaskType;

public interface PostOrderEligibleInstructionsRequestOrBuilder extends MessageOrBuilder {
    String getClientOrderId();

    ByteString getClientOrderIdBytes();

    RequestCtx getContext();

    RequestCtxOrBuilder getContextOrBuilder();

    InstructorDetails getInstructor();

    InstructorDetailsOrBuilder getInstructorOrBuilder();

    TaskType getTaskType();

    int getTaskTypeValue();

    boolean hasContext();

    boolean hasInstructor();
}
