package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import bp0.k;
import com.swiggy.locationplatform.centraladdressservice.v1.InstructionUpdate;
import in.swiggy.android.tejas.feature.address.model.PostableUpdateAddress;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: PartialUpdateTransformerUtils.kt */
final class PartialUpdateTransformerUtilsKt$getInstructionUpdateEvent$1$1 extends Lambda implements p<String, String, k> {
    final /* synthetic */ PostableUpdateAddress $address;
    final /* synthetic */ InstructionUpdate.Builder $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PartialUpdateTransformerUtilsKt$getInstructionUpdateEvent$1$1(InstructionUpdate.Builder builder, PostableUpdateAddress postableUpdateAddress) {
        super(2);
        this.$this_apply = builder;
        this.$address = postableUpdateAddress;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return k.f22762a;
    }

    public final void invoke(String str, String str2) {
        kotlin.jvm.internal.p.j(str, "addressId");
        kotlin.jvm.internal.p.j(str2, "d2r");
        this.$this_apply.setId(str);
        this.$this_apply.setInstruction(str2);
        if (this.$address.getVoiceDirectionsUri() != null) {
            this.$this_apply.setVoiceDirectionsS3Uri(this.$address.getVoiceDirectionsUri());
        }
    }
}
