package androidx.compose.material;

import d2.k;
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

/* compiled from: TouchTarget.kt */
final class MinimumTouchTargetModifier implements q {

    /* renamed from: a  reason: collision with root package name */
    private final long f5097a;

    private MinimumTouchTargetModifier(long j) {
        this.f5097a = j;
    }

    public /* synthetic */ MinimumTouchTargetModifier(long j, i iVar) {
        this(j);
    }

    public u K(w wVar, r rVar, long j) {
        p.j(wVar, "$receiver");
        p.j(rVar, "measurable");
        e0 N = rVar.N(j);
        int max = Math.max(N.A0(), wVar.j0(k.h(a())));
        int max2 = Math.max(N.e0(), wVar.j0(k.g(a())));
        return v.b(wVar, max, max2, (Map) null, new MinimumTouchTargetModifier$measure$1(max, N, max2), 4, (Object) null);
    }

    public int L(j jVar, i1.i iVar, int i11) {
        return q.a.g(this, jVar, iVar, i11);
    }

    public d N(d dVar) {
        return q.a.h(this, dVar);
    }

    public <R> R W(R r11, lp0.p<? super d.b, ? super R, ? extends R> pVar) {
        return q.a.c(this, r11, pVar);
    }

    public final long a() {
        return this.f5097a;
    }

    public boolean equals(Object obj) {
        MinimumTouchTargetModifier minimumTouchTargetModifier = obj instanceof MinimumTouchTargetModifier ? (MinimumTouchTargetModifier) obj : null;
        if (minimumTouchTargetModifier == null) {
            return false;
        }
        return k.f(a(), minimumTouchTargetModifier.a());
    }

    public int f0(j jVar, i1.i iVar, int i11) {
        return q.a.d(this, jVar, iVar, i11);
    }

    public int hashCode() {
        return k.i(a());
    }

    public int n0(j jVar, i1.i iVar, int i11) {
        return q.a.f(this, jVar, iVar, i11);
    }

    public int p(j jVar, i1.i iVar, int i11) {
        return q.a.e(this, jVar, iVar, i11);
    }

    public <R> R s(R r11, lp0.p<? super R, ? super d.b, ? extends R> pVar) {
        return q.a.b(this, r11, pVar);
    }

    public boolean x(l<? super d.b, Boolean> lVar) {
        return q.a.a(this, lVar);
    }
}
