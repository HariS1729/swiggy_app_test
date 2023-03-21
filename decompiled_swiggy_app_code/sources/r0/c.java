package r0;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.d;
import d2.e;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: DrawModifier.kt */
public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private b f16418a = h.f16421a;

    /* renamed from: b  reason: collision with root package name */
    private g f16419b;

    public /* synthetic */ float M(float f11) {
        return d.c(this, f11);
    }

    public /* synthetic */ long S(long j) {
        return d.h(this, j);
    }

    public final g b() {
        return this.f16419b;
    }

    public final long d() {
        return this.f16418a.d();
    }

    public float getDensity() {
        return this.f16418a.getDensity().getDensity();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.f16418a.getLayoutDirection();
    }

    public /* synthetic */ int j0(float f11) {
        return d.b(this, f11);
    }

    public /* synthetic */ float k(int i11) {
        return d.d(this, i11);
    }

    public /* synthetic */ float m0(long j) {
        return d.f(this, j);
    }

    public /* synthetic */ long o(long j) {
        return d.e(this, j);
    }

    public final g p(l<? super w0.c, k> lVar) {
        p.j(lVar, RenderingDetails.TYPE_BLOCK);
        g gVar = new g(lVar);
        this.f16419b = gVar;
        return gVar;
    }

    public /* synthetic */ long q(int i11) {
        return d.i(this, i11);
    }

    public final void r(b bVar) {
        p.j(bVar, "<set-?>");
        this.f16418a = bVar;
    }

    public final void s(g gVar) {
        this.f16419b = gVar;
    }

    public float u0() {
        return this.f16418a.getDensity().u0();
    }

    public /* synthetic */ float v0(float f11) {
        return d.g(this, f11);
    }

    public /* synthetic */ int y0(long j) {
        return d.a(this, j);
    }
}
