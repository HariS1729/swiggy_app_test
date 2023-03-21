package coil.compose;

import d2.b;
import fp0.c;
import i1.e0;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.s;
import lp0.l;
import lp0.p;
import p0.d;
import y6.g;
import y6.h;

/* compiled from: AsyncImage.kt */
public final class ConstraintsSizeResolver implements h, q {

    /* renamed from: a  reason: collision with root package name */
    private final i<b> f13460a = s.a(b.b(UtilsKt.c()));

    public u K(w wVar, r rVar, long j) {
        this.f13460a.setValue(b.b(j));
        e0 N = rVar.N(j);
        return v.b(wVar, N.A0(), N.e0(), (Map) null, new ConstraintsSizeResolver$measure$1(N), 4, (Object) null);
    }

    public int L(j jVar, i1.i iVar, int i11) {
        return q.a.g(this, jVar, iVar, i11);
    }

    public d N(d dVar) {
        return q.a.h(this, dVar);
    }

    public <R> R W(R r11, p<? super d.b, ? super R, ? extends R> pVar) {
        return q.a.c(this, r11, pVar);
    }

    public Object a(c<? super g> cVar) {
        return f.s(new ConstraintsSizeResolver$size$$inlined$mapNotNull$1(this.f13460a), cVar);
    }

    public int f0(j jVar, i1.i iVar, int i11) {
        return q.a.d(this, jVar, iVar, i11);
    }

    public int n0(j jVar, i1.i iVar, int i11) {
        return q.a.f(this, jVar, iVar, i11);
    }

    public int p(j jVar, i1.i iVar, int i11) {
        return q.a.e(this, jVar, iVar, i11);
    }

    public <R> R s(R r11, p<? super R, ? super d.b, ? extends R> pVar) {
        return q.a.b(this, r11, pVar);
    }

    public boolean x(l<? super d.b, Boolean> lVar) {
        return q.a.a(this, lVar);
    }
}
