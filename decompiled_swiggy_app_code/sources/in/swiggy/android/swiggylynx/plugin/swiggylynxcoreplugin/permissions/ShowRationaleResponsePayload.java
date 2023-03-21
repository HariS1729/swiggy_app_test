package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: ShowRationaleResponsePayload.kt */
public final class ShowRationaleResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19460a;

    /* compiled from: ShowRationaleResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<ShowRationaleResponsePayload> serializer() {
            return ShowRationaleResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShowRationaleResponsePayload(int i11, boolean z11, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19460a = z11;
            return;
        }
        throw new MissingFieldException("showRationale");
    }

    public static final void a(ShowRationaleResponsePayload showRationaleResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(showRationaleResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.m(serialDescriptor, 0, showRationaleResponsePayload.f19460a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShowRationaleResponsePayload) && this.f19460a == ((ShowRationaleResponsePayload) obj).f19460a;
    }

    public int hashCode() {
        boolean z11 = this.f19460a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public String toString() {
        return "ShowRationaleResponsePayload(showRationale=" + this.f19460a + ')';
    }

    public ShowRationaleResponsePayload(boolean z11) {
        this.f19460a = z11;
    }
}
