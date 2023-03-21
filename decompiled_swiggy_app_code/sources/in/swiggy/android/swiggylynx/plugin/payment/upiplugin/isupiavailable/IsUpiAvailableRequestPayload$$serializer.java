package in.swiggy.android.swiggylynx.plugin.payment.upiplugin.isupiavailable;

import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.q;
import gq0.x0;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: IsUpiAvailableRequestPayload.kt */
public final class IsUpiAvailableRequestPayload$$serializer implements q<IsUpiAvailableRequestPayload> {
    public static final IsUpiAvailableRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        IsUpiAvailableRequestPayload$$serializer isUpiAvailableRequestPayload$$serializer = new IsUpiAvailableRequestPayload$$serializer();
        INSTANCE = isUpiAvailableRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.upiplugin.isupiavailable.IsUpiAvailableRequestPayload", isUpiAvailableRequestPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("methods", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IsUpiAvailableRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{new f(a1.f23069b)};
    }

    public IsUpiAvailableRequestPayload deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.o(descriptor2, 0, new f(a1.f23069b), null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.o(descriptor2, 0, new f(a1.f23069b), obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new IsUpiAvailableRequestPayload(i11, (ArrayList) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public IsUpiAvailableRequestPayload patch(Decoder decoder, IsUpiAvailableRequestPayload isUpiAvailableRequestPayload) {
        return (IsUpiAvailableRequestPayload) q.a.a(this, decoder, isUpiAvailableRequestPayload);
    }

    public void serialize(Encoder encoder, IsUpiAvailableRequestPayload isUpiAvailableRequestPayload) {
        p.j(encoder, "encoder");
        p.j(isUpiAvailableRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        IsUpiAvailableRequestPayload.c(isUpiAvailableRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
