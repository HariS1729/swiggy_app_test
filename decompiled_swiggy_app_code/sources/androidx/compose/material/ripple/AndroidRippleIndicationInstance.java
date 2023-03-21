package androidx.compose.material.ripple;

import bp0.k;
import d0.b;
import d0.d;
import d0.g;
import e0.a1;
import e0.d1;
import e0.h0;
import e0.r0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.a;
import t0.l;
import u.n;
import u0.d0;
import u0.x;
import w0.c;
import wp0.j0;

/* compiled from: Ripple.android.kt */
public final class AndroidRippleIndicationInstance extends b implements r0 {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5791b;

    /* renamed from: c  reason: collision with root package name */
    private final float f5792c;

    /* renamed from: d  reason: collision with root package name */
    private final d1<d0> f5793d;

    /* renamed from: e  reason: collision with root package name */
    private final d1<b> f5794e;

    /* renamed from: f  reason: collision with root package name */
    private final d f5795f;

    /* renamed from: g  reason: collision with root package name */
    private final h0 f5796g;

    /* renamed from: h  reason: collision with root package name */
    private final h0 f5797h;

    /* renamed from: i  reason: collision with root package name */
    private long f5798i;
    private int j;
    private final a<k> k;

    private AndroidRippleIndicationInstance(boolean z11, float f11, d1<d0> d1Var, d1<b> d1Var2, d dVar) {
        super(z11, d1Var2);
        this.f5791b = z11;
        this.f5792c = f11;
        this.f5793d = d1Var;
        this.f5794e = d1Var2;
        this.f5795f = dVar;
        this.f5796g = j.e((Object) null, (a1) null, 2, (Object) null);
        this.f5797h = j.e(Boolean.TRUE, (a1) null, 2, (Object) null);
        this.f5798i = l.f16682b.b();
        this.j = -1;
        this.k = new AndroidRippleIndicationInstance$onInvalidateRipple$1(this);
    }

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z11, float f11, d1 d1Var, d1 d1Var2, d dVar, i iVar) {
        this(z11, f11, d1Var, d1Var2, dVar);
    }

    private final void k() {
        this.f5795f.a(this);
    }

    /* access modifiers changed from: private */
    public final boolean l() {
        return ((Boolean) this.f5797h.getValue()).booleanValue();
    }

    private final g m() {
        return (g) this.f5796g.getValue();
    }

    /* access modifiers changed from: private */
    public final void o(boolean z11) {
        this.f5797h.setValue(Boolean.valueOf(z11));
    }

    private final void p(g gVar) {
        this.f5796g.setValue(gVar);
    }

    public void a(c cVar) {
        int i11;
        p.j(cVar, "<this>");
        this.f5798i = cVar.d();
        if (Float.isNaN(this.f5792c)) {
            i11 = c.c(d0.c.a(cVar, this.f5791b, cVar.d()));
        } else {
            i11 = cVar.j0(this.f5792c);
        }
        this.j = i11;
        long v = this.f5793d.getValue().v();
        float d11 = this.f5794e.getValue().d();
        cVar.V();
        d(cVar, this.f5792c, v);
        x a11 = cVar.O().a();
        l();
        g m11 = m();
        if (m11 != null) {
            m11.f(cVar.d(), this.j, v, d11);
            m11.draw(u0.c.c(a11));
        }
    }

    public void b() {
    }

    public void c(n nVar, j0 j0Var) {
        p.j(nVar, "interaction");
        p.j(j0Var, "scope");
        g b11 = this.f5795f.b(this);
        b11.b(nVar, this.f5791b, this.f5798i, this.j, this.f5793d.getValue().v(), this.f5794e.getValue().d(), this.k);
        p(b11);
    }

    public void e(n nVar) {
        p.j(nVar, "interaction");
        g m11 = m();
        if (m11 != null) {
            m11.e();
        }
    }

    public void f() {
        k();
    }

    public void g() {
        k();
    }

    public final void n() {
        p((g) null);
    }
}
