package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum InstructorType implements ProtocolMessageEnum {
    INSTRUCTOR_TYPE_INVALID(0),
    INSTRUCTOR_TYPE_CUSTOMER(1),
    INSTRUCTOR_TYPE_STORE(2),
    INSTRUCTOR_TYPE_RESTAURANT(3),
    INSTRUCTOR_TYPE_SWIGGY_WAREHOUSE(4),
    INSTRUCTOR_TYPE_SWIGGY_INTERNAL_SYSTEM(5),
    UNRECOGNIZED(-1);
    
    public static final int INSTRUCTOR_TYPE_CUSTOMER_VALUE = 1;
    public static final int INSTRUCTOR_TYPE_INVALID_VALUE = 0;
    public static final int INSTRUCTOR_TYPE_RESTAURANT_VALUE = 3;
    public static final int INSTRUCTOR_TYPE_STORE_VALUE = 2;
    public static final int INSTRUCTOR_TYPE_SWIGGY_INTERNAL_SYSTEM_VALUE = 5;
    public static final int INSTRUCTOR_TYPE_SWIGGY_WAREHOUSE_VALUE = 4;
    private static final InstructorType[] VALUES = null;
    private static final Internal.EnumLiteMap<InstructorType> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<InstructorType>() {
            public InstructorType findValueByNumber(int i11) {
                return InstructorType.forNumber(i11);
            }
        };
        VALUES = values();
    }

    private InstructorType(int i11) {
        this.value = i11;
    }

    public static InstructorType forNumber(int i11) {
        if (i11 == 0) {
            return INSTRUCTOR_TYPE_INVALID;
        }
        if (i11 == 1) {
            return INSTRUCTOR_TYPE_CUSTOMER;
        }
        if (i11 == 2) {
            return INSTRUCTOR_TYPE_STORE;
        }
        if (i11 == 3) {
            return INSTRUCTOR_TYPE_RESTAURANT;
        }
        if (i11 == 4) {
            return INSTRUCTOR_TYPE_SWIGGY_WAREHOUSE;
        }
        if (i11 != 5) {
            return null;
        }
        return INSTRUCTOR_TYPE_SWIGGY_INTERNAL_SYSTEM;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return DeliveryInstructorMessagesProto.getDescriptor().getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<InstructorType> internalGetValueMap() {
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
    public static InstructorType valueOf(int i11) {
        return forNumber(i11);
    }

    public static InstructorType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }
}
