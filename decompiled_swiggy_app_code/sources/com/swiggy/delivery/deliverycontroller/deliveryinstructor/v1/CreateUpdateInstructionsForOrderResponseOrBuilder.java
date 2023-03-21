package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface CreateUpdateInstructionsForOrderResponseOrBuilder extends MessageOrBuilder {
    String getError();

    ByteString getErrorBytes();

    int getStatusCode();
}
