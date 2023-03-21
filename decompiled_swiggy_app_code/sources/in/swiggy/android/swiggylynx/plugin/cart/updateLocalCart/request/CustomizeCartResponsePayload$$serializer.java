package in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request;

import dq0.a;
import fq0.c;
import fq0.d;
import gq0.f;
import gq0.q;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon$$serializer;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.response.GroupVariation2$$serializer;
import java.util.List;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: CustomizeCartResponsePayload.kt */
public final class CustomizeCartResponsePayload$$serializer implements q<CustomizeCartResponsePayload> {
    public static final CustomizeCartResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CustomizeCartResponsePayload$$serializer customizeCartResponsePayload$$serializer = new CustomizeCartResponsePayload$$serializer();
        INSTANCE = customizeCartResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CustomizeCartResponsePayload", customizeCartResponsePayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("variants", true);
        pluginGeneratedSerialDescriptor.j("addons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CustomizeCartResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(new f(GroupVariation2$$serializer.INSTANCE)), a.p(new f(CartAddon$$serializer.INSTANCE))};
    }

    public CustomizeCartResponsePayload deserialize(Decoder decoder) {
        int i11;
        Object obj;
        Object obj2;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            obj2 = b11.s(descriptor2, 0, new f(GroupVariation2$$serializer.INSTANCE), null);
            obj = b11.s(descriptor2, 1, new f(CartAddon$$serializer.INSTANCE), null);
            i11 = 3;
        } else {
            obj2 = null;
            Object obj3 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z11 = false;
                } else if (w11 == 0) {
                    obj2 = b11.s(descriptor2, 0, new f(GroupVariation2$$serializer.INSTANCE), obj2);
                    i12 |= 1;
                } else if (w11 == 1) {
                    obj3 = b11.s(descriptor2, 1, new f(CartAddon$$serializer.INSTANCE), obj3);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj3;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new CustomizeCartResponsePayload(i11, (List) obj2, (List) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public CustomizeCartResponsePayload patch(Decoder decoder, CustomizeCartResponsePayload customizeCartResponsePayload) {
        return (CustomizeCartResponsePayload) q.a.a(this, decoder, customizeCartResponsePayload);
    }

    public void serialize(Encoder encoder, CustomizeCartResponsePayload customizeCartResponsePayload) {
        p.j(encoder, "encoder");
        p.j(customizeCartResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CustomizeCartResponsePayload.c(customizeCartResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
