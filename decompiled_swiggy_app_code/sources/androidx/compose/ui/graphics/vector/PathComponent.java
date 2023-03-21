package androidx.compose.ui.graphics.vector;

import bp0.f;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.e0;
import u0.o;
import u0.u;
import u0.v0;
import u0.w0;
import u0.x0;
import u0.z0;
import w0.e;
import w0.g;
import w0.l;
import y0.d;
import y0.h;
import y0.m;

/* compiled from: Vector.kt */
public final class PathComponent extends h {

    /* renamed from: b  reason: collision with root package name */
    private String f6499b = "";

    /* renamed from: c  reason: collision with root package name */
    private u f6500c;

    /* renamed from: d  reason: collision with root package name */
    private float f6501d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private List<? extends d> f6502e = m.e();

    /* renamed from: f  reason: collision with root package name */
    private int f6503f = m.b();

    /* renamed from: g  reason: collision with root package name */
    private float f6504g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f6505h;

    /* renamed from: i  reason: collision with root package name */
    private u f6506i;
    private int j = m.c();
    private int k = m.d();

    /* renamed from: l  reason: collision with root package name */
    private float f6507l = 4.0f;

    /* renamed from: m  reason: collision with root package name */
    private float f6508m;
    private float n = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    private float f6509o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6510p = true;
    private boolean q = true;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6511r = true;

    /* renamed from: s  reason: collision with root package name */
    private l f6512s;
    private final w0 t = o.a();

    /* renamed from: u  reason: collision with root package name */
    private final w0 f6513u = o.a();
    private final f v = b.a(LazyThreadSafetyMode.NONE, PathComponent$pathMeasure$2.f6515a);

    /* renamed from: w  reason: collision with root package name */
    private final y0.f f6514w = new y0.f();

    public PathComponent() {
        super((i) null);
    }

    private final z0 e() {
        return (z0) this.v.getValue();
    }

    private final void t() {
        this.f6514w.e();
        this.t.reset();
        this.f6514w.b(this.f6502e).D(this.t);
        u();
    }

    private final void u() {
        this.f6513u.reset();
        if (this.f6508m == 0.0f) {
            if (this.n == 1.0f) {
                v0.a(this.f6513u, this.t, 0, 2, (Object) null);
                return;
            }
        }
        e().c(this.t, false);
        float a11 = e().a();
        float f11 = this.f6508m;
        float f12 = this.f6509o;
        float f13 = ((f11 + f12) % 1.0f) * a11;
        float f14 = ((this.n + f12) % 1.0f) * a11;
        if (f13 > f14) {
            e().b(f13, a11, this.f6513u, true);
            e().b(0.0f, f14, this.f6513u, true);
            return;
        }
        e().b(f13, f14, this.f6513u, true);
    }

    public void a(w0.f fVar) {
        p.j(fVar, "<this>");
        if (this.f6510p) {
            t();
        } else if (this.f6511r) {
            u();
        }
        this.f6510p = false;
        this.f6511r = false;
        u uVar = this.f6500c;
        if (uVar != null) {
            e.k(fVar, this.f6513u, uVar, this.f6501d, (g) null, (e0) null, 0, 56, (Object) null);
        }
        u uVar2 = this.f6506i;
        if (uVar2 != null) {
            l lVar = this.f6512s;
            if (this.q || lVar == null) {
                lVar = new l(this.f6505h, this.f6507l, this.j, this.k, (x0) null, 16, (i) null);
                this.f6512s = lVar;
                this.q = false;
            }
            l lVar2 = lVar;
            e.k(fVar, this.f6513u, uVar2, this.f6504g, lVar2, (e0) null, 0, 48, (Object) null);
        }
    }

    public final void f(u uVar) {
        this.f6500c = uVar;
        c();
    }

    public final void g(float f11) {
        this.f6501d = f11;
        c();
    }

    public final void h(String str) {
        p.j(str, "value");
        this.f6499b = str;
        c();
    }

    public final void i(List<? extends d> list) {
        p.j(list, "value");
        this.f6502e = list;
        this.f6510p = true;
        c();
    }

    public final void j(int i11) {
        this.f6503f = i11;
        this.f6513u.m(i11);
        c();
    }

    public final void k(u uVar) {
        this.f6506i = uVar;
        c();
    }

    public final void l(float f11) {
        this.f6504g = f11;
        c();
    }

    public final void m(int i11) {
        this.j = i11;
        this.q = true;
        c();
    }

    public final void n(int i11) {
        this.k = i11;
        this.q = true;
        c();
    }

    public final void o(float f11) {
        this.f6507l = f11;
        this.q = true;
        c();
    }

    public final void p(float f11) {
        this.f6505h = f11;
        c();
    }

    public final void q(float f11) {
        if (!(this.n == f11)) {
            this.n = f11;
            this.f6511r = true;
            c();
        }
    }

    public final void r(float f11) {
        if (!(this.f6509o == f11)) {
            this.f6509o = f11;
            this.f6511r = true;
            c();
        }
    }

    public final void s(float f11) {
        if (!(this.f6508m == f11)) {
            this.f6508m = f11;
            this.f6511r = true;
            c();
        }
    }

    public String toString() {
        return this.t.toString();
    }
}
