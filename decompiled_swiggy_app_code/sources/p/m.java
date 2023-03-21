package p;

import d2.p;
import defpackage.v1;
import lp0.l;

/* compiled from: EnterExitTransition.kt */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final l<p, d2.l> f16011a;

    /* renamed from: b  reason: collision with root package name */
    private final v1.a0<d2.l> f16012b;

    public m(l<? super p, d2.l> lVar, v1.a0<d2.l> a0Var) {
        kotlin.jvm.internal.p.j(lVar, "slideOffset");
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        this.f16011a = lVar;
        this.f16012b = a0Var;
    }

    public final v1.a0<d2.l> a() {
        return this.f16012b;
    }

    public final l<p, d2.l> b() {
        return this.f16011a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.p.e(this.f16011a, mVar.f16011a) && kotlin.jvm.internal.p.e(this.f16012b, mVar.f16012b);
    }

    public int hashCode() {
        return (this.f16011a.hashCode() * 31) + this.f16012b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f16011a + ", animationSpec=" + this.f16012b + ')';
    }
}
