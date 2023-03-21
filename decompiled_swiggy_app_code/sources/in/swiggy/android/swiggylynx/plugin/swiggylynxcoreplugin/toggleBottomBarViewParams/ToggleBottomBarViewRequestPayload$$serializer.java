package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.toggleBottomBarViewParams;

import dq0.a;
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

/* compiled from: ToggleBottomBarViewRequestPayload.kt */
public final class ToggleBottomBarViewRequestPayload$$serializer implements q<ToggleBottomBarViewRequestPayload> {
    public static final ToggleBottomBarViewRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ToggleBottomBarViewRequestPayload$$serializer toggleBottomBarViewRequestPayload$$serializer = new ToggleBottomBarViewRequestPayload$$serializer();
        INSTANCE = toggleBottomBarViewRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.toggleBottomBarViewParams.ToggleBottomBarViewRequestPayload", toggleBottomBarViewRequestPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("show", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ToggleBottomBarViewRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(h.f23089b)};
    }

    public ToggleBottomBarViewRequestPayload deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.s(descriptor2, 0, h.f23089b, null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.s(descriptor2, 0, h.f23089b, obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new ToggleBottomBarViewRequestPayload(i11, (Boolean) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public ToggleBottomBarViewRequestPayload patch(Decoder decoder, ToggleBottomBarViewRequestPayload toggleBottomBarViewRequestPayload) {
        return (ToggleBottomBarViewRequestPayload) q.a.a(this, decoder, toggleBottomBarViewRequestPayload);
    }

    public void serialize(Encoder encoder, ToggleBottomBarViewRequestPayload toggleBottomBarViewRequestPayload) {
        p.j(encoder, "encoder");
        p.j(toggleBottomBarViewRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        ToggleBottomBarViewRequestPayload.c(toggleBottomBarViewRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
