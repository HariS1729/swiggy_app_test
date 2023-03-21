package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum InstructionStage implements ProtocolMessageEnum {
    INSTRUCTION_STAGE_INVALID(0),
    INSTRUCTION_STAGE_PRE_ARRIVAL(1),
    INSTRUCTION_STAGE_POST_ARRIVAL(2),
    INSTRUCTION_STAGE_POST_COMPLETION(3),
    UNRECOGNIZED(-1);
    
    public static final int INSTRUCTION_STAGE_INVALID_VALUE = 0;
    public static final int INSTRUCTION_STAGE_POST_ARRIVAL_VALUE = 2;
    public static final int INSTRUCTION_STAGE_POST_COMPLETION_VALUE = 3;
    public static final int INSTRUCTION_STAGE_PRE_ARRIVAL_VALUE = 1;
    private static final InstructionStage[] VALUES = null;
    private static final Internal.EnumLiteMap<InstructionStage> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<InstructionStage>() {
            public InstructionStage findValueByNumber(int i11) {
                return InstructionStage.forNumber(i11);
            }
        };
        VALUES = values();
    }

    private InstructionStage(int i11) {
        this.value = i11;
    }

    public static InstructionStage forNumber(int i11) {
        if (i11 == 0) {
            return INSTRUCTION_STAGE_INVALID;
        }
        if (i11 == 1) {
            return INSTRUCTION_STAGE_PRE_ARRIVAL;
        }
        if (i11 == 2) {
            return INSTRUCTION_STAGE_POST_ARRIVAL;
        }
        if (i11 != 3) {
            return null;
        }
        return INSTRUCTION_STAGE_POST_COMPLETION;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return DeliveryInstructorMessagesProto.getDescriptor().getEnumTypes().get(2);
    }

    public static Internal.EnumLiteMap<InstructionStage> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
    }

    @Deprecated
    public static InstructionStage valueOf(int i11) {
        return forNumber(i11);
    }

    public static InstructionStage valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }
}
