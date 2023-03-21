package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaytransaction;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: JuspayMakePaymentResponsePayload.kt */
public final class JuspayMakePaymentResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19225a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19226b;

    /* compiled from: JuspayMakePaymentResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<JuspayMakePaymentResponsePayload> serializer() {
            return JuspayMakePaymentResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JuspayMakePaymentResponsePayload(int i11, String str, String str2, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19225a = str;
            if ((i11 & 2) != 0) {
                this.f19226b = str2;
                return;
            }
            throw new MissingFieldException("orderId");
        }
        throw new MissingFieldException("status");
    }

    public static final void a(JuspayMakePaymentResponsePayload juspayMakePaymentResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(juspayMakePaymentResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, juspayMakePaymentResponsePayload.f19225a);
        dVar.n(serialDescriptor, 1, juspayMakePaymentResponsePayload.f19226b);
    }

    public JuspayMakePaymentResponsePayload(String str, String str2) {
        p.j(str, "status");
        p.j(str2, "orderId");
        this.f19225a = str;
        this.f19226b = str2;
    }
}
