package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.h;
import gq0.q;
import gq0.w;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InstamartItem.kt */
public final class InstamartItem$$serializer implements q<InstamartItem> {
    public static final InstamartItem$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartItem$$serializer instamartItem$$serializer = new InstamartItem$$serializer();
        INSTANCE = instamartItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem", instamartItem$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("itemId", true);
        pluginGeneratedSerialDescriptor.j("itemVariantId", true);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.QUANTITY, true);
        pluginGeneratedSerialDescriptor.j("storeId", true);
        pluginGeneratedSerialDescriptor.j("imageIds", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("metadata", true);
        pluginGeneratedSerialDescriptor.j("outOfStock", true);
        pluginGeneratedSerialDescriptor.j("stockLimited", true);
        pluginGeneratedSerialDescriptor.j("freebie", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartItem$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        w wVar = w.f23130b;
        h hVar = h.f23089b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(wVar), a.p(wVar), a.p(new f(a1Var)), a.p(a1Var), a.p(a1Var), a.p(InstamartItemMetadata$$serializer.INSTANCE), a.p(hVar), a.p(hVar), a.p(hVar)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem deserialize(kotlinx.serialization.encoding.Decoder r22) {
        /*
            r21 = this;
            r0 = r22
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r21.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 10
            r4 = 9
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 3
            r9 = 8
            r10 = 4
            r11 = 2
            r12 = 0
            r13 = 1
            r14 = 0
            if (r2 == 0) goto L_0x0066
            gq0.a1 r2 = gq0.a1.f23069b
            java.lang.Object r12 = r0.s(r1, r12, r2, r14)
            java.lang.Object r13 = r0.s(r1, r13, r2, r14)
            gq0.w r15 = gq0.w.f23130b
            java.lang.Object r11 = r0.s(r1, r11, r15, r14)
            java.lang.Object r8 = r0.s(r1, r8, r15, r14)
            gq0.f r15 = new gq0.f
            r15.<init>(r2)
            java.lang.Object r10 = r0.s(r1, r10, r15, r14)
            java.lang.Object r7 = r0.s(r1, r7, r2, r14)
            java.lang.Object r2 = r0.s(r1, r6, r2, r14)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata$$serializer r6 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata$$serializer.INSTANCE
            java.lang.Object r5 = r0.s(r1, r5, r6, r14)
            gq0.h r6 = gq0.h.f23089b
            java.lang.Object r9 = r0.s(r1, r9, r6, r14)
            java.lang.Object r4 = r0.s(r1, r4, r6, r14)
            java.lang.Object r3 = r0.s(r1, r3, r6, r14)
            r6 = 2047(0x7ff, float:2.868E-42)
            r15 = r13
            r13 = r8
            r8 = r7
            r7 = 2047(0x7ff, float:2.868E-42)
            goto L_0x0119
        L_0x0066:
            r5 = r14
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
            r2 = 0
            r20 = 1
        L_0x0073:
            if (r20 == 0) goto L_0x0110
            int r4 = r0.w(r1)
            switch(r4) {
                case -1: goto L_0x0107;
                case 0: goto L_0x00f7;
                case 1: goto L_0x00ec;
                case 2: goto L_0x00e1;
                case 3: goto L_0x00d6;
                case 4: goto L_0x00c6;
                case 5: goto L_0x00bb;
                case 6: goto L_0x00b0;
                case 7: goto L_0x00a4;
                case 8: goto L_0x0097;
                case 9: goto L_0x008c;
                case 10: goto L_0x0082;
                default: goto L_0x007c;
            }
        L_0x007c:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r4)
            throw r0
        L_0x0082:
            gq0.h r4 = gq0.h.f23089b
            java.lang.Object r9 = r0.s(r1, r3, r4, r9)
            r2 = r2 | 1024(0x400, float:1.435E-42)
            goto L_0x0103
        L_0x008c:
            gq0.h r4 = gq0.h.f23089b
            r3 = 9
            java.lang.Object r5 = r0.s(r1, r3, r4, r5)
            r2 = r2 | 512(0x200, float:7.175E-43)
            goto L_0x0101
        L_0x0097:
            r3 = 9
            gq0.h r4 = gq0.h.f23089b
            r3 = 8
            java.lang.Object r6 = r0.s(r1, r3, r4, r6)
            r2 = r2 | 256(0x100, float:3.59E-43)
            goto L_0x0101
        L_0x00a4:
            r3 = 8
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata$$serializer r4 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata$$serializer.INSTANCE
            r3 = 7
            java.lang.Object r7 = r0.s(r1, r3, r4, r7)
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x0101
        L_0x00b0:
            r3 = 7
            gq0.a1 r4 = gq0.a1.f23069b
            r3 = 6
            java.lang.Object r10 = r0.s(r1, r3, r4, r10)
            r2 = r2 | 64
            goto L_0x0101
        L_0x00bb:
            r3 = 6
            gq0.a1 r4 = gq0.a1.f23069b
            r3 = 5
            java.lang.Object r8 = r0.s(r1, r3, r4, r8)
            r2 = r2 | 32
            goto L_0x0101
        L_0x00c6:
            r3 = 5
            gq0.f r4 = new gq0.f
            gq0.a1 r3 = gq0.a1.f23069b
            r4.<init>(r3)
            r3 = 4
            java.lang.Object r11 = r0.s(r1, r3, r4, r11)
            r2 = r2 | 16
            goto L_0x0101
        L_0x00d6:
            r3 = 4
            gq0.w r4 = gq0.w.f23130b
            r3 = 3
            java.lang.Object r13 = r0.s(r1, r3, r4, r13)
            r2 = r2 | 8
            goto L_0x0101
        L_0x00e1:
            r3 = 3
            gq0.w r4 = gq0.w.f23130b
            r3 = 2
            java.lang.Object r12 = r0.s(r1, r3, r4, r12)
            r2 = r2 | 4
            goto L_0x0101
        L_0x00ec:
            r3 = 2
            gq0.a1 r4 = gq0.a1.f23069b
            r3 = 1
            java.lang.Object r15 = r0.s(r1, r3, r4, r15)
            r2 = r2 | 2
            goto L_0x0101
        L_0x00f7:
            r3 = 1
            gq0.a1 r4 = gq0.a1.f23069b
            r3 = 0
            java.lang.Object r14 = r0.s(r1, r3, r4, r14)
            r2 = r2 | 1
        L_0x0101:
            r3 = 10
        L_0x0103:
            r4 = 9
            goto L_0x0073
        L_0x0107:
            r3 = 0
            r3 = 10
            r4 = 9
            r20 = 0
            goto L_0x0073
        L_0x0110:
            r4 = r5
            r5 = r7
            r3 = r9
            r7 = r2
            r9 = r6
            r2 = r10
            r10 = r11
            r11 = r12
            r12 = r14
        L_0x0119:
            r0.c(r1)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem r0 = new in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem
            r1 = r12
            java.lang.String r1 = (java.lang.String) r1
            r12 = r15
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Integer r13 = (java.lang.Integer) r13
            r14 = r10
            java.util.List r14 = (java.util.List) r14
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r2 = (java.lang.String) r2
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata r5 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata) r5
            r16 = r9
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            r17 = r4
            java.lang.Boolean r17 = (java.lang.Boolean) r17
            r18 = r3
            java.lang.Boolean r18 = (java.lang.Boolean) r18
            r19 = 0
            r6 = r0
            r8 = r1
            r9 = r12
            r10 = r11
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r2
            r15 = r5
            r6.<init>((int) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.util.List) r12, (java.lang.String) r13, (java.lang.String) r14, (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata) r15, (java.lang.Boolean) r16, (java.lang.Boolean) r17, (java.lang.Boolean) r18, (gq0.x0) r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartItem patch(Decoder decoder, InstamartItem instamartItem) {
        return (InstamartItem) q.a.a(this, decoder, instamartItem);
    }

    public void serialize(Encoder encoder, InstamartItem instamartItem) {
        p.j(encoder, "encoder");
        p.j(instamartItem, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartItem.write$Self(instamartItem, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
