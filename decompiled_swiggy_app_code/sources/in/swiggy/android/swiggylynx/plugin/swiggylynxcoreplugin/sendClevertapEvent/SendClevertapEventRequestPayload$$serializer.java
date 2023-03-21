package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.sendClevertapEvent;

import dq0.a;
import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.x0;
import hq0.o;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* compiled from: SendClevertapEventRequestPayload.kt */
public final class SendClevertapEventRequestPayload$$serializer implements q<SendClevertapEventRequestPayload> {
    public static final SendClevertapEventRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SendClevertapEventRequestPayload$$serializer sendClevertapEventRequestPayload$$serializer = new SendClevertapEventRequestPayload$$serializer();
        INSTANCE = sendClevertapEventRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.sendClevertapEvent.SendClevertapEventRequestPayload", sendClevertapEventRequestPayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("eventName", true);
        pluginGeneratedSerialDescriptor.j("params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SendClevertapEventRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(a1.f23069b), a.p(o.f23170b)};
    }

    public SendClevertapEventRequestPayload deserialize(Decoder decoder) {
        int i11;
        Object obj;
        Object obj2;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            obj2 = b11.s(descriptor2, 0, a1.f23069b, null);
            obj = b11.s(descriptor2, 1, o.f23170b, null);
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
                    obj2 = b11.s(descriptor2, 0, a1.f23069b, obj2);
                    i12 |= 1;
                } else if (w11 == 1) {
                    obj3 = b11.s(descriptor2, 1, o.f23170b, obj3);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj3;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new SendClevertapEventRequestPayload(i11, (String) obj2, (JsonObject) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public SendClevertapEventRequestPayload patch(Decoder decoder, SendClevertapEventRequestPayload sendClevertapEventRequestPayload) {
        return (SendClevertapEventRequestPayload) q.a.a(this, decoder, sendClevertapEventRequestPayload);
    }

    public void serialize(Encoder encoder, SendClevertapEventRequestPayload sendClevertapEventRequestPayload) {
        p.j(encoder, "encoder");
        p.j(sendClevertapEventRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        SendClevertapEventRequestPayload.d(sendClevertapEventRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
