package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.q;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: JuspayEligibilityResponsePayload.kt */
public final class JuspayEligibilityResponsePayload$$serializer implements q<JuspayEligibilityResponsePayload> {
    public static final JuspayEligibilityResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        JuspayEligibilityResponsePayload$$serializer juspayEligibilityResponsePayload$$serializer = new JuspayEligibilityResponsePayload$$serializer();
        INSTANCE = juspayEligibilityResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.JuspayEligibilityResponsePayload", juspayEligibilityResponsePayload$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("isEligible", false);
        pluginGeneratedSerialDescriptor.j("bannerText", true);
        pluginGeneratedSerialDescriptor.j("flowType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JuspayEligibilityResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{h.f23089b, a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.JuspayEligibilityResponsePayload deserialize(kotlinx.serialization.encoding.Decoder r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r16.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 0
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x002b
            boolean r2 = r0.B(r1, r5)
            gq0.a1 r5 = gq0.a1.f23069b
            java.lang.Object r6 = r0.s(r1, r6, r5, r3)
            java.lang.Object r3 = r0.s(r1, r4, r5, r3)
            r4 = 7
            r12 = r2
            r11 = 7
            goto L_0x0063
        L_0x002b:
            r7 = r3
            r2 = 0
            r8 = 0
            r9 = 1
        L_0x002f:
            if (r9 == 0) goto L_0x005f
            int r10 = r0.w(r1)
            r11 = -1
            if (r10 == r11) goto L_0x005d
            if (r10 == 0) goto L_0x0056
            if (r10 == r6) goto L_0x004d
            if (r10 != r4) goto L_0x0047
            gq0.a1 r10 = gq0.a1.f23069b
            java.lang.Object r7 = r0.s(r1, r4, r10, r7)
            r8 = r8 | 4
            goto L_0x002f
        L_0x0047:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r10)
            throw r0
        L_0x004d:
            gq0.a1 r10 = gq0.a1.f23069b
            java.lang.Object r3 = r0.s(r1, r6, r10, r3)
            r8 = r8 | 2
            goto L_0x002f
        L_0x0056:
            boolean r2 = r0.B(r1, r5)
            r8 = r8 | 1
            goto L_0x002f
        L_0x005d:
            r9 = 0
            goto L_0x002f
        L_0x005f:
            r12 = r2
            r6 = r3
            r3 = r7
            r11 = r8
        L_0x0063:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.JuspayEligibilityResponsePayload r0 = new in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.JuspayEligibilityResponsePayload
            r13 = r6
            java.lang.String r13 = (java.lang.String) r13
            r14 = r3
            java.lang.String r14 = (java.lang.String) r14
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.JuspayEligibilityResponsePayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.JuspayEligibilityResponsePayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public JuspayEligibilityResponsePayload patch(Decoder decoder, JuspayEligibilityResponsePayload juspayEligibilityResponsePayload) {
        return (JuspayEligibilityResponsePayload) q.a.a(this, decoder, juspayEligibilityResponsePayload);
    }

    public void serialize(Encoder encoder, JuspayEligibilityResponsePayload juspayEligibilityResponsePayload) {
        p.j(encoder, "encoder");
        p.j(juspayEligibilityResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        JuspayEligibilityResponsePayload.a(juspayEligibilityResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
