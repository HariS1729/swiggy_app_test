package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import e0.a1;
import e0.g;
import e0.h;
import e0.h0;
import e0.s0;
import e0.u;
import kotlin.jvm.internal.p;
import l0.b;
import lp0.r;
import t0.l;
import u0.e0;
import w0.d;
import w0.f;
import y0.i;

/* compiled from: VectorPainter.kt */
public final class VectorPainter extends Painter {

    /* renamed from: g  reason: collision with root package name */
    private final h0 f6576g = j.e(l.c(l.f16682b.b()), (a1) null, 2, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    private final h0 f6577h = j.e(Boolean.FALSE, (a1) null, 2, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final VectorComponent f6578i;
    private h j;
    private final h0 k;

    /* renamed from: l  reason: collision with root package name */
    private float f6579l;

    /* renamed from: m  reason: collision with root package name */
    private e0 f6580m;

    public VectorPainter() {
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.n(new VectorPainter$vector$1$1(this));
        this.f6578i = vectorComponent;
        this.k = j.e(Boolean.TRUE, (a1) null, 2, (Object) null);
        this.f6579l = 1.0f;
    }

    private final h q(a aVar, r<? super Float, ? super Float, ? super g, ? super Integer, k> rVar) {
        h hVar = this.j;
        if (hVar == null || hVar.isDisposed()) {
            hVar = e0.k.a(new i(this.f6578i.j()), aVar);
        }
        this.j = hVar;
        hVar.c(b.c(-1916507005, true, new VectorPainter$composeVector$1(rVar, this)));
        return hVar;
    }

    private final boolean t() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final void v(boolean z11) {
        this.k.setValue(Boolean.valueOf(z11));
    }

    /* access modifiers changed from: protected */
    public boolean a(float f11) {
        this.f6579l = f11;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(e0 e0Var) {
        this.f6580m = e0Var;
        return true;
    }

    public long k() {
        return s();
    }

    /* access modifiers changed from: protected */
    public void m(f fVar) {
        p.j(fVar, "<this>");
        VectorComponent vectorComponent = this.f6578i;
        e0 e0Var = this.f6580m;
        if (e0Var == null) {
            e0Var = vectorComponent.h();
        }
        if (!r() || fVar.getLayoutDirection() != LayoutDirection.Rtl) {
            vectorComponent.g(fVar, this.f6579l, e0Var);
        } else {
            long R = fVar.R();
            d O = fVar.O();
            long d11 = O.d();
            O.a().a();
            O.c().a(-1.0f, 1.0f, R);
            vectorComponent.g(fVar, this.f6579l, e0Var);
            O.a().o();
            O.b(d11);
        }
        if (t()) {
            v(false);
        }
    }

    public final void n(String str, float f11, float f12, r<? super Float, ? super Float, ? super g, ? super Integer, k> rVar, g gVar, int i11) {
        p.j(str, "name");
        p.j(rVar, "content");
        g t = gVar.t(1264894527);
        VectorComponent vectorComponent = this.f6578i;
        vectorComponent.o(str);
        vectorComponent.q(f11);
        vectorComponent.p(f12);
        h q = q(e0.f.d(t, 0), rVar);
        u.b(q, new VectorPainter$RenderVector$2(q), t, 8);
        s0 v = t.v();
        if (v != null) {
            v.a(new VectorPainter$RenderVector$3(this, str, f11, f12, rVar, i11));
        }
    }

    public final boolean r() {
        return ((Boolean) this.f6577h.getValue()).booleanValue();
    }

    public final long s() {
        return ((l) this.f6576g.getValue()).m();
    }

    public final void u(boolean z11) {
        this.f6577h.setValue(Boolean.valueOf(z11));
    }

    public final void w(e0 e0Var) {
        this.f6578i.m(e0Var);
    }

    public final void x(long j11) {
        this.f6576g.setValue(l.c(j11));
    }
}
