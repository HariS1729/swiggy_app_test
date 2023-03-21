package in.swiggy.android.swiggylynx.plugin.dash.kyc;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: KycInitPayload.kt */
public final class KycInitPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19119a;

    /* compiled from: KycInitPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<KycInitPayload> serializer() {
            return KycInitPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KycInitPayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19119a = str;
            return;
        }
        throw new MissingFieldException("docType");
    }

    public static final void c(KycInitPayload kycInitPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(kycInitPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, kycInitPayload.f19119a);
    }

    public final String b() {
        return this.f19119a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KycInitPayload) && p.e(this.f19119a, ((KycInitPayload) obj).f19119a);
    }

    public int hashCode() {
        return this.f19119a.hashCode();
    }

    public String toString() {
        return "KycInitPayload(docType=" + this.f19119a + ')';
    }
}
