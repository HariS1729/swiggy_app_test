package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface GetInstructionsRequestOrBuilder extends MessageOrBuilder {
    RequestCtx getContext();

    RequestCtxOrBuilder getContextOrBuilder();

    String getIds(int i11);

    ByteString getIdsBytes(int i11);

    int getIdsCount();

    List<String> getIdsList();

    boolean hasContext();
}
