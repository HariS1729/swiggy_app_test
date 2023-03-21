package com.swiggy.delivery.deliverycontroller.shared.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum TaskType implements ProtocolMessageEnum {
    TASK_TYPE_INVALID(0),
    TASK_TYPE_PICK_UP(1),
    TASK_TYPE_DROP(2),
    TASK_TYPE_REPORT(3),
    TASK_TYPE_RETURN(4),
    TASK_TYPE_RTH(5),
    UNRECOGNIZED(-1);
    
    public static final int TASK_TYPE_DROP_VALUE = 2;
    public static final int TASK_TYPE_INVALID_VALUE = 0;
    public static final int TASK_TYPE_PICK_UP_VALUE = 1;
    public static final int TASK_TYPE_REPORT_VALUE = 3;
    public static final int TASK_TYPE_RETURN_VALUE = 4;
    public static final int TASK_TYPE_RTH_VALUE = 5;
    private static final TaskType[] VALUES = null;
    private static final Internal.EnumLiteMap<TaskType> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<TaskType>() {
            public TaskType findValueByNumber(int i11) {
                return TaskType.forNumber(i11);
            }
        };
        VALUES = values();
    }

    private TaskType(int i11) {
        this.value = i11;
    }

    public static TaskType forNumber(int i11) {
        if (i11 == 0) {
            return TASK_TYPE_INVALID;
        }
        if (i11 == 1) {
            return TASK_TYPE_PICK_UP;
        }
        if (i11 == 2) {
            return TASK_TYPE_DROP;
        }
        if (i11 == 3) {
            return TASK_TYPE_REPORT;
        }
        if (i11 == 4) {
            return TASK_TYPE_RETURN;
        }
        if (i11 != 5) {
            return null;
        }
        return TASK_TYPE_RTH;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return SharedProto.getDescriptor().getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<TaskType> internalGetValueMap() {
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
    public static TaskType valueOf(int i11) {
        return forNumber(i11);
    }

    public static TaskType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }
}
