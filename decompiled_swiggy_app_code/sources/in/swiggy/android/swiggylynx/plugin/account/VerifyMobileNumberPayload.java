package in.swiggy.android.swiggylynx.plugin.account;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: VerifyMobileNumberPayload.kt */
public final class VerifyMobileNumberPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f18978a;

    /* compiled from: VerifyMobileNumberPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<VerifyMobileNumberPayload> serializer() {
            return VerifyMobileNumberPayload$$serializer.INSTANCE;
        }
    }

    public VerifyMobileNumberPayload() {
        this((String) null, 1, (i) null);
    }

    public /* synthetic */ VerifyMobileNumberPayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) == 0) {
            this.f18978a = null;
        } else {
            this.f18978a = str;
        }
    }

    public static final void c(VerifyMobileNumberPayload verifyMobileNumberPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(verifyMobileNumberPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && verifyMobileNumberPayload.f18978a == null) {
            z11 = false;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, a1.f23069b, verifyMobileNumberPayload.f18978a);
        }
    }

    public final String b() {
        return this.f18978a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerifyMobileNumberPayload) && p.e(this.f18978a, ((VerifyMobileNumberPayload) obj).f18978a);
    }

    public int hashCode() {
        String str = this.f18978a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "VerifyMobileNumberPayload(number=" + this.f18978a + ')';
    }

    public VerifyMobileNumberPayload(String str) {
        this.f18978a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyMobileNumberPayload(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str);
    }
}
