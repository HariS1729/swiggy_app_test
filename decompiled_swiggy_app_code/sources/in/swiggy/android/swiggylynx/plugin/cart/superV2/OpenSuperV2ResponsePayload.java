package in.swiggy.android.swiggylynx.plugin.cart.superV2;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: OpenSuperV2ResponsePayload.kt */
public final class OpenSuperV2ResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private String f19048a;

    /* compiled from: OpenSuperV2ResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<OpenSuperV2ResponsePayload> serializer() {
            return OpenSuperV2ResponsePayload$$serializer.INSTANCE;
        }
    }

    public OpenSuperV2ResponsePayload() {
        this((String) null, 1, (i) null);
    }

    public /* synthetic */ OpenSuperV2ResponsePayload(int i11, String str, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19048a = "";
        } else {
            this.f19048a = str;
        }
    }

    public static final void a(OpenSuperV2ResponsePayload openSuperV2ResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(openSuperV2ResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && p.e(openSuperV2ResponsePayload.f19048a, "")) {
            z11 = false;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, a1.f23069b, openSuperV2ResponsePayload.f19048a);
        }
    }

    public OpenSuperV2ResponsePayload(String str) {
        this.f19048a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OpenSuperV2ResponsePayload(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? "" : str);
    }
}
