package in.swiggy.android.swiggylynx.plugin.payment.upiplugin.upitransaction;

import fq0.c;
import fq0.d;
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
public final class UpiTransactionRequestPayload$$serializer implements q<UpiTransactionRequestPayload> {
    public static final UpiTransactionRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        UpiTransactionRequestPayload$$serializer upiTransactionRequestPayload$$serializer = new UpiTransactionRequestPayload$$serializer();
        INSTANCE = upiTransactionRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.upiplugin.upitransaction.UpiTransactionRequestPayload", upiTransactionRequestPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("upiParams", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UpiTransactionRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{UpiTransactionRequestPayload$Params$$serializer.INSTANCE};
    }

    public UpiTransactionRequestPayload deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.o(descriptor2, 0, UpiTransactionRequestPayload$Params$$serializer.INSTANCE, null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.o(descriptor2, 0, UpiTransactionRequestPayload$Params$$serializer.INSTANCE, obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new UpiTransactionRequestPayload(i11, (UpiTransactionRequestPayload.Params) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public UpiTransactionRequestPayload patch(Decoder decoder, UpiTransactionRequestPayload upiTransactionRequestPayload) {
        return (UpiTransactionRequestPayload) q.a.a(this, decoder, upiTransactionRequestPayload);
    }

    public void serialize(Encoder encoder, UpiTransactionRequestPayload upiTransactionRequestPayload) {
        p.j(encoder, "encoder");
        p.j(upiTransactionRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        UpiTransactionRequestPayload.c(upiTransactionRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
