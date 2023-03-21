package in.swiggy.android.swiggylynx.plugin.dash.trackevent;

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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* compiled from: TrackEventPayload.kt */
public final class TrackEventPayload$$serializer implements q<TrackEventPayload> {
    public static final TrackEventPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        TrackEventPayload$$serializer trackEventPayload$$serializer = new TrackEventPayload$$serializer();
        INSTANCE = trackEventPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.dash.trackevent.TrackEventPayload", trackEventPayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("eventName", false);
        pluginGeneratedSerialDescriptor.j("eventParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TrackEventPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a1.f23069b, JsonElementSerializer.f26449b};
    }

    public TrackEventPayload deserialize(Decoder decoder) {
        int i11;
        Object obj;
        String str;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            str = b11.j(descriptor2, 0);
            obj = b11.o(descriptor2, 1, JsonElementSerializer.f26449b, null);
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
                    obj2 = b11.o(descriptor2, 1, JsonElementSerializer.f26449b, obj2);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj2;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new TrackEventPayload(i11, str, (JsonElement) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public TrackEventPayload patch(Decoder decoder, TrackEventPayload trackEventPayload) {
        return (TrackEventPayload) q.a.a(this, decoder, trackEventPayload);
    }

    public void serialize(Encoder encoder, TrackEventPayload trackEventPayload) {
        p.j(encoder, "encoder");
        p.j(trackEventPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        TrackEventPayload.d(trackEventPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
