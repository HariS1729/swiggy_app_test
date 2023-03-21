package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.submitfeedback;

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

/* compiled from: SubmitFeedbackPayload.kt */
public final class SubmitFeedbackPayload$$serializer implements q<SubmitFeedbackPayload> {
    public static final SubmitFeedbackPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SubmitFeedbackPayload$$serializer submitFeedbackPayload$$serializer = new SubmitFeedbackPayload$$serializer();
        INSTANCE = submitFeedbackPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.submitfeedback.SubmitFeedbackPayload", submitFeedbackPayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("originScreen", true);
        pluginGeneratedSerialDescriptor.j("link", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SubmitFeedbackPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var)};
    }

    public SubmitFeedbackPayload deserialize(Decoder decoder) {
        int i11;
        Object obj;
        Object obj2;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            a1 a1Var = a1.f23069b;
            obj = b11.s(descriptor2, 0, a1Var, null);
            obj2 = b11.s(descriptor2, 1, a1Var, null);
            i11 = 3;
        } else {
            obj2 = null;
            Object obj3 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z11 = false;
                } else if (w11 == 0) {
                    obj3 = b11.s(descriptor2, 0, a1.f23069b, obj3);
                    i12 |= 1;
                } else if (w11 == 1) {
                    obj2 = b11.s(descriptor2, 1, a1.f23069b, obj2);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj3;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new SubmitFeedbackPayload(i11, (String) obj, (String) obj2, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public SubmitFeedbackPayload patch(Decoder decoder, SubmitFeedbackPayload submitFeedbackPayload) {
        return (SubmitFeedbackPayload) q.a.a(this, decoder, submitFeedbackPayload);
    }

    public void serialize(Encoder encoder, SubmitFeedbackPayload submitFeedbackPayload) {
        p.j(encoder, "encoder");
        p.j(submitFeedbackPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        SubmitFeedbackPayload.d(submitFeedbackPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
