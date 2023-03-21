package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.q;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayActionTypesKt;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: OneClickEligibilityResponsePayload.kt */
public final class EligibilityDetails$ViesCheckType$$serializer implements q<EligibilityDetails.ViesCheckType> {
    public static final EligibilityDetails$ViesCheckType$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EligibilityDetails$ViesCheckType$$serializer eligibilityDetails$ViesCheckType$$serializer = new EligibilityDetails$ViesCheckType$$serializer();
        INSTANCE = eligibilityDetails$ViesCheckType$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails.ViesCheckType", eligibilityDetails$ViesCheckType$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("responseMsg", false);
        pluginGeneratedSerialDescriptor.j("expired", false);
        pluginGeneratedSerialDescriptor.j("enrolled", false);
        pluginGeneratedSerialDescriptor.j(JuspayActionTypesKt.ELIGIBILITY, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EligibilityDetails$ViesCheckType$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        h hVar = h.f23089b;
        return new KSerializer[]{a.p(a1.f23069b), a.p(hVar), a.p(hVar), a.p(hVar)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails.ViesCheckType deserialize(kotlinx.serialization.encoding.Decoder r14) {
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
            java.lang.Object r1 = r14.s(r0, r5, r1, r4)
            gq0.h r5 = gq0.h.f23089b
            java.lang.Object r6 = r14.s(r0, r6, r5, r4)
            java.lang.Object r3 = r14.s(r0, r3, r5, r4)
            java.lang.Object r2 = r14.s(r0, r2, r5, r4)
            r4 = 15
            r5 = 15
            goto L_0x0078
        L_0x0031:
            r1 = r4
            r7 = r1
            r8 = r7
            r9 = r8
            r4 = 0
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
            gq0.h r11 = gq0.h.f23089b
            java.lang.Object r9 = r14.s(r0, r2, r11, r9)
            r4 = r4 | 8
            goto L_0x0037
        L_0x0051:
            kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
            r14.<init>(r11)
            throw r14
        L_0x0057:
            gq0.h r11 = gq0.h.f23089b
            java.lang.Object r8 = r14.s(r0, r3, r11, r8)
            r4 = r4 | 4
            goto L_0x0037
        L_0x0060:
            gq0.h r11 = gq0.h.f23089b
            java.lang.Object r7 = r14.s(r0, r6, r11, r7)
            r4 = r4 | 2
            goto L_0x0037
        L_0x0069:
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r1 = r14.s(r0, r5, r11, r1)
            r4 = r4 | 1
            goto L_0x0037
        L_0x0072:
            r10 = 0
            goto L_0x0037
        L_0x0074:
            r5 = r4
            r6 = r7
            r3 = r8
            r2 = r9
        L_0x0078:
            r14.c(r0)
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$ViesCheckType r14 = new in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$ViesCheckType
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r7 = r6
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r8 = r3
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r9 = r2
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r10 = 0
            r4 = r14
            r6 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$ViesCheckType$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$ViesCheckType");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public EligibilityDetails.ViesCheckType patch(Decoder decoder, EligibilityDetails.ViesCheckType viesCheckType) {
        return (EligibilityDetails.ViesCheckType) q.a.a(this, decoder, viesCheckType);
    }

    public void serialize(Encoder encoder, EligibilityDetails.ViesCheckType viesCheckType) {
        p.j(encoder, "encoder");
        p.j(viesCheckType, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        EligibilityDetails.ViesCheckType.a(viesCheckType, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
