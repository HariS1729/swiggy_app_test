package u0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.a;
import t0.f;
import t0.h;
import u0.a1;

/* compiled from: AndroidPath.android.kt */
public final class j implements w0 {

    /* renamed from: b  reason: collision with root package name */
    private final Path f16815b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f16816c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f16817d;

    /* renamed from: e  reason: collision with root package name */
    private final Matrix f16818e;

    public j() {
        this((Path) null, 1, (i) null);
    }

    public j(Path path) {
        p.j(path, "internalPath");
        this.f16815b = path;
        this.f16816c = new RectF();
        this.f16817d = new float[8];
        this.f16818e = new Matrix();
    }

    private final boolean r(h hVar) {
        if (!(!Float.isNaN(hVar.i()))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        } else if (!(!Float.isNaN(hVar.l()))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        } else if (!(!Float.isNaN(hVar.j()))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        } else if (!Float.isNaN(hVar.e())) {
            return true;
        } else {
            throw new IllegalStateException("Rect.bottom is NaN".toString());
        }
    }

    public h a() {
        this.f16815b.computeBounds(this.f16816c, true);
        RectF rectF = this.f16816c;
        return new h(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public void b(float f11, float f12) {
        this.f16815b.rMoveTo(f11, f12);
    }

    public void c(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f16815b.rCubicTo(f11, f12, f13, f14, f15, f16);
    }

    public void close() {
        this.f16815b.close();
    }

    public void d(float f11, float f12, float f13, float f14) {
        this.f16815b.rQuadTo(f11, f12, f13, f14);
    }

    public void e(long j) {
        this.f16818e.reset();
        this.f16818e.setTranslate(f.m(j), f.n(j));
        this.f16815b.transform(this.f16818e);
    }

    public void f(t0.j jVar) {
        p.j(jVar, "roundRect");
        this.f16816c.set(jVar.e(), jVar.g(), jVar.f(), jVar.a());
        this.f16817d[0] = a.d(jVar.h());
        this.f16817d[1] = a.e(jVar.h());
        this.f16817d[2] = a.d(jVar.i());
        this.f16817d[3] = a.e(jVar.i());
        this.f16817d[4] = a.d(jVar.c());
        this.f16817d[5] = a.e(jVar.c());
        this.f16817d[6] = a.d(jVar.b());
        this.f16817d[7] = a.e(jVar.b());
        this.f16815b.addRoundRect(this.f16816c, this.f16817d, Path.Direction.CCW);
    }

    public void g(h hVar) {
        p.j(hVar, "oval");
        this.f16816c.set(b1.a(hVar));
        this.f16815b.addOval(this.f16816c, Path.Direction.CCW);
    }

    public void h(h hVar) {
        p.j(hVar, "rect");
        if (r(hVar)) {
            this.f16816c.set(b1.b(hVar));
            this.f16815b.addRect(this.f16816c, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void i(float f11, float f12) {
        this.f16815b.moveTo(f11, f12);
    }

    public boolean isEmpty() {
        return this.f16815b.isEmpty();
    }

    public void j(float f11, float f12) {
        this.f16815b.lineTo(f11, f12);
    }

    public boolean k() {
        return this.f16815b.isConvex();
    }

    public void l(float f11, float f12, float f13, float f14) {
        this.f16815b.quadTo(f11, f12, f13, f14);
    }

    public void m(int i11) {
        Path.FillType fillType;
        Path path = this.f16815b;
        if (y0.f(i11, y0.f16899b.a())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    public void n(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f16815b.cubicTo(f11, f12, f13, f14, f15, f16);
    }

    public boolean o(w0 w0Var, w0 w0Var2, int i11) {
        Path.Op op2;
        p.j(w0Var, "path1");
        p.j(w0Var2, "path2");
        a1.a aVar = a1.f16741a;
        if (a1.f(i11, aVar.a())) {
            op2 = Path.Op.DIFFERENCE;
        } else if (a1.f(i11, aVar.b())) {
            op2 = Path.Op.INTERSECT;
        } else if (a1.f(i11, aVar.c())) {
            op2 = Path.Op.REVERSE_DIFFERENCE;
        } else if (a1.f(i11, aVar.d())) {
            op2 = Path.Op.UNION;
        } else {
            op2 = Path.Op.XOR;
        }
        Path path = this.f16815b;
        if (w0Var instanceof j) {
            Path s11 = ((j) w0Var).s();
            if (w0Var2 instanceof j) {
                return path.op(s11, ((j) w0Var2).s(), op2);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void p(w0 w0Var, long j) {
        p.j(w0Var, "path");
        Path path = this.f16815b;
        if (w0Var instanceof j) {
            path.addPath(((j) w0Var).s(), f.m(j), f.n(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void q(float f11, float f12) {
        this.f16815b.rLineTo(f11, f12);
    }

    public void reset() {
        this.f16815b.reset();
    }

    public final Path s() {
        return this.f16815b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Path path, int i11, i iVar) {
        this((i11 & 1) != 0 ? new Path() : path);
    }
}
