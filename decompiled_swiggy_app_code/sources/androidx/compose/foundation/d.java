package androidx.compose.foundation;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import p0.e;
import r0.f;

/* compiled from: AndroidOverscroll.kt */
final class d extends o0 implements f {

    /* renamed from: b  reason: collision with root package name */
    private final AndroidEdgeEffectOverscrollEffect f3186b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, l<? super n0, k> lVar) {
        super(lVar);
        p.j(androidEdgeEffectOverscrollEffect, "overscrollEffect");
        p.j(lVar, "inspectorInfo");
        this.f3186b = androidEdgeEffectOverscrollEffect;
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public void b(w0.c cVar) {
        p.j(cVar, "<this>");
        cVar.V();
        this.f3186b.v(cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return p.e(this.f3186b, ((d) obj).f3186b);
    }

    public int hashCode() {
        return this.f3186b.hashCode();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f3186b + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
