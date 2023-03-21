package com.swiggy.delivery.deliverycontroller.shared.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;

public final class SharedProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n+delivery-controller-commons/v1/shared.proto\u0012,swiggy.delivery.deliverycontroller.shared.v1*\u0001\n\bTaskType\u0012\u0015\n\u0011TASK_TYPE_INVALID\u0010\u0000\u0012\u0015\n\u0011TASK_TYPE_PICK_UP\u0010\u0001\u0012\u0012\n\u000eTASK_TYPE_DROP\u0010\u0002\u0012\u0014\n\u0010TASK_TYPE_REPORT\u0010\u0003\u0012\u0014\n\u0010TASK_TYPE_RETURN\u0010\u0004\u0012\u0011\n\rTASK_TYPE_RTH\u0010\u0005*\u0001\n\u0007JobType\u0012\u0014\n\u0010JOB_TYPE_INVALID\u0010\u0000\u0012\u0010\n\fJOB_TYPE_BUY\u0010\u0001\u0012\u0011\n\rJOB_TYPE_PUDO\u0010\u0002\u0012\u001a\n\u0016JOB_TYPE_FOOD_PLATFORM\u0010\u0003\u0012\u0013\n\u000fJOB_TYPE_REPORT\u0010\u0004\u0012\u0013\n\u000fJOB_TYPE_RETURN\u0010\u0005\u0012\u0010\n\fJOB_TYPE_RTH\u0010\u0006BK\n0com.swiggy.delivery.deliverycontroller.shared.v1B\u000bSharedProtoP\u0001Z\bsharedv1b\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    private SharedProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
