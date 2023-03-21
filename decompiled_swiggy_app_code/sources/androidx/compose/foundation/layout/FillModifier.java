package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.b;
import d2.c;
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
import lp0.l;
import p0.d;
import p0.e;

/* compiled from: Size.kt */
final class FillModifier extends o0 implements q {

    /* renamed from: b  reason: collision with root package name */
    private final Direction f3719b;

    /* renamed from: c  reason: collision with root package name */
    private final float f3720c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FillModifier(Direction direction, float f11, l<? super n0, k> lVar) {
        super(lVar);
        p.j(direction, "direction");
        p.j(lVar, "inspectorInfo");
        this.f3719b = direction;
        this.f3720c = f11;
    }

    public u K(w wVar, r rVar, long j) {
        int i11;
        int i12;
        int i13;
        int i14;
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        if (!b.j(j) || this.f3719b == Direction.Vertical) {
            i12 = b.p(j);
            i11 = b.n(j);
        } else {
            i12 = l.m(c.c(((float) b.n(j)) * this.f3720c), b.p(j), b.n(j));
            i11 = i12;
        }
        if (!b.i(j) || this.f3719b == Direction.Horizontal) {
            int o11 = b.o(j);
            i13 = b.m(j);
            i14 = o11;
        } else {
            i14 = l.m(c.c(((float) b.m(j)) * this.f3720c), b.o(j), b.m(j));
            i13 = i14;
        }
        e0 N = rVar.N(c.a(i12, i11, i14, i13));
        return v.b(wVar, N.A0(), N.e0(), (Map) null, new FillModifier$measure$1(N), 4, (Object) null);
    }

    public /* synthetic */ int L(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.d(this, jVar, iVar, i11);
    }

    public /* synthetic */ d N(d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FillModifier) {
            FillModifier fillModifier = (FillModifier) obj;
            if (this.f3719b == fillModifier.f3719b) {
                if (this.f3720c == fillModifier.f3720c) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ int f0(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.a(this, jVar, iVar, i11);
    }

    public int hashCode() {
        return (this.f3719b.hashCode() * 31) + Float.floatToIntBits(this.f3720c);
    }

    public /* synthetic */ int n0(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.c(this, jVar, iVar, i11);
    }

    public /* synthetic */ int p(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.b(this, jVar, iVar, i11);
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
