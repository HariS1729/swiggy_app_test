package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: JuspayEligibilityResponsePayload.kt */
public final class JuspayEligibilityResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19197a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19198b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19199c;

    /* compiled from: JuspayEligibilityResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<JuspayEligibilityResponsePayload> serializer() {
            return JuspayEligibilityResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JuspayEligibilityResponsePayload(int i11, boolean z11, String str, String str2, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19197a = z11;
            if ((i11 & 2) == 0) {
                this.f19198b = null;
            } else {
                this.f19198b = str;
            }
            if ((i11 & 4) == 0) {
                this.f19199c = null;
            } else {
                this.f19199c = str2;
            }
        } else {
            throw new MissingFieldException("isEligible");
        }
    }

    public static final void a(JuspayEligibilityResponsePayload juspayEligibilityResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(juspayEligibilityResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.m(serialDescriptor, 0, juspayEligibilityResponsePayload.f19197a);
        if (dVar.o(serialDescriptor, 1) || juspayEligibilityResponsePayload.f19198b != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, juspayEligibilityResponsePayload.f19198b);
        }
        if (dVar.o(serialDescriptor, 2) || juspayEligibilityResponsePayload.f19199c != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 2, a1.f23069b, juspayEligibilityResponsePayload.f19199c);
        }
    }

    public JuspayEligibilityResponsePayload(boolean z11, String str, String str2) {
        this.f19197a = z11;
        this.f19198b = str;
        this.f19199c = str2;
    }
}
