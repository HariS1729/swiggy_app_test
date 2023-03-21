package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick;

import fq0.c;
import fq0.d;
import gq0.f;
import gq0.q;
import gq0.x0;
import java.util.List;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: OneClickEligibilityResponsePayload.kt */
public final class OneClickEligibilityResponsePayload$$serializer implements q<OneClickEligibilityResponsePayload> {
    public static final OneClickEligibilityResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        OneClickEligibilityResponsePayload$$serializer oneClickEligibilityResponsePayload$$serializer = new OneClickEligibilityResponsePayload$$serializer();
        INSTANCE = oneClickEligibilityResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.OneClickEligibilityResponsePayload", oneClickEligibilityResponsePayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("cardEligiblityDetails", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OneClickEligibilityResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{new f(EligibilityDetails$$serializer.INSTANCE)};
    }

    public OneClickEligibilityResponsePayload deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.o(descriptor2, 0, new f(EligibilityDetails$$serializer.INSTANCE), null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.o(descriptor2, 0, new f(EligibilityDetails$$serializer.INSTANCE), obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new OneClickEligibilityResponsePayload(i11, (List) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public OneClickEligibilityResponsePayload patch(Decoder decoder, OneClickEligibilityResponsePayload oneClickEligibilityResponsePayload) {
        return (OneClickEligibilityResponsePayload) q.a.a(this, decoder, oneClickEligibilityResponsePayload);
    }

    public void serialize(Encoder encoder, OneClickEligibilityResponsePayload oneClickEligibilityResponsePayload) {
        p.j(encoder, "encoder");
        p.j(oneClickEligibilityResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        OneClickEligibilityResponsePayload.a(oneClickEligibilityResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
