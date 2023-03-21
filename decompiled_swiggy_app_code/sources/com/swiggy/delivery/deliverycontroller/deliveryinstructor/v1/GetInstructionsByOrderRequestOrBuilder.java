package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface GetInstructionsByOrderRequestOrBuilder extends MessageOrBuilder {
    String getClientOrderId();

    ByteString getClientOrderIdBytes();

    RequestCtx getContext();

    RequestCtxOrBuilder getContextOrBuilder();

    boolean hasContext();
}
