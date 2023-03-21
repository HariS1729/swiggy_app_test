package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaytransaction;

import fq0.c;
import fq0.d;
import gq0.q;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspayRequestParams;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspayRequestParams$$serializer;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: JuspayMakePaymentRequestPayload.kt */
public final class JuspayMakePaymentRequestPayload$$serializer implements q<JuspayMakePaymentRequestPayload> {
    public static final JuspayMakePaymentRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        JuspayMakePaymentRequestPayload$$serializer juspayMakePaymentRequestPayload$$serializer = new JuspayMakePaymentRequestPayload$$serializer();
        INSTANCE = juspayMakePaymentRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaytransaction.JuspayMakePaymentRequestPayload", juspayMakePaymentRequestPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("juspayParams", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JuspayMakePaymentRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{JuspayRequestParams$$serializer.INSTANCE};
    }

    public JuspayMakePaymentRequestPayload deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.o(descriptor2, 0, JuspayRequestParams$$serializer.INSTANCE, null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.o(descriptor2, 0, JuspayRequestParams$$serializer.INSTANCE, obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new JuspayMakePaymentRequestPayload(i11, (JuspayRequestParams) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public JuspayMakePaymentRequestPayload patch(Decoder decoder, JuspayMakePaymentRequestPayload juspayMakePaymentRequestPayload) {
        return (JuspayMakePaymentRequestPayload) q.a.a(this, decoder, juspayMakePaymentRequestPayload);
    }

    public void serialize(Encoder encoder, JuspayMakePaymentRequestPayload juspayMakePaymentRequestPayload) {
        p.j(encoder, "encoder");
        p.j(juspayMakePaymentRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        JuspayMakePaymentRequestPayload.c(juspayMakePaymentRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
