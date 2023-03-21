package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.b;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.c;
import d2.h;
import defpackage.a2;
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

/* compiled from: Padding.kt */
final class PaddingValuesModifier extends o0 implements q {

    /* renamed from: b  reason: collision with root package name */
    private final a2.p f3785b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier(a2.p pVar, l<? super n0, k> lVar) {
        super(lVar);
        p.j(pVar, "paddingValues");
        p.j(lVar, "inspectorInfo");
        this.f3785b = pVar;
    }

    public u K(w wVar, r rVar, long j) {
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        boolean z11 = false;
        float f11 = (float) 0;
        if (h.m(this.f3785b.b(wVar.getLayoutDirection()), h.n(f11)) >= 0 && h.m(this.f3785b.d(), h.n(f11)) >= 0 && h.m(this.f3785b.c(wVar.getLayoutDirection()), h.n(f11)) >= 0 && h.m(this.f3785b.a(), h.n(f11)) >= 0) {
            z11 = true;
        }
        if (z11) {
            int j02 = wVar.j0(this.f3785b.b(wVar.getLayoutDirection())) + wVar.j0(this.f3785b.c(wVar.getLayoutDirection()));
            int j03 = wVar.j0(this.f3785b.d()) + wVar.j0(this.f3785b.a());
            e0 N = rVar.N(c.i(j, -j02, -j03));
            return v.b(wVar, c.g(j, N.A0() + j02), c.f(j, N.e0() + j03), (Map) null, new PaddingValuesModifier$measure$2(N, wVar, this), 4, (Object) null);
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    public /* synthetic */ int L(j jVar, i iVar, int i11) {
        return b.d(this, jVar, iVar, i11);
    }

    public /* synthetic */ d N(d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public final a2.p c() {
        return this.f3785b;
    }

    public boolean equals(Object obj) {
        PaddingValuesModifier paddingValuesModifier = obj instanceof PaddingValuesModifier ? (PaddingValuesModifier) obj : null;
        if (paddingValuesModifier == null) {
            return false;
        }
        return p.e(this.f3785b, paddingValuesModifier.f3785b);
    }

    public /* synthetic */ int f0(j jVar, i iVar, int i11) {
        return b.a(this, jVar, iVar, i11);
    }

    public int hashCode() {
        return this.f3785b.hashCode();
    }

    public /* synthetic */ int n0(j jVar, i iVar, int i11) {
        return b.c(this, jVar, iVar, i11);
    }

    public /* synthetic */ int p(j jVar, i iVar, int i11) {
        return b.b(this, jVar, iVar, i11);
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
