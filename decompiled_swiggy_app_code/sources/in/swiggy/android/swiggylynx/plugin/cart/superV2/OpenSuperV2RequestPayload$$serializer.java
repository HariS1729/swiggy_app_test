package in.swiggy.android.swiggylynx.plugin.cart.superV2;

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

/* compiled from: OpenSuperV2RequestPayload.kt */
public final class OpenSuperV2RequestPayload$$serializer implements q<OpenSuperV2RequestPayload> {
    public static final OpenSuperV2RequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        OpenSuperV2RequestPayload$$serializer openSuperV2RequestPayload$$serializer = new OpenSuperV2RequestPayload$$serializer();
        INSTANCE = openSuperV2RequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.superV2.OpenSuperV2RequestPayload", openSuperV2RequestPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("link", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OpenSuperV2RequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a1.f23069b};
    }

    public OpenSuperV2RequestPayload deserialize(Decoder decoder) {
        String str;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            str = b11.j(descriptor2, 0);
        } else {
            str = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    str = b11.j(descriptor2, 0);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new OpenSuperV2RequestPayload(i11, str, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public OpenSuperV2RequestPayload patch(Decoder decoder, OpenSuperV2RequestPayload openSuperV2RequestPayload) {
        return (OpenSuperV2RequestPayload) q.a.a(this, decoder, openSuperV2RequestPayload);
    }

    public void serialize(Encoder encoder, OpenSuperV2RequestPayload openSuperV2RequestPayload) {
        p.j(encoder, "encoder");
        p.j(openSuperV2RequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        OpenSuperV2RequestPayload.c(openSuperV2RequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
