package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaytransaction;

import fq0.d;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspayRequestParams;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspayRequestParams$$serializer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: JuspayMakePaymentRequestPayload.kt */
public final class JuspayMakePaymentRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final JuspayRequestParams f19224a;

    /* compiled from: JuspayMakePaymentRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<JuspayMakePaymentRequestPayload> serializer() {
            return JuspayMakePaymentRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JuspayMakePaymentRequestPayload(int i11, JuspayRequestParams juspayRequestParams, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19224a = juspayRequestParams;
            return;
        }
        throw new MissingFieldException("juspayParams");
    }

    public static final void c(JuspayMakePaymentRequestPayload juspayMakePaymentRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(juspayMakePaymentRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, JuspayRequestParams$$serializer.INSTANCE, juspayMakePaymentRequestPayload.f19224a);
    }

    public final JuspayRequestParams b() {
        return this.f19224a;
    }
}
