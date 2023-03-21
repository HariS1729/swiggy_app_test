package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.launchBrowser;

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

/* compiled from: LaunchBrowserPayload.kt */
public final class LaunchBrowserPayload$$serializer implements q<LaunchBrowserPayload> {
    public static final LaunchBrowserPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        LaunchBrowserPayload$$serializer launchBrowserPayload$$serializer = new LaunchBrowserPayload$$serializer();
        INSTANCE = launchBrowserPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.launchBrowser.LaunchBrowserPayload", launchBrowserPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LaunchBrowserPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(a1.f23069b)};
    }

    public LaunchBrowserPayload deserialize(Decoder decoder) {
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
        return new LaunchBrowserPayload(i11, (String) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public LaunchBrowserPayload patch(Decoder decoder, LaunchBrowserPayload launchBrowserPayload) {
        return (LaunchBrowserPayload) q.a.a(this, decoder, launchBrowserPayload);
    }

    public void serialize(Encoder encoder, LaunchBrowserPayload launchBrowserPayload) {
        p.j(encoder, "encoder");
        p.j(launchBrowserPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        LaunchBrowserPayload.c(launchBrowserPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
