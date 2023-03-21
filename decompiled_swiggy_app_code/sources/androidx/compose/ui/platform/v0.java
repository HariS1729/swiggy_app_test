package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.unit.LayoutDirection;
import d2.e;
import kotlin.jvm.internal.p;
import t0.a;
import t0.f;
import t0.g;
import t0.h;
import t0.j;
import t0.k;
import t0.l;
import t0.m;
import u0.c1;
import u0.j1;
import u0.o;
import u0.r0;
import u0.w0;

/* compiled from: OutlineResolver.android.kt */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    private e f7363a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7364b = true;

    /* renamed from: c  reason: collision with root package name */
    private final Outline f7365c;

    /* renamed from: d  reason: collision with root package name */
    private long f7366d;

    /* renamed from: e  reason: collision with root package name */
    private j1 f7367e;

    /* renamed from: f  reason: collision with root package name */
    private w0 f7368f;

    /* renamed from: g  reason: collision with root package name */
    private w0 f7369g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7370h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7371i;
    private w0 j;
    private j k;

    /* renamed from: l  reason: collision with root package name */
    private float f7372l;

    /* renamed from: m  reason: collision with root package name */
    private long f7373m;
    private long n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f7374o;

    /* renamed from: p  reason: collision with root package name */
    private LayoutDirection f7375p;
    private w0 q;

    /* renamed from: r  reason: collision with root package name */
    private w0 f7376r;

    /* renamed from: s  reason: collision with root package name */
    private r0 f7377s;

    public v0(e eVar) {
        p.j(eVar, "density");
        this.f7363a = eVar;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f7365c = outline;
        l.a aVar = l.f16682b;
        this.f7366d = aVar.b();
        this.f7367e = c1.a();
        this.f7373m = f.f16662b.c();
        this.n = aVar.b();
        this.f7375p = LayoutDirection.Ltr;
    }

    private final boolean f(j jVar, long j11, long j12, float f11) {
        if (jVar == null || !k.d(jVar)) {
            return false;
        }
        if (!(jVar.e() == f.m(j11))) {
            return false;
        }
        if (!(jVar.g() == f.n(j11))) {
            return false;
        }
        if (!(jVar.f() == f.m(j11) + l.i(j12))) {
            return false;
        }
        if (!(jVar.a() == f.n(j11) + l.g(j12))) {
            return false;
        }
        if (a.d(jVar.h()) == f11) {
            return true;
        }
        return false;
    }

    private final void i() {
        if (this.f7370h) {
            this.f7373m = f.f16662b.c();
            long j11 = this.f7366d;
            this.n = j11;
            this.f7372l = 0.0f;
            this.f7369g = null;
            this.f7370h = false;
            this.f7371i = false;
            if (!this.f7374o || l.i(j11) <= 0.0f || l.g(this.f7366d) <= 0.0f) {
                this.f7365c.setEmpty();
                return;
            }
            this.f7364b = true;
            r0 a11 = this.f7367e.a(this.f7366d, this.f7375p, this.f7363a);
            this.f7377s = a11;
            if (a11 instanceof r0.b) {
                k(((r0.b) a11).a());
            } else if (a11 instanceof r0.c) {
                l(((r0.c) a11).a());
            } else if (a11 instanceof r0.a) {
                j(((r0.a) a11).a());
            }
        }
    }

    private final void j(w0 w0Var) {
        if (Build.VERSION.SDK_INT > 28 || w0Var.k()) {
            Outline outline = this.f7365c;
            if (w0Var instanceof u0.j) {
                outline.setConvexPath(((u0.j) w0Var).s());
                this.f7371i = !this.f7365c.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.f7364b = false;
            this.f7365c.setEmpty();
            this.f7371i = true;
        }
        this.f7369g = w0Var;
    }

    private final void k(h hVar) {
        this.f7373m = g.a(hVar.i(), hVar.l());
        this.n = m.a(hVar.n(), hVar.h());
        this.f7365c.setRect(c.c(hVar.i()), c.c(hVar.l()), c.c(hVar.j()), c.c(hVar.e()));
    }

    private final void l(j jVar) {
        float d11 = a.d(jVar.h());
        this.f7373m = g.a(jVar.e(), jVar.g());
        this.n = m.a(jVar.j(), jVar.d());
        if (k.d(jVar)) {
            this.f7365c.setRoundRect(c.c(jVar.e()), c.c(jVar.g()), c.c(jVar.f()), c.c(jVar.a()), d11);
            this.f7372l = d11;
            return;
        }
        w0 w0Var = this.f7368f;
        if (w0Var == null) {
            w0Var = o.a();
            this.f7368f = w0Var;
        }
        w0Var.reset();
        w0Var.f(jVar);
        j(w0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (f(r1, r7.f7373m, r7.n, r6) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(u0.x r21) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.p.j(r8, r0)
            u0.w0 r0 = r20.b()
            r9 = 0
            r10 = 0
            r11 = 2
            if (r0 == 0) goto L_0x0017
            u0.w.c(r8, r0, r9, r11, r10)
            goto L_0x00a9
        L_0x0017:
            float r6 = r7.f7372l
            r12 = 0
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
            u0.w0 r13 = r7.j
            t0.j r1 = r7.k
            if (r13 == 0) goto L_0x0030
            long r2 = r7.f7373m
            long r4 = r7.n
            r0 = r20
            boolean r0 = r0.f(r1, r2, r4, r6)
            if (r0 != 0) goto L_0x0074
        L_0x0030:
            long r0 = r7.f7373m
            float r14 = t0.f.m(r0)
            long r0 = r7.f7373m
            float r15 = t0.f.n(r0)
            long r0 = r7.f7373m
            float r0 = t0.f.m(r0)
            long r1 = r7.n
            float r1 = t0.l.i(r1)
            float r16 = r0 + r1
            long r0 = r7.f7373m
            float r0 = t0.f.n(r0)
            long r1 = r7.n
            float r1 = t0.l.g(r1)
            float r17 = r0 + r1
            float r0 = r7.f7372l
            long r18 = t0.b.b(r0, r12, r11, r10)
            t0.j r0 = t0.k.c(r14, r15, r16, r17, r18)
            if (r13 != 0) goto L_0x006a
            u0.w0 r1 = u0.o.a()
            r13 = r1
            goto L_0x006d
        L_0x006a:
            r13.reset()
        L_0x006d:
            r13.f(r0)
            r7.k = r0
            r7.j = r13
        L_0x0074:
            u0.w.c(r8, r13, r9, r11, r10)
            goto L_0x00a9
        L_0x0078:
            long r0 = r7.f7373m
            float r9 = t0.f.m(r0)
            long r0 = r7.f7373m
            float r10 = t0.f.n(r0)
            long r0 = r7.f7373m
            float r0 = t0.f.m(r0)
            long r1 = r7.n
            float r1 = t0.l.i(r1)
            float r11 = r0 + r1
            long r0 = r7.f7373m
            float r0 = t0.f.n(r0)
            long r1 = r7.n
            float r1 = t0.l.g(r1)
            float r12 = r0 + r1
            r13 = 0
            r14 = 16
            r15 = 0
            r8 = r21
            u0.w.d(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.v0.a(u0.x):void");
    }

    public final w0 b() {
        i();
        return this.f7369g;
    }

    public final Outline c() {
        i();
        if (!this.f7374o || !this.f7364b) {
            return null;
        }
        return this.f7365c;
    }

    public final boolean d() {
        return !this.f7371i;
    }

    public final boolean e(long j11) {
        r0 r0Var;
        if (this.f7374o && (r0Var = this.f7377s) != null) {
            return e1.b(r0Var, f.m(j11), f.n(j11), this.q, this.f7376r);
        }
        return true;
    }

    public final boolean g(j1 j1Var, float f11, boolean z11, float f12, LayoutDirection layoutDirection, e eVar) {
        p.j(j1Var, "shape");
        p.j(layoutDirection, "layoutDirection");
        p.j(eVar, "density");
        this.f7365c.setAlpha(f11);
        boolean z12 = !p.e(this.f7367e, j1Var);
        if (z12) {
            this.f7367e = j1Var;
            this.f7370h = true;
        }
        boolean z13 = z11 || f12 > 0.0f;
        if (this.f7374o != z13) {
            this.f7374o = z13;
            this.f7370h = true;
        }
        if (this.f7375p != layoutDirection) {
            this.f7375p = layoutDirection;
            this.f7370h = true;
        }
        if (!p.e(this.f7363a, eVar)) {
            this.f7363a = eVar;
            this.f7370h = true;
        }
        return z12;
    }

    public final void h(long j11) {
        if (!l.f(this.f7366d, j11)) {
            this.f7366d = j11;
            this.f7370h = true;
        }
    }
}
