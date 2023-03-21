package cg0;

import in.swiggy.android.tejas.feature.address.v2.LocationGps;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private final s0 f18187a;

    /* renamed from: b  reason: collision with root package name */
    private final u0 f18188b;

    public t0() {
        this((s0) null, (u0) null, 3, (i) null);
    }

    public t0(s0 s0Var, u0 u0Var) {
        p.j(s0Var, "cxLog");
        p.j(u0Var, "objectLog");
        this.f18187a = s0Var;
        this.f18188b = u0Var;
    }

    public final s0 a() {
        return this.f18187a;
    }

    public final u0 b() {
        return this.f18188b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return p.e(this.f18187a, t0Var.f18187a) && p.e(this.f18188b, t0Var.f18188b);
    }

    public int hashCode() {
        return (this.f18187a.hashCode() * 31) + this.f18188b.hashCode();
    }

    public String toString() {
        return "LocationLog(cxLog=" + this.f18187a + ", objectLog=" + this.f18188b + ')';
    }

    public /* synthetic */ t0(s0 s0Var, u0 u0Var, int i11, i iVar) {
        t0 t0Var;
        u0 u0Var2;
        s0 s0Var2 = (i11 & 1) != 0 ? new s0((String) null, 0, (String) null, (String) null, (String) null, 31, (i) null) : s0Var;
        if ((i11 & 2) != 0) {
            u0Var2 = new u0((String) null, (String) null, (String) null, (String) null, (LocationGps) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (Integer) null, 32767, (i) null);
            t0Var = this;
        } else {
            t0Var = this;
            u0Var2 = u0Var;
        }
        new t0(s0Var2, u0Var2);
    }
}
