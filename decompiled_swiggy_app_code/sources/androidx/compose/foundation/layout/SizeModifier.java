package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.b;
import d2.c;
import d2.e;
import d2.h;
import i1.e0;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;

/* compiled from: Size.kt */
final class SizeModifier extends o0 implements q {

    /* renamed from: b  reason: collision with root package name */
    private final float f3849b;

    /* renamed from: c  reason: collision with root package name */
    private final float f3850c;

    /* renamed from: d  reason: collision with root package name */
    private final float f3851d;

    /* renamed from: e  reason: collision with root package name */
    private final float f3852e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3853f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SizeModifier(float f11, float f12, float f13, float f14, boolean z11, l lVar, int i11, i iVar) {
        this((i11 & 1) != 0 ? h.f13997b.c() : f11, (i11 & 2) != 0 ? h.f13997b.c() : f12, (i11 & 4) != 0 ? h.f13997b.c() : f13, (i11 & 8) != 0 ? h.f13997b.c() : f14, z11, lVar, (i) null);
    }

    public /* synthetic */ SizeModifier(float f11, float f12, float f13, float f14, boolean z11, l lVar, i iVar) {
        this(f11, f12, f13, f14, z11, lVar);
    }

    private final long c(e eVar) {
        int i11;
        int d11;
        float f11 = this.f3851d;
        h.a aVar = h.f13997b;
        int i12 = 0;
        int j02 = !h.p(f11, aVar.c()) ? eVar.j0(((h) l.f(h.k(this.f3851d), h.k(h.n((float) 0)))).s()) : Integer.MAX_VALUE;
        int j03 = !h.p(this.f3852e, aVar.c()) ? eVar.j0(((h) l.f(h.k(this.f3852e), h.k(h.n((float) 0)))).s()) : Integer.MAX_VALUE;
        if (h.p(this.f3849b, aVar.c()) || (i11 = l.d(l.i(eVar.j0(this.f3849b), j02), 0)) == Integer.MAX_VALUE) {
            i11 = 0;
        }
        if (!h.p(this.f3850c, aVar.c()) && (d11 = l.d(l.i(eVar.j0(this.f3850c), j03), 0)) != Integer.MAX_VALUE) {
            i12 = d11;
        }
        return c.a(i11, j02, i12, j03);
    }

    public u K(w wVar, r rVar, long j) {
        long j11;
        int i11;
        int i12;
        int i13;
        int i14;
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        long c11 = c(wVar);
        if (this.f3853f) {
            j11 = c.e(j, c11);
        } else {
            float f11 = this.f3849b;
            h.a aVar = h.f13997b;
            if (!h.p(f11, aVar.c())) {
                i11 = b.p(c11);
            } else {
                i11 = l.i(b.p(j), b.n(c11));
            }
            if (!h.p(this.f3851d, aVar.c())) {
                i12 = b.n(c11);
            } else {
                i12 = l.d(b.n(j), b.p(c11));
            }
            if (!h.p(this.f3850c, aVar.c())) {
                i13 = b.o(c11);
            } else {
                i13 = l.i(b.o(j), b.m(c11));
            }
            if (!h.p(this.f3852e, aVar.c())) {
                i14 = b.m(c11);
            } else {
                i14 = l.d(b.m(j), b.o(c11));
            }
            j11 = c.a(i11, i12, i13, i14);
        }
        e0 N = rVar.N(j11);
        return v.b(wVar, N.A0(), N.e0(), (Map) null, new SizeModifier$measure$1(N), 4, (Object) null);
    }

    public int L(j jVar, i1.i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        long c11 = c(jVar);
        if (b.l(c11)) {
            return b.n(c11);
        }
        return c.g(c11, iVar.K(i11));
    }

    public /* synthetic */ d N(d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SizeModifier)) {
            return false;
        }
        SizeModifier sizeModifier = (SizeModifier) obj;
        if (!h.p(this.f3849b, sizeModifier.f3849b) || !h.p(this.f3850c, sizeModifier.f3850c) || !h.p(this.f3851d, sizeModifier.f3851d) || !h.p(this.f3852e, sizeModifier.f3852e) || this.f3853f != sizeModifier.f3853f) {
            return false;
        }
        return true;
    }

    public int f0(j jVar, i1.i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        long c11 = c(jVar);
        if (b.k(c11)) {
            return b.m(c11);
        }
        return c.f(c11, iVar.x(i11));
    }

    public int hashCode() {
        return ((((((h.q(this.f3849b) * 31) + h.q(this.f3850c)) * 31) + h.q(this.f3851d)) * 31) + h.q(this.f3852e)) * 31;
    }

    public int n0(j jVar, i1.i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        long c11 = c(jVar);
        if (b.k(c11)) {
            return b.m(c11);
        }
        return c.f(c11, iVar.J(i11));
    }

    public int p(j jVar, i1.i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        long c11 = c(jVar);
        if (b.l(c11)) {
            return b.n(c11);
        }
        return c.g(c11, iVar.L(i11));
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }

    private SizeModifier(float f11, float f12, float f13, float f14, boolean z11, l<? super n0, k> lVar) {
        super(lVar);
        this.f3849b = f11;
        this.f3850c = f12;
        this.f3851d = f13;
        this.f3852e = f14;
        this.f3853f = z11;
    }
}
