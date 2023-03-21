package s;

import d2.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.u;

/* compiled from: BorderStroke.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final float f16531a;

    /* renamed from: b  reason: collision with root package name */
    private final u f16532b;

    private b(float f11, u uVar) {
        this.f16531a = f11;
        this.f16532b = uVar;
    }

    public /* synthetic */ b(float f11, u uVar, i iVar) {
        this(f11, uVar);
    }

    public final u a() {
        return this.f16532b;
    }

    public final float b() {
        return this.f16531a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.p(this.f16531a, bVar.f16531a) && p.e(this.f16532b, bVar.f16532b);
    }

    public int hashCode() {
        return (h.q(this.f16531a) * 31) + this.f16532b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + h.r(this.f16531a) + ", brush=" + this.f16532b + ')';
    }
}
