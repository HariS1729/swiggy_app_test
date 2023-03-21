package in.swiggy.android.swiggylynx.plugin.account;

import dq0.a;
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

/* compiled from: VerifyMobileNumberPayload.kt */
public final class VerifyMobileNumberPayload$$serializer implements q<VerifyMobileNumberPayload> {
    public static final VerifyMobileNumberPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        VerifyMobileNumberPayload$$serializer verifyMobileNumberPayload$$serializer = new VerifyMobileNumberPayload$$serializer();
        INSTANCE = verifyMobileNumberPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.account.VerifyMobileNumberPayload", verifyMobileNumberPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("number", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VerifyMobileNumberPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(a1.f23069b)};
    }

    public VerifyMobileNumberPayload deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.s(descriptor2, 0, a1.f23069b, null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.s(descriptor2, 0, a1.f23069b, obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new VerifyMobileNumberPayload(i11, (String) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public VerifyMobileNumberPayload patch(Decoder decoder, VerifyMobileNumberPayload verifyMobileNumberPayload) {
        return (VerifyMobileNumberPayload) q.a.a(this, decoder, verifyMobileNumberPayload);
    }

    public void serialize(Encoder encoder, VerifyMobileNumberPayload verifyMobileNumberPayload) {
        p.j(encoder, "encoder");
        p.j(verifyMobileNumberPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        VerifyMobileNumberPayload.c(verifyMobileNumberPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
