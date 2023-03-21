package in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.paymentpending;

import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.z;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: PendingPaymentRequestParams.kt */
public final class PendingPaymentRequestParams$$serializer implements q<PendingPaymentRequestParams> {
    public static final PendingPaymentRequestParams$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PendingPaymentRequestParams$$serializer pendingPaymentRequestParams$$serializer = new PendingPaymentRequestParams$$serializer();
        INSTANCE = pendingPaymentRequestParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.paymentpending.PendingPaymentRequestParams", pendingPaymentRequestParams$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("method", false);
        pluginGeneratedSerialDescriptor.j("host", false);
        pluginGeneratedSerialDescriptor.j("endpoint", false);
        pluginGeneratedSerialDescriptor.j("headers", false);
        pluginGeneratedSerialDescriptor.j("queryParams", true);
        pluginGeneratedSerialDescriptor.j("body", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PendingPaymentRequestParams$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a1Var, a1Var, new z(a1Var, a1Var), new z(a1Var, a1Var), new z(a1Var, a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.paymentpending.PendingPaymentRequestParams deserialize(kotlinx.serialization.encoding.Decoder r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r17.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x004e
            java.lang.String r2 = r0.j(r1, r7)
            java.lang.String r7 = r0.j(r1, r8)
            java.lang.String r6 = r0.j(r1, r6)
            gq0.z r8 = new gq0.z
            gq0.a1 r10 = gq0.a1.f23069b
            r8.<init>(r10, r10)
            java.lang.Object r4 = r0.o(r1, r4, r8, r9)
            gq0.z r8 = new gq0.z
            r8.<init>(r10, r10)
            java.lang.Object r5 = r0.o(r1, r5, r8, r9)
            gq0.z r8 = new gq0.z
            r8.<init>(r10, r10)
            java.lang.Object r3 = r0.o(r1, r3, r8, r9)
            r8 = 63
            r10 = r2
            r12 = r6
            r11 = r7
            r9 = 63
            goto L_0x00b1
        L_0x004e:
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r2 = 0
            r15 = 1
        L_0x0055:
            if (r15 == 0) goto L_0x00aa
            int r7 = r0.w(r1)
            switch(r7) {
                case -1: goto L_0x00a7;
                case 0: goto L_0x009f;
                case 1: goto L_0x0097;
                case 2: goto L_0x008e;
                case 3: goto L_0x0080;
                case 4: goto L_0x0072;
                case 5: goto L_0x0064;
                default: goto L_0x005e;
            }
        L_0x005e:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r7)
            throw r0
        L_0x0064:
            gq0.z r7 = new gq0.z
            gq0.a1 r8 = gq0.a1.f23069b
            r7.<init>(r8, r8)
            java.lang.Object r14 = r0.o(r1, r3, r7, r14)
            r2 = r2 | 32
            goto L_0x0094
        L_0x0072:
            gq0.z r7 = new gq0.z
            gq0.a1 r8 = gq0.a1.f23069b
            r7.<init>(r8, r8)
            java.lang.Object r13 = r0.o(r1, r5, r7, r13)
            r2 = r2 | 16
            goto L_0x0094
        L_0x0080:
            gq0.z r7 = new gq0.z
            gq0.a1 r8 = gq0.a1.f23069b
            r7.<init>(r8, r8)
            java.lang.Object r12 = r0.o(r1, r4, r7, r12)
            r2 = r2 | 8
            goto L_0x0094
        L_0x008e:
            java.lang.String r11 = r0.j(r1, r6)
            r2 = r2 | 4
        L_0x0094:
            r7 = 0
            r8 = 1
            goto L_0x0055
        L_0x0097:
            java.lang.String r10 = r0.j(r1, r8)
            r2 = r2 | 2
            r7 = 0
            goto L_0x0055
        L_0x009f:
            r7 = 0
            java.lang.String r9 = r0.j(r1, r7)
            r2 = r2 | 1
            goto L_0x0055
        L_0x00a7:
            r7 = 0
            r15 = 0
            goto L_0x0055
        L_0x00aa:
            r4 = r12
            r5 = r13
            r3 = r14
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r2
        L_0x00b1:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.paymentpending.PendingPaymentRequestParams r0 = new in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.paymentpending.PendingPaymentRequestParams
            r13 = r4
            java.util.Map r13 = (java.util.Map) r13
            r14 = r5
            java.util.Map r14 = (java.util.Map) r14
            r15 = r3
            java.util.Map r15 = (java.util.Map) r15
            r16 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.paymentpending.PendingPaymentRequestParams$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.paymentpending.PendingPaymentRequestParams");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public PendingPaymentRequestParams patch(Decoder decoder, PendingPaymentRequestParams pendingPaymentRequestParams) {
        return (PendingPaymentRequestParams) q.a.a(this, decoder, pendingPaymentRequestParams);
    }

    public void serialize(Encoder encoder, PendingPaymentRequestParams pendingPaymentRequestParams) {
        p.j(encoder, "encoder");
        p.j(pendingPaymentRequestParams, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        PendingPaymentRequestParams.g(pendingPaymentRequestParams, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
