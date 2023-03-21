package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.WrappersProto;
import com.swiggy.delivery.deliverycontroller.shared.v1.SharedProto;
import com.swiggy.locationplatform.centraladdressservice.v1.CentralAddressMessagesProto;
import in.swiggy.android.tejas.oldapi.models.restaurant.RestaurantLabel;

public final class DeliveryInstructorApiProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n4delivery-instructor/v1/delivery_instructor_api.proto\u00128swiggy.delivery.deliverycontroller.deliveryinstructor.v1\u001a+delivery-controller-commons/v1/shared.proto\u001a9central-address-service/v1/central_address_messages.proto\u001a9delivery-instructor/v1/delivery_instructor_messages.proto\u001a\u001egoogle/protobuf/wrappers.proto\"ü\u0002\n#PreOrderEligibleInstructionsRequest\u0012U\n\u0007context\u0018\u0001 \u0001(\u000b2D.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx\u0012_\n\ninstructor\u0018\u0002 \u0001(\u000b2K.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails\u0012R\n\u0007address\u0018\u0003 \u0001(\u000b2A.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddress\u0012I\n\ttask_type\u0018\u0004 \u0001(\u000e26.swiggy.delivery.deliverycontroller.shared.v1.TaskType\"Â\u0002\n$PostOrderEligibleInstructionsRequest\u0012U\n\u0007context\u0018\u0001 \u0001(\u000b2D.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx\u0012\u0017\n\u000fclient_order_id\u0018\u0002 \u0001(\t\u0012_\n\ninstructor\u0018\u0003 \u0001(\u000b2K.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails\u0012I\n\ttask_type\u0018\u0004 \u0001(\u000e26.swiggy.delivery.deliverycontroller.shared.v1.TaskType\"|\n\u0016GetInstructionsRequest\u0012U\n\u0007context\u0018\u0001 \u0001(\u000b2D.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx\u0012\u000b\n\u0003ids\u0018\u0002 \u0003(\t\"\u0001\n\u0017GetInstructionsResponse\u0012[\n\finstructions\u0018\u0001 \u0003(\u000b2E.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction\u0012\u0013\n\u000bstatus_code\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005error\u0018\u0003 \u0001(\t\"å\u0002\n'CreateUpdateInstructionsForOrderRequest\u0012U\n\u0007context\u0018\u0001 \u0001(\u000b2D.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx\u0012\u0017\n\u000fclient_order_id\u0018\u0002 \u0001(\t\u0012^\n\u0007mapping\u0018\u0003 \u0001(\u000b2M.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping\u00124\n\u000epayment_method\u0018\u0004 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00124\n\u000ecas_address_id\u0018\u0005 \u0001(\u000b2\u001c.google.protobuf.StringValue\"N\n(CreateUpdateInstructionsForOrderResponse\u0012\u0013\n\u000bstatus_code\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005error\u0018\u0002 \u0001(\t\"÷\u0001\n$PreOrderEligibleInstructionsResponse\u0012[\n\finstructions\u0018\u0001 \u0003(\u000b2E.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction\u0012\u0013\n\u000bstatus_code\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005error\u0018\u0003 \u0001(\t\u0012N\n\u0005nudge\u0018\u0004 \u0001(\u000b2?.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Nudge\"¨\u0001\n%PostOrderEligibleInstructionsResponse\u0012[\n\finstructions\u0018\u0001 \u0003(\u000b2E.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction\u0012\u0013\n\u000bstatus_code\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005error\u0018\u0003 \u0001(\t\"\u0001\n\u001dGetInstructionsByOrderRequest\u0012U\n\u0007context\u0018\u0001 \u0001(\u000b2D.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx\u0012\u0017\n\u000fclient_order_id\u0018\u0002 \u0001(\t\"¤\u0001\n\u001eGetInstructionsByOrderResponse\u0012^\n\u0007mapping\u0018\u0001 \u0003(\u000b2M.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping\u0012\u0013\n\u000bstatus_code\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005error\u0018\u0003 \u0001(\t2Í\b\n\u0015DeliveryInstructorAPI\u0012Ý\u0001\n\u001cPreOrderEligibleInstructions\u0012].swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsRequest\u001a^.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsResponse\u0012à\u0001\n\u001dPostOrderEligibleInstructions\u0012^.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PostOrderEligibleInstructionsRequest\u001a_.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PostOrderEligibleInstructionsResponse\u0012¶\u0001\n\u000fGetInstructions\u0012P.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsRequest\u001aQ.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsResponse\u0012é\u0001\n CreateUpdateInstructionsForOrder\u0012a.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderRequest\u001ab.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderResponse\u0012Ë\u0001\n\u0016GetInstructionsByOrder\u0012W.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderRequest\u001aX.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderResponseBr\n<com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1B\u001aDeliveryInstructorApiProtoP\u0001Z\u0014deliveryinstructorv1b\u0006proto3"}, new Descriptors.FileDescriptor[]{SharedProto.getDescriptor(), CentralAddressMessagesProto.getDescriptor(), DeliveryInstructorMessagesProto.getDescriptor(), WrappersProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PostOrderEligibleInstructionsRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PostOrderEligibleInstructionsRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PostOrderEligibleInstructionsResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PostOrderEligibleInstructionsResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsResponse_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsRequest_descriptor = descriptor2;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Context", "Instructor", RestaurantLabel.LABEL_TYPE_ADDRESS, "TaskType"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PostOrderEligibleInstructionsRequest_descriptor = descriptor3;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PostOrderEligibleInstructionsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Context", "ClientOrderId", "Instructor", "TaskType"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsRequest_descriptor = descriptor4;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Context", "Ids"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsResponse_descriptor = descriptor5;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Instructions", "StatusCode", "Error"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderRequest_descriptor = descriptor6;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Context", "ClientOrderId", "Mapping", "PaymentMethod", "CasAddressId"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderResponse_descriptor = descriptor7;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"StatusCode", "Error"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsResponse_descriptor = descriptor8;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Instructions", "StatusCode", "Error", "Nudge"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PostOrderEligibleInstructionsResponse_descriptor = descriptor9;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PostOrderEligibleInstructionsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Instructions", "StatusCode", "Error"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderRequest_descriptor = descriptor10;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Context", "ClientOrderId"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderResponse_descriptor = descriptor11;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Mapping", "StatusCode", "Error"});
        SharedProto.getDescriptor();
        CentralAddressMessagesProto.getDescriptor();
        DeliveryInstructorMessagesProto.getDescriptor();
        WrappersProto.getDescriptor();
    }

    private DeliveryInstructorApiProto() {
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
