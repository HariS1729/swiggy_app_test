package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: PermissionStatusResponsePayload.kt */
public final class PermissionStatusResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final PermissionStatus f19454a;

    /* compiled from: PermissionStatusResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<PermissionStatusResponsePayload> serializer() {
            return PermissionStatusResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PermissionStatusResponsePayload(int i11, PermissionStatus permissionStatus, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19454a = permissionStatus;
            return;
        }
        throw new MissingFieldException("status");
    }

    public static final void a(PermissionStatusResponsePayload permissionStatusResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(permissionStatusResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, PermissionStatus$$serializer.INSTANCE, permissionStatusResponsePayload.f19454a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PermissionStatusResponsePayload) && this.f19454a == ((PermissionStatusResponsePayload) obj).f19454a;
    }

    public int hashCode() {
        return this.f19454a.hashCode();
    }

    public String toString() {
        return "PermissionStatusResponsePayload(status=" + this.f19454a + ')';
    }

    public PermissionStatusResponsePayload(PermissionStatus permissionStatus) {
        p.j(permissionStatus, "status");
        this.f19454a = permissionStatus;
    }
}
