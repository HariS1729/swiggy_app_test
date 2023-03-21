package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaywalletinit;

import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.f0;
import gq0.q;
import gq0.x0;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InitJuspayWalletRequestPayload.kt */
public final class InitJuspayWalletRequestPayload$$serializer implements q<InitJuspayWalletRequestPayload> {
    public static final InitJuspayWalletRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InitJuspayWalletRequestPayload$$serializer initJuspayWalletRequestPayload$$serializer = new InitJuspayWalletRequestPayload$$serializer();
        INSTANCE = initJuspayWalletRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaywalletinit.InitJuspayWalletRequestPayload", initJuspayWalletRequestPayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("clientAuthToken", false);
        pluginGeneratedSerialDescriptor.j("clientAuthTokenExpiry", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InitJuspayWalletRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a1.f23069b, f0.f23081b};
    }

    public InitJuspayWalletRequestPayload deserialize(Decoder decoder) {
        long j;
        String str;
        int i11;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            str = b11.j(descriptor2, 0);
            j = b11.e(descriptor2, 1);
            i11 = 3;
        } else {
            String str2 = null;
            long j11 = 0;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z11 = false;
                } else if (w11 == 0) {
                    str2 = b11.j(descriptor2, 0);
                    i12 |= 1;
                } else if (w11 == 1) {
                    j11 = b11.e(descriptor2, 1);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            str = str2;
            j = j11;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new InitJuspayWalletRequestPayload(i11, str, j, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InitJuspayWalletRequestPayload patch(Decoder decoder, InitJuspayWalletRequestPayload initJuspayWalletRequestPayload) {
        return (InitJuspayWalletRequestPayload) q.a.a(this, decoder, initJuspayWalletRequestPayload);
    }

    public void serialize(Encoder encoder, InitJuspayWalletRequestPayload initJuspayWalletRequestPayload) {
        p.j(encoder, "encoder");
        p.j(initJuspayWalletRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InitJuspayWalletRequestPayload.c(initJuspayWalletRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
