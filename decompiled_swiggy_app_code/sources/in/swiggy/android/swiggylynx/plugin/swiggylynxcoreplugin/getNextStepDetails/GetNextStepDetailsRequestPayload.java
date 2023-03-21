package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: GetNextStepDetailsRequestPayload.kt */
public final class GetNextStepDetailsRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19409a;

    /* compiled from: GetNextStepDetailsRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetNextStepDetailsRequestPayload> serializer() {
            return GetNextStepDetailsRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetNextStepDetailsRequestPayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19409a = str;
            return;
        }
        throw new MissingFieldException("currentStep");
    }

    public static final void c(GetNextStepDetailsRequestPayload getNextStepDetailsRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getNextStepDetailsRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, getNextStepDetailsRequestPayload.f19409a);
    }

    public final String b() {
        return this.f19409a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetNextStepDetailsRequestPayload) && p.e(this.f19409a, ((GetNextStepDetailsRequestPayload) obj).f19409a);
    }

    public int hashCode() {
        return this.f19409a.hashCode();
    }

    public String toString() {
        return "GetNextStepDetailsRequestPayload(currentStep=" + this.f19409a + ')';
    }
}
