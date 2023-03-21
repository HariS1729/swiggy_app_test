package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.StringValue;
import com.google.protobuf.StringValueOrBuilder;

public interface CreateUpdateInstructionsForOrderRequestOrBuilder extends MessageOrBuilder {
    StringValue getCasAddressId();

    StringValueOrBuilder getCasAddressIdOrBuilder();

    String getClientOrderId();

    ByteString getClientOrderIdBytes();

    RequestCtx getContext();

    RequestCtxOrBuilder getContextOrBuilder();

    InstructionsMapping getMapping();

    InstructionsMappingOrBuilder getMappingOrBuilder();

    StringValue getPaymentMethod();

    StringValueOrBuilder getPaymentMethodOrBuilder();

    boolean hasCasAddressId();

    boolean hasContext();

    boolean hasMapping();

    boolean hasPaymentMethod();
}
