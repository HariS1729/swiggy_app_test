package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.q;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon$$serializer;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem$$serializer;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation$$serializer;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: GetIMCartData.kt */
public final class GetIMCartData$$serializer implements q<GetIMCartData> {
    public static final GetIMCartData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        GetIMCartData$$serializer getIMCartData$$serializer = new GetIMCartData$$serializer();
        INSTANCE = getIMCartData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData", getIMCartData$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("bill", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        pluginGeneratedSerialDescriptor.j("location", false);
        pluginGeneratedSerialDescriptor.j("coupon", true);
        pluginGeneratedSerialDescriptor.j("storesInfo", false);
        pluginGeneratedSerialDescriptor.j("cartId", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("superData", true);
        pluginGeneratedSerialDescriptor.j("metadata", true);
        pluginGeneratedSerialDescriptor.j("addressId", true);
        pluginGeneratedSerialDescriptor.j("deliveryType", true);
        pluginGeneratedSerialDescriptor.j("slotId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetIMCartData$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{InstamartBill$$serializer.INSTANCE, new f(InstamartItem$$serializer.INSTANCE), InstamartLocation$$serializer.INSTANCE, a.p(InstamartCoupon$$serializer.INSTANCE), new f(InstamartStoresInfo$$serializer.INSTANCE), a1Var, a1Var, a.p(InstamartSuperData$$serializer.INSTANCE), a.p(InstamartMetaData$$serializer.INSTANCE), a.p(a1Var), a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e2, code lost:
        r2 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0129, code lost:
        r2 = 11;
        r4 = 10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData deserialize(kotlinx.serialization.encoding.Decoder r25) {
        /*
            r24 = this;
            r0 = r25
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r24.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r4 = 10
            r5 = 9
            r6 = 7
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 8
            r11 = 4
            r12 = 2
            r13 = 0
            r14 = 1
            r15 = 0
            if (r2 == 0) goto L_0x0078
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartBill$$serializer r2 = in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartBill$$serializer.INSTANCE
            java.lang.Object r2 = r0.o(r1, r13, r2, r15)
            gq0.f r13 = new gq0.f
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem$$serializer r3 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem$$serializer.INSTANCE
            r13.<init>(r3)
            java.lang.Object r3 = r0.o(r1, r14, r13, r15)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation$$serializer r13 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation$$serializer.INSTANCE
            java.lang.Object r12 = r0.o(r1, r12, r13, r15)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon$$serializer r13 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon$$serializer.INSTANCE
            java.lang.Object r9 = r0.s(r1, r9, r13, r15)
            gq0.f r13 = new gq0.f
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartStoresInfo$$serializer r14 = in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartStoresInfo$$serializer.INSTANCE
            r13.<init>(r14)
            java.lang.Object r11 = r0.o(r1, r11, r13, r15)
            java.lang.String r8 = r0.j(r1, r8)
            java.lang.String r7 = r0.j(r1, r7)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartSuperData$$serializer r13 = in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartSuperData$$serializer.INSTANCE
            java.lang.Object r6 = r0.s(r1, r6, r13, r15)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartMetaData$$serializer r13 = in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartMetaData$$serializer.INSTANCE
            java.lang.Object r10 = r0.s(r1, r10, r13, r15)
            gq0.a1 r13 = gq0.a1.f23069b
            java.lang.Object r5 = r0.s(r1, r5, r13, r15)
            java.lang.Object r4 = r0.s(r1, r4, r13, r15)
            r14 = 11
            java.lang.Object r13 = r0.s(r1, r14, r13, r15)
            r14 = 4095(0xfff, float:5.738E-42)
            r15 = r7
            r14 = r8
            r8 = 4095(0xfff, float:5.738E-42)
            goto L_0x014d
        L_0x0078:
            r2 = 11
            r6 = r15
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r19 = r14
            r20 = r19
            r3 = 0
            r22 = 1
        L_0x008a:
            if (r22 == 0) goto L_0x013b
            int r5 = r0.w(r1)
            switch(r5) {
                case -1: goto L_0x0131;
                case 0: goto L_0x011e;
                case 1: goto L_0x010d;
                case 2: goto L_0x0101;
                case 3: goto L_0x00f5;
                case 4: goto L_0x00e5;
                case 5: goto L_0x00da;
                case 6: goto L_0x00d1;
                case 7: goto L_0x00c5;
                case 8: goto L_0x00b8;
                case 9: goto L_0x00ad;
                case 10: goto L_0x00a3;
                case 11: goto L_0x0099;
                default: goto L_0x0093;
            }
        L_0x0093:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r5)
            throw r0
        L_0x0099:
            gq0.a1 r5 = gq0.a1.f23069b
            java.lang.Object r10 = r0.s(r1, r2, r5, r10)
            r3 = r3 | 2048(0x800, float:2.87E-42)
            goto L_0x012d
        L_0x00a3:
            gq0.a1 r5 = gq0.a1.f23069b
            java.lang.Object r6 = r0.s(r1, r4, r5, r6)
            r3 = r3 | 1024(0x400, float:1.435E-42)
            goto L_0x012d
        L_0x00ad:
            gq0.a1 r5 = gq0.a1.f23069b
            r2 = 9
            java.lang.Object r7 = r0.s(r1, r2, r5, r7)
            r3 = r3 | 512(0x200, float:7.175E-43)
            goto L_0x00e2
        L_0x00b8:
            r2 = 9
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartMetaData$$serializer r5 = in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartMetaData$$serializer.INSTANCE
            r2 = 8
            java.lang.Object r8 = r0.s(r1, r2, r5, r8)
            r3 = r3 | 256(0x100, float:3.59E-43)
            goto L_0x00e2
        L_0x00c5:
            r2 = 8
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartSuperData$$serializer r5 = in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartSuperData$$serializer.INSTANCE
            r2 = 7
            java.lang.Object r11 = r0.s(r1, r2, r5, r11)
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x00e2
        L_0x00d1:
            r2 = 7
            r5 = 6
            java.lang.String r20 = r0.j(r1, r5)
            r3 = r3 | 64
            goto L_0x00e2
        L_0x00da:
            r2 = 5
            r5 = 6
            java.lang.String r19 = r0.j(r1, r2)
            r3 = r3 | 32
        L_0x00e2:
            r2 = 11
            goto L_0x012d
        L_0x00e5:
            r5 = 6
            gq0.f r2 = new gq0.f
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartStoresInfo$$serializer r4 = in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartStoresInfo$$serializer.INSTANCE
            r2.<init>(r4)
            r4 = 4
            java.lang.Object r9 = r0.o(r1, r4, r2, r9)
            r3 = r3 | 16
            goto L_0x0129
        L_0x00f5:
            r4 = 4
            r5 = 6
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon$$serializer r2 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon$$serializer.INSTANCE
            r4 = 3
            java.lang.Object r12 = r0.s(r1, r4, r2, r12)
            r3 = r3 | 8
            goto L_0x0129
        L_0x0101:
            r4 = 3
            r5 = 6
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation$$serializer r2 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation$$serializer.INSTANCE
            r4 = 2
            java.lang.Object r14 = r0.o(r1, r4, r2, r14)
            r3 = r3 | 4
            goto L_0x0129
        L_0x010d:
            r4 = 2
            r5 = 6
            gq0.f r2 = new gq0.f
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem$$serializer r4 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem$$serializer.INSTANCE
            r2.<init>(r4)
            r4 = 1
            java.lang.Object r13 = r0.o(r1, r4, r2, r13)
            r3 = r3 | 2
            goto L_0x0129
        L_0x011e:
            r4 = 1
            r5 = 6
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartBill$$serializer r2 = in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartBill$$serializer.INSTANCE
            r4 = 0
            java.lang.Object r15 = r0.o(r1, r4, r2, r15)
            r3 = r3 | 1
        L_0x0129:
            r2 = 11
            r4 = 10
        L_0x012d:
            r5 = 9
            goto L_0x008a
        L_0x0131:
            r4 = 0
            r5 = 6
            r4 = 10
            r5 = 9
            r22 = 0
            goto L_0x008a
        L_0x013b:
            r4 = r6
            r5 = r7
            r6 = r11
            r2 = r15
            r15 = r20
            r11 = r9
            r9 = r12
            r12 = r14
            r14 = r19
            r23 = r8
            r8 = r3
            r3 = r13
            r13 = r10
            r10 = r23
        L_0x014d:
            r0.c(r1)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData r0 = new in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData
            r1 = r2
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartBill r1 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartBill) r1
            r2 = r3
            java.util.List r2 = (java.util.List) r2
            r3 = r12
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation r3 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation) r3
            r12 = r9
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon r12 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon) r12
            r16 = r11
            java.util.List r16 = (java.util.List) r16
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartSuperData r6 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartSuperData) r6
            r17 = r10
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartMetaData r17 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartMetaData) r17
            r18 = r5
            java.lang.String r18 = (java.lang.String) r18
            r19 = r4
            java.lang.String r19 = (java.lang.String) r19
            r20 = r13
            java.lang.String r20 = (java.lang.String) r20
            r21 = 0
            r7 = r0
            r9 = r1
            r10 = r2
            r11 = r3
            r13 = r16
            r16 = r6
            r7.<init>((int) r8, (in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartBill) r9, (java.util.List) r10, (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation) r11, (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon) r12, (java.util.List) r13, (java.lang.String) r14, (java.lang.String) r15, (in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartSuperData) r16, (in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartMetaData) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (gq0.x0) r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public GetIMCartData patch(Decoder decoder, GetIMCartData getIMCartData) {
        return (GetIMCartData) q.a.a(this, decoder, getIMCartData);
    }

    public void serialize(Encoder encoder, GetIMCartData getIMCartData) {
        p.j(encoder, "encoder");
        p.j(getIMCartData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        GetIMCartData.write$Self(getIMCartData, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
