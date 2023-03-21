package in.swiggy.android.swiggylynx.plugin.payment.walletplugin;

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

/* compiled from: GetLinkedWalletDataPayload.kt */
public final class GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload$$serializer implements q<GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload> {
    public static final GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload$$serializer getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload$$serializer = new GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload$$serializer();
        INSTANCE = getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.walletplugin.GetLinkedWalletDataPayload.GetLinkedWalletDataResponsePayload", getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("displayName", false);
        pluginGeneratedSerialDescriptor.j("balance", false);
        pluginGeneratedSerialDescriptor.j("mobileNumber", false);
        pluginGeneratedSerialDescriptor.j("iconUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a1Var, a1Var, a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.walletplugin.GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload deserialize(kotlinx.serialization.encoding.Decoder r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r19.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = r0.j(r1, r6)
            java.lang.String r6 = r0.j(r1, r7)
            java.lang.String r4 = r0.j(r1, r4)
            gq0.a1 r7 = gq0.a1.f23069b
            java.lang.Object r3 = r0.s(r1, r3, r7, r5)
            r5 = 15
            r14 = r2
            r16 = r4
            r15 = r6
            r13 = 15
            goto L_0x0078
        L_0x0035:
            r2 = r5
            r8 = r2
            r9 = r8
            r10 = r9
            r5 = 0
            r11 = 1
        L_0x003b:
            if (r11 == 0) goto L_0x0072
            int r12 = r0.w(r1)
            r13 = -1
            if (r12 == r13) goto L_0x0070
            if (r12 == 0) goto L_0x0069
            if (r12 == r7) goto L_0x0062
            if (r12 == r4) goto L_0x005b
            if (r12 != r3) goto L_0x0055
            gq0.a1 r12 = gq0.a1.f23069b
            java.lang.Object r10 = r0.s(r1, r3, r12, r10)
            r5 = r5 | 8
            goto L_0x003b
        L_0x0055:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r12)
            throw r0
        L_0x005b:
            java.lang.String r9 = r0.j(r1, r4)
            r5 = r5 | 4
            goto L_0x003b
        L_0x0062:
            java.lang.String r8 = r0.j(r1, r7)
            r5 = r5 | 2
            goto L_0x003b
        L_0x0069:
            java.lang.String r2 = r0.j(r1, r6)
            r5 = r5 | 1
            goto L_0x003b
        L_0x0070:
            r11 = 0
            goto L_0x003b
        L_0x0072:
            r14 = r2
            r13 = r5
            r15 = r8
            r16 = r9
            r3 = r10
        L_0x0078:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.payment.walletplugin.GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload r0 = new in.swiggy.android.swiggylynx.plugin.payment.walletplugin.GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload
            r17 = r3
            java.lang.String r17 = (java.lang.String) r17
            r18 = 0
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.walletplugin.GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.walletplugin.GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload patch(Decoder decoder, GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload) {
        return (GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload) q.a.a(this, decoder, getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload);
    }

    public void serialize(Encoder encoder, GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload) {
        p.j(encoder, "encoder");
        p.j(getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload.b(getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
