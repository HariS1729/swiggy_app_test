package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum InstructionType implements ProtocolMessageEnum {
    INSTRUCTION_TYPE_INVALID(0),
    INSTRUCTION_TYPE_REACH(1),
    INSTRUCTION_TYPE_CUSTOM(2),
    INSTRUCTION_TYPE_DROP_AT_SECURITY(3),
    INSTRUCTION_TYPE_DROP_AT_DOOR(4),
    INSTRUCTION_TYPE_OTHERS(5),
    UNRECOGNIZED(-1);
    
    public static final int INSTRUCTION_TYPE_CUSTOM_VALUE = 2;
    public static final int INSTRUCTION_TYPE_DROP_AT_DOOR_VALUE = 4;
    public static final int INSTRUCTION_TYPE_DROP_AT_SECURITY_VALUE = 3;
    public static final int INSTRUCTION_TYPE_INVALID_VALUE = 0;
    public static final int INSTRUCTION_TYPE_OTHERS_VALUE = 5;
    public static final int INSTRUCTION_TYPE_REACH_VALUE = 1;
    private static final InstructionType[] VALUES = null;
    private static final Internal.EnumLiteMap<InstructionType> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<InstructionType>() {
            public InstructionType findValueByNumber(int i11) {
                return InstructionType.forNumber(i11);
            }
        };
        VALUES = values();
    }

    private InstructionType(int i11) {
        this.value = i11;
    }

    public static InstructionType forNumber(int i11) {
        if (i11 == 0) {
            return INSTRUCTION_TYPE_INVALID;
        }
        if (i11 == 1) {
            return INSTRUCTION_TYPE_REACH;
        }
        if (i11 == 2) {
            return INSTRUCTION_TYPE_CUSTOM;
        }
        if (i11 == 3) {
            return INSTRUCTION_TYPE_DROP_AT_SECURITY;
        }
        if (i11 == 4) {
            return INSTRUCTION_TYPE_DROP_AT_DOOR;
        }
        if (i11 != 5) {
            return null;
        }
        return INSTRUCTION_TYPE_OTHERS;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return DeliveryInstructorMessagesProto.getDescriptor().getEnumTypes().get(1);
    }

    public static Internal.EnumLiteMap<InstructionType> internalGetValueMap() {
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
    public static InstructionType valueOf(int i11) {
        return forNumber(i11);
    }

    public static InstructionType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }
}
