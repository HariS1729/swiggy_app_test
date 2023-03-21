package w0;

import d2.e;
import d2.g;
import kotlin.jvm.internal.p;
import t0.f;
import t0.l;
import t0.m;
import u0.w0;
import u0.x;

/* compiled from: CanvasDrawScope.kt */
public final class b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final e f17430a = g.a(1.0f, 1.0f);

    /* compiled from: CanvasDrawScope.kt */
    public static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f17431a;

        a(d dVar) {
            this.f17431a = dVar;
        }

        public void a(float f11, float f12, long j) {
            x a11 = this.f17431a.a();
            a11.c(f.m(j), f.n(j));
            a11.l(f11, f12);
            a11.c(-f.m(j), -f.n(j));
        }

        public void b(float f11, float f12, float f13, float f14, int i11) {
            this.f17431a.a().b(f11, f12, f13, f14, i11);
        }

        public void c(float f11, float f12) {
            this.f17431a.a().c(f11, f12);
        }

        public void d(w0 w0Var, int i11) {
            p.j(w0Var, "path");
            this.f17431a.a().d(w0Var, i11);
        }

        public void e(float f11, long j) {
            x a11 = this.f17431a.a();
            a11.c(f.m(j), f.n(j));
            a11.q(f11);
            a11.c(-f.m(j), -f.n(j));
        }

        public void f(float f11, float f12, float f13, float f14) {
            x a11 = this.f17431a.a();
            d dVar = this.f17431a;
            long a12 = m.a(l.i(h()) - (f13 + f11), l.g(h()) - (f14 + f12));
            if (l.i(a12) >= 0.0f && l.g(a12) >= 0.0f) {
                dVar.b(a12);
                a11.c(f11, f12);
                return;
            }
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
        }

        public void g(float[] fArr) {
            p.j(fArr, "matrix");
            this.f17431a.a().t(fArr);
        }

        public long h() {
            return this.f17431a.d();
        }
    }

    /* access modifiers changed from: private */
    public static final i c(d dVar) {
        return new a(dVar);
    }
}
