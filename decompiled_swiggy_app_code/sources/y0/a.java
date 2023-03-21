package y0;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import d2.p;
import d2.q;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import lp0.l;
import u0.d0;
import u0.e0;
import u0.l0;
import u0.n0;
import u0.s;
import u0.x;
import u0.z;
import w0.a;
import w0.f;
import w0.g;

/* compiled from: DrawCache.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private l0 f17850a;

    /* renamed from: b  reason: collision with root package name */
    private x f17851b;

    /* renamed from: c  reason: collision with root package name */
    private e f17852c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutDirection f17853d = LayoutDirection.Ltr;

    /* renamed from: e  reason: collision with root package name */
    private long f17854e = p.f14019b.a();

    /* renamed from: f  reason: collision with root package name */
    private final w0.a f17855f = new w0.a();

    private final void a(f fVar) {
        w0.e.n(fVar, d0.f16756b.a(), 0, 0, 0.0f, (g) null, (e0) null, s.f16866b.a(), 62, (Object) null);
    }

    public final void b(long j, e eVar, LayoutDirection layoutDirection, l<? super f, k> lVar) {
        e eVar2 = eVar;
        LayoutDirection layoutDirection2 = layoutDirection;
        l<? super f, k> lVar2 = lVar;
        kotlin.jvm.internal.p.j(eVar2, "density");
        kotlin.jvm.internal.p.j(layoutDirection2, "layoutDirection");
        kotlin.jvm.internal.p.j(lVar2, RenderingDetails.TYPE_BLOCK);
        this.f17852c = eVar2;
        this.f17853d = layoutDirection2;
        l0 l0Var = this.f17850a;
        x xVar = this.f17851b;
        if (l0Var == null || xVar == null || p.g(j) > l0Var.getWidth() || p.f(j) > l0Var.getHeight()) {
            l0Var = n0.b(p.g(j), p.f(j), 0, false, (androidx.compose.ui.graphics.colorspace.a) null, 28, (Object) null);
            xVar = z.a(l0Var);
            this.f17850a = l0Var;
            this.f17851b = xVar;
        }
        this.f17854e = j;
        w0.a aVar = this.f17855f;
        long b11 = q.b(j);
        a.C0202a D = aVar.D();
        e a11 = D.a();
        LayoutDirection b12 = D.b();
        x c11 = D.c();
        long d11 = D.d();
        a.C0202a D2 = aVar.D();
        D2.j(eVar2);
        D2.k(layoutDirection2);
        D2.i(xVar);
        D2.l(b11);
        xVar.a();
        a(aVar);
        lVar2.invoke(aVar);
        xVar.o();
        a.C0202a D3 = aVar.D();
        D3.j(a11);
        D3.k(b12);
        D3.i(c11);
        D3.l(d11);
        l0Var.a();
    }

    public final void c(f fVar, float f11, e0 e0Var) {
        kotlin.jvm.internal.p.j(fVar, "target");
        l0 l0Var = this.f17850a;
        if (l0Var != null) {
            w0.e.g(fVar, l0Var, 0, this.f17854e, 0, 0, f11, (g) null, e0Var, 0, 0, 858, (Object) null);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }
}
