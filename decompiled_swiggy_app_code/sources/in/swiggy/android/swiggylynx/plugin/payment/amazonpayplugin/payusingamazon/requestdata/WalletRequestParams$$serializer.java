package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.q;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: WalletRequestParams.kt */
public final class WalletRequestParams$$serializer implements q<WalletRequestParams> {
    public static final WalletRequestParams$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        WalletRequestParams$$serializer walletRequestParams$$serializer = new WalletRequestParams$$serializer();
        INSTANCE = walletRequestParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata.WalletRequestParams", walletRequestParams$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("orderId", false);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.PAYLOAD, true);
        pluginGeneratedSerialDescriptor.j("iv", true);
        pluginGeneratedSerialDescriptor.j(HttpRequest.HEADER_KEY, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WalletRequestParams$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a.p(a1Var), a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata.WalletRequestParams deserialize(kotlinx.serialization.encoding.Decoder r20) {
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
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = r0.j(r1, r6)
            gq0.a1 r6 = gq0.a1.f23069b
            java.lang.Object r7 = r0.s(r1, r7, r6, r5)
            java.lang.Object r4 = r0.s(r1, r4, r6, r5)
            java.lang.Object r3 = r0.s(r1, r3, r6, r5)
            r5 = 15
            r14 = r2
            r13 = 15
            goto L_0x0078
        L_0x0032:
            r2 = r5
            r8 = r2
            r9 = r8
            r10 = r9
            r5 = 0
            r11 = 1
        L_0x0038:
            if (r11 == 0) goto L_0x0073
            int r12 = r0.w(r1)
            r13 = -1
            if (r12 == r13) goto L_0x0071
            if (r12 == 0) goto L_0x006a
            if (r12 == r7) goto L_0x0061
            if (r12 == r4) goto L_0x0058
            if (r12 != r3) goto L_0x0052
            gq0.a1 r12 = gq0.a1.f23069b
            java.lang.Object r10 = r0.s(r1, r3, r12, r10)
            r5 = r5 | 8
            goto L_0x0038
        L_0x0052:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r12)
            throw r0
        L_0x0058:
            gq0.a1 r12 = gq0.a1.f23069b
            java.lang.Object r9 = r0.s(r1, r4, r12, r9)
            r5 = r5 | 4
            goto L_0x0038
        L_0x0061:
            gq0.a1 r12 = gq0.a1.f23069b
            java.lang.Object r8 = r0.s(r1, r7, r12, r8)
            r5 = r5 | 2
            goto L_0x0038
        L_0x006a:
            java.lang.String r2 = r0.j(r1, r6)
            r5 = r5 | 1
            goto L_0x0038
        L_0x0071:
            r11 = 0
            goto L_0x0038
        L_0x0073:
            r14 = r2
            r13 = r5
            r7 = r8
            r4 = r9
            r3 = r10
        L_0x0078:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata.WalletRequestParams r0 = new in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata.WalletRequestParams
            r15 = r7
            java.lang.String r15 = (java.lang.String) r15
            r16 = r4
            java.lang.String r16 = (java.lang.String) r16
            r17 = r3
            java.lang.String r17 = (java.lang.String) r17
            r18 = 0
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata.WalletRequestParams$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata.WalletRequestParams");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public WalletRequestParams patch(Decoder decoder, WalletRequestParams walletRequestParams) {
        return (WalletRequestParams) q.a.a(this, decoder, walletRequestParams);
    }

    public void serialize(Encoder encoder, WalletRequestParams walletRequestParams) {
        p.j(encoder, "encoder");
        p.j(walletRequestParams, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        WalletRequestParams.e(walletRequestParams, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
