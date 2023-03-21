package in.swiggy.android.swiggylynx.plugin.dash.instamart;

import dq0.a;
import fq0.c;
import fq0.d;
import gq0.q;
import gq0.x0;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.feature.instamart.model.GetIMCartResponse;
import in.swiggy.android.tejas.feature.instamart.model.GetIMCartResponse$$serializer;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InstamartUpdateLocalCartPayload.kt */
public final class InstamartUpdateLocalCartPayload$$serializer implements q<InstamartUpdateLocalCartPayload> {
    public static final InstamartUpdateLocalCartPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartUpdateLocalCartPayload$$serializer instamartUpdateLocalCartPayload$$serializer = new InstamartUpdateLocalCartPayload$$serializer();
        INSTANCE = instamartUpdateLocalCartPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.dash.instamart.InstamartUpdateLocalCartPayload", instamartUpdateLocalCartPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.PAYLOAD, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartUpdateLocalCartPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(GetIMCartResponse$$serializer.INSTANCE)};
    }

    public InstamartUpdateLocalCartPayload deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.s(descriptor2, 0, GetIMCartResponse$$serializer.INSTANCE, null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.s(descriptor2, 0, GetIMCartResponse$$serializer.INSTANCE, obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new InstamartUpdateLocalCartPayload(i11, (GetIMCartResponse) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartUpdateLocalCartPayload patch(Decoder decoder, InstamartUpdateLocalCartPayload instamartUpdateLocalCartPayload) {
        return (InstamartUpdateLocalCartPayload) q.a.a(this, decoder, instamartUpdateLocalCartPayload);
    }

    public void serialize(Encoder encoder, InstamartUpdateLocalCartPayload instamartUpdateLocalCartPayload) {
        p.j(encoder, "encoder");
        p.j(instamartUpdateLocalCartPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartUpdateLocalCartPayload.c(instamartUpdateLocalCartPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
