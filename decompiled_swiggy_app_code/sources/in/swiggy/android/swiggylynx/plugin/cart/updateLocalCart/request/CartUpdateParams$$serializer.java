package in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request;

import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.f0;
import gq0.h;
import gq0.q;
import gq0.w;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem$$serializer;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElementSerializer;

/* compiled from: CartUpdateParams.kt */
public final class CartUpdateParams$$serializer implements q<CartUpdateParams> {
    public static final CartUpdateParams$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CartUpdateParams$$serializer cartUpdateParams$$serializer = new CartUpdateParams$$serializer();
        INSTANCE = cartUpdateParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CartUpdateParams", cartUpdateParams$$serializer, 24);
        pluginGeneratedSerialDescriptor.j("restaurantId", true);
        pluginGeneratedSerialDescriptor.j("restaurantName", true);
        pluginGeneratedSerialDescriptor.j("restaurantCloudinaryImageId", true);
        pluginGeneratedSerialDescriptor.j("address_id", true);
        pluginGeneratedSerialDescriptor.j("isCouponValid", true);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.CART_ID, true);
        pluginGeneratedSerialDescriptor.j("originalCartId", true);
        pluginGeneratedSerialDescriptor.j("cartItems", true);
        pluginGeneratedSerialDescriptor.j("batchOptIn", true);
        pluginGeneratedSerialDescriptor.j("orderComment", true);
        pluginGeneratedSerialDescriptor.j("cutleryComments", true);
        pluginGeneratedSerialDescriptor.j("tipDetails", true);
        pluginGeneratedSerialDescriptor.j("couponCode", true);
        pluginGeneratedSerialDescriptor.j("mealItems", true);
        pluginGeneratedSerialDescriptor.j("subscriptionItems", true);
        pluginGeneratedSerialDescriptor.j("address_nudge_check", true);
        pluginGeneratedSerialDescriptor.j("cart_type", true);
        pluginGeneratedSerialDescriptor.j("sld", true);
        pluginGeneratedSerialDescriptor.j("selectedAddress", true);
        pluginGeneratedSerialDescriptor.j("discountMessage", true);
        pluginGeneratedSerialDescriptor.j("addressSortingWeight", true);
        pluginGeneratedSerialDescriptor.j("selected_drop_off_instruction_ids", true);
        pluginGeneratedSerialDescriptor.j("selected_sla_option", true);
        pluginGeneratedSerialDescriptor.j("shouldRefreshMenu", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CartUpdateParams$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        w wVar = w.f23130b;
        f0 f0Var = f0.f23081b;
        h hVar = h.f23089b;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f26449b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), wVar, a.p(f0Var), a.p(f0Var), a.p(new f(CartItem$$serializer.INSTANCE)), a.p(hVar), a.p(a1Var), a.p(a1Var), a.p(jsonElementSerializer), a.p(a1Var), a.p(new f(jsonElementSerializer)), a.p(new f(jsonElementSerializer)), a.p(hVar), a.p(a1Var), a.p(wVar), a.p(jsonElementSerializer), a.p(a1Var), a.p(jsonElementSerializer), a.p(new f(a1Var)), a.p(a1Var), a.p(hVar)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0165, code lost:
        r10 = r10 | r6;
        r6 = r46;
        r13 = r47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x01c8, code lost:
        r10 = r10 | r6;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01f9, code lost:
        r6 = r46;
        r13 = r47;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0324, code lost:
        r6 = r14;
        r2 = r23;
        r3 = r24;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x03e2, code lost:
        r4 = r27;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x03e4, code lost:
        r14 = r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0117, code lost:
        r7 = r7;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0117, code lost:
        r7 = r7;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0117, code lost:
        r5 = r5;
        r7 = r7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CartUpdateParams deserialize(kotlinx.serialization.encoding.Decoder r78) {
        /*
            r77 = this;
            r0 = r78
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r77.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r13 = 9
            r14 = 7
            r15 = 6
            r3 = 5
            r4 = 3
            r6 = 8
            r5 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r2 == 0) goto L_0x00f1
            gq0.a1 r2 = gq0.a1.f23069b
            java.lang.Object r9 = r0.s(r1, r9, r2, r10)
            java.lang.Object r8 = r0.s(r1, r8, r2, r10)
            java.lang.Object r7 = r0.s(r1, r7, r2, r10)
            java.lang.Object r4 = r0.s(r1, r4, r2, r10)
            int r5 = r0.g(r1, r5)
            gq0.f0 r11 = gq0.f0.f23081b
            java.lang.Object r3 = r0.s(r1, r3, r11, r10)
            java.lang.Object r11 = r0.s(r1, r15, r11, r10)
            gq0.f r15 = new gq0.f
            in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem$$serializer r12 = in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem$$serializer.INSTANCE
            r15.<init>(r12)
            java.lang.Object r12 = r0.s(r1, r14, r15, r10)
            gq0.h r14 = gq0.h.f23089b
            java.lang.Object r6 = r0.s(r1, r6, r14, r10)
            java.lang.Object r13 = r0.s(r1, r13, r2, r10)
            r15 = 10
            java.lang.Object r15 = r0.s(r1, r15, r2, r10)
            r24 = r3
            kotlinx.serialization.json.JsonElementSerializer r3 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            r25 = r4
            r4 = 11
            java.lang.Object r4 = r0.s(r1, r4, r3, r10)
            r23 = r4
            r4 = 12
            java.lang.Object r4 = r0.s(r1, r4, r2, r10)
            r22 = r4
            gq0.f r4 = new gq0.f
            r4.<init>(r3)
            r26 = r5
            r5 = 13
            java.lang.Object r4 = r0.s(r1, r5, r4, r10)
            gq0.f r5 = new gq0.f
            r5.<init>(r3)
            r21 = r4
            r4 = 14
            java.lang.Object r4 = r0.s(r1, r4, r5, r10)
            r5 = 15
            java.lang.Object r5 = r0.s(r1, r5, r14, r10)
            r19 = r4
            r4 = 16
            java.lang.Object r4 = r0.s(r1, r4, r2, r10)
            r18 = r4
            gq0.w r4 = gq0.w.f23130b
            r20 = r5
            r5 = 17
            java.lang.Object r4 = r0.s(r1, r5, r4, r10)
            r5 = 18
            java.lang.Object r5 = r0.s(r1, r5, r3, r10)
            r17 = r4
            r4 = 19
            java.lang.Object r4 = r0.s(r1, r4, r2, r10)
            r16 = r4
            r4 = 20
            java.lang.Object r3 = r0.s(r1, r4, r3, r10)
            r4 = 21
            r78 = r3
            gq0.f r3 = new gq0.f
            r3.<init>(r2)
            java.lang.Object r3 = r0.s(r1, r4, r3, r10)
            r4 = 22
            java.lang.Object r2 = r0.s(r1, r4, r2, r10)
            r4 = 23
            java.lang.Object r4 = r0.s(r1, r4, r14, r10)
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            r48 = r4
            r14 = r23
            r4 = r25
            r55 = r26
            r50 = 16777215(0xffffff, float:2.3509886E-38)
            r26 = r7
            r7 = r5
            r5 = r78
            r76 = r24
            r24 = r3
            r3 = r76
            goto L_0x0452
        L_0x00f1:
            r2 = r10
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r35 = r15
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r10 = 0
            r34 = 0
            r45 = 1
        L_0x0117:
            if (r45 == 0) goto L_0x0412
            r46 = r6
            int r6 = r0.w(r1)
            switch(r6) {
                case -1: goto L_0x03e8;
                case 0: goto L_0x03b1;
                case 1: goto L_0x0381;
                case 2: goto L_0x0356;
                case 3: goto L_0x032b;
                case 4: goto L_0x0308;
                case 5: goto L_0x02df;
                case 6: goto L_0x02b8;
                case 7: goto L_0x028d;
                case 8: goto L_0x0268;
                case 9: goto L_0x0245;
                case 10: goto L_0x022d;
                case 11: goto L_0x0217;
                case 12: goto L_0x01ff;
                case 13: goto L_0x01e2;
                case 14: goto L_0x01ca;
                case 15: goto L_0x01b5;
                case 16: goto L_0x01a2;
                case 17: goto L_0x018f;
                case 18: goto L_0x017c;
                case 19: goto L_0x016b;
                case 20: goto L_0x0157;
                case 21: goto L_0x0142;
                case 22: goto L_0x0135;
                case 23: goto L_0x0128;
                default: goto L_0x0122;
            }
        L_0x0122:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r6)
            throw r0
        L_0x0128:
            r6 = 23
            r47 = r13
            gq0.h r13 = gq0.h.f23089b
            java.lang.Object r14 = r0.s(r1, r6, r13, r14)
            r6 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0165
        L_0x0135:
            r47 = r13
            r6 = 22
            gq0.a1 r13 = gq0.a1.f23069b
            java.lang.Object r15 = r0.s(r1, r6, r13, r15)
            r6 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0165
        L_0x0142:
            r47 = r13
            r6 = 21
            gq0.f r13 = new gq0.f
            r48 = r14
            gq0.a1 r14 = gq0.a1.f23069b
            r13.<init>(r14)
            java.lang.Object r3 = r0.s(r1, r6, r13, r3)
            r6 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x01c8
        L_0x0157:
            r47 = r13
            r48 = r14
            kotlinx.serialization.json.JsonElementSerializer r6 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            r13 = 20
            java.lang.Object r5 = r0.s(r1, r13, r6, r5)
            r6 = 1048576(0x100000, float:1.469368E-39)
        L_0x0165:
            r10 = r10 | r6
            r6 = r46
            r13 = r47
            goto L_0x0117
        L_0x016b:
            r47 = r13
            r48 = r14
            r13 = 20
            gq0.a1 r6 = gq0.a1.f23069b
            r14 = 19
            java.lang.Object r4 = r0.s(r1, r14, r6, r4)
            r6 = 524288(0x80000, float:7.34684E-40)
            goto L_0x01c8
        L_0x017c:
            r47 = r13
            r48 = r14
            r13 = 20
            r14 = 19
            kotlinx.serialization.json.JsonElementSerializer r6 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            r13 = 18
            java.lang.Object r7 = r0.s(r1, r13, r6, r7)
            r6 = 262144(0x40000, float:3.67342E-40)
            goto L_0x01c8
        L_0x018f:
            r47 = r13
            r48 = r14
            r13 = 18
            r14 = 19
            gq0.w r6 = gq0.w.f23130b
            r13 = 17
            java.lang.Object r8 = r0.s(r1, r13, r6, r8)
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01c8
        L_0x01a2:
            r47 = r13
            r48 = r14
            r13 = 17
            r14 = 19
            gq0.a1 r6 = gq0.a1.f23069b
            r13 = 16
            java.lang.Object r9 = r0.s(r1, r13, r6, r9)
            r6 = 65536(0x10000, float:9.18355E-41)
            goto L_0x01c8
        L_0x01b5:
            r47 = r13
            r48 = r14
            r13 = 16
            r14 = 19
            gq0.h r6 = gq0.h.f23089b
            r13 = 15
            java.lang.Object r12 = r0.s(r1, r13, r6, r12)
            r6 = 32768(0x8000, float:4.5918E-41)
        L_0x01c8:
            r10 = r10 | r6
            goto L_0x01f9
        L_0x01ca:
            r47 = r13
            r48 = r14
            r13 = 15
            r14 = 19
            gq0.f r6 = new gq0.f
            kotlinx.serialization.json.JsonElementSerializer r13 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            r6.<init>(r13)
            r13 = 14
            java.lang.Object r11 = r0.s(r1, r13, r6, r11)
            r10 = r10 | 16384(0x4000, float:2.2959E-41)
            goto L_0x01f9
        L_0x01e2:
            r47 = r13
            r48 = r14
            r13 = 14
            r14 = 19
            gq0.f r6 = new gq0.f
            kotlinx.serialization.json.JsonElementSerializer r13 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            r6.<init>(r13)
            r13 = 13
            java.lang.Object r2 = r0.s(r1, r13, r6, r2)
            r10 = r10 | 8192(0x2000, float:1.14794E-41)
        L_0x01f9:
            r6 = r46
            r13 = r47
            goto L_0x03e4
        L_0x01ff:
            r47 = r13
            r48 = r14
            r13 = 13
            r14 = 19
            gq0.a1 r6 = gq0.a1.f23069b
            r13 = r47
            r14 = 12
            java.lang.Object r13 = r0.s(r1, r14, r6, r13)
            r10 = r10 | 4096(0x1000, float:5.74E-42)
            r6 = r46
            goto L_0x03e4
        L_0x0217:
            r48 = r14
            r14 = 12
            kotlinx.serialization.json.JsonElementSerializer r6 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            r23 = r2
            r14 = r46
            r2 = 11
            java.lang.Object r6 = r0.s(r1, r2, r6, r14)
            r10 = r10 | 2048(0x800, float:2.87E-42)
            r2 = r23
            goto L_0x03e4
        L_0x022d:
            r23 = r2
            r48 = r14
            r14 = r46
            r2 = 11
            gq0.a1 r6 = gq0.a1.f23069b
            r24 = r3
            r2 = r44
            r3 = 10
            java.lang.Object r44 = r0.s(r1, r3, r6, r2)
            r10 = r10 | 1024(0x400, float:1.435E-42)
            goto L_0x0324
        L_0x0245:
            r23 = r2
            r24 = r3
            r48 = r14
            r2 = r44
            r14 = r46
            r3 = 10
            gq0.a1 r6 = gq0.a1.f23069b
            r33 = r2
            r3 = r43
            r2 = 9
            java.lang.Object r43 = r0.s(r1, r2, r6, r3)
            r10 = r10 | 512(0x200, float:7.175E-43)
            r6 = r14
            r2 = r23
            r3 = r24
            r44 = r33
            goto L_0x03e4
        L_0x0268:
            r23 = r2
            r24 = r3
            r48 = r14
            r3 = r43
            r33 = r44
            r14 = r46
            r2 = 9
            gq0.h r6 = gq0.h.f23089b
            r32 = r3
            r2 = r42
            r3 = 8
            java.lang.Object r42 = r0.s(r1, r3, r6, r2)
            r10 = r10 | 256(0x100, float:3.59E-43)
            r6 = r14
            r2 = r23
            r3 = r24
            r43 = r32
            goto L_0x03e4
        L_0x028d:
            r23 = r2
            r24 = r3
            r48 = r14
            r2 = r42
            r32 = r43
            r33 = r44
            r14 = r46
            r3 = 8
            gq0.f r6 = new gq0.f
            in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem$$serializer r3 = in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem$$serializer.INSTANCE
            r6.<init>(r3)
            r31 = r2
            r3 = r41
            r2 = 7
            java.lang.Object r41 = r0.s(r1, r2, r6, r3)
            r10 = r10 | 128(0x80, float:1.794E-43)
            r6 = r14
            r2 = r23
            r3 = r24
            r42 = r31
            goto L_0x03e4
        L_0x02b8:
            r23 = r2
            r24 = r3
            r48 = r14
            r3 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r14 = r46
            r2 = 7
            gq0.f0 r6 = gq0.f0.f23081b
            r30 = r3
            r2 = r40
            r3 = 6
            java.lang.Object r40 = r0.s(r1, r3, r6, r2)
            r10 = r10 | 64
            r6 = r14
            r2 = r23
            r3 = r24
            r41 = r30
            goto L_0x03e4
        L_0x02df:
            r23 = r2
            r24 = r3
            r48 = r14
            r2 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r14 = r46
            r3 = 6
            gq0.f0 r6 = gq0.f0.f23081b
            r29 = r2
            r3 = r39
            r2 = 5
            java.lang.Object r39 = r0.s(r1, r2, r6, r3)
            r10 = r10 | 32
            r6 = r14
            r2 = r23
            r3 = r24
            r40 = r29
            goto L_0x03e4
        L_0x0308:
            r23 = r2
            r24 = r3
            r48 = r14
            r3 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r14 = r46
            r2 = 5
            r6 = 4
            int r34 = r0.g(r1, r6)
            r10 = r10 | 16
        L_0x0324:
            r6 = r14
            r2 = r23
            r3 = r24
            goto L_0x03e4
        L_0x032b:
            r23 = r2
            r24 = r3
            r48 = r14
            r3 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r14 = r46
            r6 = 4
            gq0.a1 r2 = gq0.a1.f23069b
            r28 = r3
            r6 = r38
            r3 = 3
            java.lang.Object r38 = r0.s(r1, r3, r2, r6)
            r10 = r10 | 8
            r6 = r14
            r2 = r23
            r3 = r24
            r39 = r28
            goto L_0x03e4
        L_0x0356:
            r23 = r2
            r24 = r3
            r48 = r14
            r6 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r14 = r46
            r3 = 3
            gq0.a1 r2 = gq0.a1.f23069b
            r27 = r4
            r3 = r37
            r4 = 2
            java.lang.Object r37 = r0.s(r1, r4, r2, r3)
            r10 = r10 | 4
            r6 = r14
            r2 = r23
            r3 = r24
            goto L_0x03e2
        L_0x0381:
            r23 = r2
            r24 = r3
            r27 = r4
            r48 = r14
            r3 = r37
            r6 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r14 = r46
            r4 = 2
            gq0.a1 r2 = gq0.a1.f23069b
            r26 = r3
            r4 = r36
            r3 = 1
            java.lang.Object r36 = r0.s(r1, r3, r2, r4)
            r10 = r10 | 2
            r6 = r14
            r2 = r23
            r3 = r24
            r37 = r26
            goto L_0x03e2
        L_0x03b1:
            r23 = r2
            r24 = r3
            r27 = r4
            r48 = r14
            r4 = r36
            r26 = r37
            r6 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r14 = r46
            r3 = 1
            gq0.a1 r2 = gq0.a1.f23069b
            r25 = r4
            r3 = r35
            r4 = 0
            java.lang.Object r35 = r0.s(r1, r4, r2, r3)
            r10 = r10 | 1
            r6 = r14
            r2 = r23
            r3 = r24
            r36 = r25
        L_0x03e2:
            r4 = r27
        L_0x03e4:
            r14 = r48
            goto L_0x0117
        L_0x03e8:
            r23 = r2
            r24 = r3
            r27 = r4
            r48 = r14
            r3 = r35
            r25 = r36
            r26 = r37
            r6 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r14 = r46
            r4 = 0
            r6 = r14
            r3 = r24
            r4 = r27
            r14 = r48
            r45 = 0
            goto L_0x0117
        L_0x0412:
            r23 = r2
            r24 = r3
            r27 = r4
            r48 = r14
            r3 = r35
            r25 = r36
            r26 = r37
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r14 = r6
            r6 = r38
            r4 = r6
            r17 = r8
            r18 = r9
            r50 = r10
            r19 = r11
            r20 = r12
            r22 = r13
            r2 = r15
            r21 = r23
            r8 = r25
            r16 = r27
            r11 = r29
            r12 = r30
            r6 = r31
            r13 = r32
            r15 = r33
            r55 = r34
            r9 = r3
            r3 = r28
        L_0x0452:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CartUpdateParams r0 = new in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CartUpdateParams
            r49 = r0
            r51 = r9
            java.lang.String r51 = (java.lang.String) r51
            r52 = r8
            java.lang.String r52 = (java.lang.String) r52
            r53 = r26
            java.lang.String r53 = (java.lang.String) r53
            r54 = r4
            java.lang.String r54 = (java.lang.String) r54
            r56 = r3
            java.lang.Long r56 = (java.lang.Long) r56
            r57 = r11
            java.lang.Long r57 = (java.lang.Long) r57
            r58 = r12
            java.util.List r58 = (java.util.List) r58
            r59 = r6
            java.lang.Boolean r59 = (java.lang.Boolean) r59
            r60 = r13
            java.lang.String r60 = (java.lang.String) r60
            r61 = r15
            java.lang.String r61 = (java.lang.String) r61
            r62 = r14
            kotlinx.serialization.json.JsonElement r62 = (kotlinx.serialization.json.JsonElement) r62
            r63 = r22
            java.lang.String r63 = (java.lang.String) r63
            r64 = r21
            java.util.List r64 = (java.util.List) r64
            r65 = r19
            java.util.List r65 = (java.util.List) r65
            r66 = r20
            java.lang.Boolean r66 = (java.lang.Boolean) r66
            r67 = r18
            java.lang.String r67 = (java.lang.String) r67
            r68 = r17
            java.lang.Integer r68 = (java.lang.Integer) r68
            r69 = r7
            kotlinx.serialization.json.JsonElement r69 = (kotlinx.serialization.json.JsonElement) r69
            r70 = r16
            java.lang.String r70 = (java.lang.String) r70
            r71 = r5
            kotlinx.serialization.json.JsonElement r71 = (kotlinx.serialization.json.JsonElement) r71
            r72 = r24
            java.util.List r72 = (java.util.List) r72
            r73 = r2
            java.lang.String r73 = (java.lang.String) r73
            r74 = r48
            java.lang.Boolean r74 = (java.lang.Boolean) r74
            r75 = 0
            r49.<init>((int) r50, (java.lang.String) r51, (java.lang.String) r52, (java.lang.String) r53, (java.lang.String) r54, (int) r55, (java.lang.Long) r56, (java.lang.Long) r57, (java.util.List) r58, (java.lang.Boolean) r59, (java.lang.String) r60, (java.lang.String) r61, (kotlinx.serialization.json.JsonElement) r62, (java.lang.String) r63, (java.util.List) r64, (java.util.List) r65, (java.lang.Boolean) r66, (java.lang.String) r67, (java.lang.Integer) r68, (kotlinx.serialization.json.JsonElement) r69, (java.lang.String) r70, (kotlinx.serialization.json.JsonElement) r71, (java.util.List) r72, (java.lang.String) r73, (java.lang.Boolean) r74, (gq0.x0) r75)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CartUpdateParams$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CartUpdateParams");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public CartUpdateParams patch(Decoder decoder, CartUpdateParams cartUpdateParams) {
        return (CartUpdateParams) q.a.a(this, decoder, cartUpdateParams);
    }

    public void serialize(Encoder encoder, CartUpdateParams cartUpdateParams) {
        p.j(encoder, "encoder");
        p.j(cartUpdateParams, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CartUpdateParams.w(cartUpdateParams, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
