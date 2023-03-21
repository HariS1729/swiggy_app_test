package androidx.compose.ui.platform;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import t0.a;
import t0.h;
import t0.j;
import u0.a1;
import u0.o;
import u0.r0;
import u0.w0;

/* compiled from: ShapeContainingUtil.kt */
public final class e1 {
    private static final boolean a(j jVar) {
        return a.d(jVar.h()) + a.d(jVar.i()) <= jVar.j() && a.d(jVar.b()) + a.d(jVar.c()) <= jVar.j() && a.e(jVar.h()) + a.e(jVar.b()) <= jVar.d() && a.e(jVar.i()) + a.e(jVar.c()) <= jVar.d();
    }

    public static final boolean b(r0 r0Var, float f11, float f12, w0 w0Var, w0 w0Var2) {
        p.j(r0Var, "outline");
        if (r0Var instanceof r0.b) {
            return d(((r0.b) r0Var).a(), f11, f12);
        }
        if (r0Var instanceof r0.c) {
            return e((r0.c) r0Var, f11, f12, w0Var, w0Var2);
        }
        if (r0Var instanceof r0.a) {
            return c(((r0.a) r0Var).a(), f11, f12, w0Var, w0Var2);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean c(w0 w0Var, float f11, float f12, w0 w0Var2, w0 w0Var3) {
        h hVar = new h(f11 - 0.005f, f12 - 0.005f, f11 + 0.005f, f12 + 0.005f);
        if (w0Var2 == null) {
            w0Var2 = o.a();
        }
        w0Var2.h(hVar);
        if (w0Var3 == null) {
            w0Var3 = o.a();
        }
        w0Var3.o(w0Var, w0Var2, a1.f16741a.b());
        boolean isEmpty = w0Var3.isEmpty();
        w0Var3.reset();
        w0Var2.reset();
        return !isEmpty;
    }

    private static final boolean d(h hVar, float f11, float f12) {
        return hVar.i() <= f11 && f11 < hVar.j() && hVar.l() <= f12 && f12 < hVar.e();
    }

    private static final boolean e(r0.c cVar, float f11, float f12, w0 w0Var, w0 w0Var2) {
        float f13 = f11;
        float f14 = f12;
        w0 w0Var3 = w0Var2;
        j a11 = cVar.a();
        if (f13 < a11.e() || f13 >= a11.f() || f14 < a11.g() || f14 >= a11.a()) {
            return false;
        }
        if (!a(a11)) {
            w0 a12 = w0Var3 == null ? o.a() : w0Var3;
            a12.f(a11);
            return c(a12, f11, f12, w0Var, w0Var3);
        }
        float d11 = a.d(a11.h()) + a11.e();
        float e11 = a.e(a11.h()) + a11.g();
        float f15 = a11.f() - a.d(a11.i());
        float e12 = a.e(a11.i()) + a11.g();
        float f16 = a11.f() - a.d(a11.c());
        float a13 = a11.a() - a.e(a11.c());
        float a14 = a11.a() - a.e(a11.b());
        float d12 = a.d(a11.b()) + a11.e();
        if (f13 < d11 && f14 < e11) {
            return f(f11, f12, a11.h(), d11, e11);
        } else if (f13 < d12 && f14 > a14) {
            return f(f11, f12, a11.b(), d12, a14);
        } else if (f13 > f15 && f14 < e12) {
            return f(f11, f12, a11.i(), f15, e12);
        } else if (f13 <= f16 || f14 <= a13) {
            return true;
        } else {
            return f(f11, f12, a11.c(), f16, a13);
        }
    }

    private static final boolean f(float f11, float f12, long j, float f13, float f14) {
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float d11 = a.d(j);
        float e11 = a.e(j);
        return ((f15 * f15) / (d11 * d11)) + ((f16 * f16) / (e11 * e11)) <= 1.0f;
    }
}
