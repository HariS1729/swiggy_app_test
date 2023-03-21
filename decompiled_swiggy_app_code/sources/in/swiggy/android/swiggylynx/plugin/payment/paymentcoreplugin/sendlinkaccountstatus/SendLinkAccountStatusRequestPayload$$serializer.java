package in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.sendlinkaccountstatus;

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

/* compiled from: SendLinkAccountStatusRequestPayload.kt */
public final class SendLinkAccountStatusRequestPayload$$serializer implements q<SendLinkAccountStatusRequestPayload> {
    public static final SendLinkAccountStatusRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SendLinkAccountStatusRequestPayload$$serializer sendLinkAccountStatusRequestPayload$$serializer = new SendLinkAccountStatusRequestPayload$$serializer();
        INSTANCE = sendLinkAccountStatusRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.sendlinkaccountstatus.SendLinkAccountStatusRequestPayload", sendLinkAccountStatusRequestPayload$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("paymentCode", false);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("token", true);
        pluginGeneratedSerialDescriptor.j("linkedMobileNumber", true);
        pluginGeneratedSerialDescriptor.j("source", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SendLinkAccountStatusRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.sendlinkaccountstatus.SendLinkAccountStatusRequestPayload deserialize(kotlinx.serialization.encoding.Decoder r23) {
        /*
            r22 = this;
            r0 = r23
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r22.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 3
            r4 = 4
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = r0.j(r1, r6)
            gq0.a1 r6 = gq0.a1.f23069b
            java.lang.Object r8 = r0.s(r1, r8, r6, r7)
            java.lang.Object r5 = r0.s(r1, r5, r6, r7)
            java.lang.Object r3 = r0.s(r1, r3, r6, r7)
            java.lang.Object r4 = r0.s(r1, r4, r6, r7)
            r6 = 31
            r16 = r2
            r15 = 31
            goto L_0x008b
        L_0x0038:
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r2 = 0
            r13 = 1
        L_0x003e:
            if (r13 == 0) goto L_0x0084
            int r14 = r0.w(r1)
            r15 = -1
            if (r14 == r15) goto L_0x0082
            if (r14 == 0) goto L_0x007b
            if (r14 == r8) goto L_0x0072
            if (r14 == r5) goto L_0x0069
            if (r14 == r3) goto L_0x0060
            if (r14 != r4) goto L_0x005a
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r12 = r0.s(r1, r4, r14, r12)
            r2 = r2 | 16
            goto L_0x003e
        L_0x005a:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r14)
            throw r0
        L_0x0060:
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r11 = r0.s(r1, r3, r14, r11)
            r2 = r2 | 8
            goto L_0x003e
        L_0x0069:
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r10 = r0.s(r1, r5, r14, r10)
            r2 = r2 | 4
            goto L_0x003e
        L_0x0072:
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r9 = r0.s(r1, r8, r14, r9)
            r2 = r2 | 2
            goto L_0x003e
        L_0x007b:
            java.lang.String r7 = r0.j(r1, r6)
            r2 = r2 | 1
            goto L_0x003e
        L_0x0082:
            r13 = 0
            goto L_0x003e
        L_0x0084:
            r15 = r2
            r16 = r7
            r8 = r9
            r5 = r10
            r3 = r11
            r4 = r12
        L_0x008b:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.sendlinkaccountstatus.SendLinkAccountStatusRequestPayload r0 = new in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.sendlinkaccountstatus.SendLinkAccountStatusRequestPayload
            r17 = r8
            java.lang.String r17 = (java.lang.String) r17
            r18 = r5
            java.lang.String r18 = (java.lang.String) r18
            r19 = r3
            java.lang.String r19 = (java.lang.String) r19
            r20 = r4
            java.lang.String r20 = (java.lang.String) r20
            r21 = 0
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.sendlinkaccountstatus.SendLinkAccountStatusRequestPayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.sendlinkaccountstatus.SendLinkAccountStatusRequestPayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public SendLinkAccountStatusRequestPayload patch(Decoder decoder, SendLinkAccountStatusRequestPayload sendLinkAccountStatusRequestPayload) {
        return (SendLinkAccountStatusRequestPayload) q.a.a(this, decoder, sendLinkAccountStatusRequestPayload);
    }

    public void serialize(Encoder encoder, SendLinkAccountStatusRequestPayload sendLinkAccountStatusRequestPayload) {
        p.j(encoder, "encoder");
        p.j(sendLinkAccountStatusRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        SendLinkAccountStatusRequestPayload.e(sendLinkAccountStatusRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
