package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata;

import fq0.c;
import fq0.d;
import gq0.q;
import gq0.x0;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: ProceedToPayData.kt */
public final class ProceedToPayData$$serializer implements q<ProceedToPayData> {
    public static final ProceedToPayData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ProceedToPayData$$serializer proceedToPayData$$serializer = new ProceedToPayData$$serializer();
        INSTANCE = proceedToPayData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata.ProceedToPayData", proceedToPayData$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("walletParams", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProceedToPayData$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{WalletRequestParams$$serializer.INSTANCE};
    }

    public ProceedToPayData deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.o(descriptor2, 0, WalletRequestParams$$serializer.INSTANCE, null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.o(descriptor2, 0, WalletRequestParams$$serializer.INSTANCE, obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new ProceedToPayData(i11, (WalletRequestParams) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public ProceedToPayData patch(Decoder decoder, ProceedToPayData proceedToPayData) {
        return (ProceedToPayData) q.a.a(this, decoder, proceedToPayData);
    }

    public void serialize(Encoder encoder, ProceedToPayData proceedToPayData) {
        p.j(encoder, "encoder");
        p.j(proceedToPayData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        ProceedToPayData.c(proceedToPayData, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
