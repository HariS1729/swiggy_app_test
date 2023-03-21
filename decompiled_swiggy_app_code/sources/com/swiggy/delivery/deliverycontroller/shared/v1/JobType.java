package com.swiggy.delivery.deliverycontroller.shared.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum JobType implements ProtocolMessageEnum {
    JOB_TYPE_INVALID(0),
    JOB_TYPE_BUY(1),
    JOB_TYPE_PUDO(2),
    JOB_TYPE_FOOD_PLATFORM(3),
    JOB_TYPE_REPORT(4),
    JOB_TYPE_RETURN(5),
    JOB_TYPE_RTH(6),
    UNRECOGNIZED(-1);
    
    public static final int JOB_TYPE_BUY_VALUE = 1;
    public static final int JOB_TYPE_FOOD_PLATFORM_VALUE = 3;
    public static final int JOB_TYPE_INVALID_VALUE = 0;
    public static final int JOB_TYPE_PUDO_VALUE = 2;
    public static final int JOB_TYPE_REPORT_VALUE = 4;
    public static final int JOB_TYPE_RETURN_VALUE = 5;
    public static final int JOB_TYPE_RTH_VALUE = 6;
    private static final JobType[] VALUES = null;
    private static final Internal.EnumLiteMap<JobType> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<JobType>() {
            public JobType findValueByNumber(int i11) {
                return JobType.forNumber(i11);
            }
        };
        VALUES = values();
    }

    private JobType(int i11) {
        this.value = i11;
    }

    public static JobType forNumber(int i11) {
        switch (i11) {
            case 0:
                return JOB_TYPE_INVALID;
            case 1:
                return JOB_TYPE_BUY;
            case 2:
                return JOB_TYPE_PUDO;
            case 3:
                return JOB_TYPE_FOOD_PLATFORM;
            case 4:
                return JOB_TYPE_REPORT;
            case 5:
                return JOB_TYPE_RETURN;
            case 6:
                return JOB_TYPE_RTH;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return SharedProto.getDescriptor().getEnumTypes().get(1);
    }

    public static Internal.EnumLiteMap<JobType> internalGetValueMap() {
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
    public static JobType valueOf(int i11) {
        return forNumber(i11);
    }

    public static JobType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }
}
