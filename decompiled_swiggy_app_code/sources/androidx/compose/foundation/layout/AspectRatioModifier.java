package androidx.compose.foundation.layout;

import a0.h;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.b;
import d2.c;
import d2.p;
import i1.e0;
import i1.i;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import p0.e;

/* compiled from: AspectRatio.kt */
final class AspectRatioModifier extends o0 implements q {

    /* renamed from: b  reason: collision with root package name */
    private final float f3674b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3675c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AspectRatioModifier(float f11, boolean z11, l<? super n0, k> lVar) {
        super(lVar);
        p.j(lVar, "inspectorInfo");
        this.f3674b = f11;
        this.f3675c = z11;
        if (!(f11 > 0.0f)) {
            throw new IllegalArgumentException(("aspectRatio " + f11 + " must be > 0").toString());
        }
    }

    private final long c(long j) {
        if (!this.f3675c) {
            long g11 = g(this, j, false, 1, (Object) null);
            p.a aVar = d2.p.f14019b;
            if (!d2.p.e(g11, aVar.a())) {
                return g11;
            }
            long e11 = e(this, j, false, 1, (Object) null);
            if (!d2.p.e(e11, aVar.a())) {
                return e11;
            }
            long k = k(this, j, false, 1, (Object) null);
            if (!d2.p.e(k, aVar.a())) {
                return k;
            }
            long i11 = i(this, j, false, 1, (Object) null);
            if (!d2.p.e(i11, aVar.a())) {
                return i11;
            }
            long f11 = f(j, false);
            if (!d2.p.e(f11, aVar.a())) {
                return f11;
            }
            long d11 = d(j, false);
            if (!d2.p.e(d11, aVar.a())) {
                return d11;
            }
            long j11 = j(j, false);
            if (!d2.p.e(j11, aVar.a())) {
                return j11;
            }
            long h11 = h(j, false);
            if (!d2.p.e(h11, aVar.a())) {
                return h11;
            }
        } else {
            long e12 = e(this, j, false, 1, (Object) null);
            p.a aVar2 = d2.p.f14019b;
            if (!d2.p.e(e12, aVar2.a())) {
                return e12;
            }
            long g12 = g(this, j, false, 1, (Object) null);
            if (!d2.p.e(g12, aVar2.a())) {
                return g12;
            }
            long i12 = i(this, j, false, 1, (Object) null);
            if (!d2.p.e(i12, aVar2.a())) {
                return i12;
            }
            long k11 = k(this, j, false, 1, (Object) null);
            if (!d2.p.e(k11, aVar2.a())) {
                return k11;
            }
            long d12 = d(j, false);
            if (!d2.p.e(d12, aVar2.a())) {
                return d12;
            }
            long f12 = f(j, false);
            if (!d2.p.e(f12, aVar2.a())) {
                return f12;
            }
            long h12 = h(j, false);
            if (!d2.p.e(h12, aVar2.a())) {
                return h12;
            }
            long j12 = j(j, false);
            if (!d2.p.e(j12, aVar2.a())) {
                return j12;
            }
        }
        return d2.p.f14019b.a();
    }

    private final long d(long j, boolean z11) {
        int c11;
        int m11 = b.m(j);
        if (m11 != Integer.MAX_VALUE && (c11 = c.c(((float) m11) * this.f3674b)) > 0) {
            long a11 = d2.q.a(c11, m11);
            if (!z11 || c.h(j, a11)) {
                return a11;
            }
        }
        return d2.p.f14019b.a();
    }

    static /* synthetic */ long e(AspectRatioModifier aspectRatioModifier, long j, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return aspectRatioModifier.d(j, z11);
    }

    private final long f(long j, boolean z11) {
        int c11;
        int n = b.n(j);
        if (n != Integer.MAX_VALUE && (c11 = c.c(((float) n) / this.f3674b)) > 0) {
            long a11 = d2.q.a(n, c11);
            if (!z11 || c.h(j, a11)) {
                return a11;
            }
        }
        return d2.p.f14019b.a();
    }

    static /* synthetic */ long g(AspectRatioModifier aspectRatioModifier, long j, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return aspectRatioModifier.f(j, z11);
    }

    private final long h(long j, boolean z11) {
        int o11 = b.o(j);
        int c11 = c.c(((float) o11) * this.f3674b);
        if (c11 > 0) {
            long a11 = d2.q.a(c11, o11);
            if (!z11 || c.h(j, a11)) {
                return a11;
            }
        }
        return d2.p.f14019b.a();
    }

    static /* synthetic */ long i(AspectRatioModifier aspectRatioModifier, long j, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return aspectRatioModifier.h(j, z11);
    }

    private final long j(long j, boolean z11) {
        int p11 = b.p(j);
        int c11 = c.c(((float) p11) / this.f3674b);
        if (c11 > 0) {
            long a11 = d2.q.a(p11, c11);
            if (!z11 || c.h(j, a11)) {
                return a11;
            }
        }
        return d2.p.f14019b.a();
    }

    static /* synthetic */ long k(AspectRatioModifier aspectRatioModifier, long j, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return aspectRatioModifier.j(j, z11);
    }

    public u K(w wVar, r rVar, long j) {
        kotlin.jvm.internal.p.j(wVar, "$this$measure");
        kotlin.jvm.internal.p.j(rVar, "measurable");
        long c11 = c(j);
        if (!d2.p.e(c11, d2.p.f14019b.a())) {
            j = b.f13990b.c(d2.p.g(c11), d2.p.f(c11));
        }
        e0 N = rVar.N(j);
        return v.b(wVar, N.A0(), N.e0(), (Map) null, new AspectRatioModifier$measure$1(N), 4, (Object) null);
    }

    public int L(j jVar, i iVar, int i11) {
        kotlin.jvm.internal.p.j(jVar, "<this>");
        kotlin.jvm.internal.p.j(iVar, "measurable");
        if (i11 != Integer.MAX_VALUE) {
            return c.c(((float) i11) * this.f3674b);
        }
        return iVar.K(i11);
    }

    public /* synthetic */ d N(d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioModifier aspectRatioModifier = obj instanceof AspectRatioModifier ? (AspectRatioModifier) obj : null;
        if (aspectRatioModifier == null) {
            return false;
        }
        if (!(this.f3674b == aspectRatioModifier.f3674b) || this.f3675c != ((AspectRatioModifier) obj).f3675c) {
            return false;
        }
        return true;
    }

    public int f0(j jVar, i iVar, int i11) {
        kotlin.jvm.internal.p.j(jVar, "<this>");
        kotlin.jvm.internal.p.j(iVar, "measurable");
        if (i11 != Integer.MAX_VALUE) {
            return c.c(((float) i11) / this.f3674b);
        }
        return iVar.x(i11);
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f3674b) * 31) + h.a(this.f3675c);
    }

    public int n0(j jVar, i iVar, int i11) {
        kotlin.jvm.internal.p.j(jVar, "<this>");
        kotlin.jvm.internal.p.j(iVar, "measurable");
        if (i11 != Integer.MAX_VALUE) {
            return c.c(((float) i11) / this.f3674b);
        }
        return iVar.J(i11);
    }

    public int p(j jVar, i iVar, int i11) {
        kotlin.jvm.internal.p.j(jVar, "<this>");
        kotlin.jvm.internal.p.j(iVar, "measurable");
        if (i11 != Integer.MAX_VALUE) {
            return c.c(((float) i11) * this.f3674b);
        }
        return iVar.L(i11);
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.f3674b + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
