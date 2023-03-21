package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.closeWebViewWithParams;

import fq0.c;
import fq0.d;
import gq0.a1;
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

/* compiled from: CloseWebViewWithParamsRequestPayload.kt */
public final class CloseWebViewWithParamsRequestPayload$$serializer implements q<CloseWebViewWithParamsRequestPayload> {
    public static final CloseWebViewWithParamsRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CloseWebViewWithParamsRequestPayload$$serializer closeWebViewWithParamsRequestPayload$$serializer = new CloseWebViewWithParamsRequestPayload$$serializer();
        INSTANCE = closeWebViewWithParamsRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.closeWebViewWithParams.CloseWebViewWithParamsRequestPayload", closeWebViewWithParamsRequestPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CloseWebViewWithParamsRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{new z(a1Var, a1Var)};
    }

    public CloseWebViewWithParamsRequestPayload deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            a1 a1Var = a1.f23069b;
            obj = b11.o(descriptor2, 0, new z(a1Var, a1Var), null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    a1 a1Var2 = a1.f23069b;
                    obj = b11.o(descriptor2, 0, new z(a1Var2, a1Var2), obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new CloseWebViewWithParamsRequestPayload(i11, (Map) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public CloseWebViewWithParamsRequestPayload patch(Decoder decoder, CloseWebViewWithParamsRequestPayload closeWebViewWithParamsRequestPayload) {
        return (CloseWebViewWithParamsRequestPayload) q.a.a(this, decoder, closeWebViewWithParamsRequestPayload);
    }

    public void serialize(Encoder encoder, CloseWebViewWithParamsRequestPayload closeWebViewWithParamsRequestPayload) {
        p.j(encoder, "encoder");
        p.j(closeWebViewWithParamsRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CloseWebViewWithParamsRequestPayload.c(closeWebViewWithParamsRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
