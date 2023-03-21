package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility;

import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.x0;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: JuspayEligibilityRequestPayload.kt */
public final class JuspayEligibilityRequestPayload$$serializer implements q<JuspayEligibilityRequestPayload> {
    public static final JuspayEligibilityRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        JuspayEligibilityRequestPayload$$serializer juspayEligibilityRequestPayload$$serializer = new JuspayEligibilityRequestPayload$$serializer();
        INSTANCE = juspayEligibilityRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.JuspayEligibilityRequestPayload", juspayEligibilityRequestPayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, false);
        pluginGeneratedSerialDescriptor.j("clientAuthToken", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JuspayEligibilityRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a1Var};
    }

    public JuspayEligibilityRequestPayload deserialize(Decoder decoder) {
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
        return new JuspayEligibilityRequestPayload(i11, str2, str, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public JuspayEligibilityRequestPayload patch(Decoder decoder, JuspayEligibilityRequestPayload juspayEligibilityRequestPayload) {
        return (JuspayEligibilityRequestPayload) q.a.a(this, decoder, juspayEligibilityRequestPayload);
    }

    public void serialize(Encoder encoder, JuspayEligibilityRequestPayload juspayEligibilityRequestPayload) {
        p.j(encoder, "encoder");
        p.j(juspayEligibilityRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        JuspayEligibilityRequestPayload.d(juspayEligibilityRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
