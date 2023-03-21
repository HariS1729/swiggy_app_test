package in.swiggy.android.tejas.feature.instamart.model.localinstamartitem;

import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.n;
import gq0.q;
import gq0.w;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: LocalInstamartItem.kt */
public final class LocalInstamartItem$$serializer implements q<LocalInstamartItem> {
    public static final LocalInstamartItem$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        LocalInstamartItem$$serializer localInstamartItem$$serializer = new LocalInstamartItem$$serializer();
        INSTANCE = localInstamartItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem", localInstamartItem$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.QUANTITY, false);
        pluginGeneratedSerialDescriptor.j("itemId", false);
        pluginGeneratedSerialDescriptor.j("productId", false);
        pluginGeneratedSerialDescriptor.j("spin", true);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.PRICE, false);
        pluginGeneratedSerialDescriptor.j("variation", false);
        pluginGeneratedSerialDescriptor.j("freebie", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LocalInstamartItem$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, w.f23130b, a1Var, a1Var, a.p(a1Var), n.f23109b, LocalInstamartVariation$$serializer.INSTANCE, h.f23089b};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem deserialize(kotlinx.serialization.encoding.Decoder r22) {
        /*
            r21 = this;
            r0 = r22
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r21.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r2 == 0) goto L_0x0050
            java.lang.String r2 = r0.j(r1, r11)
            int r9 = r0.g(r1, r9)
            java.lang.String r8 = r0.j(r1, r8)
            java.lang.String r6 = r0.j(r1, r6)
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r7 = r0.s(r1, r7, r11, r10)
            double r11 = r0.E(r1, r5)
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation$$serializer r5 = in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation$$serializer.INSTANCE
            java.lang.Object r4 = r0.o(r1, r4, r5, r10)
            boolean r3 = r0.B(r1, r3)
            r5 = 255(0xff, float:3.57E-43)
            r19 = r3
            r14 = r6
            r13 = r8
            r16 = r11
            r10 = 255(0xff, float:3.57E-43)
            r11 = r2
            r12 = r9
            goto L_0x00c3
        L_0x0050:
            r12 = 0
            r9 = r10
            r11 = r9
            r14 = r11
            r15 = r14
            r17 = r12
            r2 = 0
            r12 = 0
            r19 = 1
            r13 = r15
            r10 = 0
        L_0x005e:
            if (r19 == 0) goto L_0x00ba
            int r8 = r0.w(r1)
            switch(r8) {
                case -1: goto L_0x00b4;
                case 0: goto L_0x00a7;
                case 1: goto L_0x009c;
                case 2: goto L_0x0094;
                case 3: goto L_0x008d;
                case 4: goto L_0x0084;
                case 5: goto L_0x007d;
                case 6: goto L_0x0074;
                case 7: goto L_0x006d;
                default: goto L_0x0067;
            }
        L_0x0067:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r8)
            throw r0
        L_0x006d:
            boolean r2 = r0.B(r1, r3)
            r10 = r10 | 128(0x80, float:1.794E-43)
            goto L_0x00b8
        L_0x0074:
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation$$serializer r8 = in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation$$serializer.INSTANCE
            java.lang.Object r9 = r0.o(r1, r4, r8, r9)
            r10 = r10 | 64
            goto L_0x00b8
        L_0x007d:
            double r17 = r0.E(r1, r5)
            r10 = r10 | 32
            goto L_0x00b8
        L_0x0084:
            gq0.a1 r8 = gq0.a1.f23069b
            java.lang.Object r11 = r0.s(r1, r7, r8, r11)
            r10 = r10 | 16
            goto L_0x00b8
        L_0x008d:
            java.lang.String r15 = r0.j(r1, r6)
            r10 = r10 | 8
            goto L_0x00b8
        L_0x0094:
            r8 = 2
            java.lang.String r14 = r0.j(r1, r8)
            r10 = r10 | 4
            goto L_0x005e
        L_0x009c:
            r8 = 2
            r12 = 1
            int r16 = r0.g(r1, r12)
            r10 = r10 | 2
            r12 = r16
            goto L_0x005e
        L_0x00a7:
            r8 = 2
            r13 = 0
            r16 = 1
            java.lang.String r20 = r0.j(r1, r13)
            r10 = r10 | 1
            r13 = r20
            goto L_0x005e
        L_0x00b4:
            r16 = 1
            r19 = 0
        L_0x00b8:
            r8 = 2
            goto L_0x005e
        L_0x00ba:
            r19 = r2
            r4 = r9
            r7 = r11
            r11 = r13
            r13 = r14
            r14 = r15
            r16 = r17
        L_0x00c3:
            r0.c(r1)
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem r0 = new in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem
            r15 = r7
            java.lang.String r15 = (java.lang.String) r15
            r18 = r4
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation r18 = (in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation) r18
            r20 = 0
            r9 = r0
            r9.<init>((int) r10, (java.lang.String) r11, (int) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (double) r16, (in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation) r18, (boolean) r19, (gq0.x0) r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public LocalInstamartItem patch(Decoder decoder, LocalInstamartItem localInstamartItem) {
        return (LocalInstamartItem) q.a.a(this, decoder, localInstamartItem);
    }

    public void serialize(Encoder encoder, LocalInstamartItem localInstamartItem) {
        p.j(encoder, "encoder");
        p.j(localInstamartItem, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        LocalInstamartItem.write$Self(localInstamartItem, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
