package in.swiggy.android.swiggylynx.plugin.payment.walletplugin;

import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.payment.walletplugin.AmazonDelinkPlugin;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: AmazonDelinkPlugin.kt */
public final class AmazonDelinkPlugin$AmazonDelinkResponsePayload$$serializer implements q<AmazonDelinkPlugin.AmazonDelinkResponsePayload> {
    public static final AmazonDelinkPlugin$AmazonDelinkResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AmazonDelinkPlugin$AmazonDelinkResponsePayload$$serializer amazonDelinkPlugin$AmazonDelinkResponsePayload$$serializer = new AmazonDelinkPlugin$AmazonDelinkResponsePayload$$serializer();
        INSTANCE = amazonDelinkPlugin$AmazonDelinkResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.walletplugin.AmazonDelinkPlugin.AmazonDelinkResponsePayload", amazonDelinkPlugin$AmazonDelinkResponsePayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("status", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AmazonDelinkPlugin$AmazonDelinkResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a1.f23069b};
    }

    public AmazonDelinkPlugin.AmazonDelinkResponsePayload deserialize(Decoder decoder) {
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
        return new AmazonDelinkPlugin.AmazonDelinkResponsePayload(i11, str, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AmazonDelinkPlugin.AmazonDelinkResponsePayload patch(Decoder decoder, AmazonDelinkPlugin.AmazonDelinkResponsePayload amazonDelinkResponsePayload) {
        return (AmazonDelinkPlugin.AmazonDelinkResponsePayload) q.a.a(this, decoder, amazonDelinkResponsePayload);
    }

    public void serialize(Encoder encoder, AmazonDelinkPlugin.AmazonDelinkResponsePayload amazonDelinkResponsePayload) {
        p.j(encoder, "encoder");
        p.j(amazonDelinkResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        AmazonDelinkPlugin.AmazonDelinkResponsePayload.b(amazonDelinkResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
