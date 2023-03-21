package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface NudgeOrBuilder extends MessageOrBuilder {
    boolean getEnable();

    String getImgUrlId();

    ByteString getImgUrlIdBytes();

    String getText();

    ByteString getTextBytes();
}
