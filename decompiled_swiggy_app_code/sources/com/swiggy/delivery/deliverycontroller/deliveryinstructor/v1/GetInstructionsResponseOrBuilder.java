package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface GetInstructionsResponseOrBuilder extends MessageOrBuilder {
    String getError();

    ByteString getErrorBytes();

    Instruction getInstructions(int i11);

    int getInstructionsCount();

    List<Instruction> getInstructionsList();

    InstructionOrBuilder getInstructionsOrBuilder(int i11);

    List<? extends InstructionOrBuilder> getInstructionsOrBuilderList();

    int getStatusCode();
}
