package in.swiggy.android.swiggylynx.plugin.statusbar;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: StatusBarColorChangePayload.kt */
public final class StatusBarColorChangePayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19377a;

    /* compiled from: StatusBarColorChangePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<StatusBarColorChangePayload> serializer() {
            return StatusBarColorChangePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StatusBarColorChangePayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19377a = str;
            return;
        }
        throw new MissingFieldException("style");
    }

    public static final void c(StatusBarColorChangePayload statusBarColorChangePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(statusBarColorChangePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, statusBarColorChangePayload.f19377a);
    }

    public final String b() {
        return this.f19377a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StatusBarColorChangePayload) && p.e(this.f19377a, ((StatusBarColorChangePayload) obj).f19377a);
    }

    public int hashCode() {
        return this.f19377a.hashCode();
    }

    public String toString() {
        return "StatusBarColorChangePayload(color=" + this.f19377a + ')';
    }
}
