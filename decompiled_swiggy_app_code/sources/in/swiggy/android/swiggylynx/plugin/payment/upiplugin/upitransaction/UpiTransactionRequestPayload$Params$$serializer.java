package in.swiggy.android.swiggylynx.plugin.payment.upiplugin.upitransaction;

import com.newrelic.agent.android.agentdata.HexAttribute;
import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.payment.upiplugin.upitransaction.UpiTransactionRequestPayload;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: UpiTransactionRequestPayload.kt */
public final class UpiTransactionRequestPayload$Params$$serializer implements q<UpiTransactionRequestPayload.Params> {
    public static final UpiTransactionRequestPayload$Params$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        UpiTransactionRequestPayload$Params$$serializer upiTransactionRequestPayload$Params$$serializer = new UpiTransactionRequestPayload$Params$$serializer();
        INSTANCE = upiTransactionRequestPayload$Params$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.upiplugin.upitransaction.UpiTransactionRequestPayload.Params", upiTransactionRequestPayload$Params$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("orderId", false);
        pluginGeneratedSerialDescriptor.j("orderAmount", false);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j(HexAttribute.HEX_ATTR_METHOD_NAME, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UpiTransactionRequestPayload$Params$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a1Var, a1Var, a1Var};
    }

    public UpiTransactionRequestPayload.Params deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        int i11;
        Decoder decoder2 = decoder;
        p.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder2.b(descriptor2);
        if (b11.k()) {
            String j = b11.j(descriptor2, 0);
            String j11 = b11.j(descriptor2, 1);
            String j12 = b11.j(descriptor2, 2);
            str4 = j;
            str = b11.j(descriptor2, 3);
            str2 = j12;
            str3 = j11;
            i11 = 15;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z11 = false;
                } else if (w11 == 0) {
                    str5 = b11.j(descriptor2, 0);
                    i12 |= 1;
                } else if (w11 == 1) {
                    str8 = b11.j(descriptor2, 1);
                    i12 |= 2;
                } else if (w11 == 2) {
                    str7 = b11.j(descriptor2, 2);
                    i12 |= 4;
                } else if (w11 == 3) {
                    str6 = b11.j(descriptor2, 3);
                    i12 |= 8;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            str4 = str5;
            str = str6;
            str2 = str7;
            str3 = str8;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new UpiTransactionRequestPayload.Params(i11, str4, str3, str2, str, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public UpiTransactionRequestPayload.Params patch(Decoder decoder, UpiTransactionRequestPayload.Params params) {
        return (UpiTransactionRequestPayload.Params) q.a.a(this, decoder, params);
    }

    public void serialize(Encoder encoder, UpiTransactionRequestPayload.Params params) {
        p.j(encoder, "encoder");
        p.j(params, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        UpiTransactionRequestPayload.Params.d(params, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
