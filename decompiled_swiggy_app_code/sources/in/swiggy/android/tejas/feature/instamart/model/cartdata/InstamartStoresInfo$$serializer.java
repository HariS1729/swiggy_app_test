package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.q;
import gq0.s;
import gq0.w;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation$$serializer;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InstamartStoresInfo.kt */
public final class InstamartStoresInfo$$serializer implements q<InstamartStoresInfo> {
    public static final InstamartStoresInfo$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartStoresInfo$$serializer instamartStoresInfo$$serializer = new InstamartStoresInfo$$serializer();
        INSTANCE = instamartStoresInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartStoresInfo", instamartStoresInfo$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("address", true);
        pluginGeneratedSerialDescriptor.j("imageId", true);
        pluginGeneratedSerialDescriptor.j(DistributedTracing.NR_ID_ATTRIBUTE, false);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("categories", true);
        pluginGeneratedSerialDescriptor.j("storeType", true);
        pluginGeneratedSerialDescriptor.j("maxAllowedCartWeightInGrams", true);
        pluginGeneratedSerialDescriptor.j("maxAllowedCartVolumeInCc", true);
        pluginGeneratedSerialDescriptor.j("maxAllowedItemsInCart", true);
        pluginGeneratedSerialDescriptor.j("minimumOrderValueInRs", true);
        pluginGeneratedSerialDescriptor.j("subCategoryTypeMaxAllowedWeights", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartStoresInfo$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        w wVar = w.f23130b;
        return new KSerializer[]{a1Var, a.p(a1Var), a.p(a1Var), wVar, a.p(InstamartLocation$$serializer.INSTANCE), a.p(new f(InstamartCategories$$serializer.INSTANCE)), a.p(a1Var), a.p(wVar), a.p(wVar), a.p(wVar), a.p(wVar), a.p(new s(a1Var, wVar))};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0162, code lost:
        r4 = r22;
        r9 = r9;
        r8 = r8;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0164, code lost:
        r15 = r23;
        r9 = r9;
        r8 = r8;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        r9 = r9;
        r8 = r8;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        r9 = r9;
        r8 = r8;
        r6 = r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartStoresInfo deserialize(kotlinx.serialization.encoding.Decoder r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r25.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r5 = 9
            r6 = 7
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 8
            r11 = 4
            r12 = 2
            r13 = 1
            r14 = 0
            r15 = 0
            if (r2 == 0) goto L_0x0077
            java.lang.String r2 = r0.j(r1, r14)
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r13 = r0.s(r1, r13, r14, r15)
            java.lang.Object r12 = r0.s(r1, r12, r14, r15)
            int r9 = r0.g(r1, r9)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation$$serializer r3 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation$$serializer.INSTANCE
            java.lang.Object r3 = r0.s(r1, r11, r3, r15)
            gq0.f r11 = new gq0.f
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartCategories$$serializer r4 = in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartCategories$$serializer.INSTANCE
            r11.<init>(r4)
            java.lang.Object r4 = r0.s(r1, r8, r11, r15)
            java.lang.Object r7 = r0.s(r1, r7, r14, r15)
            gq0.w r8 = gq0.w.f23130b
            java.lang.Object r6 = r0.s(r1, r6, r8, r15)
            java.lang.Object r10 = r0.s(r1, r10, r8, r15)
            java.lang.Object r5 = r0.s(r1, r5, r8, r15)
            r11 = 10
            java.lang.Object r11 = r0.s(r1, r11, r8, r15)
            r16 = r2
            gq0.s r2 = new gq0.s
            r2.<init>(r14, r8)
            r8 = 11
            java.lang.Object r2 = r0.s(r1, r8, r2, r15)
            r8 = 4095(0xfff, float:5.738E-42)
            r8 = r6
            r22 = r9
            r9 = r4
            r6 = r5
            r5 = r16
            r4 = 4095(0xfff, float:5.738E-42)
            goto L_0x0197
        L_0x0077:
            r2 = 11
            r5 = r15
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r3 = 0
            r4 = 0
            r21 = 1
        L_0x0087:
            if (r21 == 0) goto L_0x0186
            int r2 = r0.w(r1)
            switch(r2) {
                case -1: goto L_0x017b;
                case 0: goto L_0x0167;
                case 1: goto L_0x0152;
                case 2: goto L_0x0141;
                case 3: goto L_0x0132;
                case 4: goto L_0x0121;
                case 5: goto L_0x010b;
                case 6: goto L_0x00fa;
                case 7: goto L_0x00e7;
                case 8: goto L_0x00d3;
                case 9: goto L_0x00bf;
                case 10: goto L_0x00ad;
                case 11: goto L_0x0096;
                default: goto L_0x0090;
            }
        L_0x0090:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r2)
            throw r0
        L_0x0096:
            gq0.s r2 = new gq0.s
            r22 = r4
            gq0.a1 r4 = gq0.a1.f23069b
            r23 = r15
            gq0.w r15 = gq0.w.f23130b
            r2.<init>(r4, r15)
            r4 = 11
            java.lang.Object r5 = r0.s(r1, r4, r2, r5)
            r3 = r3 | 2048(0x800, float:2.87E-42)
            goto L_0x0162
        L_0x00ad:
            r22 = r4
            r23 = r15
            r4 = 11
            gq0.w r2 = gq0.w.f23130b
            r15 = 10
            java.lang.Object r10 = r0.s(r1, r15, r2, r10)
            r3 = r3 | 1024(0x400, float:1.435E-42)
            goto L_0x0162
        L_0x00bf:
            r22 = r4
            r23 = r15
            r4 = 11
            r15 = 10
            gq0.w r2 = gq0.w.f23130b
            r4 = 9
            java.lang.Object r6 = r0.s(r1, r4, r2, r6)
            r3 = r3 | 512(0x200, float:7.175E-43)
            goto L_0x0162
        L_0x00d3:
            r22 = r4
            r23 = r15
            r4 = 9
            r15 = 10
            gq0.w r2 = gq0.w.f23130b
            r4 = 8
            java.lang.Object r7 = r0.s(r1, r4, r2, r7)
            r3 = r3 | 256(0x100, float:3.59E-43)
            goto L_0x0162
        L_0x00e7:
            r22 = r4
            r23 = r15
            r4 = 8
            r15 = 10
            gq0.w r2 = gq0.w.f23130b
            r4 = 7
            java.lang.Object r8 = r0.s(r1, r4, r2, r8)
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x0162
        L_0x00fa:
            r22 = r4
            r23 = r15
            r4 = 7
            r15 = 10
            gq0.a1 r2 = gq0.a1.f23069b
            r4 = 6
            java.lang.Object r11 = r0.s(r1, r4, r2, r11)
            r3 = r3 | 64
            goto L_0x0162
        L_0x010b:
            r22 = r4
            r23 = r15
            r4 = 6
            r15 = 10
            gq0.f r2 = new gq0.f
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartCategories$$serializer r4 = in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartCategories$$serializer.INSTANCE
            r2.<init>(r4)
            r4 = 5
            java.lang.Object r9 = r0.s(r1, r4, r2, r9)
            r3 = r3 | 32
            goto L_0x0162
        L_0x0121:
            r22 = r4
            r23 = r15
            r4 = 5
            r15 = 10
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation$$serializer r2 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation$$serializer.INSTANCE
            r4 = 4
            java.lang.Object r12 = r0.s(r1, r4, r2, r12)
            r3 = r3 | 16
            goto L_0x0162
        L_0x0132:
            r23 = r15
            r2 = 3
            r4 = 4
            r15 = 10
            int r16 = r0.g(r1, r2)
            r3 = r3 | 8
            r4 = r16
            goto L_0x0164
        L_0x0141:
            r22 = r4
            r23 = r15
            r4 = 4
            r15 = 10
            gq0.a1 r2 = gq0.a1.f23069b
            r4 = 2
            java.lang.Object r13 = r0.s(r1, r4, r2, r13)
            r3 = r3 | 4
            goto L_0x0162
        L_0x0152:
            r22 = r4
            r23 = r15
            r4 = 2
            r15 = 10
            gq0.a1 r2 = gq0.a1.f23069b
            r4 = 1
            java.lang.Object r14 = r0.s(r1, r4, r2, r14)
            r3 = r3 | 2
        L_0x0162:
            r4 = r22
        L_0x0164:
            r15 = r23
            goto L_0x0177
        L_0x0167:
            r22 = r4
            r2 = 0
            r4 = 1
            r15 = 10
            java.lang.String r16 = r0.j(r1, r2)
            r3 = r3 | 1
            r15 = r16
            r4 = r22
        L_0x0177:
            r2 = 11
            goto L_0x0087
        L_0x017b:
            r22 = r4
            r23 = r15
            r2 = 0
            r2 = 11
            r21 = 0
            goto L_0x0087
        L_0x0186:
            r22 = r4
            r23 = r15
            r4 = r3
            r2 = r5
            r3 = r12
            r12 = r13
            r13 = r14
            r5 = r23
            r24 = r10
            r10 = r7
            r7 = r11
            r11 = r24
        L_0x0197:
            r0.c(r1)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartStoresInfo r0 = new in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartStoresInfo
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r12 = (java.lang.String) r12
            r13 = r3
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation r13 = (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation) r13
            r14 = r9
            java.util.List r14 = (java.util.List) r14
            r15 = r7
            java.lang.String r15 = (java.lang.String) r15
            r16 = r8
            java.lang.Integer r16 = (java.lang.Integer) r16
            r17 = r10
            java.lang.Integer r17 = (java.lang.Integer) r17
            r18 = r6
            java.lang.Integer r18 = (java.lang.Integer) r18
            r19 = r11
            java.lang.Integer r19 = (java.lang.Integer) r19
            java.util.HashMap r2 = (java.util.HashMap) r2
            r20 = 0
            r3 = r0
            r6 = r1
            r7 = r12
            r8 = r22
            r9 = r13
            r10 = r14
            r11 = r15
            r12 = r16
            r13 = r17
            r14 = r18
            r15 = r19
            r16 = r2
            r17 = r20
            r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (int) r8, (in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation) r9, (java.util.List) r10, (java.lang.String) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (java.lang.Integer) r14, (java.lang.Integer) r15, (java.util.HashMap) r16, (gq0.x0) r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartStoresInfo$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartStoresInfo");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartStoresInfo patch(Decoder decoder, InstamartStoresInfo instamartStoresInfo) {
        return (InstamartStoresInfo) q.a.a(this, decoder, instamartStoresInfo);
    }

    public void serialize(Encoder encoder, InstamartStoresInfo instamartStoresInfo) {
        p.j(encoder, "encoder");
        p.j(instamartStoresInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartStoresInfo.write$Self(instamartStoresInfo, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
