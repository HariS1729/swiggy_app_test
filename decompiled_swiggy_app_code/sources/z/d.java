package z;

import d2.e;
import d2.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: CornerSize.kt */
final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final float f18039a;

    private d(float f11) {
        this.f18039a = f11;
    }

    public /* synthetic */ d(float f11, i iVar) {
        this(f11);
    }

    public float a(long j, e eVar) {
        p.j(eVar, "density");
        return eVar.v0(this.f18039a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && h.p(this.f18039a, ((d) obj).f18039a);
    }

    public int hashCode() {
        return h.q(this.f18039a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f18039a + ".dp)";
    }
}
