package in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.payusingphonepe;

import fq0.d;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model.PhonePePreRequisites;
import in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model.PhonePePreRequisites$$serializer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: PhonePeMakePaymentRequestPayload.kt */
public final class PhonePeMakePaymentRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final PhonePePreRequisites f19323a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19324b;

    /* compiled from: PhonePeMakePaymentRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<PhonePeMakePaymentRequestPayload> serializer() {
            return PhonePeMakePaymentRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PhonePeMakePaymentRequestPayload(int i11, PhonePePreRequisites phonePePreRequisites, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19323a = phonePePreRequisites;
            if ((i11 & 2) != 0) {
                this.f19324b = str;
                return;
            }
            throw new MissingFieldException("orderId");
        }
        throw new MissingFieldException("phonePeData");
    }

    public static final void d(PhonePeMakePaymentRequestPayload phonePeMakePaymentRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(phonePeMakePaymentRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, PhonePePreRequisites$$serializer.INSTANCE, phonePeMakePaymentRequestPayload.f19323a);
        dVar.n(serialDescriptor, 1, phonePeMakePaymentRequestPayload.f19324b);
    }

    public final String b() {
        return this.f19324b;
    }

    public final PhonePePreRequisites c() {
        return this.f19323a;
    }
}
