package in.swiggy.android.swiggylynx.plugin.dash.phoneContact;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: PhoneResponsePayload.kt */
public final class PhoneResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private String f19123a;

    /* renamed from: b  reason: collision with root package name */
    private String f19124b;

    /* compiled from: PhoneResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<PhoneResponsePayload> serializer() {
            return PhoneResponsePayload$$serializer.INSTANCE;
        }
    }

    public PhoneResponsePayload() {
        this((String) null, (String) null, 3, (i) null);
    }

    public /* synthetic */ PhoneResponsePayload(int i11, String str, String str2, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19123a = "";
        } else {
            this.f19123a = str;
        }
        if ((i11 & 2) == 0) {
            this.f19124b = "";
        } else {
            this.f19124b = str2;
        }
    }

    public static final void a(PhoneResponsePayload phoneResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        boolean z11;
        p.j(phoneResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z12 = false;
        if (!dVar.o(serialDescriptor, 0) && p.e(phoneResponsePayload.f19123a, "")) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, a1.f23069b, phoneResponsePayload.f19123a);
        }
        if (dVar.o(serialDescriptor, 1) || !p.e(phoneResponsePayload.f19124b, "")) {
            z12 = true;
        }
        if (z12) {
            dVar.E(serialDescriptor, 1, a1.f23069b, phoneResponsePayload.f19124b);
        }
    }

    public PhoneResponsePayload(String str, String str2) {
        this.f19123a = str;
        this.f19124b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhoneResponsePayload(String str, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }
}
