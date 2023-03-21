package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ClientCtxOrBuilder extends MessageOrBuilder {
    String getClientId();

    ByteString getClientIdBytes();

    String getSource();

    ByteString getSourceBytes();
}
