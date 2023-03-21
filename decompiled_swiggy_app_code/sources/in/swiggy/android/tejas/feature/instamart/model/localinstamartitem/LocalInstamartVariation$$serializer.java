package in.swiggy.android.tejas.feature.instamart.model.localinstamartitem;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.h;
import gq0.q;
import gq0.w;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty$$serializer;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension$$serializer;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory$$serializer;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta$$serializer;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.TrackOrderType;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: LocalInstamartVariation.kt */
public final class LocalInstamartVariation$$serializer implements q<LocalInstamartVariation> {
    public static final LocalInstamartVariation$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        LocalInstamartVariation$$serializer localInstamartVariation$$serializer = new LocalInstamartVariation$$serializer();
        INSTANCE = localInstamartVariation$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation", localInstamartVariation$$serializer, 15);
        pluginGeneratedSerialDescriptor.j(TrackOrderType.DEFAULT, false);
        pluginGeneratedSerialDescriptor.j(DistributedTracing.NR_ID_ATTRIBUTE, false);
        pluginGeneratedSerialDescriptor.j("displayName", true);
        pluginGeneratedSerialDescriptor.j("spin", true);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.PRICE, true);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.QUANTITY, true);
        pluginGeneratedSerialDescriptor.j("inventory", true);
        pluginGeneratedSerialDescriptor.j("cartAllowedQuantity", true);
        pluginGeneratedSerialDescriptor.j("maxAllowedQuantity", true);
        pluginGeneratedSerialDescriptor.j("weightInGrams", true);
        pluginGeneratedSerialDescriptor.j("subCategoryType", true);
        pluginGeneratedSerialDescriptor.j("dimensions", true);
        pluginGeneratedSerialDescriptor.j("meta", false);
        pluginGeneratedSerialDescriptor.j("images", false);
        pluginGeneratedSerialDescriptor.j("skuSlotInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LocalInstamartVariation$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        w wVar = w.f23130b;
        return new KSerializer[]{h.f23089b, a1Var, a.p(a1Var), a.p(a1Var), a.p(LocalInstamartPrice$$serializer.INSTANCE), a.p(a1Var), a.p(InstamartItemInventory$$serializer.INSTANCE), a.p(InstamartItemCartAllowedQty$$serializer.INSTANCE), a.p(wVar), a.p(wVar), a.p(a1Var), a.p(InstamartItemDimension$$serializer.INSTANCE), a.p(InstamartItemMeta$$serializer.INSTANCE), a.p(new f(a1Var)), a.p(SkuSlotInfo$$serializer.INSTANCE)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01a4, code lost:
        r5 = r16;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01a6, code lost:
        r2 = r27;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01de, code lost:
        r2 = r5;
        r5 = r16;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b6, code lost:
        r15 = r15;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r28.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r7 = 10
            r8 = 9
            r9 = 7
            r10 = 6
            r11 = 5
            r12 = 3
            r13 = 8
            r14 = 4
            r15 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x009f
            boolean r2 = r0.B(r1, r4)
            java.lang.String r3 = r0.j(r1, r3)
            gq0.a1 r4 = gq0.a1.f23069b
            java.lang.Object r15 = r0.s(r1, r15, r4, r5)
            java.lang.Object r12 = r0.s(r1, r12, r4, r5)
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartPrice$$serializer r6 = in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartPrice$$serializer.INSTANCE
            java.lang.Object r6 = r0.s(r1, r14, r6, r5)
            java.lang.Object r11 = r0.s(r1, r11, r4, r5)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory$$serializer r14 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory$$serializer.INSTANCE
            java.lang.Object r10 = r0.s(r1, r10, r14, r5)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty$$serializer r14 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty$$serializer.INSTANCE
            java.lang.Object r9 = r0.s(r1, r9, r14, r5)
            gq0.w r14 = gq0.w.f23130b
            java.lang.Object r13 = r0.s(r1, r13, r14, r5)
            java.lang.Object r8 = r0.s(r1, r8, r14, r5)
            java.lang.Object r7 = r0.s(r1, r7, r4, r5)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension$$serializer r14 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension$$serializer.INSTANCE
            r19 = r2
            r2 = 11
            java.lang.Object r2 = r0.s(r1, r2, r14, r5)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta$$serializer r14 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta$$serializer.INSTANCE
            r18 = r2
            r2 = 12
            java.lang.Object r2 = r0.s(r1, r2, r14, r5)
            gq0.f r14 = new gq0.f
            r14.<init>(r4)
            r4 = 13
            java.lang.Object r4 = r0.s(r1, r4, r14, r5)
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo$$serializer r14 = in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo$$serializer.INSTANCE
            r16 = r4
            r4 = 14
            java.lang.Object r4 = r0.s(r1, r4, r14, r5)
            r5 = 32767(0x7fff, float:4.5916E-41)
            r23 = r3
            r17 = r7
            r14 = r9
            r9 = r15
            r7 = r19
            r3 = r2
            r15 = r6
            r2 = r18
            r6 = r4
            r18 = r13
            r4 = r16
            r16 = r8
            r13 = r10
            r10 = r12
            r8 = 32767(0x7fff, float:4.5916E-41)
            r12 = r11
            goto L_0x020f
        L_0x009f:
            r2 = 0
            r4 = 14
            r2 = r5
            r3 = r2
            r7 = r3
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r19 = r15
            r24 = r19
            r6 = 0
            r25 = 0
            r26 = 1
        L_0x00b6:
            if (r26 == 0) goto L_0x01f5
            int r4 = r0.w(r1)
            switch(r4) {
                case -1: goto L_0x01e5;
                case 0: goto L_0x01d1;
                case 1: goto L_0x01c3;
                case 2: goto L_0x01a9;
                case 3: goto L_0x0194;
                case 4: goto L_0x0183;
                case 5: goto L_0x0172;
                case 6: goto L_0x0161;
                case 7: goto L_0x014f;
                case 8: goto L_0x013c;
                case 9: goto L_0x0128;
                case 10: goto L_0x0114;
                case 11: goto L_0x0100;
                case 12: goto L_0x00ec;
                case 13: goto L_0x00d3;
                case 14: goto L_0x00c5;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r4)
            throw r0
        L_0x00c5:
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo$$serializer r4 = in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo$$serializer.INSTANCE
            r27 = r2
            r2 = 14
            java.lang.Object r5 = r0.s(r1, r2, r4, r5)
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            goto L_0x01a6
        L_0x00d3:
            r27 = r2
            r2 = 14
            gq0.f r4 = new gq0.f
            gq0.a1 r2 = gq0.a1.f23069b
            r4.<init>(r2)
            r16 = r5
            r2 = r24
            r5 = 13
            java.lang.Object r24 = r0.s(r1, r5, r4, r2)
            r6 = r6 | 8192(0x2000, float:1.14794E-41)
            goto L_0x01a4
        L_0x00ec:
            r27 = r2
            r16 = r5
            r2 = r24
            r5 = 13
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta$$serializer r4 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta$$serializer.INSTANCE
            r5 = 12
            java.lang.Object r7 = r0.s(r1, r5, r4, r7)
            r6 = r6 | 4096(0x1000, float:5.74E-42)
            goto L_0x01a4
        L_0x0100:
            r27 = r2
            r16 = r5
            r2 = r24
            r5 = 12
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension$$serializer r4 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension$$serializer.INSTANCE
            r5 = 11
            java.lang.Object r8 = r0.s(r1, r5, r4, r8)
            r6 = r6 | 2048(0x800, float:2.87E-42)
            goto L_0x01a4
        L_0x0114:
            r27 = r2
            r16 = r5
            r2 = r24
            r5 = 11
            gq0.a1 r4 = gq0.a1.f23069b
            r5 = 10
            java.lang.Object r13 = r0.s(r1, r5, r4, r13)
            r6 = r6 | 1024(0x400, float:1.435E-42)
            goto L_0x01a4
        L_0x0128:
            r27 = r2
            r16 = r5
            r2 = r24
            r5 = 10
            gq0.w r4 = gq0.w.f23130b
            r5 = 9
            java.lang.Object r9 = r0.s(r1, r5, r4, r9)
            r6 = r6 | 512(0x200, float:7.175E-43)
            goto L_0x01a4
        L_0x013c:
            r27 = r2
            r16 = r5
            r2 = r24
            r5 = 9
            gq0.w r4 = gq0.w.f23130b
            r5 = 8
            java.lang.Object r10 = r0.s(r1, r5, r4, r10)
            r6 = r6 | 256(0x100, float:3.59E-43)
            goto L_0x01a4
        L_0x014f:
            r27 = r2
            r16 = r5
            r2 = r24
            r5 = 8
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty$$serializer r4 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty$$serializer.INSTANCE
            r5 = 7
            java.lang.Object r11 = r0.s(r1, r5, r4, r11)
            r6 = r6 | 128(0x80, float:1.794E-43)
            goto L_0x01a4
        L_0x0161:
            r27 = r2
            r16 = r5
            r2 = r24
            r5 = 7
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory$$serializer r4 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory$$serializer.INSTANCE
            r5 = 6
            java.lang.Object r14 = r0.s(r1, r5, r4, r14)
            r6 = r6 | 64
            goto L_0x01a4
        L_0x0172:
            r27 = r2
            r16 = r5
            r2 = r24
            r5 = 6
            gq0.a1 r4 = gq0.a1.f23069b
            r5 = 5
            java.lang.Object r12 = r0.s(r1, r5, r4, r12)
            r6 = r6 | 32
            goto L_0x01a4
        L_0x0183:
            r27 = r2
            r16 = r5
            r2 = r24
            r5 = 5
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartPrice$$serializer r4 = in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartPrice$$serializer.INSTANCE
            r5 = 4
            java.lang.Object r15 = r0.s(r1, r5, r4, r15)
            r6 = r6 | 16
            goto L_0x01a4
        L_0x0194:
            r27 = r2
            r16 = r5
            r2 = r24
            r5 = 4
            gq0.a1 r4 = gq0.a1.f23069b
            r5 = 3
            java.lang.Object r3 = r0.s(r1, r5, r4, r3)
            r6 = r6 | 8
        L_0x01a4:
            r5 = r16
        L_0x01a6:
            r2 = r27
            goto L_0x01e1
        L_0x01a9:
            r27 = r2
            r16 = r5
            r2 = r24
            r5 = 3
            gq0.a1 r4 = gq0.a1.f23069b
            r21 = r2
            r5 = r27
            r2 = 2
            java.lang.Object r4 = r0.s(r1, r2, r4, r5)
            r6 = r6 | 4
            r2 = r4
            r5 = r16
            r24 = r21
            goto L_0x01e1
        L_0x01c3:
            r16 = r5
            r21 = r24
            r4 = 1
            r5 = r2
            r2 = 2
            java.lang.String r19 = r0.j(r1, r4)
            r6 = r6 | 2
            goto L_0x01de
        L_0x01d1:
            r16 = r5
            r21 = r24
            r4 = 1
            r5 = r2
            r2 = 0
            boolean r25 = r0.B(r1, r2)
            r6 = r6 | 1
        L_0x01de:
            r2 = r5
            r5 = r16
        L_0x01e1:
            r4 = 14
            goto L_0x00b6
        L_0x01e5:
            r16 = r5
            r21 = r24
            r4 = 1
            r5 = r2
            r2 = 0
            r2 = r5
            r5 = r16
            r4 = 14
            r26 = 0
            goto L_0x00b6
        L_0x01f5:
            r16 = r5
            r21 = r24
            r5 = r2
            r2 = r8
            r18 = r10
            r17 = r13
            r13 = r14
            r23 = r19
            r4 = r21
            r10 = r3
            r8 = r6
            r3 = r7
            r14 = r11
            r6 = r16
            r7 = r25
            r16 = r9
            r9 = r5
        L_0x020f:
            r0.c(r1)
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation r0 = new in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation
            r5 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = (java.lang.String) r10
            r11 = r15
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartPrice r11 = (in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartPrice) r11
            java.lang.String r12 = (java.lang.String) r12
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory r13 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory) r13
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty r14 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty) r14
            r15 = r18
            java.lang.Integer r15 = (java.lang.Integer) r15
            java.lang.Integer r16 = (java.lang.Integer) r16
            java.lang.String r17 = (java.lang.String) r17
            r18 = r2
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension r18 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension) r18
            r19 = r3
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta r19 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta) r19
            r20 = r4
            java.util.List r20 = (java.util.List) r20
            r21 = r6
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo r21 = (in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo) r21
            r22 = 0
            r6 = r8
            r8 = r23
            r5.<init>((int) r6, (boolean) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartPrice) r11, (java.lang.String) r12, (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory) r13, (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty) r14, (java.lang.Integer) r15, (java.lang.Integer) r16, (java.lang.String) r17, (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension) r18, (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta) r19, (java.util.List) r20, (in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo) r21, (gq0.x0) r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public LocalInstamartVariation patch(Decoder decoder, LocalInstamartVariation localInstamartVariation) {
        return (LocalInstamartVariation) q.a.a(this, decoder, localInstamartVariation);
    }

    public void serialize(Encoder encoder, LocalInstamartVariation localInstamartVariation) {
        p.j(encoder, "encoder");
        p.j(localInstamartVariation, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        LocalInstamartVariation.write$Self(localInstamartVariation, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
