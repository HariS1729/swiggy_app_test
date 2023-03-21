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

/* compiled from: GetLinkWalletDataPayload.kt */
public final class GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload$$serializer implements q<GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload> {
    public static final GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload$$serializer getLinkWalletDataPayload$GetLinkWalletDataResponsePayload$$serializer = new GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload$$serializer();
        INSTANCE = getLinkWalletDataPayload$GetLinkWalletDataResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.walletplugin.GetLinkWalletDataPayload.GetLinkWalletDataResponsePayload", getLinkWalletDataPayload$GetLinkWalletDataResponsePayload$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("walletCode", false);
        pluginGeneratedSerialDescriptor.j("defaultMobileNumber", false);
        pluginGeneratedSerialDescriptor.j("iconUrl", false);
        pluginGeneratedSerialDescriptor.j("displayName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a1Var, a.p(a1Var), a1Var};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.walletplugin.GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload deserialize(kotlinx.serialization.encoding.Decoder r20) {
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
            gq0.a1 r7 = gq0.a1.f23069b
            java.lang.Object r4 = r0.s(r1, r4, r7, r5)
            java.lang.String r3 = r0.j(r1, r3)
            r5 = 15
            r14 = r2
            r17 = r3
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
            if (r12 == r4) goto L_0x0059
            if (r12 != r3) goto L_0x0053
            java.lang.String r10 = r0.j(r1, r3)
            r5 = r5 | 8
            goto L_0x003b
        L_0x0053:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r12)
            throw r0
        L_0x0059:
            gq0.a1 r12 = gq0.a1.f23069b
            java.lang.Object r9 = r0.s(r1, r4, r12, r9)
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
            r4 = r9
            r17 = r10
        L_0x0078:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.payment.walletplugin.GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload r0 = new in.swiggy.android.swiggylynx.plugin.payment.walletplugin.GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload
            r16 = r4
            java.lang.String r16 = (java.lang.String) r16
            r18 = 0
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.walletplugin.GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.walletplugin.GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload patch(Decoder decoder, GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload getLinkWalletDataPayload$GetLinkWalletDataResponsePayload) {
        return (GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload) q.a.a(this, decoder, getLinkWalletDataPayload$GetLinkWalletDataResponsePayload);
    }

    public void serialize(Encoder encoder, GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload getLinkWalletDataPayload$GetLinkWalletDataResponsePayload) {
        p.j(encoder, "encoder");
        p.j(getLinkWalletDataPayload$GetLinkWalletDataResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload.b(getLinkWalletDataPayload$GetLinkWalletDataResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
