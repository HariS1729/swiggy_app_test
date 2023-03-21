package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayinit;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.q;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: JustpayInitRequestPayload.kt */
public final class JustpayInitRequestPayload$$serializer implements q<JustpayInitRequestPayload> {
    public static final JustpayInitRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        JustpayInitRequestPayload$$serializer justpayInitRequestPayload$$serializer = new JustpayInitRequestPayload$$serializer();
        INSTANCE = justpayInitRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayinit.JustpayInitRequestPayload", justpayInitRequestPayload$$serializer, 3);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.ENV, false);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.MERCHANT_ID_CAMEL, false);
        pluginGeneratedSerialDescriptor.j("clientAuthToken", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JustpayInitRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a1Var, a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayinit.JustpayInitRequestPayload deserialize(kotlinx.serialization.encoding.Decoder r17) {
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
            if (r2 == 0) goto L_0x002c
            java.lang.String r2 = r0.j(r1, r5)
            java.lang.String r5 = r0.j(r1, r6)
            gq0.a1 r6 = gq0.a1.f23069b
            java.lang.Object r3 = r0.s(r1, r4, r6, r3)
            r4 = 7
            r12 = r2
            r13 = r5
            r11 = 7
            goto L_0x0062
        L_0x002c:
            r2 = r3
            r7 = r2
            r8 = 0
            r9 = 1
        L_0x0030:
            if (r9 == 0) goto L_0x005e
            int r10 = r0.w(r1)
            r11 = -1
            if (r10 == r11) goto L_0x005c
            if (r10 == 0) goto L_0x0055
            if (r10 == r6) goto L_0x004e
            if (r10 != r4) goto L_0x0048
            gq0.a1 r10 = gq0.a1.f23069b
            java.lang.Object r7 = r0.s(r1, r4, r10, r7)
            r8 = r8 | 4
            goto L_0x0030
        L_0x0048:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r10)
            throw r0
        L_0x004e:
            java.lang.String r2 = r0.j(r1, r6)
            r8 = r8 | 2
            goto L_0x0030
        L_0x0055:
            java.lang.String r3 = r0.j(r1, r5)
            r8 = r8 | 1
            goto L_0x0030
        L_0x005c:
            r9 = 0
            goto L_0x0030
        L_0x005e:
            r13 = r2
            r12 = r3
            r3 = r7
            r11 = r8
        L_0x0062:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayinit.JustpayInitRequestPayload r0 = new in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayinit.JustpayInitRequestPayload
            r14 = r3
            java.lang.String r14 = (java.lang.String) r14
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayinit.JustpayInitRequestPayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayinit.JustpayInitRequestPayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public JustpayInitRequestPayload patch(Decoder decoder, JustpayInitRequestPayload justpayInitRequestPayload) {
        return (JustpayInitRequestPayload) q.a.a(this, decoder, justpayInitRequestPayload);
    }

    public void serialize(Encoder encoder, JustpayInitRequestPayload justpayInitRequestPayload) {
        p.j(encoder, "encoder");
        p.j(justpayInitRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        JustpayInitRequestPayload.e(justpayInitRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
