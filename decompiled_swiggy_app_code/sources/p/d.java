package p;

import d2.p;
import defpackage.v1;
import lp0.l;
import p0.a;

/* compiled from: EnterExitTransition.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final a f15990a;

    /* renamed from: b  reason: collision with root package name */
    private final l<p, p> f15991b;

    /* renamed from: c  reason: collision with root package name */
    private final v1.a0<p> f15992c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f15993d;

    public d(a aVar, l<? super p, p> lVar, v1.a0<p> a0Var, boolean z11) {
        kotlin.jvm.internal.p.j(aVar, "alignment");
        kotlin.jvm.internal.p.j(lVar, "size");
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        this.f15990a = aVar;
        this.f15991b = lVar;
        this.f15992c = a0Var;
        this.f15993d = z11;
    }

    public final a a() {
        return this.f15990a;
    }

    public final v1.a0<p> b() {
        return this.f15992c;
    }

    public final boolean c() {
        return this.f15993d;
    }

    public final l<p, p> d() {
        return this.f15991b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.p.e(this.f15990a, dVar.f15990a) && kotlin.jvm.internal.p.e(this.f15991b, dVar.f15991b) && kotlin.jvm.internal.p.e(this.f15992c, dVar.f15992c) && this.f15993d == dVar.f15993d;
    }

    public int hashCode() {
        int hashCode = ((((this.f15990a.hashCode() * 31) + this.f15991b.hashCode()) * 31) + this.f15992c.hashCode()) * 31;
        boolean z11 = this.f15993d;
        if (z11) {
            z11 = true;
        }
        return hashCode + (z11 ? 1 : 0);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f15990a + ", size=" + this.f15991b + ", animationSpec=" + this.f15992c + ", clip=" + this.f15993d + ')';
    }
}
