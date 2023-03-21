package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.h;
import gq0.q;
import gq0.w;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo$$serializer;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.TrackOrderType;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InstamartItemVariation.kt */
public final class InstamartItemVariation$$serializer implements q<InstamartItemVariation> {
    public static final InstamartItemVariation$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartItemVariation$$serializer instamartItemVariation$$serializer = new InstamartItemVariation$$serializer();
        INSTANCE = instamartItemVariation$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation", instamartItemVariation$$serializer, 24);
        pluginGeneratedSerialDescriptor.j(DistributedTracing.NR_ID_ATTRIBUTE, true);
        pluginGeneratedSerialDescriptor.j("tax_code", true);
        pluginGeneratedSerialDescriptor.j("commission_code", true);
        pluginGeneratedSerialDescriptor.j("hsn_code", true);
        pluginGeneratedSerialDescriptor.j("display_name", true);
        pluginGeneratedSerialDescriptor.j("spin", true);
        pluginGeneratedSerialDescriptor.j("images", true);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.PRICE, true);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.DISCOUNT, true);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.QUANTITY, true);
        pluginGeneratedSerialDescriptor.j("meta_for_pd", true);
        pluginGeneratedSerialDescriptor.j("meta", true);
        pluginGeneratedSerialDescriptor.j("tags", true);
        pluginGeneratedSerialDescriptor.j("inventory", true);
        pluginGeneratedSerialDescriptor.j("cart_allowed_quantity", true);
        pluginGeneratedSerialDescriptor.j("max_allowed_quantity", true);
        pluginGeneratedSerialDescriptor.j("weight_in_grams", true);
        pluginGeneratedSerialDescriptor.j("sub_category_type_max_allowed_quantity", true);
        pluginGeneratedSerialDescriptor.j("sub_category_type", true);
        pluginGeneratedSerialDescriptor.j("dimensions", true);
        pluginGeneratedSerialDescriptor.j("category", true);
        pluginGeneratedSerialDescriptor.j("super_category", true);
        pluginGeneratedSerialDescriptor.j("skuSlotInfo", true);
        pluginGeneratedSerialDescriptor.j(TrackOrderType.DEFAULT, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartItemVariation$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        w wVar = w.f23130b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(new f(a1Var)), a.p(InstamartItemPrice$$serializer.INSTANCE), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(InstamartItemMeta$$serializer.INSTANCE), a.p(new f(a1Var)), a.p(InstamartItemInventory$$serializer.INSTANCE), a.p(InstamartItemCartAllowedQty$$serializer.INSTANCE), a.p(wVar), a.p(wVar), a.p(wVar), a.p(a1Var), a.p(InstamartItemDimension$$serializer.INSTANCE), a.p(a1Var), a.p(a1Var), a.p(SkuSlotInfo$$serializer.INSTANCE), a.p(h.f23089b)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0170, code lost:
        r2 = r2 | r12;
        r11 = r11;
        r9 = r9;
        r8 = r8;
        r7 = r7;
        r5 = r5;
        r14 = r14;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x01d0, code lost:
        r2 = r2 | r12;
        r11 = r11;
        r9 = r9;
        r8 = r8;
        r7 = r7;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01f7, code lost:
        r3 = r51;
        r14 = r14;
        r6 = r6;
        r11 = r11;
        r9 = r9;
        r8 = r8;
        r7 = r7;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01f9, code lost:
        r13 = r48;
        r12 = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x041d, code lost:
        r3 = r51;
        r4 = r23;
        r12 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0423, code lost:
        r13 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012c, code lost:
        r14 = r14;
        r11 = r11;
        r9 = r9;
        r8 = r8;
        r7 = r7;
        r6 = r6;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012c, code lost:
        r14 = r14;
        r11 = r11;
        r9 = r9;
        r8 = r8;
        r7 = r7;
        r6 = r6;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012c, code lost:
        r14 = r14;
        r11 = r11;
        r9 = r9;
        r8 = r8;
        r7 = r7;
        r6 = r6;
        r5 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation deserialize(kotlinx.serialization.encoding.Decoder r51) {
        /*
            r50 = this;
            r0 = r51
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r50.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r12 = 10
            r13 = 9
            r14 = 7
            r15 = 6
            r3 = 5
            r4 = 3
            r6 = 8
            r5 = 4
            r7 = 2
            r8 = 0
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L_0x0107
            gq0.a1 r2 = gq0.a1.f23069b
            java.lang.Object r8 = r0.s(r1, r8, r2, r10)
            java.lang.Object r9 = r0.s(r1, r9, r2, r10)
            java.lang.Object r7 = r0.s(r1, r7, r2, r10)
            java.lang.Object r4 = r0.s(r1, r4, r2, r10)
            java.lang.Object r5 = r0.s(r1, r5, r2, r10)
            java.lang.Object r3 = r0.s(r1, r3, r2, r10)
            gq0.f r11 = new gq0.f
            r11.<init>(r2)
            java.lang.Object r11 = r0.s(r1, r15, r11, r10)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice$$serializer r15 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice$$serializer.INSTANCE
            java.lang.Object r14 = r0.s(r1, r14, r15, r10)
            java.lang.Object r6 = r0.s(r1, r6, r2, r10)
            java.lang.Object r13 = r0.s(r1, r13, r2, r10)
            java.lang.Object r12 = r0.s(r1, r12, r2, r10)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta$$serializer r15 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta$$serializer.INSTANCE
            r25 = r3
            r3 = 11
            java.lang.Object r3 = r0.s(r1, r3, r15, r10)
            gq0.f r15 = new gq0.f
            r15.<init>(r2)
            r24 = r3
            r3 = 12
            java.lang.Object r3 = r0.s(r1, r3, r15, r10)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory$$serializer r15 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory$$serializer.INSTANCE
            r23 = r3
            r3 = 13
            java.lang.Object r3 = r0.s(r1, r3, r15, r10)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty$$serializer r15 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty$$serializer.INSTANCE
            r22 = r3
            r3 = 14
            java.lang.Object r3 = r0.s(r1, r3, r15, r10)
            gq0.w r15 = gq0.w.f23130b
            r21 = r3
            r3 = 15
            java.lang.Object r3 = r0.s(r1, r3, r15, r10)
            r20 = r3
            r3 = 16
            java.lang.Object r3 = r0.s(r1, r3, r15, r10)
            r19 = r3
            r3 = 17
            java.lang.Object r3 = r0.s(r1, r3, r15, r10)
            r15 = 18
            java.lang.Object r15 = r0.s(r1, r15, r2, r10)
            r17 = r3
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension$$serializer r3 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension$$serializer.INSTANCE
            r18 = r4
            r4 = 19
            java.lang.Object r3 = r0.s(r1, r4, r3, r10)
            r4 = 20
            java.lang.Object r4 = r0.s(r1, r4, r2, r10)
            r51 = r3
            r3 = 21
            java.lang.Object r2 = r0.s(r1, r3, r2, r10)
            r3 = 22
            r16 = r2
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo$$serializer r2 = in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo$$serializer.INSTANCE
            java.lang.Object r2 = r0.s(r1, r3, r2, r10)
            r3 = 23
            r26 = r2
            gq0.h r2 = gq0.h.f23089b
            java.lang.Object r2 = r0.s(r1, r3, r2, r10)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r28 = r5
            r32 = r6
            r30 = r11
            r34 = r12
            r33 = r13
            r31 = r14
            r36 = r15
            r27 = r18
            r11 = r21
            r10 = r22
            r35 = r24
            r3 = r25
            r14 = r26
            r5 = r51
            r6 = r2
            r12 = r4
            r26 = r7
            r13 = r8
            r18 = r9
            r2 = r16
            r7 = r17
            r9 = r19
            r8 = r20
            r4 = r23
            r16 = 16777215(0xffffff, float:2.3509886E-38)
            goto L_0x047c
        L_0x0107:
            r3 = r10
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
            r36 = r15
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
            r46 = r45
            r2 = 0
            r47 = 1
        L_0x012c:
            if (r47 == 0) goto L_0x0450
            r48 = r13
            int r13 = r0.w(r1)
            switch(r13) {
                case -1: goto L_0x0427;
                case 0: goto L_0x03f3;
                case 1: goto L_0x03c0;
                case 2: goto L_0x038e;
                case 3: goto L_0x035e;
                case 4: goto L_0x0330;
                case 5: goto L_0x0304;
                case 6: goto L_0x02d5;
                case 7: goto L_0x02ac;
                case 8: goto L_0x0284;
                case 9: goto L_0x025e;
                case 10: goto L_0x0242;
                case 11: goto L_0x0222;
                case 12: goto L_0x01ff;
                case 13: goto L_0x01e5;
                case 14: goto L_0x01d2;
                case 15: goto L_0x01bd;
                case 16: goto L_0x01aa;
                case 17: goto L_0x0197;
                case 18: goto L_0x0184;
                case 19: goto L_0x0173;
                case 20: goto L_0x0164;
                case 21: goto L_0x0157;
                case 22: goto L_0x014a;
                case 23: goto L_0x013d;
                default: goto L_0x0137;
            }
        L_0x0137:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r13)
            throw r0
        L_0x013d:
            r13 = 23
            r49 = r12
            gq0.h r12 = gq0.h.f23089b
            java.lang.Object r6 = r0.s(r1, r13, r12, r6)
            r12 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0170
        L_0x014a:
            r49 = r12
            r12 = 22
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo$$serializer r13 = in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo$$serializer.INSTANCE
            java.lang.Object r14 = r0.s(r1, r12, r13, r14)
            r12 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0170
        L_0x0157:
            r49 = r12
            r12 = 21
            gq0.a1 r13 = gq0.a1.f23069b
            java.lang.Object r15 = r0.s(r1, r12, r13, r15)
            r12 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0170
        L_0x0164:
            r49 = r12
            gq0.a1 r12 = gq0.a1.f23069b
            r13 = 20
            java.lang.Object r3 = r0.s(r1, r13, r12, r3)
            r12 = 1048576(0x100000, float:1.469368E-39)
        L_0x0170:
            r2 = r2 | r12
            goto L_0x01f9
        L_0x0173:
            r49 = r12
            r13 = 20
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension$$serializer r12 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension$$serializer.INSTANCE
            r51 = r3
            r3 = 19
            java.lang.Object r5 = r0.s(r1, r3, r12, r5)
            r12 = 524288(0x80000, float:7.34684E-40)
            goto L_0x01d0
        L_0x0184:
            r51 = r3
            r49 = r12
            r3 = 19
            r13 = 20
            gq0.a1 r12 = gq0.a1.f23069b
            r3 = 18
            java.lang.Object r4 = r0.s(r1, r3, r12, r4)
            r12 = 262144(0x40000, float:3.67342E-40)
            goto L_0x01d0
        L_0x0197:
            r51 = r3
            r49 = r12
            r3 = 18
            r13 = 20
            gq0.w r12 = gq0.w.f23130b
            r3 = 17
            java.lang.Object r7 = r0.s(r1, r3, r12, r7)
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01d0
        L_0x01aa:
            r51 = r3
            r49 = r12
            r3 = 17
            r13 = 20
            gq0.w r12 = gq0.w.f23130b
            r3 = 16
            java.lang.Object r9 = r0.s(r1, r3, r12, r9)
            r12 = 65536(0x10000, float:9.18355E-41)
            goto L_0x01d0
        L_0x01bd:
            r51 = r3
            r49 = r12
            r3 = 16
            r13 = 20
            gq0.w r12 = gq0.w.f23130b
            r3 = 15
            java.lang.Object r8 = r0.s(r1, r3, r12, r8)
            r12 = 32768(0x8000, float:4.5918E-41)
        L_0x01d0:
            r2 = r2 | r12
            goto L_0x01f7
        L_0x01d2:
            r51 = r3
            r49 = r12
            r3 = 15
            r13 = 20
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty$$serializer r12 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty$$serializer.INSTANCE
            r3 = 14
            java.lang.Object r11 = r0.s(r1, r3, r12, r11)
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            goto L_0x01f7
        L_0x01e5:
            r51 = r3
            r49 = r12
            r3 = 14
            r13 = 20
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory$$serializer r12 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory$$serializer.INSTANCE
            r3 = 13
            java.lang.Object r10 = r0.s(r1, r3, r12, r10)
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
        L_0x01f7:
            r3 = r51
        L_0x01f9:
            r13 = r48
            r12 = r49
            goto L_0x012c
        L_0x01ff:
            r51 = r3
            r49 = r12
            r3 = 13
            r13 = 20
            gq0.f r12 = new gq0.f
            gq0.a1 r3 = gq0.a1.f23069b
            r12.<init>(r3)
            r23 = r4
            r3 = r49
            r4 = 12
            java.lang.Object r12 = r0.s(r1, r4, r12, r3)
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r3 = r51
            r4 = r23
            r13 = r48
            goto L_0x012c
        L_0x0222:
            r51 = r3
            r23 = r4
            r3 = r12
            r4 = 12
            r13 = 20
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta$$serializer r12 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta$$serializer.INSTANCE
            r24 = r3
            r4 = r48
            r3 = 11
            java.lang.Object r4 = r0.s(r1, r3, r12, r4)
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = r51
            r13 = r4
            r4 = r23
            r12 = r24
            goto L_0x012c
        L_0x0242:
            r51 = r3
            r23 = r4
            r24 = r12
            r4 = r48
            r3 = 11
            r13 = 20
            gq0.a1 r12 = gq0.a1.f23069b
            r35 = r4
            r3 = r46
            r4 = 10
            java.lang.Object r46 = r0.s(r1, r4, r12, r3)
            r2 = r2 | 1024(0x400, float:1.435E-42)
            goto L_0x041d
        L_0x025e:
            r51 = r3
            r23 = r4
            r24 = r12
            r3 = r46
            r35 = r48
            r4 = 10
            r13 = 20
            gq0.a1 r12 = gq0.a1.f23069b
            r34 = r3
            r4 = r45
            r3 = 9
            java.lang.Object r45 = r0.s(r1, r3, r12, r4)
            r2 = r2 | 512(0x200, float:7.175E-43)
            r3 = r51
            r4 = r23
            r12 = r24
            r46 = r34
            goto L_0x0423
        L_0x0284:
            r51 = r3
            r23 = r4
            r24 = r12
            r4 = r45
            r34 = r46
            r35 = r48
            r3 = 9
            r13 = 20
            gq0.a1 r12 = gq0.a1.f23069b
            r33 = r4
            r3 = r44
            r4 = 8
            java.lang.Object r44 = r0.s(r1, r4, r12, r3)
            r2 = r2 | 256(0x100, float:3.59E-43)
            r3 = r51
            r4 = r23
            r12 = r24
            r45 = r33
            goto L_0x0423
        L_0x02ac:
            r51 = r3
            r23 = r4
            r24 = r12
            r3 = r44
            r33 = r45
            r34 = r46
            r35 = r48
            r4 = 8
            r13 = 20
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice$$serializer r12 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice$$serializer.INSTANCE
            r32 = r3
            r4 = r43
            r3 = 7
            java.lang.Object r43 = r0.s(r1, r3, r12, r4)
            r2 = r2 | 128(0x80, float:1.794E-43)
            r3 = r51
            r4 = r23
            r12 = r24
            r44 = r32
            goto L_0x0423
        L_0x02d5:
            r51 = r3
            r23 = r4
            r24 = r12
            r4 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r48
            r3 = 7
            r13 = 20
            gq0.f r12 = new gq0.f
            gq0.a1 r3 = gq0.a1.f23069b
            r12.<init>(r3)
            r31 = r4
            r3 = r42
            r4 = 6
            java.lang.Object r42 = r0.s(r1, r4, r12, r3)
            r2 = r2 | 64
            r3 = r51
            r4 = r23
            r12 = r24
            r43 = r31
            goto L_0x0423
        L_0x0304:
            r51 = r3
            r23 = r4
            r24 = r12
            r3 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r48
            r4 = 6
            r13 = 20
            gq0.a1 r12 = gq0.a1.f23069b
            r30 = r3
            r4 = r41
            r3 = 5
            java.lang.Object r41 = r0.s(r1, r3, r12, r4)
            r2 = r2 | 32
            r3 = r51
            r4 = r23
            r12 = r24
            r42 = r30
            goto L_0x0423
        L_0x0330:
            r51 = r3
            r23 = r4
            r24 = r12
            r4 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r48
            r3 = 5
            r13 = 20
            gq0.a1 r12 = gq0.a1.f23069b
            r29 = r4
            r3 = r40
            r4 = 4
            java.lang.Object r40 = r0.s(r1, r4, r12, r3)
            r2 = r2 | 16
            r3 = r51
            r4 = r23
            r12 = r24
            r41 = r29
            goto L_0x0423
        L_0x035e:
            r51 = r3
            r23 = r4
            r24 = r12
            r3 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r48
            r4 = 4
            r13 = 20
            gq0.a1 r12 = gq0.a1.f23069b
            r28 = r3
            r4 = r39
            r3 = 3
            java.lang.Object r39 = r0.s(r1, r3, r12, r4)
            r2 = r2 | 8
            r3 = r51
            r4 = r23
            r12 = r24
            r40 = r28
            goto L_0x0423
        L_0x038e:
            r51 = r3
            r23 = r4
            r24 = r12
            r4 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r48
            r3 = 3
            r13 = 20
            gq0.a1 r12 = gq0.a1.f23069b
            r27 = r4
            r3 = r38
            r4 = 2
            java.lang.Object r38 = r0.s(r1, r4, r12, r3)
            r2 = r2 | 4
            r3 = r51
            r4 = r23
            r12 = r24
            r39 = r27
            goto L_0x0423
        L_0x03c0:
            r51 = r3
            r23 = r4
            r24 = r12
            r3 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r48
            r4 = 2
            r13 = 20
            gq0.a1 r12 = gq0.a1.f23069b
            r26 = r3
            r4 = r37
            r3 = 1
            java.lang.Object r37 = r0.s(r1, r3, r12, r4)
            r2 = r2 | 2
            r3 = r51
            r4 = r23
            r12 = r24
            r38 = r26
            goto L_0x0423
        L_0x03f3:
            r51 = r3
            r23 = r4
            r24 = r12
            r4 = r37
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r48
            r3 = 1
            r13 = 20
            gq0.a1 r12 = gq0.a1.f23069b
            r3 = r36
            r13 = 0
            java.lang.Object r36 = r0.s(r1, r13, r12, r3)
            r2 = r2 | 1
        L_0x041d:
            r3 = r51
            r4 = r23
            r12 = r24
        L_0x0423:
            r13 = r35
            goto L_0x012c
        L_0x0427:
            r51 = r3
            r23 = r4
            r24 = r12
            r3 = r36
            r4 = r37
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r48
            r13 = 0
            r4 = r23
            r13 = r35
            r47 = 0
            r3 = r51
            goto L_0x012c
        L_0x0450:
            r51 = r3
            r23 = r4
            r24 = r12
            r35 = r13
            r3 = r36
            r4 = r37
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r12 = r51
            r16 = r2
            r13 = r3
            r18 = r4
            r2 = r15
            r36 = r23
            r4 = r24
            r3 = r29
        L_0x047c:
            r0.c(r1)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation r0 = new in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation
            r15 = r0
            r17 = r13
            java.lang.String r17 = (java.lang.String) r17
            java.lang.String r18 = (java.lang.String) r18
            r19 = r26
            java.lang.String r19 = (java.lang.String) r19
            r20 = r27
            java.lang.String r20 = (java.lang.String) r20
            r21 = r28
            java.lang.String r21 = (java.lang.String) r21
            r22 = r3
            java.lang.String r22 = (java.lang.String) r22
            r23 = r30
            java.util.List r23 = (java.util.List) r23
            r24 = r31
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice r24 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice) r24
            r25 = r32
            java.lang.String r25 = (java.lang.String) r25
            r26 = r33
            java.lang.String r26 = (java.lang.String) r26
            r27 = r34
            java.lang.String r27 = (java.lang.String) r27
            r28 = r35
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta r28 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta) r28
            r29 = r4
            java.util.List r29 = (java.util.List) r29
            r30 = r10
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory r30 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory) r30
            r31 = r11
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty r31 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty) r31
            r32 = r8
            java.lang.Integer r32 = (java.lang.Integer) r32
            r33 = r9
            java.lang.Integer r33 = (java.lang.Integer) r33
            r34 = r7
            java.lang.Integer r34 = (java.lang.Integer) r34
            r35 = r36
            java.lang.String r35 = (java.lang.String) r35
            r36 = r5
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension r36 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension) r36
            r37 = r12
            java.lang.String r37 = (java.lang.String) r37
            r38 = r2
            java.lang.String r38 = (java.lang.String) r38
            r39 = r14
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo r39 = (in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo) r39
            r40 = r6
            java.lang.Boolean r40 = (java.lang.Boolean) r40
            r41 = 0
            r15.<init>((int) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (java.util.List) r23, (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice) r24, (java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta) r28, (java.util.List) r29, (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory) r30, (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty) r31, (java.lang.Integer) r32, (java.lang.Integer) r33, (java.lang.Integer) r34, (java.lang.String) r35, (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension) r36, (java.lang.String) r37, (java.lang.String) r38, (in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo) r39, (java.lang.Boolean) r40, (gq0.x0) r41)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartItemVariation patch(Decoder decoder, InstamartItemVariation instamartItemVariation) {
        return (InstamartItemVariation) q.a.a(this, decoder, instamartItemVariation);
    }

    public void serialize(Encoder encoder, InstamartItemVariation instamartItemVariation) {
        p.j(encoder, "encoder");
        p.j(instamartItemVariation, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartItemVariation.write$Self(instamartItemVariation, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
