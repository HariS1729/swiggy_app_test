package in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.payusingphonepe;

import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.x0;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: PhonePeMakePaymentResponsePayload.kt */
public final class PhonePeMakePaymentResponsePayload$$serializer implements q<PhonePeMakePaymentResponsePayload> {
    public static final PhonePeMakePaymentResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PhonePeMakePaymentResponsePayload$$serializer phonePeMakePaymentResponsePayload$$serializer = new PhonePeMakePaymentResponsePayload$$serializer();
        INSTANCE = phonePeMakePaymentResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.payusingphonepe.PhonePeMakePaymentResponsePayload", phonePeMakePaymentResponsePayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("orderId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PhonePeMakePaymentResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a1Var};
    }

    public PhonePeMakePaymentResponsePayload deserialize(Decoder decoder) {
        int i11;
        String str;
        String str2;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            str2 = b11.j(descriptor2, 0);
            str = b11.j(descriptor2, 1);
            i11 = 3;
        } else {
            str2 = null;
            String str3 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z11 = false;
                } else if (w11 == 0) {
                    str2 = b11.j(descriptor2, 0);
                    i12 |= 1;
                } else if (w11 == 1) {
                    str3 = b11.j(descriptor2, 1);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            str = str3;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new PhonePeMakePaymentResponsePayload(i11, str2, str, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public PhonePeMakePaymentResponsePayload patch(Decoder decoder, PhonePeMakePaymentResponsePayload phonePeMakePaymentResponsePayload) {
        return (PhonePeMakePaymentResponsePayload) q.a.a(this, decoder, phonePeMakePaymentResponsePayload);
    }

    public void serialize(Encoder encoder, PhonePeMakePaymentResponsePayload phonePeMakePaymentResponsePayload) {
        p.j(encoder, "encoder");
        p.j(phonePeMakePaymentResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        PhonePeMakePaymentResponsePayload.a(phonePeMakePaymentResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
