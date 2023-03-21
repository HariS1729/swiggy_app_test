package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin;

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

/* compiled from: IsLocationEnabledPayload.kt */
public final class IsLocationEnabledPayload$$serializer implements q<IsLocationEnabledPayload> {
    public static final IsLocationEnabledPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        IsLocationEnabledPayload$$serializer isLocationEnabledPayload$$serializer = new IsLocationEnabledPayload$$serializer();
        INSTANCE = isLocationEnabledPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.IsLocationEnabledPayload", isLocationEnabledPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("enabled", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IsLocationEnabledPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{h.f23089b};
    }

    public IsLocationEnabledPayload deserialize(Decoder decoder) {
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
        return new IsLocationEnabledPayload(i11, z11, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public IsLocationEnabledPayload patch(Decoder decoder, IsLocationEnabledPayload isLocationEnabledPayload) {
        return (IsLocationEnabledPayload) q.a.a(this, decoder, isLocationEnabledPayload);
    }

    public void serialize(Encoder encoder, IsLocationEnabledPayload isLocationEnabledPayload) {
        p.j(encoder, "encoder");
        p.j(isLocationEnabledPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        IsLocationEnabledPayload.a(isLocationEnabledPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
