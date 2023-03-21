package androidx.compose.ui.text;

import a2.a;
import a2.e;
import a2.g;
import a2.h;
import androidx.compose.ui.text.style.b;
import d2.s;
import kotlin.jvm.internal.p;
import p1.r;
import p1.u;
import u0.d0;
import u0.f0;
import u0.h1;
import u0.i1;
import u1.i;
import u1.t;
import u1.v;
import u1.w;
import w1.f;

/* compiled from: SpanStyle.kt */
public final class SpanStyleKt {

    /* renamed from: a  reason: collision with root package name */
    private static final long f7522a = s.f(14);

    /* renamed from: b  reason: collision with root package name */
    private static final long f7523b = s.f(0);

    /* renamed from: c  reason: collision with root package name */
    private static final long f7524c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f7525d;

    static {
        d0.a aVar = d0.f16756b;
        f7524c = aVar.e();
        f7525d = aVar.a();
    }

    public static final u b(u uVar, u uVar2, float f11) {
        float f12 = f11;
        p.j(uVar, "start");
        p.j(uVar2, "stop");
        b a11 = g.a(uVar.r(), uVar2.r(), f12);
        i iVar = (i) c(uVar.g(), uVar2.g(), f12);
        long e11 = e(uVar.i(), uVar2.i(), f12);
        v l11 = uVar.l();
        if (l11 == null) {
            l11 = v.f16949b.f();
        }
        v l12 = uVar2.l();
        if (l12 == null) {
            l12 = v.f16949b.f();
        }
        v a12 = w.a(l11, l12, f12);
        u1.s sVar = (u1.s) c(uVar.j(), uVar2.j(), f12);
        t tVar = (t) c(uVar.k(), uVar2.k(), f12);
        String str = (String) c(uVar.h(), uVar2.h(), f12);
        long e12 = e(uVar.m(), uVar2.m(), f12);
        a d11 = uVar.d();
        float h11 = d11 != null ? d11.h() : a.c(0.0f);
        a d12 = uVar2.d();
        float a13 = a2.b.a(h11, d12 != null ? d12.h() : a.c(0.0f), f12);
        h s11 = uVar.s();
        if (s11 == null) {
            s11 = h.f927c.a();
        }
        h s12 = uVar2.s();
        if (s12 == null) {
            s12 = h.f927c.a();
        }
        h a14 = a2.i.a(s11, s12, f12);
        f fVar = (f) c(uVar.n(), uVar2.n(), f12);
        long g11 = f0.g(uVar.c(), uVar2.c(), f12);
        e eVar = (e) c(uVar.q(), uVar2.q(), f12);
        h1 p11 = uVar.p();
        if (p11 == null) {
            p11 = new h1(0, 0, 0.0f, 7, (kotlin.jvm.internal.i) null);
        }
        h1 p12 = uVar2.p();
        if (p12 == null) {
            p12 = new h1(0, 0, 0.0f, 7, (kotlin.jvm.internal.i) null);
        }
        return new u(a11, e11, a12, sVar, tVar, iVar, str, e12, a.b(a13), a14, fVar, g11, eVar, i1.a(p11, p12, f12), d(uVar.o(), uVar2.o(), f12), (kotlin.jvm.internal.i) null);
    }

    public static final <T> T c(T t, T t11, float f11) {
        return ((double) f11) < 0.5d ? t : t11;
    }

    private static final r d(r rVar, r rVar2, float f11) {
        if (rVar == null && rVar2 == null) {
            return null;
        }
        if (rVar == null) {
            rVar = r.f16168a.a();
        }
        if (rVar2 == null) {
            rVar2 = r.f16168a.a();
        }
        return p1.a.c(rVar, rVar2, f11);
    }

    public static final long e(long j, long j11, float f11) {
        if (s.g(j) || s.g(j11)) {
            return ((d2.r) c(d2.r.b(j), d2.r.b(j11), f11)).k();
        }
        return s.h(j, j11, f11);
    }

    public static final u f(u uVar) {
        long j;
        p.j(uVar, "style");
        b c11 = uVar.r().c(SpanStyleKt$resolveSpanStyleDefaults$1.f7526a);
        long i11 = s.g(uVar.i()) ? f7522a : uVar.i();
        v l11 = uVar.l();
        if (l11 == null) {
            l11 = v.f16949b.f();
        }
        v vVar = l11;
        u1.s j11 = uVar.j();
        u1.s c12 = u1.s.c(j11 != null ? j11.i() : u1.s.f16939b.b());
        t k = uVar.k();
        t e11 = t.e(k != null ? k.m() : t.f16943b.a());
        i g11 = uVar.g();
        if (g11 == null) {
            g11 = i.f16915b.a();
        }
        i iVar = g11;
        String h11 = uVar.h();
        if (h11 == null) {
            h11 = "";
        }
        String str = h11;
        if (s.g(uVar.m())) {
            j = f7523b;
        } else {
            j = uVar.m();
        }
        long j12 = j;
        a d11 = uVar.d();
        a b11 = a.b(d11 != null ? d11.h() : a.f884b.a());
        h s11 = uVar.s();
        if (s11 == null) {
            s11 = h.f927c.a();
        }
        h hVar = s11;
        f n = uVar.n();
        if (n == null) {
            n = f.f17448c.a();
        }
        f fVar = n;
        long c13 = uVar.c();
        if (!(c13 != d0.f16756b.f())) {
            c13 = f7524c;
        }
        long j13 = c13;
        e q = uVar.q();
        if (q == null) {
            q = e.f915b.c();
        }
        e eVar = q;
        h1 p11 = uVar.p();
        if (p11 == null) {
            p11 = h1.f16796d.a();
        }
        return new u(c11, i11, vVar, c12, e11, iVar, str, j12, b11, hVar, fVar, j13, eVar, p11, uVar.o(), (kotlin.jvm.internal.i) null);
    }
}
