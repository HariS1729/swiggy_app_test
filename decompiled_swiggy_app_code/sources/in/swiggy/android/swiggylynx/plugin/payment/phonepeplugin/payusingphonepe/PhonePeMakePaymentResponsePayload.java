package in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.payusingphonepe;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: PhonePeMakePaymentResponsePayload.kt */
public final class PhonePeMakePaymentResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19325a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19326b;

    /* compiled from: PhonePeMakePaymentResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<PhonePeMakePaymentResponsePayload> serializer() {
            return PhonePeMakePaymentResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PhonePeMakePaymentResponsePayload(int i11, String str, String str2, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19325a = str;
            if ((i11 & 2) != 0) {
                this.f19326b = str2;
                return;
            }
            throw new MissingFieldException("orderId");
        }
        throw new MissingFieldException("status");
    }

    public static final void a(PhonePeMakePaymentResponsePayload phonePeMakePaymentResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(phonePeMakePaymentResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, phonePeMakePaymentResponsePayload.f19325a);
        dVar.n(serialDescriptor, 1, phonePeMakePaymentResponsePayload.f19326b);
    }

    public PhonePeMakePaymentResponsePayload(String str, String str2) {
        p.j(str, "status");
        p.j(str2, "orderId");
        this.f19325a = str;
        this.f19326b = str2;
    }
}
