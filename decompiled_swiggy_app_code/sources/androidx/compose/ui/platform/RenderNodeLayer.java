package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import k1.o;
import kotlin.jvm.internal.i;
import lp0.l;
import lp0.p;
import t0.d;
import t0.f;
import t0.m;
import u0.c;
import u0.c1;
import u0.d1;
import u0.f0;
import u0.j1;
import u0.p0;
import u0.q1;
import u0.t0;
import u0.w0;
import u0.x;
import u0.y;

/* compiled from: RenderNodeLayer.android.kt */
public final class RenderNodeLayer implements o {

    /* renamed from: m  reason: collision with root package name */
    public static final a f7162m = new a((i) null);
    private static final p<h0, Matrix, k> n = RenderNodeLayer$Companion$getMatrix$1.f7173a;

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f7163a;

    /* renamed from: b  reason: collision with root package name */
    private l<? super x, k> f7164b;

    /* renamed from: c  reason: collision with root package name */
    private lp0.a<k> f7165c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7166d;

    /* renamed from: e  reason: collision with root package name */
    private final v0 f7167e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7168f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7169g;

    /* renamed from: h  reason: collision with root package name */
    private t0 f7170h;

    /* renamed from: i  reason: collision with root package name */
    private final r0<h0> f7171i = new r0<>(n);
    private final y j = new y();
    private long k = q1.f16858b.a();

    /* renamed from: l  reason: collision with root package name */
    private final h0 f7172l;

    /* compiled from: RenderNodeLayer.android.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public RenderNodeLayer(AndroidComposeView androidComposeView, l<? super x, k> lVar, lp0.a<k> aVar) {
        h0 h0Var;
        kotlin.jvm.internal.p.j(androidComposeView, "ownerView");
        kotlin.jvm.internal.p.j(lVar, "drawBlock");
        kotlin.jvm.internal.p.j(aVar, "invalidateParentLayer");
        this.f7163a = androidComposeView;
        this.f7164b = lVar;
        this.f7165c = aVar;
        this.f7167e = new v0(androidComposeView.getDensity());
        if (Build.VERSION.SDK_INT >= 29) {
            h0Var = new x0(androidComposeView);
        } else {
            h0Var = new w0(androidComposeView);
        }
        h0Var.v(true);
        this.f7172l = h0Var;
    }

    private final void j(x xVar) {
        if (this.f7172l.u() || this.f7172l.E()) {
            this.f7167e.a(xVar);
        }
    }

    private final void k(boolean z11) {
        if (z11 != this.f7166d) {
            this.f7166d = z11;
            this.f7163a.c0(this, z11);
        }
    }

    private final void l() {
        if (Build.VERSION.SDK_INT >= 26) {
            y1.f7397a.a(this.f7163a);
        } else {
            this.f7163a.invalidate();
        }
    }

    public void a(d dVar, boolean z11) {
        kotlin.jvm.internal.p.j(dVar, "rect");
        if (z11) {
            float[] a11 = this.f7171i.a(this.f7172l);
            if (a11 == null) {
                dVar.g(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                p0.g(a11, dVar);
            }
        } else {
            p0.g(this.f7171i.b(this.f7172l), dVar);
        }
    }

    public void b(l<? super x, k> lVar, lp0.a<k> aVar) {
        kotlin.jvm.internal.p.j(lVar, "drawBlock");
        kotlin.jvm.internal.p.j(aVar, "invalidateParentLayer");
        k(false);
        this.f7168f = false;
        this.f7169g = false;
        this.k = q1.f16858b.a();
        this.f7164b = lVar;
        this.f7165c = aVar;
    }

    public long c(long j11, boolean z11) {
        if (!z11) {
            return p0.f(this.f7171i.b(this.f7172l), j11);
        }
        float[] a11 = this.f7171i.a(this.f7172l);
        return a11 != null ? p0.f(a11, j11) : f.f16662b.a();
    }

    public void d(long j11) {
        int g11 = d2.p.g(j11);
        int f11 = d2.p.f(j11);
        float f12 = (float) g11;
        this.f7172l.y(q1.f(this.k) * f12);
        float f13 = (float) f11;
        this.f7172l.z(q1.g(this.k) * f13);
        h0 h0Var = this.f7172l;
        if (h0Var.C(h0Var.getLeft(), this.f7172l.getTop(), this.f7172l.getLeft() + g11, this.f7172l.getTop() + f11)) {
            this.f7167e.h(m.a(f12, f13));
            this.f7172l.A(this.f7167e.c());
            invalidate();
            this.f7171i.c();
        }
    }

    public void destroy() {
        if (this.f7172l.s()) {
            this.f7172l.D();
        }
        this.f7164b = null;
        this.f7165c = null;
        this.f7168f = true;
        k(false);
        this.f7163a.i0();
        this.f7163a.g0(this);
    }

    public void e(x xVar) {
        kotlin.jvm.internal.p.j(xVar, "canvas");
        Canvas c11 = c.c(xVar);
        boolean z11 = false;
        if (c11.isHardwareAccelerated()) {
            h();
            if (this.f7172l.H() > 0.0f) {
                z11 = true;
            }
            this.f7169g = z11;
            if (z11) {
                xVar.p();
            }
            this.f7172l.o(c11);
            if (this.f7169g) {
                xVar.j();
                return;
            }
            return;
        }
        float left = (float) this.f7172l.getLeft();
        float top = (float) this.f7172l.getTop();
        float right = (float) this.f7172l.getRight();
        float bottom = (float) this.f7172l.getBottom();
        if (this.f7172l.getAlpha() < 1.0f) {
            t0 t0Var = this.f7170h;
            if (t0Var == null) {
                t0Var = u0.i.a();
                this.f7170h = t0Var;
            }
            t0Var.c(this.f7172l.getAlpha());
            c11.saveLayer(left, top, right, bottom, t0Var.k());
        } else {
            xVar.a();
        }
        xVar.c(left, top);
        xVar.t(this.f7171i.b(this.f7172l));
        j(xVar);
        l<? super x, k> lVar = this.f7164b;
        if (lVar != null) {
            lVar.invoke(xVar);
        }
        xVar.o();
        k(false);
    }

    public boolean f(long j11) {
        float m11 = f.m(j11);
        float n11 = f.n(j11);
        if (this.f7172l.E()) {
            if (0.0f > m11 || m11 >= ((float) this.f7172l.getWidth()) || 0.0f > n11 || n11 >= ((float) this.f7172l.getHeight())) {
                return false;
            }
            return true;
        } else if (this.f7172l.u()) {
            return this.f7167e.e(j11);
        } else {
            return true;
        }
    }

    public void g(long j11) {
        int left = this.f7172l.getLeft();
        int top = this.f7172l.getTop();
        int j12 = d2.l.j(j11);
        int k11 = d2.l.k(j11);
        if (left != j12 || top != k11) {
            this.f7172l.x(j12 - left);
            this.f7172l.r(k11 - top);
            l();
            this.f7171i.c();
        }
    }

    public void h() {
        if (this.f7166d || !this.f7172l.s()) {
            k(false);
            w0 b11 = (!this.f7172l.u() || this.f7167e.d()) ? null : this.f7167e.b();
            l<? super x, k> lVar = this.f7164b;
            if (lVar != null) {
                this.f7172l.t(this.j, b11, lVar);
            }
        }
    }

    public void i(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, j1 j1Var, boolean z11, d1 d1Var, long j12, long j13, LayoutDirection layoutDirection, e eVar) {
        lp0.a<k> aVar;
        j1 j1Var2 = j1Var;
        kotlin.jvm.internal.p.j(j1Var2, "shape");
        kotlin.jvm.internal.p.j(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.p.j(eVar, "density");
        this.k = j11;
        boolean z12 = true;
        boolean z13 = this.f7172l.u() && !this.f7167e.d();
        float f22 = f11;
        this.f7172l.l(f11);
        float f23 = f12;
        this.f7172l.m(f12);
        float f24 = f13;
        this.f7172l.c(f13);
        this.f7172l.n(f14);
        this.f7172l.e(f15);
        this.f7172l.q(f16);
        this.f7172l.F(f0.j(j12));
        this.f7172l.G(f0.j(j13));
        this.f7172l.i(f19);
        this.f7172l.g(f17);
        this.f7172l.h(f18);
        this.f7172l.f(f21);
        this.f7172l.y(q1.f(j11) * ((float) this.f7172l.getWidth()));
        this.f7172l.z(q1.g(j11) * ((float) this.f7172l.getHeight()));
        this.f7172l.B(z11 && j1Var2 != c1.a());
        this.f7172l.p(z11 && j1Var2 == c1.a());
        this.f7172l.j(d1Var);
        boolean g11 = this.f7167e.g(j1Var, this.f7172l.getAlpha(), this.f7172l.u(), this.f7172l.H(), layoutDirection, eVar);
        this.f7172l.A(this.f7167e.c());
        if (!this.f7172l.u() || this.f7167e.d()) {
            z12 = false;
        }
        if (z13 != z12 || (z12 && g11)) {
            invalidate();
        } else {
            l();
        }
        if (!this.f7169g && this.f7172l.H() > 0.0f && (aVar = this.f7165c) != null) {
            aVar.invoke();
        }
        this.f7171i.c();
    }

    public void invalidate() {
        if (!this.f7166d && !this.f7168f) {
            this.f7163a.invalidate();
            k(true);
        }
    }
}
