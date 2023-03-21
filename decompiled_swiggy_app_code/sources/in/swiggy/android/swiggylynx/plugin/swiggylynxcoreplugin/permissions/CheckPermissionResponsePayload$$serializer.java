package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions;

import fq0.c;
import fq0.d;
import gq0.h;
import gq0.q;
import gq0.x0;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: CheckPermissionResponsePayload.kt */
public final class CheckPermissionResponsePayload$$serializer implements q<CheckPermissionResponsePayload> {
    public static final CheckPermissionResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CheckPermissionResponsePayload$$serializer checkPermissionResponsePayload$$serializer = new CheckPermissionResponsePayload$$serializer();
        INSTANCE = checkPermissionResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions.CheckPermissionResponsePayload", checkPermissionResponsePayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("available", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CheckPermissionResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{h.f23089b};
    }

    public CheckPermissionResponsePayload deserialize(Decoder decoder) {
        boolean z11;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            z11 = b11.B(descriptor2, 0);
        } else {
            z11 = false;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    z11 = b11.B(descriptor2, 0);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new CheckPermissionResponsePayload(i11, z11, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public CheckPermissionResponsePayload patch(Decoder decoder, CheckPermissionResponsePayload checkPermissionResponsePayload) {
        return (CheckPermissionResponsePayload) q.a.a(this, decoder, checkPermissionResponsePayload);
    }

    public void serialize(Encoder encoder, CheckPermissionResponsePayload checkPermissionResponsePayload) {
        p.j(encoder, "encoder");
        p.j(checkPermissionResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CheckPermissionResponsePayload.a(checkPermissionResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
