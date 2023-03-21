package u0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import bp0.k;
import d2.l;
import kotlin.jvm.internal.p;
import t0.f;
import t0.h;

/* compiled from: AndroidCanvas.android.kt */
public final class b implements x {

    /* renamed from: a  reason: collision with root package name */
    private Canvas f16747a = c.f16751a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f16748b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private final Rect f16749c = new Rect();

    public void a() {
        this.f16747a.save();
    }

    public void b(float f11, float f12, float f13, float f14, int i11) {
        this.f16747a.clipRect(f11, f12, f13, f14, x(i11));
    }

    public void c(float f11, float f12) {
        this.f16747a.translate(f11, f12);
    }

    public void d(w0 w0Var, int i11) {
        p.j(w0Var, "path");
        Canvas canvas = this.f16747a;
        if (w0Var instanceof j) {
            canvas.clipPath(((j) w0Var).s(), x(i11));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void e(long j, long j11, t0 t0Var) {
        p.j(t0Var, "paint");
        this.f16747a.drawLine(f.m(j), f.n(j), f.m(j11), f.n(j11), t0Var.k());
    }

    public void f(float f11, float f12, float f13, float f14, float f15, float f16, t0 t0Var) {
        p.j(t0Var, "paint");
        this.f16747a.drawRoundRect(f11, f12, f13, f14, f15, f16, t0Var.k());
    }

    public /* synthetic */ void g(h hVar, t0 t0Var) {
        w.b(this, hVar, t0Var);
    }

    public void h(h hVar, t0 t0Var) {
        p.j(hVar, "bounds");
        p.j(t0Var, "paint");
        this.f16747a.saveLayer(hVar.i(), hVar.l(), hVar.j(), hVar.e(), t0Var.k(), 31);
    }

    public void i(l0 l0Var, long j, t0 t0Var) {
        p.j(l0Var, "image");
        p.j(t0Var, "paint");
        this.f16747a.drawBitmap(f.b(l0Var), f.m(j), f.n(j), t0Var.k());
    }

    public void j() {
        a0.f16737a.a(this.f16747a, false);
    }

    public void k(float f11, float f12, float f13, float f14, t0 t0Var) {
        p.j(t0Var, "paint");
        this.f16747a.drawRect(f11, f12, f13, f14, t0Var.k());
    }

    public void l(float f11, float f12) {
        this.f16747a.scale(f11, f12);
    }

    public void m(l0 l0Var, long j, long j11, long j12, long j13, t0 t0Var) {
        p.j(l0Var, "image");
        p.j(t0Var, "paint");
        Canvas canvas = this.f16747a;
        Bitmap b11 = f.b(l0Var);
        Rect rect = this.f16748b;
        rect.left = l.j(j);
        rect.top = l.k(j);
        rect.right = l.j(j) + d2.p.g(j11);
        rect.bottom = l.k(j) + d2.p.f(j11);
        k kVar = k.f22762a;
        Rect rect2 = this.f16749c;
        rect2.left = l.j(j12);
        rect2.top = l.k(j12);
        rect2.right = l.j(j12) + d2.p.g(j13);
        rect2.bottom = l.k(j12) + d2.p.f(j13);
        canvas.drawBitmap(b11, rect, rect2, t0Var.k());
    }

    public void n(long j, float f11, t0 t0Var) {
        p.j(t0Var, "paint");
        this.f16747a.drawCircle(f.m(j), f.n(j), f11, t0Var.k());
    }

    public void o() {
        this.f16747a.restore();
    }

    public void p() {
        a0.f16737a.a(this.f16747a, true);
    }

    public void q(float f11) {
        this.f16747a.rotate(f11);
    }

    public void r(w0 w0Var, t0 t0Var) {
        p.j(w0Var, "path");
        p.j(t0Var, "paint");
        Canvas canvas = this.f16747a;
        if (w0Var instanceof j) {
            canvas.drawPath(((j) w0Var).s(), t0Var.k());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void s(float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, t0 t0Var) {
        p.j(t0Var, "paint");
        this.f16747a.drawArc(f11, f12, f13, f14, f15, f16, z11, t0Var.k());
    }

    public void t(float[] fArr) {
        p.j(fArr, "matrix");
        if (!q0.a(fArr)) {
            Matrix matrix = new Matrix();
            g.a(matrix, fArr);
            this.f16747a.concat(matrix);
        }
    }

    public /* synthetic */ void u(h hVar, int i11) {
        w.a(this, hVar, i11);
    }

    public final Canvas v() {
        return this.f16747a;
    }

    public final void w(Canvas canvas) {
        p.j(canvas, "<set-?>");
        this.f16747a = canvas;
    }

    public final Region.Op x(int i11) {
        if (c0.d(i11, c0.f16752a.a())) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }
}
