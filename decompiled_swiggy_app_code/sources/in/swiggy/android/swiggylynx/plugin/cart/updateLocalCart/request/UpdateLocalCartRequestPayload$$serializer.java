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

/* compiled from: UpdateLocalCartRequestPayload.kt */
public final class UpdateLocalCartRequestPayload$$serializer implements q<UpdateLocalCartRequestPayload> {
    public static final UpdateLocalCartRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        UpdateLocalCartRequestPayload$$serializer updateLocalCartRequestPayload$$serializer = new UpdateLocalCartRequestPayload$$serializer();
        INSTANCE = updateLocalCartRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.UpdateLocalCartRequestPayload", updateLocalCartRequestPayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("tenant", false);
        pluginGeneratedSerialDescriptor.j(CardTypeAdapterFactory.DATA, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UpdateLocalCartRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{TenantParams$$serializer.INSTANCE, CartUpdateParams$$serializer.INSTANCE};
    }

    public UpdateLocalCartRequestPayload deserialize(Decoder decoder) {
        int i11;
        Object obj;
        Object obj2;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            obj2 = b11.o(descriptor2, 0, TenantParams$$serializer.INSTANCE, null);
            obj = b11.o(descriptor2, 1, CartUpdateParams$$serializer.INSTANCE, null);
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
                    obj3 = b11.o(descriptor2, 1, CartUpdateParams$$serializer.INSTANCE, obj3);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj3;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new UpdateLocalCartRequestPayload(i11, (TenantParams) obj2, (CartUpdateParams) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public UpdateLocalCartRequestPayload patch(Decoder decoder, UpdateLocalCartRequestPayload updateLocalCartRequestPayload) {
        return (UpdateLocalCartRequestPayload) q.a.a(this, decoder, updateLocalCartRequestPayload);
    }

    public void serialize(Encoder encoder, UpdateLocalCartRequestPayload updateLocalCartRequestPayload) {
        p.j(encoder, "encoder");
        p.j(updateLocalCartRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        UpdateLocalCartRequestPayload.c(updateLocalCartRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
