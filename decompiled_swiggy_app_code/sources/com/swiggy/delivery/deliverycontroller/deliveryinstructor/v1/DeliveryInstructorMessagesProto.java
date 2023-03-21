package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.swiggy.delivery.deliverycontroller.shared.v1.SharedProto;
import com.swiggy.platform.shared.marketplace.v1.MarketplaceProto;

public final class DeliveryInstructorMessagesProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n9delivery-instructor/v1/delivery_instructor_messages.proto\u00128swiggy.delivery.deliverycontroller.deliveryinstructor.v1\u001a+delivery-controller-commons/v1/shared.proto\u001a/bundle-commons/marketplace/v1/marketplace.proto\".\n\tClientCtx\u0012\u000e\n\u0006source\u0018\u0001 \u0001(\t\u0012\u0011\n\tclient_id\u0018\u0002 \u0001(\t\"Ç\u0002\n\nRequestCtx\u0012L\n\u000emarketplace_id\u0018\u0001 \u0001(\u000e24.swiggy.platform.shared.marketplace.v1.MarketPlaceId\u0012L\n\u000fbusinessline_id\u0018\u0002 \u0001(\u000e23.swiggy.platform.shared.marketplace.v1.BusinessLine\u0012D\n\u000bcategory_id\u0018\u0003 \u0001(\u000e2/.swiggy.platform.shared.marketplace.v1.Category\u0012W\n\nclient_ctx\u0018\u0004 \u0001(\u000b2C.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.ClientCtx\"\u0001\n\u0011InstructorDetails\u0012\u0015\n\rinstructor_id\u0018\u0001 \u0001(\t\u0012a\n\u000finstructor_type\u0018\u0002 \u0001(\u000e2H.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorType\"\u0002\n\u0013InstructionsMapping\u0012[\n\finstructions\u0018\u0001 \u0003(\u000b2E.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction\u0012_\n\ninstructor\u0018\u0002 \u0001(\u000b2K.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails\u0012I\n\ttask_type\u0018\u0003 \u0001(\u000e26.swiggy.delivery.deliverycontroller.shared.v1.TaskType\"×\u0003\n\u000bInstruction\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\r\n\u0005title\u0018\u0002 \u0001(\t\u0012\u001b\n\u0013instruction_summary\u0018\u0003 \u0001(\t\u0012\u0017\n\u000finstructor_text\u0018\u0004 \u0001(\t\u0012\u0011\n\tpreferred\u0018\u0005 \u0001(\b\u0012\u0010\n\bselected\u0018\u0006 \u0001(\b\u0012$\n\u001cincompatible_instruction_ids\u0018\u0007 \u0003(\t\u0012\u001a\n\u0012active_icon_url_id\u0018\b \u0001(\t\u0012\u001c\n\u0014inactive_icon_url_id\u0018\t \u0001(\t\u0012\u0018\n\u0010conditional_text\u0018\n \u0001(\t\u0012\u0010\n\beligible\u0018\u000b \u0001(\b\u0012W\n\u0004type\u0018\f \u0001(\u000e2I.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionType\u0012\u0012\n\nrider_text\u0018\r \u0001(\t\u0012Y\n\u0005stage\u0018\u000e \u0001(\u000e2J.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionStage\"{\n\u001cSelectedDeliveryInstructions\u0012[\n\finstructions\u0018\u0001 \u0003(\u000b2E.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction\"9\n\u0005Nudge\u0012\u000e\n\u0006enable\u0018\u0001 \u0001(\b\u0012\f\n\u0004text\u0018\u0002 \u0001(\t\u0012\u0012\n\nimg_url_id\u0018\u0003 \u0001(\t*Ø\u0001\n\u000eInstructorType\u0012\u001b\n\u0017INSTRUCTOR_TYPE_INVALID\u0010\u0000\u0012\u001c\n\u0018INSTRUCTOR_TYPE_CUSTOMER\u0010\u0001\u0012\u0019\n\u0015INSTRUCTOR_TYPE_STORE\u0010\u0002\u0012\u001e\n\u001aINSTRUCTOR_TYPE_RESTAURANT\u0010\u0003\u0012$\n INSTRUCTOR_TYPE_SWIGGY_WAREHOUSE\u0010\u0004\u0012*\n&INSTRUCTOR_TYPE_SWIGGY_INTERNAL_SYSTEM\u0010\u0005*Ï\u0001\n\u000fInstructionType\u0012\u001c\n\u0018INSTRUCTION_TYPE_INVALID\u0010\u0000\u0012\u001a\n\u0016INSTRUCTION_TYPE_REACH\u0010\u0001\u0012\u001b\n\u0017INSTRUCTION_TYPE_CUSTOM\u0010\u0002\u0012%\n!INSTRUCTION_TYPE_DROP_AT_SECURITY\u0010\u0003\u0012!\n\u001dINSTRUCTION_TYPE_DROP_AT_DOOR\u0010\u0004\u0012\u001b\n\u0017INSTRUCTION_TYPE_OTHERS\u0010\u0005*\u0001\n\u0010InstructionStage\u0012\u001d\n\u0019INSTRUCTION_STAGE_INVALID\u0010\u0000\u0012!\n\u001dINSTRUCTION_STAGE_PRE_ARRIVAL\u0010\u0001\u0012\"\n\u001eINSTRUCTION_STAGE_POST_ARRIVAL\u0010\u0002\u0012%\n!INSTRUCTION_STAGE_POST_COMPLETION\u0010\u0003Bw\n<com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1B\u001fDeliveryInstructorMessagesProtoP\u0001Z\u0014deliveryinstructorv1b\u0006proto3"}, new Descriptors.FileDescriptor[]{SharedProto.getDescriptor(), MarketplaceProto.c()});
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_ClientCtx_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_ClientCtx_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Instruction_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Instruction_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructionsMapping_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructionsMapping_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructorDetails_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructorDetails_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Nudge_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Nudge_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_RequestCtx_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_RequestCtx_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_SelectedDeliveryInstructions_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_SelectedDeliveryInstructions_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_ClientCtx_descriptor = descriptor2;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_ClientCtx_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Source", "ClientId"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_RequestCtx_descriptor = descriptor3;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_RequestCtx_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"MarketplaceId", "BusinesslineId", "CategoryId", "ClientCtx"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructorDetails_descriptor = descriptor4;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructorDetails_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"InstructorId", "InstructorType"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructionsMapping_descriptor = descriptor5;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructionsMapping_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Instructions", "Instructor", "TaskType"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Instruction_descriptor = descriptor6;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Instruction_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Id", "Title", "InstructionSummary", "InstructorText", "Preferred", "Selected", "IncompatibleInstructionIds", "ActiveIconUrlId", "InactiveIconUrlId", "ConditionalText", "Eligible", "Type", "RiderText", "Stage"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_SelectedDeliveryInstructions_descriptor = descriptor7;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_SelectedDeliveryInstructions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Instructions"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Nudge_descriptor = descriptor8;
        internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Nudge_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Enable", "Text", "ImgUrlId"});
        SharedProto.getDescriptor();
        MarketplaceProto.c();
    }

    private DeliveryInstructorMessagesProto() {
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
