package in.swiggy.android.swiggylynx.plugin.cart.getcart.response;

import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.f0;
import gq0.n;
import gq0.q;
import gq0.w;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElementSerializer;

/* compiled from: CartItem.kt */
public final class CartItem$$serializer implements q<CartItem> {
    public static final CartItem$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CartItem$$serializer cartItem$$serializer = new CartItem$$serializer();
        INSTANCE = cartItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem", cartItem$$serializer, 13);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.QUANTITY, true);
        pluginGeneratedSerialDescriptor.j("menu_item_id", true);
        pluginGeneratedSerialDescriptor.j("variants", true);
        pluginGeneratedSerialDescriptor.j("addons", true);
        pluginGeneratedSerialDescriptor.j("rewardType", true);
        pluginGeneratedSerialDescriptor.j("in_stock", true);
        pluginGeneratedSerialDescriptor.j("base_price", true);
        pluginGeneratedSerialDescriptor.j("final_price", true);
        pluginGeneratedSerialDescriptor.j("subtotal", true);
        pluginGeneratedSerialDescriptor.j("subtotal_trade_discount", true);
        pluginGeneratedSerialDescriptor.j("valid_addons", true);
        pluginGeneratedSerialDescriptor.j("valid_variants", true);
        pluginGeneratedSerialDescriptor.j("valid_variants_v2", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CartItem$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        w wVar = w.f23130b;
        n nVar = n.f23109b;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f26449b;
        return new KSerializer[]{a.p(wVar), a.p(f0.f23081b), a.p(new f(GroupVariation2$$serializer.INSTANCE)), a.p(new f(CartAddon$$serializer.INSTANCE)), a.p(a1.f23069b), a.p(wVar), nVar, nVar, nVar, nVar, a.p(new f(jsonElementSerializer)), a.p(jsonElementSerializer), a.p(jsonElementSerializer)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x011c, code lost:
        r6 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0160, code lost:
        r6 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0163, code lost:
        r11 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0165, code lost:
        r14 = 12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem deserialize(kotlinx.serialization.encoding.Decoder r34) {
        /*
            r33 = this;
            r0 = r34
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r33.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r6 = 9
            r7 = 7
            r8 = 6
            r9 = 5
            r10 = 3
            r11 = 8
            r12 = 4
            r13 = 2
            r14 = 0
            r15 = 1
            r3 = 0
            if (r2 == 0) goto L_0x0089
            gq0.w r2 = gq0.w.f23130b
            java.lang.Object r14 = r0.s(r1, r14, r2, r3)
            gq0.f0 r4 = gq0.f0.f23081b
            java.lang.Object r4 = r0.s(r1, r15, r4, r3)
            gq0.f r15 = new gq0.f
            in.swiggy.android.swiggylynx.plugin.cart.getcart.response.GroupVariation2$$serializer r5 = in.swiggy.android.swiggylynx.plugin.cart.getcart.response.GroupVariation2$$serializer.INSTANCE
            r15.<init>(r5)
            java.lang.Object r5 = r0.s(r1, r13, r15, r3)
            gq0.f r13 = new gq0.f
            in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon$$serializer r15 = in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon$$serializer.INSTANCE
            r13.<init>(r15)
            java.lang.Object r10 = r0.s(r1, r10, r13, r3)
            gq0.a1 r13 = gq0.a1.f23069b
            java.lang.Object r12 = r0.s(r1, r12, r13, r3)
            java.lang.Object r2 = r0.s(r1, r9, r2, r3)
            double r8 = r0.E(r1, r8)
            double r18 = r0.E(r1, r7)
            double r20 = r0.E(r1, r11)
            double r6 = r0.E(r1, r6)
            gq0.f r11 = new gq0.f
            kotlinx.serialization.json.JsonElementSerializer r13 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            r11.<init>(r13)
            r15 = 10
            java.lang.Object r11 = r0.s(r1, r15, r11, r3)
            r15 = 11
            java.lang.Object r15 = r0.s(r1, r15, r13, r3)
            r16 = r14
            r14 = 12
            java.lang.Object r3 = r0.s(r1, r14, r13, r3)
            r13 = 8191(0x1fff, float:1.1478E-41)
            r14 = r11
            r27 = r18
            r29 = r20
            r20 = r6
            r17 = r8
            r11 = r10
            r7 = 8191(0x1fff, float:1.1478E-41)
            goto L_0x0182
        L_0x0089:
            r2 = 0
            r14 = 12
            r4 = 0
            r2 = r3
            r9 = r2
            r10 = r9
            r12 = r10
            r13 = r12
            r15 = r13
            r23 = r4
            r25 = r23
            r27 = r25
            r29 = r27
            r8 = 0
            r31 = 1
            r4 = r15
            r5 = r4
        L_0x00a1:
            if (r31 == 0) goto L_0x0172
            int r7 = r0.w(r1)
            switch(r7) {
                case -1: goto L_0x0169;
                case 0: goto L_0x0153;
                case 1: goto L_0x0145;
                case 2: goto L_0x0132;
                case 3: goto L_0x011f;
                case 4: goto L_0x010f;
                case 5: goto L_0x0102;
                case 6: goto L_0x00f5;
                case 7: goto L_0x00eb;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00d7;
                case 10: goto L_0x00c5;
                case 11: goto L_0x00ba;
                case 12: goto L_0x00b0;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r7)
            throw r0
        L_0x00b0:
            kotlinx.serialization.json.JsonElementSerializer r7 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            java.lang.Object r9 = r0.s(r1, r14, r7, r9)
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r7 = 7
            goto L_0x00a1
        L_0x00ba:
            kotlinx.serialization.json.JsonElementSerializer r7 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            r14 = 11
            java.lang.Object r12 = r0.s(r1, r14, r7, r12)
            r8 = r8 | 2048(0x800, float:2.87E-42)
            goto L_0x00e8
        L_0x00c5:
            r14 = 11
            gq0.f r7 = new gq0.f
            kotlinx.serialization.json.JsonElementSerializer r14 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            r7.<init>(r14)
            r14 = 10
            java.lang.Object r10 = r0.s(r1, r14, r7, r10)
            r8 = r8 | 1024(0x400, float:1.435E-42)
            goto L_0x00e8
        L_0x00d7:
            r14 = 10
            double r23 = r0.E(r1, r6)
            r8 = r8 | 512(0x200, float:7.175E-43)
            goto L_0x00e8
        L_0x00e0:
            r14 = 10
            double r29 = r0.E(r1, r11)
            r8 = r8 | 256(0x100, float:3.59E-43)
        L_0x00e8:
            r7 = 7
            goto L_0x0165
        L_0x00eb:
            r7 = 7
            r14 = 10
            double r27 = r0.E(r1, r7)
            r8 = r8 | 128(0x80, float:1.794E-43)
            goto L_0x0165
        L_0x00f5:
            r6 = 6
            r7 = 7
            r14 = 10
            double r25 = r0.E(r1, r6)
            r8 = r8 | 64
            r6 = 9
            goto L_0x0165
        L_0x0102:
            r7 = 7
            r14 = 10
            gq0.w r6 = gq0.w.f23130b
            r11 = 5
            java.lang.Object r13 = r0.s(r1, r11, r6, r13)
            r8 = r8 | 32
            goto L_0x011c
        L_0x010f:
            r7 = 7
            r11 = 5
            r14 = 10
            gq0.a1 r6 = gq0.a1.f23069b
            r11 = 4
            java.lang.Object r15 = r0.s(r1, r11, r6, r15)
            r8 = r8 | 16
        L_0x011c:
            r6 = 9
            goto L_0x0163
        L_0x011f:
            r7 = 7
            r11 = 4
            r14 = 10
            gq0.f r6 = new gq0.f
            in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon$$serializer r7 = in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon$$serializer.INSTANCE
            r6.<init>(r7)
            r7 = 3
            java.lang.Object r2 = r0.s(r1, r7, r6, r2)
            r8 = r8 | 8
            goto L_0x0160
        L_0x0132:
            r7 = 3
            r11 = 4
            r14 = 10
            gq0.f r6 = new gq0.f
            in.swiggy.android.swiggylynx.plugin.cart.getcart.response.GroupVariation2$$serializer r7 = in.swiggy.android.swiggylynx.plugin.cart.getcart.response.GroupVariation2$$serializer.INSTANCE
            r6.<init>(r7)
            r7 = 2
            java.lang.Object r5 = r0.s(r1, r7, r6, r5)
            r8 = r8 | 4
            goto L_0x0160
        L_0x0145:
            r7 = 2
            r11 = 4
            r14 = 10
            gq0.f0 r6 = gq0.f0.f23081b
            r11 = 1
            java.lang.Object r4 = r0.s(r1, r11, r6, r4)
            r8 = r8 | 2
            goto L_0x0160
        L_0x0153:
            r7 = 2
            r11 = 1
            r14 = 10
            gq0.w r6 = gq0.w.f23130b
            r7 = 0
            java.lang.Object r3 = r0.s(r1, r7, r6, r3)
            r8 = r8 | 1
        L_0x0160:
            r6 = 9
            r7 = 7
        L_0x0163:
            r11 = 8
        L_0x0165:
            r14 = 12
            goto L_0x00a1
        L_0x0169:
            r7 = 0
            r11 = 1
            r7 = 7
            r11 = 8
            r31 = 0
            goto L_0x00a1
        L_0x0172:
            r11 = r2
            r16 = r3
            r7 = r8
            r3 = r9
            r14 = r10
            r2 = r13
            r20 = r23
            r17 = r25
            r32 = r15
            r15 = r12
            r12 = r32
        L_0x0182:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem r0 = new in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem
            r6 = r0
            r8 = r16
            java.lang.Integer r8 = (java.lang.Integer) r8
            r9 = r4
            java.lang.Long r9 = (java.lang.Long) r9
            r10 = r5
            java.util.List r10 = (java.util.List) r10
            java.util.List r11 = (java.util.List) r11
            java.lang.String r12 = (java.lang.String) r12
            r13 = r2
            java.lang.Integer r13 = (java.lang.Integer) r13
            r22 = r14
            java.util.List r22 = (java.util.List) r22
            r23 = r15
            kotlinx.serialization.json.JsonElement r23 = (kotlinx.serialization.json.JsonElement) r23
            r24 = r3
            kotlinx.serialization.json.JsonElement r24 = (kotlinx.serialization.json.JsonElement) r24
            r25 = 0
            r14 = r17
            r16 = r27
            r18 = r29
            r6.<init>((int) r7, (java.lang.Integer) r8, (java.lang.Long) r9, (java.util.List) r10, (java.util.List) r11, (java.lang.String) r12, (java.lang.Integer) r13, (double) r14, (double) r16, (double) r18, (double) r20, (java.util.List) r22, (kotlinx.serialization.json.JsonElement) r23, (kotlinx.serialization.json.JsonElement) r24, (gq0.x0) r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public CartItem patch(Decoder decoder, CartItem cartItem) {
        return (CartItem) q.a.a(this, decoder, cartItem);
    }

    public void serialize(Encoder encoder, CartItem cartItem) {
        p.j(encoder, "encoder");
        p.j(cartItem, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CartItem.m(cartItem, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
