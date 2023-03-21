package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.isjuspayavailable;

import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.q;
import gq0.x0;
import gq0.z;
import java.util.Map;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: IsJuspayAvailableResponsePayload.kt */
public final class IsJuspayAvailableResponsePayload$$serializer implements q<IsJuspayAvailableResponsePayload> {
    public static final IsJuspayAvailableResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        IsJuspayAvailableResponsePayload$$serializer isJuspayAvailableResponsePayload$$serializer = new IsJuspayAvailableResponsePayload$$serializer();
        INSTANCE = isJuspayAvailableResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.isjuspayavailable.IsJuspayAvailableResponsePayload", isJuspayAvailableResponsePayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("isAvailable", false);
        pluginGeneratedSerialDescriptor.j("featuresAvailability", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IsJuspayAvailableResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        h hVar = h.f23089b;
        return new KSerializer[]{hVar, new z(a1.f23069b, hVar)};
    }

    public IsJuspayAvailableResponsePayload deserialize(Decoder decoder) {
        int i11;
        Object obj;
        boolean z11;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            z11 = b11.B(descriptor2, 0);
            obj = b11.o(descriptor2, 1, new z(a1.f23069b, h.f23089b), null);
            i11 = 3;
        } else {
            Object obj2 = null;
            z11 = false;
            int i12 = 0;
            boolean z12 = true;
            while (z12) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z12 = false;
                } else if (w11 == 0) {
                    z11 = b11.B(descriptor2, 0);
                    i12 |= 1;
                } else if (w11 == 1) {
                    obj2 = b11.o(descriptor2, 1, new z(a1.f23069b, h.f23089b), obj2);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj2;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new IsJuspayAvailableResponsePayload(i11, z11, (Map) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public IsJuspayAvailableResponsePayload patch(Decoder decoder, IsJuspayAvailableResponsePayload isJuspayAvailableResponsePayload) {
        return (IsJuspayAvailableResponsePayload) q.a.a(this, decoder, isJuspayAvailableResponsePayload);
    }

    public void serialize(Encoder encoder, IsJuspayAvailableResponsePayload isJuspayAvailableResponsePayload) {
        p.j(encoder, "encoder");
        p.j(isJuspayAvailableResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        IsJuspayAvailableResponsePayload.a(isJuspayAvailableResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
