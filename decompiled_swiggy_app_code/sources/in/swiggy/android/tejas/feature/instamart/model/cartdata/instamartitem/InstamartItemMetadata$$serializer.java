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

/* compiled from: InstamartItemMetadata.kt */
public final class InstamartItemMetadata$$serializer implements q<InstamartItemMetadata> {
    public static final InstamartItemMetadata$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartItemMetadata$$serializer instamartItemMetadata$$serializer = new InstamartItemMetadata$$serializer();
        INSTANCE = instamartItemMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata", instamartItemMetadata$$serializer, 9);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.PRODUCT_ID, true);
        pluginGeneratedSerialDescriptor.j("display_name", true);
        pluginGeneratedSerialDescriptor.j("is_avail", true);
        pluginGeneratedSerialDescriptor.j("in_stock", true);
        pluginGeneratedSerialDescriptor.j("max_allowed_quantity", true);
        pluginGeneratedSerialDescriptor.j("weight_in_grams", true);
        pluginGeneratedSerialDescriptor.j("sub_category_type_max_allowed_quantity", true);
        pluginGeneratedSerialDescriptor.j("sub_category_type", true);
        pluginGeneratedSerialDescriptor.j("variations", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartItemMetadata$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        h hVar = h.f23089b;
        w wVar = w.f23130b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(hVar), a.p(hVar), a.p(wVar), a.p(wVar), a.p(wVar), a.p(a1Var), a.p(new f(InstamartItemVariation$$serializer.INSTANCE))};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata deserialize(kotlinx.serialization.encoding.Decoder r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r20.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 8
            r8 = 4
            r9 = 2
            r10 = 0
            r11 = 1
            r12 = 0
            if (r2 == 0) goto L_0x0059
            gq0.a1 r2 = gq0.a1.f23069b
            java.lang.Object r10 = r0.s(r1, r10, r2, r12)
            java.lang.Object r11 = r0.s(r1, r11, r2, r12)
            gq0.h r13 = gq0.h.f23089b
            java.lang.Object r9 = r0.s(r1, r9, r13, r12)
            java.lang.Object r6 = r0.s(r1, r6, r13, r12)
            gq0.w r13 = gq0.w.f23130b
            java.lang.Object r8 = r0.s(r1, r8, r13, r12)
            java.lang.Object r5 = r0.s(r1, r5, r13, r12)
            java.lang.Object r4 = r0.s(r1, r4, r13, r12)
            java.lang.Object r2 = r0.s(r1, r3, r2, r12)
            gq0.f r3 = new gq0.f
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation$$serializer r13 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation$$serializer.INSTANCE
            r3.<init>(r13)
            java.lang.Object r3 = r0.s(r1, r7, r3, r12)
            r7 = 511(0x1ff, float:7.16E-43)
            r12 = r10
            r10 = r8
            r8 = 511(0x1ff, float:7.16E-43)
            goto L_0x00ec
        L_0x0059:
            r6 = r12
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
            r2 = 0
            r19 = 1
        L_0x0064:
            if (r19 == 0) goto L_0x00e4
            int r5 = r0.w(r1)
            switch(r5) {
                case -1: goto L_0x00de;
                case 0: goto L_0x00cf;
                case 1: goto L_0x00c3;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00ab;
                case 4: goto L_0x009f;
                case 5: goto L_0x0094;
                case 6: goto L_0x008a;
                case 7: goto L_0x0081;
                case 8: goto L_0x0073;
                default: goto L_0x006d;
            }
        L_0x006d:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r5)
            throw r0
        L_0x0073:
            gq0.f r5 = new gq0.f
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation$$serializer r4 = in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation$$serializer.INSTANCE
            r5.<init>(r4)
            java.lang.Object r8 = r0.s(r1, r7, r5, r8)
            r2 = r2 | 256(0x100, float:3.59E-43)
            goto L_0x00db
        L_0x0081:
            gq0.a1 r4 = gq0.a1.f23069b
            java.lang.Object r6 = r0.s(r1, r3, r4, r6)
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x00db
        L_0x008a:
            gq0.w r4 = gq0.w.f23130b
            r5 = 6
            java.lang.Object r9 = r0.s(r1, r5, r4, r9)
            r2 = r2 | 64
            goto L_0x00db
        L_0x0094:
            r5 = 6
            gq0.w r4 = gq0.w.f23130b
            r3 = 5
            java.lang.Object r11 = r0.s(r1, r3, r4, r11)
            r2 = r2 | 32
            goto L_0x00da
        L_0x009f:
            r3 = 5
            r5 = 6
            gq0.w r4 = gq0.w.f23130b
            r3 = 4
            java.lang.Object r10 = r0.s(r1, r3, r4, r10)
            r2 = r2 | 16
            goto L_0x00da
        L_0x00ab:
            r3 = 4
            r5 = 6
            gq0.h r4 = gq0.h.f23089b
            r3 = 3
            java.lang.Object r15 = r0.s(r1, r3, r4, r15)
            r2 = r2 | 8
            goto L_0x00da
        L_0x00b7:
            r3 = 3
            r5 = 6
            gq0.h r4 = gq0.h.f23089b
            r3 = 2
            java.lang.Object r14 = r0.s(r1, r3, r4, r14)
            r2 = r2 | 4
            goto L_0x00da
        L_0x00c3:
            r3 = 2
            r5 = 6
            gq0.a1 r4 = gq0.a1.f23069b
            r3 = 1
            java.lang.Object r13 = r0.s(r1, r3, r4, r13)
            r2 = r2 | 2
            goto L_0x00da
        L_0x00cf:
            r3 = 1
            r5 = 6
            gq0.a1 r4 = gq0.a1.f23069b
            r3 = 0
            java.lang.Object r12 = r0.s(r1, r3, r4, r12)
            r2 = r2 | 1
        L_0x00da:
            r3 = 7
        L_0x00db:
            r4 = 6
            r5 = 5
            goto L_0x0064
        L_0x00de:
            r3 = 0
            r3 = 7
            r5 = 5
            r19 = 0
            goto L_0x0064
        L_0x00e4:
            r3 = r8
            r4 = r9
            r5 = r11
            r11 = r13
            r9 = r14
            r8 = r2
            r2 = r6
            r6 = r15
        L_0x00ec:
            r0.c(r1)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata r0 = new in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata
            r1 = r12
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r11 = (java.lang.String) r11
            r12 = r9
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r13 = r10
            java.lang.Integer r13 = (java.lang.Integer) r13
            r14 = r5
            java.lang.Integer r14 = (java.lang.Integer) r14
            r15 = r4
            java.lang.Integer r15 = (java.lang.Integer) r15
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            r17 = r3
            java.util.List r17 = (java.util.List) r17
            r18 = 0
            r7 = r0
            r9 = r1
            r10 = r11
            r11 = r12
            r12 = r6
            r7.<init>((int) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.Boolean) r11, (java.lang.Boolean) r12, (java.lang.Integer) r13, (java.lang.Integer) r14, (java.lang.Integer) r15, (java.lang.String) r16, (java.util.List) r17, (gq0.x0) r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartItemMetadata patch(Decoder decoder, InstamartItemMetadata instamartItemMetadata) {
        return (InstamartItemMetadata) q.a.a(this, decoder, instamartItemMetadata);
    }

    public void serialize(Encoder encoder, InstamartItemMetadata instamartItemMetadata) {
        p.j(encoder, "encoder");
        p.j(instamartItemMetadata, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartItemMetadata.write$Self(instamartItemMetadata, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
