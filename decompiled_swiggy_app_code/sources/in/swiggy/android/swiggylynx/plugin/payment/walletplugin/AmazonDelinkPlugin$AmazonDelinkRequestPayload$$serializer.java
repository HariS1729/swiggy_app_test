package in.swiggy.android.swiggylynx.plugin.payment.walletplugin;

import fq0.c;
import fq0.d;
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
public final class AmazonDelinkPlugin$AmazonDelinkRequestPayload$$serializer implements q<AmazonDelinkPlugin.AmazonDelinkRequestPayload> {
    public static final AmazonDelinkPlugin$AmazonDelinkRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AmazonDelinkPlugin$AmazonDelinkRequestPayload$$serializer amazonDelinkPlugin$AmazonDelinkRequestPayload$$serializer = new AmazonDelinkPlugin$AmazonDelinkRequestPayload$$serializer();
        INSTANCE = amazonDelinkPlugin$AmazonDelinkRequestPayload$$serializer;
        descriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.walletplugin.AmazonDelinkPlugin.AmazonDelinkRequestPayload", amazonDelinkPlugin$AmazonDelinkRequestPayload$$serializer, 0);
    }

    private AmazonDelinkPlugin$AmazonDelinkRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[0];
    }

    public AmazonDelinkPlugin.AmazonDelinkRequestPayload deserialize(Decoder decoder) {
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (!b11.k()) {
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z11 = false;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
        }
        b11.c(descriptor2);
        return new AmazonDelinkPlugin.AmazonDelinkRequestPayload(0, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AmazonDelinkPlugin.AmazonDelinkRequestPayload patch(Decoder decoder, AmazonDelinkPlugin.AmazonDelinkRequestPayload amazonDelinkRequestPayload) {
        return (AmazonDelinkPlugin.AmazonDelinkRequestPayload) q.a.a(this, decoder, amazonDelinkRequestPayload);
    }

    public void serialize(Encoder encoder, AmazonDelinkPlugin.AmazonDelinkRequestPayload amazonDelinkRequestPayload) {
        p.j(encoder, "encoder");
        p.j(amazonDelinkRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        AmazonDelinkPlugin.AmazonDelinkRequestPayload.b(amazonDelinkRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
