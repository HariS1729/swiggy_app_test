package in.swiggy.android.swiggylynx.plugin.payment.walletplugin;

import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.x0;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: GetLinkedWalletDataPayload.kt */
public final class GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload$$serializer implements q<GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload> {
    public static final GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload$$serializer getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload$$serializer = new GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload$$serializer();
        INSTANCE = getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.walletplugin.GetLinkedWalletDataPayload.GetLinkedWalletDataRequestPayload", getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("walletCode", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a1.f23069b};
    }

    public GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload deserialize(Decoder decoder) {
        String str;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            str = b11.j(descriptor2, 0);
        } else {
            str = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    str = b11.j(descriptor2, 0);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload(i11, str, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload patch(Decoder decoder, GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload) {
        return (GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload) q.a.a(this, decoder, getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload);
    }

    public void serialize(Encoder encoder, GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload) {
        p.j(encoder, "encoder");
        p.j(getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload.c(getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
