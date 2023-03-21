package w0;

import android.graphics.Shader;
import androidx.compose.ui.unit.LayoutDirection;
import com.truecaller.android.sdk.TruecallerSdkScope;
import d2.d;
import d2.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.f;
import t0.l;
import u0.d0;
import u0.e0;
import u0.h0;
import u0.l0;
import u0.l1;
import u0.m1;
import u0.s;
import u0.t0;
import u0.u;
import u0.u0;
import u0.w0;
import u0.x;
import u0.x0;

/* compiled from: CanvasDrawScope.kt */
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final C0202a f17420a = new C0202a((e) null, (LayoutDirection) null, (x) null, 0, 15, (i) null);

    /* renamed from: b  reason: collision with root package name */
    private final d f17421b = new b(this);

    /* renamed from: c  reason: collision with root package name */
    private t0 f17422c;

    /* renamed from: d  reason: collision with root package name */
    private t0 f17423d;

    /* compiled from: CanvasDrawScope.kt */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final i f17428a = b.c(this);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f17429b;

        b(a aVar) {
            this.f17429b = aVar;
        }

        public x a() {
            return this.f17429b.D().e();
        }

        public void b(long j) {
            this.f17429b.D().l(j);
        }

        public i c() {
            return this.f17428a;
        }

        public long d() {
            return this.f17429b.D().h();
        }
    }

    private final t0 A(u uVar, float f11, float f12, int i11, int i12, x0 x0Var, float f13, e0 e0Var, int i13, int i14) {
        t0 K = K();
        boolean z11 = true;
        if (uVar != null) {
            uVar.a(d(), K, f13);
        } else {
            if (!(K.getAlpha() == f13)) {
                K.c(f13);
            }
        }
        if (!p.e(K.r(), e0Var)) {
            K.s(e0Var);
        }
        if (!s.G(K.u(), i13)) {
            K.q(i13);
        }
        if (!(K.p() == f11)) {
            K.o(f11);
        }
        if (K.j() != f12) {
            z11 = false;
        }
        if (!z11) {
            K.m(f12);
        }
        if (!l1.g(K.f(), i11)) {
            K.b(i11);
        }
        if (!m1.g(K.i(), i12)) {
            K.g(i12);
        }
        if (!p.e(K.t(), x0Var)) {
            K.d(x0Var);
        }
        if (!h0.d(K.w(), i14)) {
            K.e(i14);
        }
        return K;
    }

    static /* synthetic */ t0 B(a aVar, u uVar, float f11, float f12, int i11, int i12, x0 x0Var, float f13, e0 e0Var, int i13, int i14, int i15, Object obj) {
        return aVar.A(uVar, f11, f12, i11, i12, x0Var, f13, e0Var, i13, (i15 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? f.f17432j0.b() : i14);
    }

    private final long I(long j, float f11) {
        if (f11 == 1.0f) {
            return j;
        }
        return d0.l(j, d0.o(j) * f11, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    private final t0 J() {
        t0 t0Var = this.f17422c;
        if (t0Var != null) {
            return t0Var;
        }
        t0 a11 = u0.i.a();
        a11.n(u0.f16890a.a());
        this.f17422c = a11;
        return a11;
    }

    private final t0 K() {
        t0 t0Var = this.f17423d;
        if (t0Var != null) {
            return t0Var;
        }
        t0 a11 = u0.i.a();
        a11.n(u0.f16890a.b());
        this.f17423d = a11;
        return a11;
    }

    private final t0 L(g gVar) {
        if (p.e(gVar, k.f17436a)) {
            return J();
        }
        if (gVar instanceof l) {
            t0 K = K();
            l lVar = (l) gVar;
            boolean z11 = true;
            if (!(K.p() == lVar.f())) {
                K.o(lVar.f());
            }
            if (!l1.g(K.f(), lVar.b())) {
                K.b(lVar.b());
            }
            if (K.j() != lVar.d()) {
                z11 = false;
            }
            if (!z11) {
                K.m(lVar.d());
            }
            if (!m1.g(K.i(), lVar.c())) {
                K.g(lVar.c());
            }
            if (!p.e(K.t(), lVar.e())) {
                K.d(lVar.e());
            }
            return K;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final t0 b(long j, g gVar, float f11, e0 e0Var, int i11, int i12) {
        t0 L = L(gVar);
        long I = I(j, f11);
        if (!d0.n(L.a(), I)) {
            L.h(I);
        }
        if (L.l() != null) {
            L.v((Shader) null);
        }
        if (!p.e(L.r(), e0Var)) {
            L.s(e0Var);
        }
        if (!s.G(L.u(), i11)) {
            L.q(i11);
        }
        if (!h0.d(L.w(), i12)) {
            L.e(i12);
        }
        return L;
    }

    static /* synthetic */ t0 p(a aVar, long j, g gVar, float f11, e0 e0Var, int i11, int i12, int i13, Object obj) {
        return aVar.b(j, gVar, f11, e0Var, i11, (i13 & 32) != 0 ? f.f17432j0.b() : i12);
    }

    private final t0 r(u uVar, g gVar, float f11, e0 e0Var, int i11, int i12) {
        t0 L = L(gVar);
        if (uVar != null) {
            uVar.a(d(), L, f11);
        } else {
            if (!(L.getAlpha() == f11)) {
                L.c(f11);
            }
        }
        if (!p.e(L.r(), e0Var)) {
            L.s(e0Var);
        }
        if (!s.G(L.u(), i11)) {
            L.q(i11);
        }
        if (!h0.d(L.w(), i12)) {
            L.e(i12);
        }
        return L;
    }

    static /* synthetic */ t0 s(a aVar, u uVar, g gVar, float f11, e0 e0Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            i12 = f.f17432j0.b();
        }
        return aVar.r(uVar, gVar, f11, e0Var, i11, i12);
    }

    private final t0 t(long j, float f11, float f12, int i11, int i12, x0 x0Var, float f13, e0 e0Var, int i13, int i14) {
        t0 K = K();
        long I = I(j, f13);
        if (!d0.n(K.a(), I)) {
            K.h(I);
        }
        if (K.l() != null) {
            K.v((Shader) null);
        }
        if (!p.e(K.r(), e0Var)) {
            K.s(e0Var);
        }
        if (!s.G(K.u(), i13)) {
            K.q(i13);
        }
        boolean z11 = true;
        if (!(K.p() == f11)) {
            K.o(f11);
        }
        if (K.j() != f12) {
            z11 = false;
        }
        if (!z11) {
            K.m(f12);
        }
        if (!l1.g(K.f(), i11)) {
            K.b(i11);
        }
        if (!m1.g(K.i(), i12)) {
            K.g(i12);
        }
        if (!p.e(K.t(), x0Var)) {
            K.d(x0Var);
        }
        if (!h0.d(K.w(), i14)) {
            K.e(i14);
        }
        return K;
    }

    static /* synthetic */ t0 x(a aVar, long j, float f11, float f12, int i11, int i12, x0 x0Var, float f13, e0 e0Var, int i13, int i14, int i15, Object obj) {
        return aVar.t(j, f11, f12, i11, i12, x0Var, f13, e0Var, i13, (i15 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? f.f17432j0.b() : i14);
    }

    public void B0(long j, long j11, long j12, float f11, int i11, x0 x0Var, float f12, e0 e0Var, int i12) {
        this.f17420a.e().e(j11, j12, x(this, j, f11, 4.0f, i11, m1.f16837b.b(), x0Var, f12, e0Var, i12, 0, TruecallerSdkScope.FOOTER_TYPE_MANUALLY, (Object) null));
    }

    public void C0(u uVar, float f11, float f12, boolean z11, long j, long j11, float f13, g gVar, e0 e0Var, int i11) {
        u uVar2 = uVar;
        p.j(uVar2, "brush");
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f17420a.e().s(f.m(j), f.n(j), f.m(j) + l.i(j11), f.n(j) + l.g(j11), f11, f12, z11, s(this, uVar2, gVar2, f13, e0Var, i11, 0, 32, (Object) null));
    }

    public final C0202a D() {
        return this.f17420a;
    }

    public void E(w0 w0Var, u uVar, float f11, g gVar, e0 e0Var, int i11) {
        w0 w0Var2 = w0Var;
        p.j(w0Var, "path");
        p.j(uVar, "brush");
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f17420a.e().r(w0Var, s(this, uVar, gVar2, f11, e0Var, i11, 0, 32, (Object) null));
    }

    public void G(long j, float f11, float f12, boolean z11, long j11, long j12, float f13, g gVar, e0 e0Var, int i11) {
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f17420a.e().s(f.m(j11), f.n(j11), f.m(j11) + l.i(j12), f.n(j11) + l.g(j12), f11, f12, z11, p(this, j, gVar2, f13, e0Var, i11, 0, 32, (Object) null));
    }

    public /* synthetic */ float M(float f11) {
        return d.c(this, f11);
    }

    public d O() {
        return this.f17421b;
    }

    public void Q(long j, long j11, long j12, long j13, g gVar, float f11, e0 e0Var, int i11) {
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f17420a.e().f(f.m(j11), f.n(j11), f.m(j11) + l.i(j12), f.n(j11) + l.g(j12), t0.a.d(j13), t0.a.e(j13), p(this, j, gVar2, f11, e0Var, i11, 0, 32, (Object) null));
    }

    public /* synthetic */ long R() {
        return e.a(this);
    }

    public /* synthetic */ long S(long j) {
        return d.h(this, j);
    }

    public void X(w0 w0Var, long j, float f11, g gVar, e0 e0Var, int i11) {
        w0 w0Var2 = w0Var;
        p.j(w0Var, "path");
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f17420a.e().r(w0Var, p(this, j, gVar2, f11, e0Var, i11, 0, 32, (Object) null));
    }

    public void Z(l0 l0Var, long j, long j11, long j12, long j13, float f11, g gVar, e0 e0Var, int i11, int i12) {
        p.j(l0Var, "image");
        p.j(gVar, "style");
        x e11 = this.f17420a.e();
        x xVar = e11;
        xVar.m(l0Var, j, j11, j12, j13, r((u) null, gVar, f11, e0Var, i11, i12));
    }

    public void b0(long j, long j11, long j12, float f11, g gVar, e0 e0Var, int i11) {
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f17420a.e().k(f.m(j11), f.n(j11), f.m(j11) + l.i(j12), f.n(j11) + l.g(j12), p(this, j, gVar2, f11, e0Var, i11, 0, 32, (Object) null));
    }

    public /* synthetic */ long d() {
        return e.b(this);
    }

    public void g0(long j, float f11, long j11, float f12, g gVar, e0 e0Var, int i11) {
        g gVar2 = gVar;
        p.j(gVar2, "style");
        float f13 = f11;
        this.f17420a.e().n(j11, f11, p(this, j, gVar2, f12, e0Var, i11, 0, 32, (Object) null));
    }

    public float getDensity() {
        return this.f17420a.f().getDensity();
    }

    public LayoutDirection getLayoutDirection() {
        return this.f17420a.g();
    }

    public void h0(l0 l0Var, long j, float f11, g gVar, e0 e0Var, int i11) {
        l0 l0Var2 = l0Var;
        p.j(l0Var, "image");
        g gVar2 = gVar;
        p.j(gVar2, "style");
        long j11 = j;
        this.f17420a.e().i(l0Var, j, s(this, (u) null, gVar2, f11, e0Var, i11, 0, 32, (Object) null));
    }

    public void i0(u uVar, long j, long j11, float f11, g gVar, e0 e0Var, int i11) {
        u uVar2 = uVar;
        p.j(uVar2, "brush");
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f17420a.e().k(f.m(j), f.n(j), f.m(j) + l.i(j11), f.n(j) + l.g(j11), s(this, uVar2, gVar2, f11, e0Var, i11, 0, 32, (Object) null));
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

    public /* synthetic */ long q(int i11) {
        return d.i(this, i11);
    }

    public float u0() {
        return this.f17420a.f().u0();
    }

    public void v(u uVar, long j, long j11, long j12, float f11, g gVar, e0 e0Var, int i11) {
        u uVar2 = uVar;
        p.j(uVar2, "brush");
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f17420a.e().f(f.m(j), f.n(j), f.m(j) + l.i(j11), f.n(j) + l.g(j11), t0.a.d(j12), t0.a.e(j12), s(this, uVar2, gVar2, f11, e0Var, i11, 0, 32, (Object) null));
    }

    public /* synthetic */ float v0(float f11) {
        return d.g(this, f11);
    }

    public void w(u uVar, long j, long j11, float f11, int i11, x0 x0Var, float f12, e0 e0Var, int i12) {
        u uVar2 = uVar;
        p.j(uVar2, "brush");
        this.f17420a.e().e(j, j11, B(this, uVar2, f11, 4.0f, i11, m1.f16837b.b(), x0Var, f12, e0Var, i12, 0, TruecallerSdkScope.FOOTER_TYPE_MANUALLY, (Object) null));
    }

    public /* synthetic */ int y0(long j) {
        return d.a(this, j);
    }

    /* renamed from: w0.a$a  reason: collision with other inner class name */
    /* compiled from: CanvasDrawScope.kt */
    public static final class C0202a {

        /* renamed from: a  reason: collision with root package name */
        private e f17424a;

        /* renamed from: b  reason: collision with root package name */
        private LayoutDirection f17425b;

        /* renamed from: c  reason: collision with root package name */
        private x f17426c;

        /* renamed from: d  reason: collision with root package name */
        private long f17427d;

        private C0202a(e eVar, LayoutDirection layoutDirection, x xVar, long j) {
            this.f17424a = eVar;
            this.f17425b = layoutDirection;
            this.f17426c = xVar;
            this.f17427d = j;
        }

        public /* synthetic */ C0202a(e eVar, LayoutDirection layoutDirection, x xVar, long j, i iVar) {
            this(eVar, layoutDirection, xVar, j);
        }

        public final e a() {
            return this.f17424a;
        }

        public final LayoutDirection b() {
            return this.f17425b;
        }

        public final x c() {
            return this.f17426c;
        }

        public final long d() {
            return this.f17427d;
        }

        public final x e() {
            return this.f17426c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0202a)) {
                return false;
            }
            C0202a aVar = (C0202a) obj;
            return p.e(this.f17424a, aVar.f17424a) && this.f17425b == aVar.f17425b && p.e(this.f17426c, aVar.f17426c) && l.f(this.f17427d, aVar.f17427d);
        }

        public final e f() {
            return this.f17424a;
        }

        public final LayoutDirection g() {
            return this.f17425b;
        }

        public final long h() {
            return this.f17427d;
        }

        public int hashCode() {
            return (((((this.f17424a.hashCode() * 31) + this.f17425b.hashCode()) * 31) + this.f17426c.hashCode()) * 31) + l.j(this.f17427d);
        }

        public final void i(x xVar) {
            p.j(xVar, "<set-?>");
            this.f17426c = xVar;
        }

        public final void j(e eVar) {
            p.j(eVar, "<set-?>");
            this.f17424a = eVar;
        }

        public final void k(LayoutDirection layoutDirection) {
            p.j(layoutDirection, "<set-?>");
            this.f17425b = layoutDirection;
        }

        public final void l(long j) {
            this.f17427d = j;
        }

        public String toString() {
            return "DrawParams(density=" + this.f17424a + ", layoutDirection=" + this.f17425b + ", canvas=" + this.f17426c + ", size=" + l.l(this.f17427d) + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0202a(e eVar, LayoutDirection layoutDirection, x xVar, long j, int i11, i iVar) {
            this((i11 & 1) != 0 ? b.f17430a : eVar, (i11 & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i11 & 4) != 0 ? new j() : xVar, (i11 & 8) != 0 ? l.f16682b.b() : j, (i) null);
        }
    }
}
