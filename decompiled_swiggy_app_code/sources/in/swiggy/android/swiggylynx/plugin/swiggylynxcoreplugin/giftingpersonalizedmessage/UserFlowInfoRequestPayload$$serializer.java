package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.giftingpersonalizedmessage;

import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.giftingpersonalizedmessage.UserFlowInfoRequestPayload;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: UserFlowInfoRequestPayload.kt */
public final class UserFlowInfoRequestPayload$$serializer implements q<UserFlowInfoRequestPayload> {
    public static final UserFlowInfoRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        UserFlowInfoRequestPayload$$serializer userFlowInfoRequestPayload$$serializer = new UserFlowInfoRequestPayload$$serializer();
        INSTANCE = userFlowInfoRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.giftingpersonalizedmessage.UserFlowInfoRequestPayload", userFlowInfoRequestPayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("flowType", false);
        pluginGeneratedSerialDescriptor.j("flowData", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserFlowInfoRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a1.f23069b, UserFlowInfoRequestPayload$FlowData$$serializer.INSTANCE};
    }

    public UserFlowInfoRequestPayload deserialize(Decoder decoder) {
        int i11;
        Object obj;
        String str;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            str = b11.j(descriptor2, 0);
            obj = b11.o(descriptor2, 1, UserFlowInfoRequestPayload$FlowData$$serializer.INSTANCE, null);
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
                    obj2 = b11.o(descriptor2, 1, UserFlowInfoRequestPayload$FlowData$$serializer.INSTANCE, obj2);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj2;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new UserFlowInfoRequestPayload(i11, str, (UserFlowInfoRequestPayload.FlowData) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public UserFlowInfoRequestPayload patch(Decoder decoder, UserFlowInfoRequestPayload userFlowInfoRequestPayload) {
        return (UserFlowInfoRequestPayload) q.a.a(this, decoder, userFlowInfoRequestPayload);
    }

    public void serialize(Encoder encoder, UserFlowInfoRequestPayload userFlowInfoRequestPayload) {
        p.j(encoder, "encoder");
        p.j(userFlowInfoRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        UserFlowInfoRequestPayload.d(userFlowInfoRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
