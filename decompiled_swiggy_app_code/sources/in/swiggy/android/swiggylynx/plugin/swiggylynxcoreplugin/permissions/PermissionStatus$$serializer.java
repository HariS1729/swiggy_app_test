package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions;

import gq0.q;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;

/* compiled from: PermissionStatus.kt */
public final class PermissionStatus$$serializer implements q<PermissionStatus> {
    public static final PermissionStatus$$serializer INSTANCE = new PermissionStatus$$serializer();
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions.PermissionStatus", 2);
        enumDescriptor.j("GRANTED", false);
        enumDescriptor.j("DENIED", false);
        descriptor = enumDescriptor;
    }

    private PermissionStatus$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[0];
    }

    public PermissionStatus deserialize(Decoder decoder) {
        p.j(decoder, "decoder");
        return PermissionStatus.values()[decoder.r(getDescriptor())];
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public PermissionStatus patch(Decoder decoder, PermissionStatus permissionStatus) {
        return (PermissionStatus) q.a.a(this, decoder, permissionStatus);
    }

    public void serialize(Encoder encoder, PermissionStatus permissionStatus) {
        p.j(encoder, "encoder");
        p.j(permissionStatus, "value");
        encoder.f(getDescriptor(), permissionStatus.ordinal());
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
