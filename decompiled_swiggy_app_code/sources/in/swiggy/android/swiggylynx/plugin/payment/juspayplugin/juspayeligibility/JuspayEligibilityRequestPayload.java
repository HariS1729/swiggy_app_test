package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility;

import fq0.d;
import gq0.x0;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: JuspayEligibilityRequestPayload.kt */
public final class JuspayEligibilityRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19195a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19196b;

    /* compiled from: JuspayEligibilityRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<JuspayEligibilityRequestPayload> serializer() {
            return JuspayEligibilityRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JuspayEligibilityRequestPayload(int i11, String str, String str2, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19195a = str;
            if ((i11 & 2) != 0) {
                this.f19196b = str2;
                return;
            }
            throw new MissingFieldException("clientAuthToken");
        }
        throw new MissingFieldException(PaymentConstants.AMOUNT);
    }

    public static final void d(JuspayEligibilityRequestPayload juspayEligibilityRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(juspayEligibilityRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, juspayEligibilityRequestPayload.f19195a);
        dVar.n(serialDescriptor, 1, juspayEligibilityRequestPayload.f19196b);
    }

    public final String b() {
        return this.f19195a;
    }

    public final String c() {
        return this.f19196b;
    }
}
