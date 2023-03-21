package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import d2.b;
import i1.e0;
import i1.i;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.jvm.internal.p;
import p0.c;
import p0.e;
import s.d;
import s.l;

/* compiled from: Scroll.kt */
final class ScrollingLayoutModifier implements q {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollState f3164a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3165b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3166c;

    /* renamed from: d  reason: collision with root package name */
    private final l f3167d;

    public ScrollingLayoutModifier(ScrollState scrollState, boolean z11, boolean z12, l lVar) {
        p.j(scrollState, "scrollerState");
        p.j(lVar, "overscrollEffect");
        this.f3164a = scrollState;
        this.f3165b = z11;
        this.f3166c = z12;
        this.f3167d = lVar;
    }

    public u K(w wVar, r rVar, long j) {
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        d.a(j, this.f3166c ? Orientation.Vertical : Orientation.Horizontal);
        e0 N = rVar.N(b.e(j, 0, this.f3166c ? b.n(j) : Integer.MAX_VALUE, 0, this.f3166c ? Integer.MAX_VALUE : b.m(j), 5, (Object) null));
        int i11 = l.i(N.A0(), b.n(j));
        int i12 = l.i(N.e0(), b.m(j));
        int e02 = N.e0() - i12;
        int A0 = N.A0() - i11;
        if (!this.f3166c) {
            e02 = A0;
        }
        this.f3167d.setEnabled(e02 != 0);
        return v.b(wVar, i11, i12, (Map) null, new ScrollingLayoutModifier$measure$1(this, e02, N), 4, (Object) null);
    }

    public int L(j jVar, i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        return iVar.K(i11);
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public final ScrollState a() {
        return this.f3164a;
    }

    public final boolean c() {
        return this.f3165b;
    }

    public final boolean d() {
        return this.f3166c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollingLayoutModifier)) {
            return false;
        }
        ScrollingLayoutModifier scrollingLayoutModifier = (ScrollingLayoutModifier) obj;
        return p.e(this.f3164a, scrollingLayoutModifier.f3164a) && this.f3165b == scrollingLayoutModifier.f3165b && this.f3166c == scrollingLayoutModifier.f3166c && p.e(this.f3167d, scrollingLayoutModifier.f3167d);
    }

    public int f0(j jVar, i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        return iVar.x(i11);
    }

    public int hashCode() {
        int hashCode = this.f3164a.hashCode() * 31;
        boolean z11 = this.f3165b;
        boolean z12 = true;
        if (z11) {
            z11 = true;
        }
        int i11 = (hashCode + (z11 ? 1 : 0)) * 31;
        boolean z13 = this.f3166c;
        if (!z13) {
            z12 = z13;
        }
        return ((i11 + (z12 ? 1 : 0)) * 31) + this.f3167d.hashCode();
    }

    public int n0(j jVar, i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        return iVar.J(i11);
    }

    public int p(j jVar, i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        return iVar.L(i11);
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.f3164a + ", isReversed=" + this.f3165b + ", isVertical=" + this.f3166c + ", overscrollEffect=" + this.f3167d + ')';
    }

    public /* synthetic */ boolean x(lp0.l lVar) {
        return e.a(this, lVar);
    }
}
