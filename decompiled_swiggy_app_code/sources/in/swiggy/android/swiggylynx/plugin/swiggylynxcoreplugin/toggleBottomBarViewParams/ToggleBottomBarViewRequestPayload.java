package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.toggleBottomBarViewParams;

import fq0.d;
import gq0.h;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: ToggleBottomBarViewRequestPayload.kt */
public final class ToggleBottomBarViewRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f19496a;

    /* compiled from: ToggleBottomBarViewRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<ToggleBottomBarViewRequestPayload> serializer() {
            return ToggleBottomBarViewRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ToggleBottomBarViewRequestPayload(int i11, Boolean bool, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19496a = bool;
            return;
        }
        throw new MissingFieldException("show");
    }

    public static final void c(ToggleBottomBarViewRequestPayload toggleBottomBarViewRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(toggleBottomBarViewRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.E(serialDescriptor, 0, h.f23089b, toggleBottomBarViewRequestPayload.f19496a);
    }

    public final Boolean b() {
        return this.f19496a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToggleBottomBarViewRequestPayload) && p.e(this.f19496a, ((ToggleBottomBarViewRequestPayload) obj).f19496a);
    }

    public int hashCode() {
        Boolean bool = this.f19496a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "ToggleBottomBarViewRequestPayload(show=" + this.f19496a + ')';
    }
}
