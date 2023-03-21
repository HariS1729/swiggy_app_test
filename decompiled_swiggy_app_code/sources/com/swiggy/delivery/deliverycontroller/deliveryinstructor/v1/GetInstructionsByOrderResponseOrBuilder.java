package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface GetInstructionsByOrderResponseOrBuilder extends MessageOrBuilder {
    String getError();

    ByteString getErrorBytes();

    InstructionsMapping getMapping(int i11);

    int getMappingCount();

    List<InstructionsMapping> getMappingList();

    InstructionsMappingOrBuilder getMappingOrBuilder(int i11);

    List<? extends InstructionsMappingOrBuilder> getMappingOrBuilderList();

    int getStatusCode();
}
