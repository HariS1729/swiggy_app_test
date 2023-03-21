package in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.payusingphonepe;

import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model.PhonePePreRequisites;
import in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model.PhonePePreRequisites$$serializer;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: PhonePeMakePaymentRequestPayload.kt */
public final class PhonePeMakePaymentRequestPayload$$serializer implements q<PhonePeMakePaymentRequestPayload> {
    public static final PhonePeMakePaymentRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PhonePeMakePaymentRequestPayload$$serializer phonePeMakePaymentRequestPayload$$serializer = new PhonePeMakePaymentRequestPayload$$serializer();
        INSTANCE = phonePeMakePaymentRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.payusingphonepe.PhonePeMakePaymentRequestPayload", phonePeMakePaymentRequestPayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("phonePeData", false);
        pluginGeneratedSerialDescriptor.j("orderId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PhonePeMakePaymentRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{PhonePePreRequisites$$serializer.INSTANCE, a1.f23069b};
    }

    public PhonePeMakePaymentRequestPayload deserialize(Decoder decoder) {
        int i11;
        String str;
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            obj = b11.o(descriptor2, 0, PhonePePreRequisites$$serializer.INSTANCE, null);
            str = b11.j(descriptor2, 1);
            i11 = 3;
        } else {
            obj = null;
            String str2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z11 = false;
                } else if (w11 == 0) {
                    obj = b11.o(descriptor2, 0, PhonePePreRequisites$$serializer.INSTANCE, obj);
                    i12 |= 1;
                } else if (w11 == 1) {
                    str2 = b11.j(descriptor2, 1);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            str = str2;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new PhonePeMakePaymentRequestPayload(i11, (PhonePePreRequisites) obj, str, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public PhonePeMakePaymentRequestPayload patch(Decoder decoder, PhonePeMakePaymentRequestPayload phonePeMakePaymentRequestPayload) {
        return (PhonePeMakePaymentRequestPayload) q.a.a(this, decoder, phonePeMakePaymentRequestPayload);
    }

    public void serialize(Encoder encoder, PhonePeMakePaymentRequestPayload phonePeMakePaymentRequestPayload) {
        p.j(encoder, "encoder");
        p.j(phonePeMakePaymentRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        PhonePeMakePaymentRequestPayload.d(phonePeMakePaymentRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
