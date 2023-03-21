package androidx.compose.ui.layout;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.b;
import i1.i;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.w;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import p0.e;

/* compiled from: LayoutModifier.kt */
final class c extends o0 implements q {

    /* renamed from: b  reason: collision with root package name */
    private final lp0.q<w, r, b, u> f6797b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(lp0.q<? super w, ? super r, ? super b, ? extends u> qVar, l<? super n0, k> lVar) {
        super(lVar);
        p.j(qVar, "measureBlock");
        p.j(lVar, "inspectorInfo");
        this.f6797b = qVar;
    }

    public u K(w wVar, r rVar, long j) {
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        return this.f6797b.invoke(wVar, rVar, b.b(j));
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c cVar = obj instanceof c ? (c) obj : null;
        if (cVar == null) {
            return false;
        }
        return p.e(this.f6797b, cVar.f6797b);
    }

    public /* synthetic */ int f0(j jVar, i iVar, int i11) {
        return b.a(this, jVar, iVar, i11);
    }

    public int hashCode() {
        return this.f6797b.hashCode();
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

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f6797b + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
