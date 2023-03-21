package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CheckPermissionResponsePayload.kt */
public final class CheckPermissionResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19452a;

    /* compiled from: CheckPermissionResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CheckPermissionResponsePayload> serializer() {
            return CheckPermissionResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckPermissionResponsePayload(int i11, boolean z11, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19452a = z11;
            return;
        }
        throw new MissingFieldException("available");
    }

    public static final void a(CheckPermissionResponsePayload checkPermissionResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(checkPermissionResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.m(serialDescriptor, 0, checkPermissionResponsePayload.f19452a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckPermissionResponsePayload) && this.f19452a == ((CheckPermissionResponsePayload) obj).f19452a;
    }

    public int hashCode() {
        boolean z11 = this.f19452a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public String toString() {
        return "CheckPermissionResponsePayload(available=" + this.f19452a + ')';
    }

    public CheckPermissionResponsePayload(boolean z11) {
        this.f19452a = z11;
    }
}
