package androidx.compose.ui.draw;

import a0.h;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.b;
import i1.c;
import i1.i;
import i1.i0;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.a;
import p0.d;
import p0.e;
import r0.f;
import t0.m;
import u0.e0;

/* compiled from: PainterModifier.kt */
final class PainterModifier extends o0 implements q, f {

    /* renamed from: b  reason: collision with root package name */
    private final Painter f6331b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6332c;

    /* renamed from: d  reason: collision with root package name */
    private final a f6333d;

    /* renamed from: e  reason: collision with root package name */
    private final c f6334e;

    /* renamed from: f  reason: collision with root package name */
    private final float f6335f;

    /* renamed from: g  reason: collision with root package name */
    private final e0 f6336g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PainterModifier(Painter painter, boolean z11, a aVar, c cVar, float f11, e0 e0Var, l<? super n0, k> lVar) {
        super(lVar);
        p.j(painter, "painter");
        p.j(aVar, "alignment");
        p.j(cVar, "contentScale");
        p.j(lVar, "inspectorInfo");
        this.f6331b = painter;
        this.f6332c = z11;
        this.f6333d = aVar;
        this.f6334e = cVar;
        this.f6335f = f11;
        this.f6336g = e0Var;
    }

    private final long c(long j) {
        float f11;
        float f12;
        if (!d()) {
            return j;
        }
        if (!f(this.f6331b.k())) {
            f11 = t0.l.i(j);
        } else {
            f11 = t0.l.i(this.f6331b.k());
        }
        if (!e(this.f6331b.k())) {
            f12 = t0.l.g(j);
        } else {
            f12 = t0.l.g(this.f6331b.k());
        }
        long a11 = m.a(f11, f12);
        boolean z11 = true;
        if (!(t0.l.i(j) == 0.0f)) {
            if (t0.l.g(j) != 0.0f) {
                z11 = false;
            }
            if (!z11) {
                return i0.b(a11, this.f6334e.a(a11, j));
            }
        }
        return t0.l.f16682b.b();
    }

    private final boolean d() {
        if (this.f6332c) {
            if (this.f6331b.k() != t0.l.f16682b.a()) {
                return true;
            }
        }
        return false;
    }

    private final boolean e(long j) {
        if (!t0.l.f(j, t0.l.f16682b.a())) {
            float g11 = t0.l.g(j);
            if (!Float.isInfinite(g11) && !Float.isNaN(g11)) {
                return true;
            }
        }
        return false;
    }

    private final boolean f(long j) {
        if (!t0.l.f(j, t0.l.f16682b.a())) {
            float i11 = t0.l.i(j);
            if (!Float.isInfinite(i11) && !Float.isNaN(i11)) {
                return true;
            }
        }
        return false;
    }

    private final long g(long j) {
        int i11;
        int i12;
        boolean z11 = true;
        boolean z12 = b.j(j) && b.i(j);
        if (!b.l(j) || !b.k(j)) {
            z11 = false;
        }
        if ((d() || !z12) && !z11) {
            long k = this.f6331b.k();
            if (f(k)) {
                i11 = c.c(t0.l.i(k));
            } else {
                i11 = b.p(j);
            }
            if (e(k)) {
                i12 = c.c(t0.l.g(k));
            } else {
                i12 = b.o(j);
            }
            long c11 = c(m.a((float) d2.c.g(j, i11), (float) d2.c.f(j, i12)));
            return b.e(j, d2.c.g(j, c.c(t0.l.i(c11))), 0, d2.c.f(j, c.c(t0.l.g(c11))), 0, 10, (Object) null);
        }
        return b.e(j, b.n(j), 0, b.m(j), 0, 10, (Object) null);
    }

    public u K(w wVar, r rVar, long j) {
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        i1.e0 N = rVar.N(g(j));
        return v.b(wVar, N.A0(), N.e0(), (Map) null, new PainterModifier$measure$1(N), 4, (Object) null);
    }

    public int L(j jVar, i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        if (!d()) {
            return iVar.K(i11);
        }
        long g11 = g(d2.c.b(0, 0, 0, i11, 7, (Object) null));
        return Math.max(b.p(g11), iVar.K(i11));
    }

    public /* synthetic */ d N(d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public void b(w0.c cVar) {
        float f11;
        float f12;
        long j;
        p.j(cVar, "<this>");
        long k = this.f6331b.k();
        if (f(k)) {
            f11 = t0.l.i(k);
        } else {
            f11 = t0.l.i(cVar.d());
        }
        if (e(k)) {
            f12 = t0.l.g(k);
        } else {
            f12 = t0.l.g(cVar.d());
        }
        long a11 = m.a(f11, f12);
        boolean z11 = true;
        if (!(t0.l.i(cVar.d()) == 0.0f)) {
            if (t0.l.g(cVar.d()) != 0.0f) {
                z11 = false;
            }
            if (!z11) {
                j = i0.b(a11, this.f6334e.a(a11, cVar.d()));
                long j11 = j;
                long a12 = this.f6333d.a(d2.q.a(c.c(t0.l.i(j11)), c.c(t0.l.g(j11))), d2.q.a(c.c(t0.l.i(cVar.d())), c.c(t0.l.g(cVar.d()))), cVar.getLayoutDirection());
                float j12 = (float) d2.l.j(a12);
                float k11 = (float) d2.l.k(a12);
                cVar.O().c().c(j12, k11);
                this.f6331b.j(cVar, j11, this.f6335f, this.f6336g);
                cVar.O().c().c(-j12, -k11);
                cVar.V();
            }
        }
        j = t0.l.f16682b.b();
        long j112 = j;
        long a122 = this.f6333d.a(d2.q.a(c.c(t0.l.i(j112)), c.c(t0.l.g(j112))), d2.q.a(c.c(t0.l.i(cVar.d())), c.c(t0.l.g(cVar.d()))), cVar.getLayoutDirection());
        float j122 = (float) d2.l.j(a122);
        float k112 = (float) d2.l.k(a122);
        cVar.O().c().c(j122, k112);
        this.f6331b.j(cVar, j112, this.f6335f, this.f6336g);
        cVar.O().c().c(-j122, -k112);
        cVar.V();
    }

    public boolean equals(Object obj) {
        PainterModifier painterModifier = obj instanceof PainterModifier ? (PainterModifier) obj : null;
        if (painterModifier == null || !p.e(this.f6331b, painterModifier.f6331b) || this.f6332c != painterModifier.f6332c || !p.e(this.f6333d, painterModifier.f6333d) || !p.e(this.f6334e, painterModifier.f6334e)) {
            return false;
        }
        if (!(this.f6335f == painterModifier.f6335f) || !p.e(this.f6336g, painterModifier.f6336g)) {
            return false;
        }
        return true;
    }

    public int f0(j jVar, i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        if (!d()) {
            return iVar.x(i11);
        }
        long g11 = g(d2.c.b(0, i11, 0, 0, 13, (Object) null));
        return Math.max(b.o(g11), iVar.x(i11));
    }

    public int hashCode() {
        int hashCode = ((((((((this.f6331b.hashCode() * 31) + h.a(this.f6332c)) * 31) + this.f6333d.hashCode()) * 31) + this.f6334e.hashCode()) * 31) + Float.floatToIntBits(this.f6335f)) * 31;
        e0 e0Var = this.f6336g;
        return hashCode + (e0Var != null ? e0Var.hashCode() : 0);
    }

    public int n0(j jVar, i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        if (!d()) {
            return iVar.J(i11);
        }
        long g11 = g(d2.c.b(0, i11, 0, 0, 13, (Object) null));
        return Math.max(b.o(g11), iVar.J(i11));
    }

    public int p(j jVar, i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        if (!d()) {
            return iVar.L(i11);
        }
        long g11 = g(d2.c.b(0, 0, 0, i11, 7, (Object) null));
        return Math.max(b.p(g11), iVar.L(i11));
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f6331b + ", sizeToIntrinsics=" + this.f6332c + ", alignment=" + this.f6333d + ", alpha=" + this.f6335f + ", colorFilter=" + this.f6336g + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
