package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick;

import dq0.a;
import fq0.c;
import fq0.d;
import gq0.q;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: OneClickEligibilityResponsePayload.kt */
public final class EligibilityDetails$CheckType$$serializer implements q<EligibilityDetails.CheckType> {
    public static final EligibilityDetails$CheckType$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EligibilityDetails$CheckType$$serializer eligibilityDetails$CheckType$$serializer = new EligibilityDetails$CheckType$$serializer();
        INSTANCE = eligibilityDetails$CheckType$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails.CheckType", eligibilityDetails$CheckType$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("vies", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EligibilityDetails$CheckType$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(EligibilityDetails$ViesCheckType$$serializer.INSTANCE)};
    }

    public EligibilityDetails.CheckType deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.s(descriptor2, 0, EligibilityDetails$ViesCheckType$$serializer.INSTANCE, null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.s(descriptor2, 0, EligibilityDetails$ViesCheckType$$serializer.INSTANCE, obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new EligibilityDetails.CheckType(i11, (EligibilityDetails.ViesCheckType) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public EligibilityDetails.CheckType patch(Decoder decoder, EligibilityDetails.CheckType checkType) {
        return (EligibilityDetails.CheckType) q.a.a(this, decoder, checkType);
    }

    public void serialize(Encoder encoder, EligibilityDetails.CheckType checkType) {
        p.j(encoder, "encoder");
        p.j(checkType, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        EligibilityDetails.CheckType.a(checkType, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
