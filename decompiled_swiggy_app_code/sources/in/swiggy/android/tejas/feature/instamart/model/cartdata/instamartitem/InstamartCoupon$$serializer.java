package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import com.newrelic.agent.android.agentdata.HexAttribute;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.w;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InstamartCoupon.kt */
public final class InstamartCoupon$$serializer implements q<InstamartCoupon> {
    public static final InstamartCoupon$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartCoupon$$serializer instamartCoupon$$serializer = new InstamartCoupon$$serializer();
        INSTANCE = instamartCoupon$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon", instamartCoupon$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("coupon", true);
        pluginGeneratedSerialDescriptor.j(HexAttribute.HEX_ATTR_MESSAGE, true);
        pluginGeneratedSerialDescriptor.j("creativeId", true);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartCoupon$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(w.f23130b)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon deserialize(kotlinx.serialization.encoding.Decoder r14) {
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
            if (r1 == 0) goto L_0x0031
            gq0.a1 r1 = gq0.a1.f23069b
            java.lang.Object r5 = r14.s(r0, r5, r1, r4)
            java.lang.Object r6 = r14.s(r0, r6, r1, r4)
            java.lang.Object r1 = r14.s(r0, r3, r1, r4)
            gq0.w r3 = gq0.w.f23130b
            java.lang.Object r2 = r14.s(r0, r2, r3, r4)
            r3 = 15
            r4 = 15
            goto L_0x0078
        L_0x0031:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = 0
            r10 = 1
        L_0x0036:
            if (r10 == 0) goto L_0x0073
            int r11 = r14.w(r0)
            r12 = -1
            if (r11 == r12) goto L_0x0071
            if (r11 == 0) goto L_0x0068
            if (r11 == r6) goto L_0x005f
            if (r11 == r3) goto L_0x0056
            if (r11 != r2) goto L_0x0050
            gq0.w r11 = gq0.w.f23130b
            java.lang.Object r9 = r14.s(r0, r2, r11, r9)
            r1 = r1 | 8
            goto L_0x0036
        L_0x0050:
            kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
            r14.<init>(r11)
            throw r14
        L_0x0056:
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r8 = r14.s(r0, r3, r11, r8)
            r1 = r1 | 4
            goto L_0x0036
        L_0x005f:
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r7 = r14.s(r0, r6, r11, r7)
            r1 = r1 | 2
            goto L_0x0036
        L_0x0068:
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r4 = r14.s(r0, r5, r11, r4)
            r1 = r1 | 1
            goto L_0x0036
        L_0x0071:
            r10 = 0
            goto L_0x0036
        L_0x0073:
            r5 = r4
            r6 = r7
            r2 = r9
            r4 = r1
            r1 = r8
        L_0x0078:
            r14.c(r0)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon r14 = new in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r8 = r2
            java.lang.Integer r8 = (java.lang.Integer) r8
            r9 = 0
            r3 = r14
            r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.Integer) r8, (gq0.x0) r9)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartCoupon patch(Decoder decoder, InstamartCoupon instamartCoupon) {
        return (InstamartCoupon) q.a.a(this, decoder, instamartCoupon);
    }

    public void serialize(Encoder encoder, InstamartCoupon instamartCoupon) {
        p.j(encoder, "encoder");
        p.j(instamartCoupon, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartCoupon.write$Self(instamartCoupon, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
