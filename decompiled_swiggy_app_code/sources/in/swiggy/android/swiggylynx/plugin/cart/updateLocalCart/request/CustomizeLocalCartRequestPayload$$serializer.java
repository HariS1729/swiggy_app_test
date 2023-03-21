package in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request;

import fq0.c;
import fq0.d;
import gq0.q;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.request.TenantParams;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.request.TenantParams$$serializer;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: CustomizeLocalCartRequestPayload.kt */
public final class CustomizeLocalCartRequestPayload$$serializer implements q<CustomizeLocalCartRequestPayload> {
    public static final CustomizeLocalCartRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CustomizeLocalCartRequestPayload$$serializer customizeLocalCartRequestPayload$$serializer = new CustomizeLocalCartRequestPayload$$serializer();
        INSTANCE = customizeLocalCartRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CustomizeLocalCartRequestPayload", customizeLocalCartRequestPayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("tenant", false);
        pluginGeneratedSerialDescriptor.j(CardTypeAdapterFactory.DATA, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CustomizeLocalCartRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{TenantParams$$serializer.INSTANCE, CartCustomizeParams$$serializer.INSTANCE};
    }

    public CustomizeLocalCartRequestPayload deserialize(Decoder decoder) {
        int i11;
        Object obj;
        Object obj2;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            obj2 = b11.o(descriptor2, 0, TenantParams$$serializer.INSTANCE, null);
            obj = b11.o(descriptor2, 1, CartCustomizeParams$$serializer.INSTANCE, null);
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
                    obj2 = b11.o(descriptor2, 0, TenantParams$$serializer.INSTANCE, obj2);
                    i12 |= 1;
                } else if (w11 == 1) {
                    obj3 = b11.o(descriptor2, 1, CartCustomizeParams$$serializer.INSTANCE, obj3);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj3;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new CustomizeLocalCartRequestPayload(i11, (TenantParams) obj2, (CartCustomizeParams) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public CustomizeLocalCartRequestPayload patch(Decoder decoder, CustomizeLocalCartRequestPayload customizeLocalCartRequestPayload) {
        return (CustomizeLocalCartRequestPayload) q.a.a(this, decoder, customizeLocalCartRequestPayload);
    }

    public void serialize(Encoder encoder, CustomizeLocalCartRequestPayload customizeLocalCartRequestPayload) {
        p.j(encoder, "encoder");
        p.j(customizeLocalCartRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CustomizeLocalCartRequestPayload.c(customizeLocalCartRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
