package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.responsedata;

import dq0.a;
import fq0.c;
import fq0.d;
import gq0.h;
import gq0.p;
import gq0.q;
import gq0.x0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: GetWalletBalanceResponsePayload.kt */
public final class GetWalletBalanceResponsePayload$$serializer implements q<GetWalletBalanceResponsePayload> {
    public static final GetWalletBalanceResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        GetWalletBalanceResponsePayload$$serializer getWalletBalanceResponsePayload$$serializer = new GetWalletBalanceResponsePayload$$serializer();
        INSTANCE = getWalletBalanceResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.responsedata.GetWalletBalanceResponsePayload", getWalletBalanceResponsePayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("balance", true);
        pluginGeneratedSerialDescriptor.j("linked", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetWalletBalanceResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(p.f23116b), h.f23089b};
    }

    public GetWalletBalanceResponsePayload deserialize(Decoder decoder) {
        int i11;
        boolean z11;
        Object obj;
        kotlin.jvm.internal.p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            obj = b11.s(descriptor2, 0, p.f23116b, null);
            z11 = b11.B(descriptor2, 1);
            i11 = 3;
        } else {
            obj = null;
            boolean z12 = false;
            int i12 = 0;
            boolean z13 = true;
            while (z13) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z13 = false;
                } else if (w11 == 0) {
                    obj = b11.s(descriptor2, 0, p.f23116b, obj);
                    i12 |= 1;
                } else if (w11 == 1) {
                    z12 = b11.B(descriptor2, 1);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            z11 = z12;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new GetWalletBalanceResponsePayload(i11, (Float) obj, z11, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public GetWalletBalanceResponsePayload patch(Decoder decoder, GetWalletBalanceResponsePayload getWalletBalanceResponsePayload) {
        return (GetWalletBalanceResponsePayload) q.a.a(this, decoder, getWalletBalanceResponsePayload);
    }

    public void serialize(Encoder encoder, GetWalletBalanceResponsePayload getWalletBalanceResponsePayload) {
        kotlin.jvm.internal.p.j(encoder, "encoder");
        kotlin.jvm.internal.p.j(getWalletBalanceResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        GetWalletBalanceResponsePayload.a(getWalletBalanceResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
