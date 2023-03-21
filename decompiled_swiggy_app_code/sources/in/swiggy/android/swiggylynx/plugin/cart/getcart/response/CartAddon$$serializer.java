package in.swiggy.android.swiggylynx.plugin.cart.getcart.response;

import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.n;
import gq0.q;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: CartAddon.kt */
public final class CartAddon$$serializer implements q<CartAddon> {
    public static final CartAddon$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CartAddon$$serializer cartAddon$$serializer = new CartAddon$$serializer();
        INSTANCE = cartAddon$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon", cartAddon$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("group_id", false);
        pluginGeneratedSerialDescriptor.j("choice_id", true);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.PRICE, true);
        pluginGeneratedSerialDescriptor.j("name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CartAddon$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a.p(a1Var), n.f23109b, a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon deserialize(kotlinx.serialization.encoding.Decoder r22) {
        /*
            r21 = this;
            r0 = r22
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r21.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0034
            java.lang.String r2 = r0.j(r1, r6)
            gq0.a1 r6 = gq0.a1.f23069b
            java.lang.Object r7 = r0.s(r1, r7, r6, r4)
            double r8 = r0.E(r1, r5)
            java.lang.Object r3 = r0.s(r1, r3, r6, r4)
            r4 = 15
            r15 = r2
            r17 = r8
            r14 = 15
            goto L_0x007b
        L_0x0034:
            r8 = 0
            r2 = r4
            r10 = r8
            r12 = 1
            r8 = r2
            r9 = r8
            r4 = 0
        L_0x003c:
            if (r12 == 0) goto L_0x0075
            int r13 = r0.w(r1)
            r14 = -1
            if (r13 == r14) goto L_0x0073
            if (r13 == 0) goto L_0x006c
            if (r13 == r7) goto L_0x0063
            if (r13 == r5) goto L_0x005c
            if (r13 != r3) goto L_0x0056
            gq0.a1 r13 = gq0.a1.f23069b
            java.lang.Object r9 = r0.s(r1, r3, r13, r9)
            r4 = r4 | 8
            goto L_0x003c
        L_0x0056:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r13)
            throw r0
        L_0x005c:
            double r10 = r0.E(r1, r5)
            r4 = r4 | 4
            goto L_0x003c
        L_0x0063:
            gq0.a1 r13 = gq0.a1.f23069b
            java.lang.Object r8 = r0.s(r1, r7, r13, r8)
            r4 = r4 | 2
            goto L_0x003c
        L_0x006c:
            java.lang.String r2 = r0.j(r1, r6)
            r4 = r4 | 1
            goto L_0x003c
        L_0x0073:
            r12 = 0
            goto L_0x003c
        L_0x0075:
            r15 = r2
            r14 = r4
            r7 = r8
            r3 = r9
            r17 = r10
        L_0x007b:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon r0 = new in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon
            r16 = r7
            java.lang.String r16 = (java.lang.String) r16
            r19 = r3
            java.lang.String r19 = (java.lang.String) r19
            r20 = 0
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public CartAddon patch(Decoder decoder, CartAddon cartAddon) {
        return (CartAddon) q.a.a(this, decoder, cartAddon);
    }

    public void serialize(Encoder encoder, CartAddon cartAddon) {
        p.j(encoder, "encoder");
        p.j(cartAddon, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CartAddon.c(cartAddon, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
