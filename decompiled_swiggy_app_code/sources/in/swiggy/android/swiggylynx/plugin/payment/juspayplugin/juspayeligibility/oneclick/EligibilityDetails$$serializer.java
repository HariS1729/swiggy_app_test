package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.q;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: OneClickEligibilityResponsePayload.kt */
public final class EligibilityDetails$$serializer implements q<EligibilityDetails> {
    public static final EligibilityDetails$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EligibilityDetails$$serializer eligibilityDetails$$serializer = new EligibilityDetails$$serializer();
        INSTANCE = eligibilityDetails$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails", eligibilityDetails$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("checkType", false);
        pluginGeneratedSerialDescriptor.j("cardBin", false);
        pluginGeneratedSerialDescriptor.j("cardAlias", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EligibilityDetails$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{EligibilityDetails$CheckType$$serializer.INSTANCE, a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails deserialize(kotlinx.serialization.encoding.Decoder r12) {
        /*
            r11 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.p.j(r12, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r11.getDescriptor()
            fq0.c r12 = r12.b(r0)
            boolean r1 = r12.k()
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x002a
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$CheckType$$serializer r1 = in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$CheckType$$serializer.INSTANCE
            java.lang.Object r1 = r12.o(r0, r4, r1, r2)
            gq0.a1 r4 = gq0.a1.f23069b
            java.lang.Object r5 = r12.s(r0, r5, r4, r2)
            java.lang.Object r2 = r12.s(r0, r3, r4, r2)
            r3 = 7
            r4 = 7
            goto L_0x0064
        L_0x002a:
            r1 = r2
            r6 = r1
            r7 = 0
            r8 = 1
        L_0x002e:
            if (r8 == 0) goto L_0x0060
            int r9 = r12.w(r0)
            r10 = -1
            if (r9 == r10) goto L_0x005e
            if (r9 == 0) goto L_0x0055
            if (r9 == r5) goto L_0x004c
            if (r9 != r3) goto L_0x0046
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r6 = r12.s(r0, r3, r9, r6)
            r7 = r7 | 4
            goto L_0x002e
        L_0x0046:
            kotlinx.serialization.UnknownFieldException r12 = new kotlinx.serialization.UnknownFieldException
            r12.<init>(r9)
            throw r12
        L_0x004c:
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r1 = r12.s(r0, r5, r9, r1)
            r7 = r7 | 2
            goto L_0x002e
        L_0x0055:
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$CheckType$$serializer r9 = in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$CheckType$$serializer.INSTANCE
            java.lang.Object r2 = r12.o(r0, r4, r9, r2)
            r7 = r7 | 1
            goto L_0x002e
        L_0x005e:
            r8 = 0
            goto L_0x002e
        L_0x0060:
            r5 = r1
            r1 = r2
            r2 = r6
            r4 = r7
        L_0x0064:
            r12.c(r0)
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails r12 = new in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails
            r0 = r1
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$CheckType r0 = (in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails.CheckType) r0
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            r8 = 0
            r3 = r12
            r5 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public EligibilityDetails patch(Decoder decoder, EligibilityDetails eligibilityDetails) {
        return (EligibilityDetails) q.a.a(this, decoder, eligibilityDetails);
    }

    public void serialize(Encoder encoder, EligibilityDetails eligibilityDetails) {
        p.j(encoder, "encoder");
        p.j(eligibilityDetails, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        EligibilityDetails.a(eligibilityDetails, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
