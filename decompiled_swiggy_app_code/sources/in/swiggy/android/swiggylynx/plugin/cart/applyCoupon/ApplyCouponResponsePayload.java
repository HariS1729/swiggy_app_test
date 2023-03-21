package in.swiggy.android.swiggylynx.plugin.cart.applyCoupon;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: ApplyCouponResponsePayload.kt */
public final class ApplyCouponResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private String f19021a;

    /* compiled from: ApplyCouponResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<ApplyCouponResponsePayload> serializer() {
            return ApplyCouponResponsePayload$$serializer.INSTANCE;
        }
    }

    public ApplyCouponResponsePayload() {
        this((String) null, 1, (i) null);
    }

    public /* synthetic */ ApplyCouponResponsePayload(int i11, String str, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19021a = "";
        } else {
            this.f19021a = str;
        }
    }

    public static final void a(ApplyCouponResponsePayload applyCouponResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(applyCouponResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && p.e(applyCouponResponsePayload.f19021a, "")) {
            z11 = false;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, a1.f23069b, applyCouponResponsePayload.f19021a);
        }
    }

    public ApplyCouponResponsePayload(String str) {
        this.f19021a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApplyCouponResponsePayload(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? "" : str);
    }
}
