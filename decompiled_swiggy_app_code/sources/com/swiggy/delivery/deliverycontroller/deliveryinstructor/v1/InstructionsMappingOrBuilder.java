package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.MessageOrBuilder;
import com.swiggy.delivery.deliverycontroller.shared.v1.TaskType;
import java.util.List;

public interface InstructionsMappingOrBuilder extends MessageOrBuilder {
    Instruction getInstructions(int i11);

    int getInstructionsCount();

    List<Instruction> getInstructionsList();

    InstructionOrBuilder getInstructionsOrBuilder(int i11);

    List<? extends InstructionOrBuilder> getInstructionsOrBuilderList();

    InstructorDetails getInstructor();

    InstructorDetailsOrBuilder getInstructorOrBuilder();

    TaskType getTaskType();

    int getTaskTypeValue();

    boolean hasInstructor();
}
