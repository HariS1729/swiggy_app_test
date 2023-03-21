package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata;

import com.newrelic.agent.android.agentdata.HexAttribute;
import dq0.a;
import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.x0;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* compiled from: PayUsingAmazonRequestPayload.kt */
public final class PayUsingAmazonRequestPayload$$serializer implements q<PayUsingAmazonRequestPayload> {
    public static final PayUsingAmazonRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PayUsingAmazonRequestPayload$$serializer payUsingAmazonRequestPayload$$serializer = new PayUsingAmazonRequestPayload$$serializer();
        INSTANCE = payUsingAmazonRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata.PayUsingAmazonRequestPayload", payUsingAmazonRequestPayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j(HexAttribute.HEX_ATTR_THREAD_STATE, false);
        pluginGeneratedSerialDescriptor.j(CardTypeAdapterFactory.DATA, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PayUsingAmazonRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a1.f23069b, a.p(JsonElementSerializer.f26449b)};
    }

    public PayUsingAmazonRequestPayload deserialize(Decoder decoder) {
        int i11;
        Object obj;
        String str;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            str = b11.j(descriptor2, 0);
            obj = b11.s(descriptor2, 1, JsonElementSerializer.f26449b, null);
            i11 = 3;
        } else {
            str = null;
            Object obj2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z11 = false;
                } else if (w11 == 0) {
                    str = b11.j(descriptor2, 0);
                    i12 |= 1;
                } else if (w11 == 1) {
                    obj2 = b11.s(descriptor2, 1, JsonElementSerializer.f26449b, obj2);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj2;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new PayUsingAmazonRequestPayload(i11, str, (JsonElement) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public PayUsingAmazonRequestPayload patch(Decoder decoder, PayUsingAmazonRequestPayload payUsingAmazonRequestPayload) {
        return (PayUsingAmazonRequestPayload) q.a.a(this, decoder, payUsingAmazonRequestPayload);
    }

    public void serialize(Encoder encoder, PayUsingAmazonRequestPayload payUsingAmazonRequestPayload) {
        p.j(encoder, "encoder");
        p.j(payUsingAmazonRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        PayUsingAmazonRequestPayload.d(payUsingAmazonRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
