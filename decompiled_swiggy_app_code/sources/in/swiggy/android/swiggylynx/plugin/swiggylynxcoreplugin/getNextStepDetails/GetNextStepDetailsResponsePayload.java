package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: GetNextStepDetailsResponsePayload.kt */
public final class GetNextStepDetailsResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private String f19410a;

    /* renamed from: b  reason: collision with root package name */
    private String f19411b;

    /* renamed from: c  reason: collision with root package name */
    private String f19412c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19413d;

    /* compiled from: GetNextStepDetailsResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetNextStepDetailsResponsePayload> serializer() {
            return GetNextStepDetailsResponsePayload$$serializer.INSTANCE;
        }
    }

    public GetNextStepDetailsResponsePayload() {
        this((String) null, (String) null, (String) null, (String) null, 15, (i) null);
    }

    public /* synthetic */ GetNextStepDetailsResponsePayload(int i11, String str, String str2, String str3, String str4, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19410a = null;
        } else {
            this.f19410a = str;
        }
        if ((i11 & 2) == 0) {
            this.f19411b = null;
        } else {
            this.f19411b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f19412c = null;
        } else {
            this.f19412c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f19413d = null;
        } else {
            this.f19413d = str4;
        }
    }

    public static final void a(GetNextStepDetailsResponsePayload getNextStepDetailsResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getNextStepDetailsResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || getNextStepDetailsResponsePayload.f19410a != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, getNextStepDetailsResponsePayload.f19410a);
        }
        if (dVar.o(serialDescriptor, 1) || getNextStepDetailsResponsePayload.f19411b != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, getNextStepDetailsResponsePayload.f19411b);
        }
        if (dVar.o(serialDescriptor, 2) || getNextStepDetailsResponsePayload.f19412c != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, getNextStepDetailsResponsePayload.f19412c);
        }
        if (dVar.o(serialDescriptor, 3) || getNextStepDetailsResponsePayload.f19413d != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 3, a1.f23069b, getNextStepDetailsResponsePayload.f19413d);
        }
    }

    public GetNextStepDetailsResponsePayload(String str, String str2, String str3, String str4) {
        this.f19410a = str;
        this.f19411b = str2;
        this.f19412c = str3;
        this.f19413d = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetNextStepDetailsResponsePayload(String str, String str2, String str3, String str4, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }
}
