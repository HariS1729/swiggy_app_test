package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions;

import fq0.d;
import gq0.x0;
import in.juspay.hyper.constants.Labels;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: PermissionRequestPayload.kt */
public final class PermissionRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19453a;

    /* compiled from: PermissionRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<PermissionRequestPayload> serializer() {
            return PermissionRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PermissionRequestPayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19453a = str;
            return;
        }
        throw new MissingFieldException(Labels.System.PERMISSION);
    }

    public static final void c(PermissionRequestPayload permissionRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(permissionRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, permissionRequestPayload.f19453a);
    }

    public final String b() {
        return this.f19453a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PermissionRequestPayload) && p.e(this.f19453a, ((PermissionRequestPayload) obj).f19453a);
    }

    public int hashCode() {
        return this.f19453a.hashCode();
    }

    public String toString() {
        return "PermissionRequestPayload(permission=" + this.f19453a + ')';
    }
}
