package in.swiggy.android.swiggylynx.plugin.cart.superV2;

import dq0.a;
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

/* compiled from: OpenSuperV2ResponsePayload.kt */
public final class OpenSuperV2ResponsePayload$$serializer implements q<OpenSuperV2ResponsePayload> {
    public static final OpenSuperV2ResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        OpenSuperV2ResponsePayload$$serializer openSuperV2ResponsePayload$$serializer = new OpenSuperV2ResponsePayload$$serializer();
        INSTANCE = openSuperV2ResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.superV2.OpenSuperV2ResponsePayload", openSuperV2ResponsePayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("planId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OpenSuperV2ResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(a1.f23069b)};
    }

    public OpenSuperV2ResponsePayload deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.s(descriptor2, 0, a1.f23069b, null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.s(descriptor2, 0, a1.f23069b, obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new OpenSuperV2ResponsePayload(i11, (String) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public OpenSuperV2ResponsePayload patch(Decoder decoder, OpenSuperV2ResponsePayload openSuperV2ResponsePayload) {
        return (OpenSuperV2ResponsePayload) q.a.a(this, decoder, openSuperV2ResponsePayload);
    }

    public void serialize(Encoder encoder, OpenSuperV2ResponsePayload openSuperV2ResponsePayload) {
        p.j(encoder, "encoder");
        p.j(openSuperV2ResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        OpenSuperV2ResponsePayload.a(openSuperV2ResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
