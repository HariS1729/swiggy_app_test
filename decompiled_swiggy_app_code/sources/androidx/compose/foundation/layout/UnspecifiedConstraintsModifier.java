package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.b;
import d2.c;
import d2.h;
import i1.e0;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import p0.e;

/* compiled from: Size.kt */
final class UnspecifiedConstraintsModifier extends o0 implements q {

    /* renamed from: b  reason: collision with root package name */
    private final float f3857b;

    /* renamed from: c  reason: collision with root package name */
    private final float f3858c;

    private UnspecifiedConstraintsModifier(float f11, float f12, l<? super n0, k> lVar) {
        super(lVar);
        this.f3857b = f11;
        this.f3858c = f12;
    }

    public /* synthetic */ UnspecifiedConstraintsModifier(float f11, float f12, l lVar, i iVar) {
        this(f11, f12, lVar);
    }

    public u K(w wVar, r rVar, long j) {
        int i11;
        int i12;
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        float f11 = this.f3857b;
        h.a aVar = h.f13997b;
        if (h.p(f11, aVar.c()) || b.p(j) != 0) {
            i11 = b.p(j);
        } else {
            i11 = l.d(l.i(wVar.j0(this.f3857b), b.n(j)), 0);
        }
        int n = b.n(j);
        if (h.p(this.f3858c, aVar.c()) || b.o(j) != 0) {
            i12 = b.o(j);
        } else {
            i12 = l.d(l.i(wVar.j0(this.f3858c), b.m(j)), 0);
        }
        e0 N = rVar.N(c.a(i11, n, i12, b.m(j)));
        return v.b(wVar, N.A0(), N.e0(), (Map) null, new UnspecifiedConstraintsModifier$measure$1(N), 4, (Object) null);
    }

    public int L(j jVar, i1.i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        return l.d(iVar.K(i11), !h.p(this.f3857b, h.f13997b.c()) ? jVar.j0(this.f3857b) : 0);
    }

    public /* synthetic */ d N(d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsModifier)) {
            return false;
        }
        UnspecifiedConstraintsModifier unspecifiedConstraintsModifier = (UnspecifiedConstraintsModifier) obj;
        if (!h.p(this.f3857b, unspecifiedConstraintsModifier.f3857b) || !h.p(this.f3858c, unspecifiedConstraintsModifier.f3858c)) {
            return false;
        }
        return true;
    }

    public int f0(j jVar, i1.i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        return l.d(iVar.x(i11), !h.p(this.f3858c, h.f13997b.c()) ? jVar.j0(this.f3858c) : 0);
    }

    public int hashCode() {
        return (h.q(this.f3857b) * 31) + h.q(this.f3858c);
    }

    public int n0(j jVar, i1.i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        return l.d(iVar.J(i11), !h.p(this.f3858c, h.f13997b.c()) ? jVar.j0(this.f3858c) : 0);
    }

    public int p(j jVar, i1.i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        return l.d(iVar.L(i11), !h.p(this.f3857b, h.f13997b.c()) ? jVar.j0(this.f3857b) : 0);
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
