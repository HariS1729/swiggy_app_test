package in.swiggy.android.swiggylynx.plugin.accessibility;

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

/* compiled from: AccessibilityEnabledResponsePayload.kt */
public final class AccessibilityEnabledResponsePayload$$serializer implements q<AccessibilityEnabledResponsePayload> {
    public static final AccessibilityEnabledResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AccessibilityEnabledResponsePayload$$serializer accessibilityEnabledResponsePayload$$serializer = new AccessibilityEnabledResponsePayload$$serializer();
        INSTANCE = accessibilityEnabledResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.accessibility.AccessibilityEnabledResponsePayload", accessibilityEnabledResponsePayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("accessibility-enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AccessibilityEnabledResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a1.f23069b};
    }

    public AccessibilityEnabledResponsePayload deserialize(Decoder decoder) {
        String str;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            str = b11.j(descriptor2, 0);
        } else {
            str = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    str = b11.j(descriptor2, 0);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new AccessibilityEnabledResponsePayload(i11, str, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AccessibilityEnabledResponsePayload patch(Decoder decoder, AccessibilityEnabledResponsePayload accessibilityEnabledResponsePayload) {
        return (AccessibilityEnabledResponsePayload) q.a.a(this, decoder, accessibilityEnabledResponsePayload);
    }

    public void serialize(Encoder encoder, AccessibilityEnabledResponsePayload accessibilityEnabledResponsePayload) {
        p.j(encoder, "encoder");
        p.j(accessibilityEnabledResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        AccessibilityEnabledResponsePayload.a(accessibilityEnabledResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
