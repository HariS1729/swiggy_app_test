package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.vibrate;

import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.f0;
import gq0.q;
import gq0.x0;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: VibratePayload.kt */
public final class VibratePayload$$serializer implements q<VibratePayload> {
    public static final VibratePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        VibratePayload$$serializer vibratePayload$$serializer = new VibratePayload$$serializer();
        INSTANCE = vibratePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.vibrate.VibratePayload", vibratePayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("amplitude", false);
        pluginGeneratedSerialDescriptor.j("duration", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VibratePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a1.f23069b, f0.f23081b};
    }

    public VibratePayload deserialize(Decoder decoder) {
        long j;
        String str;
        int i11;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            str = b11.j(descriptor2, 0);
            j = b11.e(descriptor2, 1);
            i11 = 3;
        } else {
            String str2 = null;
            long j11 = 0;
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
                    j11 = b11.e(descriptor2, 1);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            str = str2;
            j = j11;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new VibratePayload(i11, str, j, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public VibratePayload patch(Decoder decoder, VibratePayload vibratePayload) {
        return (VibratePayload) q.a.a(this, decoder, vibratePayload);
    }

    public void serialize(Encoder encoder, VibratePayload vibratePayload) {
        p.j(encoder, "encoder");
        p.j(vibratePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        VibratePayload.d(vibratePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
