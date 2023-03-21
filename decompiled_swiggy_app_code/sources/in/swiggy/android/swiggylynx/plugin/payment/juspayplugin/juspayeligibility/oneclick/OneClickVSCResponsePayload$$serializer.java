package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick;

import fq0.c;
import fq0.d;
import gq0.h;
import gq0.q;
import gq0.x0;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: OneClickVSCResponsePayload.kt */
public final class OneClickVSCResponsePayload$$serializer implements q<OneClickVSCResponsePayload> {
    public static final OneClickVSCResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        OneClickVSCResponsePayload$$serializer oneClickVSCResponsePayload$$serializer = new OneClickVSCResponsePayload$$serializer();
        INSTANCE = oneClickVSCResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.OneClickVSCResponsePayload", oneClickVSCResponsePayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("isDeEnrolled", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OneClickVSCResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{h.f23089b};
    }

    public OneClickVSCResponsePayload deserialize(Decoder decoder) {
        boolean z11;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            z11 = b11.B(descriptor2, 0);
        } else {
            z11 = false;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    z11 = b11.B(descriptor2, 0);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new OneClickVSCResponsePayload(i11, z11, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public OneClickVSCResponsePayload patch(Decoder decoder, OneClickVSCResponsePayload oneClickVSCResponsePayload) {
        return (OneClickVSCResponsePayload) q.a.a(this, decoder, oneClickVSCResponsePayload);
    }

    public void serialize(Encoder encoder, OneClickVSCResponsePayload oneClickVSCResponsePayload) {
        p.j(encoder, "encoder");
        p.j(oneClickVSCResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        OneClickVSCResponsePayload.a(oneClickVSCResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
