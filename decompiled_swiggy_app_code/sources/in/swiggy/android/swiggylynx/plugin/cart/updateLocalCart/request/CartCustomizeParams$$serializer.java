package in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request;

import dq0.a;
import fq0.d;
import gq0.h;
import gq0.q;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElementSerializer;

/* compiled from: CartCustomizeParams.kt */
public final class CartCustomizeParams$$serializer implements q<CartCustomizeParams> {
    public static final CartCustomizeParams$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CartCustomizeParams$$serializer cartCustomizeParams$$serializer = new CartCustomizeParams$$serializer();
        INSTANCE = cartCustomizeParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CartCustomizeParams", cartCustomizeParams$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("menuItem", true);
        pluginGeneratedSerialDescriptor.j("restaurantDetails", false);
        pluginGeneratedSerialDescriptor.j("addNewItem", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CartCustomizeParams$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(JsonElementSerializer.f26449b), RestaurantDetailsParams$$serializer.INSTANCE, h.f23089b};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CartCustomizeParams deserialize(kotlinx.serialization.encoding.Decoder r13) {
        /*
            r12 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.p.j(r13, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r12.getDescriptor()
            fq0.c r13 = r13.b(r0)
            boolean r1 = r13.k()
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x002a
            kotlinx.serialization.json.JsonElementSerializer r1 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            java.lang.Object r1 = r13.s(r0, r4, r1, r2)
            in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.RestaurantDetailsParams$$serializer r4 = in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.RestaurantDetailsParams$$serializer.INSTANCE
            java.lang.Object r2 = r13.o(r0, r5, r4, r2)
            boolean r3 = r13.B(r0, r3)
            r4 = 7
            r7 = r3
            goto L_0x0063
        L_0x002a:
            r1 = r2
            r6 = 0
            r7 = 0
            r8 = 1
        L_0x002e:
            if (r8 == 0) goto L_0x005e
            int r9 = r13.w(r0)
            r10 = -1
            if (r9 == r10) goto L_0x005c
            if (r9 == 0) goto L_0x0053
            if (r9 == r5) goto L_0x004a
            if (r9 != r3) goto L_0x0044
            boolean r6 = r13.B(r0, r3)
            r7 = r7 | 4
            goto L_0x002e
        L_0x0044:
            kotlinx.serialization.UnknownFieldException r13 = new kotlinx.serialization.UnknownFieldException
            r13.<init>(r9)
            throw r13
        L_0x004a:
            in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.RestaurantDetailsParams$$serializer r9 = in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.RestaurantDetailsParams$$serializer.INSTANCE
            java.lang.Object r1 = r13.o(r0, r5, r9, r1)
            r7 = r7 | 2
            goto L_0x002e
        L_0x0053:
            kotlinx.serialization.json.JsonElementSerializer r9 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            java.lang.Object r2 = r13.s(r0, r4, r9, r2)
            r7 = r7 | 1
            goto L_0x002e
        L_0x005c:
            r8 = 0
            goto L_0x002e
        L_0x005e:
            r4 = r7
            r7 = r6
            r11 = r2
            r2 = r1
            r1 = r11
        L_0x0063:
            r13.c(r0)
            in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CartCustomizeParams r13 = new in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CartCustomizeParams
            r5 = r1
            kotlinx.serialization.json.JsonElement r5 = (kotlinx.serialization.json.JsonElement) r5
            r6 = r2
            in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.RestaurantDetailsParams r6 = (in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.RestaurantDetailsParams) r6
            r8 = 0
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CartCustomizeParams$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CartCustomizeParams");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public CartCustomizeParams patch(Decoder decoder, CartCustomizeParams cartCustomizeParams) {
        return (CartCustomizeParams) q.a.a(this, decoder, cartCustomizeParams);
    }

    public void serialize(Encoder encoder, CartCustomizeParams cartCustomizeParams) {
        p.j(encoder, "encoder");
        p.j(cartCustomizeParams, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CartCustomizeParams.e(cartCustomizeParams, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
