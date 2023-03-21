package f1;

import kotlin.jvm.internal.p;
import t0.f;
import t0.l;

/* compiled from: PointerEvent.kt */
public final class o {
    public static final boolean a(v vVar) {
        p.j(vVar, "<this>");
        return !vVar.m() && !vVar.i() && vVar.g();
    }

    public static final boolean b(v vVar) {
        p.j(vVar, "<this>");
        return !vVar.i() && vVar.g();
    }

    public static final boolean c(v vVar) {
        p.j(vVar, "<this>");
        return !vVar.m() && vVar.i() && !vVar.g();
    }

    public static final boolean d(v vVar) {
        p.j(vVar, "<this>");
        return vVar.i() && !vVar.g();
    }

    public static final boolean e(v vVar, long j) {
        p.j(vVar, "$this$isOutOfBounds");
        long f11 = vVar.f();
        float m11 = f.m(f11);
        float n = f.n(f11);
        return m11 < 0.0f || m11 > ((float) d2.p.g(j)) || n < 0.0f || n > ((float) d2.p.f(j));
    }

    public static final boolean f(v vVar, long j, long j11) {
        p.j(vVar, "$this$isOutOfBounds");
        if (!g0.g(vVar.k(), g0.f14488a.d())) {
            return e(vVar, j);
        }
        long f11 = vVar.f();
        float m11 = f.m(f11);
        float n = f.n(f11);
        return m11 < (-l.i(j11)) || m11 > ((float) d2.p.g(j)) + l.i(j11) || n < (-l.g(j11)) || n > ((float) d2.p.f(j)) + l.g(j11);
    }

    public static final long g(v vVar) {
        p.j(vVar, "<this>");
        return i(vVar, false);
    }

    public static final long h(v vVar) {
        p.j(vVar, "<this>");
        return i(vVar, true);
    }

    private static final long i(v vVar, boolean z11) {
        long q = f.q(vVar.f(), vVar.h());
        return (z11 || !vVar.m()) ? q : f.f16662b.c();
    }

    public static final boolean j(v vVar) {
        p.j(vVar, "<this>");
        return !f.j(i(vVar, true), f.f16662b.c());
    }
}
