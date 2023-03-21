package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

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

/* compiled from: InstamartItemPrice.kt */
public final class InstamartItemPrice$$serializer implements q<InstamartItemPrice> {
    public static final InstamartItemPrice$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartItemPrice$$serializer instamartItemPrice$$serializer = new InstamartItemPrice$$serializer();
        INSTANCE = instamartItemPrice$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice", instamartItemPrice$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("mrp", true);
        pluginGeneratedSerialDescriptor.j("store_price", true);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.CURRENCY, true);
        pluginGeneratedSerialDescriptor.j("offer_price", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartItemPrice$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        n nVar = n.f23109b;
        return new KSerializer[]{a.p(nVar), a.p(nVar), a.p(a1.f23069b), a.p(nVar)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice deserialize(kotlinx.serialization.encoding.Decoder r14) {
        /*
            r13 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.p.j(r14, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r13.getDescriptor()
            fq0.c r14 = r14.b(r0)
            boolean r1 = r14.k()
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0032
            gq0.n r1 = gq0.n.f23109b
            java.lang.Object r5 = r14.s(r0, r5, r1, r4)
            java.lang.Object r6 = r14.s(r0, r6, r1, r4)
            gq0.a1 r7 = gq0.a1.f23069b
            java.lang.Object r3 = r14.s(r0, r3, r7, r4)
            java.lang.Object r1 = r14.s(r0, r2, r1, r4)
            r2 = 15
            r8 = r3
            r3 = 15
            goto L_0x0078
        L_0x0032:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = 0
            r10 = 1
        L_0x0037:
            if (r10 == 0) goto L_0x0074
            int r11 = r14.w(r0)
            r12 = -1
            if (r11 == r12) goto L_0x0072
            if (r11 == 0) goto L_0x0069
            if (r11 == r6) goto L_0x0060
            if (r11 == r3) goto L_0x0057
            if (r11 != r2) goto L_0x0051
            gq0.n r11 = gq0.n.f23109b
            java.lang.Object r9 = r14.s(r0, r2, r11, r9)
            r1 = r1 | 8
            goto L_0x0037
        L_0x0051:
            kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
            r14.<init>(r11)
            throw r14
        L_0x0057:
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r8 = r14.s(r0, r3, r11, r8)
            r1 = r1 | 4
            goto L_0x0037
        L_0x0060:
            gq0.n r11 = gq0.n.f23109b
            java.lang.Object r7 = r14.s(r0, r6, r11, r7)
            r1 = r1 | 2
            goto L_0x0037
        L_0x0069:
            gq0.n r11 = gq0.n.f23109b
            java.lang.Object r4 = r14.s(r0, r5, r11, r4)
            r1 = r1 | 1
            goto L_0x0037
        L_0x0072:
            r10 = 0
            goto L_0x0037
        L_0x0074:
            r3 = r1
            r5 = r4
            r6 = r7
            r1 = r9
        L_0x0078:
            r14.c(r0)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice r14 = new in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice
            r4 = r5
            java.lang.Double r4 = (java.lang.Double) r4
            r5 = r6
            java.lang.Double r5 = (java.lang.Double) r5
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            java.lang.Double r7 = (java.lang.Double) r7
            r8 = 0
            r2 = r14
            r2.<init>((int) r3, (java.lang.Double) r4, (java.lang.Double) r5, (java.lang.String) r6, (java.lang.Double) r7, (gq0.x0) r8)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartItemPrice patch(Decoder decoder, InstamartItemPrice instamartItemPrice) {
        return (InstamartItemPrice) q.a.a(this, decoder, instamartItemPrice);
    }

    public void serialize(Encoder encoder, InstamartItemPrice instamartItemPrice) {
        p.j(encoder, "encoder");
        p.j(instamartItemPrice, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartItemPrice.write$Self(instamartItemPrice, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
