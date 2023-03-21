package in.swiggy.android.swiggylynx.plugin.cart.getcart.request;

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

/* compiled from: ToggleBottomBarRequestPayload.kt */
public final class ToggleBottomBarRequestPayload$$serializer implements q<ToggleBottomBarRequestPayload> {
    public static final ToggleBottomBarRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ToggleBottomBarRequestPayload$$serializer toggleBottomBarRequestPayload$$serializer = new ToggleBottomBarRequestPayload$$serializer();
        INSTANCE = toggleBottomBarRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.getcart.request.ToggleBottomBarRequestPayload", toggleBottomBarRequestPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("show", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ToggleBottomBarRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{h.f23089b};
    }

    public ToggleBottomBarRequestPayload deserialize(Decoder decoder) {
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
        return new ToggleBottomBarRequestPayload(i11, z11, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public ToggleBottomBarRequestPayload patch(Decoder decoder, ToggleBottomBarRequestPayload toggleBottomBarRequestPayload) {
        return (ToggleBottomBarRequestPayload) q.a.a(this, decoder, toggleBottomBarRequestPayload);
    }

    public void serialize(Encoder encoder, ToggleBottomBarRequestPayload toggleBottomBarRequestPayload) {
        p.j(encoder, "encoder");
        p.j(toggleBottomBarRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        ToggleBottomBarRequestPayload.b(toggleBottomBarRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
