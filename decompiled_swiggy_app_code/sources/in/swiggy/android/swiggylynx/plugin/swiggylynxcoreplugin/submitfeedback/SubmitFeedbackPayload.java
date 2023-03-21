package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.submitfeedback;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: SubmitFeedbackPayload.kt */
public final class SubmitFeedbackPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19494a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19495b;

    /* compiled from: SubmitFeedbackPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<SubmitFeedbackPayload> serializer() {
            return SubmitFeedbackPayload$$serializer.INSTANCE;
        }
    }

    public SubmitFeedbackPayload() {
        this((String) null, (String) null, 3, (i) null);
    }

    public /* synthetic */ SubmitFeedbackPayload(int i11, String str, String str2, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) == 0) {
            this.f19494a = null;
        } else {
            this.f19494a = str;
        }
        if ((i11 & 2) == 0) {
            this.f19495b = null;
        } else {
            this.f19495b = str2;
        }
    }

    public static final void d(SubmitFeedbackPayload submitFeedbackPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(submitFeedbackPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || submitFeedbackPayload.f19494a != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, submitFeedbackPayload.f19494a);
        }
        if (dVar.o(serialDescriptor, 1) || submitFeedbackPayload.f19495b != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, a1.f23069b, submitFeedbackPayload.f19495b);
        }
    }

    public final String b() {
        return this.f19495b;
    }

    public final String c() {
        return this.f19494a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitFeedbackPayload)) {
            return false;
        }
        SubmitFeedbackPayload submitFeedbackPayload = (SubmitFeedbackPayload) obj;
        return p.e(this.f19494a, submitFeedbackPayload.f19494a) && p.e(this.f19495b, submitFeedbackPayload.f19495b);
    }

    public int hashCode() {
        String str = this.f19494a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19495b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "SubmitFeedbackPayload(originScreen=" + this.f19494a + ", link=" + this.f19495b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SubmitFeedbackPayload(String str, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }

    public SubmitFeedbackPayload(String str, String str2) {
        this.f19494a = str;
        this.f19495b = str2;
    }
}
