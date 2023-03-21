package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import com.swiggy.locationplatform.centraladdressservice.v1.InstructionUpdate;
import com.swiggy.locationplatform.centraladdressservice.v1.UpdateAddressEvent;
import com.swiggy.locationplatform.centraladdressservice.v1.UpdateEvent;
import com.swiggy.locationplatform.centraladdressservice.v1.UpdateType;
import in.swiggy.android.tejas.feature.address.model.PostableUpdateAddress;
import in.swiggy.android.tejas.feature.address.model.UpdateAddress;
import js.c;
import kotlin.jvm.internal.p;

/* compiled from: PartialUpdateTransformerUtils.kt */
public final class PartialUpdateTransformerUtilsKt {

    /* compiled from: PartialUpdateTransformerUtils.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateType.values().length];
            iArr[UpdateType.UPDATE_TYPE_INSTRUCTION.ordinal()] = 1;
            iArr[UpdateType.UPDATE_TYPE_INVALID.ordinal()] = 2;
            iArr[UpdateType.UNRECOGNIZED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final UpdateEvent getAddressUpdateEvent(UpdateType updateType, PostableUpdateAddress postableUpdateAddress) {
        UpdateEvent.Builder newBuilder = UpdateEvent.newBuilder();
        newBuilder.setType(updateType);
        if (WhenMappings.$EnumSwitchMapping$0[updateType.ordinal()] == 1) {
            newBuilder.setInstructionUpdate(getInstructionUpdateEvent(postableUpdateAddress));
        }
        UpdateEvent build = newBuilder.build();
        p.i(build, "eventBuilder.build()");
        return build;
    }

    private static final InstructionUpdate getInstructionUpdateEvent(PostableUpdateAddress postableUpdateAddress) {
        InstructionUpdate.Builder newBuilder = InstructionUpdate.newBuilder();
        c.o(postableUpdateAddress.getAddressId(), postableUpdateAddress.getDirectionsToReach(), new PartialUpdateTransformerUtilsKt$getInstructionUpdateEvent$1$1(newBuilder, postableUpdateAddress));
        return newBuilder.build();
    }

    public static final UpdateAddressEvent getPartialUpdateEvent(UpdateAddress updateAddress) {
        p.j(updateAddress, "<this>");
        String userId = updateAddress.getAddress().getUserId();
        UpdateAddressEvent.Builder newBuilder = UpdateAddressEvent.newBuilder();
        newBuilder.setEntityCtx(AddressTranformerUtilsKt.getEntityCtx(userId));
        newBuilder.setRequestCtx(AddressTranformerUtilsKt.getRequestCtx(updateAddress.getAddress().getLaunchSource()));
        newBuilder.setAddressUpdateEvent(getAddressUpdateEvent(updateAddress.getUpdateType(), updateAddress.getAddress()));
        UpdateAddressEvent build = newBuilder.build();
        p.i(build, "partialUpdateBuilder.build()");
        return build;
    }
}
