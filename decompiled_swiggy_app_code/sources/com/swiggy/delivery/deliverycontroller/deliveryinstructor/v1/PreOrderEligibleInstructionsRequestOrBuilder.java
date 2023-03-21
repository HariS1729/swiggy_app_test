package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.MessageOrBuilder;
import com.swiggy.delivery.deliverycontroller.shared.v1.TaskType;
import com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddress;
import com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddressOrBuilder;

public interface PreOrderEligibleInstructionsRequestOrBuilder extends MessageOrBuilder {
    EnrichedAddress getAddress();

    EnrichedAddressOrBuilder getAddressOrBuilder();

    RequestCtx getContext();

    RequestCtxOrBuilder getContextOrBuilder();

    InstructorDetails getInstructor();

    InstructorDetailsOrBuilder getInstructorOrBuilder();

    TaskType getTaskType();

    int getTaskTypeValue();

    boolean hasAddress();

    boolean hasContext();

    boolean hasInstructor();
}
