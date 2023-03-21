package androidx.compose.foundation.layout;

import a0.h;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.b;
import d2.c;
import d2.l;
import i1.e0;
import i1.i;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import lp0.p;
import p0.d;
import p0.e;

/* compiled from: Size.kt */
final class WrapContentModifier extends o0 implements q {

    /* renamed from: b  reason: collision with root package name */
    private final Direction f3884b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3885c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final p<d2.p, LayoutDirection, l> f3886d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f3887e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapContentModifier(Direction direction, boolean z11, p<? super d2.p, ? super LayoutDirection, l> pVar, Object obj, lp0.l<? super n0, k> lVar) {
        super(lVar);
        kotlin.jvm.internal.p.j(direction, "direction");
        kotlin.jvm.internal.p.j(pVar, "alignmentCallback");
        kotlin.jvm.internal.p.j(obj, "align");
        kotlin.jvm.internal.p.j(lVar, "inspectorInfo");
        this.f3884b = direction;
        this.f3885c = z11;
        this.f3886d = pVar;
        this.f3887e = obj;
    }

    public u K(w wVar, r rVar, long j) {
        int i11;
        r rVar2 = rVar;
        w wVar2 = wVar;
        kotlin.jvm.internal.p.j(wVar, "$this$measure");
        kotlin.jvm.internal.p.j(rVar2, "measurable");
        Direction direction = this.f3884b;
        Direction direction2 = Direction.Vertical;
        int i12 = 0;
        int p11 = direction != direction2 ? 0 : b.p(j);
        Direction direction3 = this.f3884b;
        Direction direction4 = Direction.Horizontal;
        if (direction3 == direction4) {
            i12 = b.o(j);
        }
        int i13 = Integer.MAX_VALUE;
        if (this.f3884b == direction2 || !this.f3885c) {
            i11 = b.n(j);
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (this.f3884b == direction4 || !this.f3885c) {
            i13 = b.m(j);
        }
        e0 N = rVar2.N(c.a(p11, i11, i12, i13));
        int m11 = l.m(N.A0(), b.p(j), b.n(j));
        int m12 = l.m(N.e0(), b.o(j), b.m(j));
        return v.b(wVar, m11, m12, (Map) null, new WrapContentModifier$measure$1(this, m11, N, m12, wVar), 4, (Object) null);
    }

    public /* synthetic */ int L(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.d(this, jVar, iVar, i11);
    }

    public /* synthetic */ d N(d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, p pVar) {
        return e.c(this, obj, pVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WrapContentModifier)) {
            return false;
        }
        WrapContentModifier wrapContentModifier = (WrapContentModifier) obj;
        if (this.f3884b == wrapContentModifier.f3884b && this.f3885c == wrapContentModifier.f3885c && kotlin.jvm.internal.p.e(this.f3887e, wrapContentModifier.f3887e)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ int f0(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.a(this, jVar, iVar, i11);
    }

    public int hashCode() {
        return (((this.f3884b.hashCode() * 31) + h.a(this.f3885c)) * 31) + this.f3887e.hashCode();
    }

    public /* synthetic */ int n0(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.c(this, jVar, iVar, i11);
    }

    public /* synthetic */ int p(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.b(this, jVar, iVar, i11);
    }

    public /* synthetic */ Object s(Object obj, p pVar) {
        return e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(lp0.l lVar) {
        return e.a(this, lVar);
    }
}
