package d2;

import t0.l;
import t0.m;

/* compiled from: Density.kt */
public final /* synthetic */ class d {
    public static int a(e eVar, long j) {
        return c.c(eVar.m0(j));
    }

    public static int b(e eVar, float f11) {
        float v02 = eVar.v0(f11);
        if (Float.isInfinite(v02)) {
            return Integer.MAX_VALUE;
        }
        return c.c(v02);
    }

    public static float c(e eVar, float f11) {
        return h.n(f11 / eVar.getDensity());
    }

    public static float d(e eVar, int i11) {
        return h.n(((float) i11) / eVar.getDensity());
    }

    public static long e(e eVar, long j) {
        if (j != l.f16682b.a()) {
            return i.b(eVar.M(l.i(j)), eVar.M(l.g(j)));
        }
        return k.f14006b.a();
    }

    public static float f(e eVar, long j) {
        if (t.g(r.g(j), t.f14026b.b())) {
            return r.h(j) * eVar.u0() * eVar.getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static float g(e eVar, float f11) {
        return f11 * eVar.getDensity();
    }

    public static long h(e eVar, long j) {
        if (j != k.f14006b.a()) {
            return m.a(eVar.v0(k.h(j)), eVar.v0(k.g(j)));
        }
        return l.f16682b.a();
    }

    public static long i(e eVar, int i11) {
        return s.e(((float) i11) / (eVar.u0() * eVar.getDensity()));
    }
}
