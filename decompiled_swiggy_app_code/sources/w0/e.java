package w0;

import com.truecaller.android.sdk.TruecallerSdkScope;
import d2.q;
import t0.a;
import t0.l;
import t0.m;
import u0.e0;
import u0.l0;
import u0.u;
import u0.w0;
import u0.x0;
import w0.f;

/* compiled from: DrawScope.kt */
public final /* synthetic */ class e {
    static {
        f.a aVar = f.f17432j0;
    }

    public static long a(f fVar) {
        return m.b(fVar.O().d());
    }

    public static long b(f fVar) {
        return fVar.O().d();
    }

    public static long c(f fVar, long j, long j11) {
        return m.a(l.i(j) - t0.f.m(j11), l.g(j) - t0.f.n(j11));
    }

    public static /* synthetic */ void d(f fVar, u uVar, float f11, float f12, boolean z11, long j, long j11, float f13, g gVar, e0 e0Var, int i11, int i12, Object obj) {
        long j12;
        int i13 = i12;
        if (obj == null) {
            long c11 = (i13 & 16) != 0 ? t0.f.f16662b.c() : j;
            if ((i13 & 32) != 0) {
                j12 = c(fVar, fVar.d(), c11);
            } else {
                f fVar2 = fVar;
                j12 = j11;
            }
            fVar.C0(uVar, f11, f12, z11, c11, j12, (i13 & 64) != 0 ? 1.0f : f13, (i13 & 128) != 0 ? k.f17436a : gVar, (i13 & 256) != 0 ? null : e0Var, (i13 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? f.f17432j0.a() : i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
    }

    public static /* synthetic */ void e(f fVar, long j, float f11, float f12, boolean z11, long j11, long j12, float f13, g gVar, e0 e0Var, int i11, int i12, Object obj) {
        long j13;
        int i13 = i12;
        if (obj == null) {
            long c11 = (i13 & 16) != 0 ? t0.f.f16662b.c() : j11;
            if ((i13 & 32) != 0) {
                j13 = c(fVar, fVar.d(), c11);
            } else {
                f fVar2 = fVar;
                j13 = j12;
            }
            fVar.G(j, f11, f12, z11, c11, j13, (i13 & 64) != 0 ? 1.0f : f13, (i13 & 128) != 0 ? k.f17436a : gVar, (i13 & 256) != 0 ? null : e0Var, (i13 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? f.f17432j0.a() : i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
    }

    public static /* synthetic */ void f(f fVar, long j, float f11, long j11, float f12, g gVar, e0 e0Var, int i11, int i12, Object obj) {
        if (obj == null) {
            fVar.g0(j, (i12 & 2) != 0 ? l.h(fVar.d()) / 2.0f : f11, (i12 & 4) != 0 ? fVar.R() : j11, (i12 & 8) != 0 ? 1.0f : f12, (i12 & 16) != 0 ? k.f17436a : gVar, (i12 & 32) != 0 ? null : e0Var, (i12 & 64) != 0 ? f.f17432j0.a() : i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
    }

    public static /* synthetic */ void g(f fVar, l0 l0Var, long j, long j11, long j12, long j13, float f11, g gVar, e0 e0Var, int i11, int i12, int i13, Object obj) {
        int i14 = i13;
        if (obj == null) {
            long a11 = (i14 & 2) != 0 ? d2.l.f14010b.a() : j;
            long a12 = (i14 & 4) != 0 ? q.a(l0Var.getWidth(), l0Var.getHeight()) : j11;
            fVar.Z(l0Var, a11, a12, (i14 & 8) != 0 ? d2.l.f14010b.a() : j12, (i14 & 16) != 0 ? a12 : j13, (i14 & 32) != 0 ? 1.0f : f11, (i14 & 64) != 0 ? k.f17436a : gVar, (i14 & 128) != 0 ? null : e0Var, (i14 & 256) != 0 ? f.f17432j0.a() : i11, (i14 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? f.f17432j0.b() : i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
    }

    public static /* synthetic */ void h(f fVar, l0 l0Var, long j, float f11, g gVar, e0 e0Var, int i11, int i12, Object obj) {
        if (obj == null) {
            fVar.h0(l0Var, (i12 & 2) != 0 ? t0.f.f16662b.c() : j, (i12 & 4) != 0 ? 1.0f : f11, (i12 & 8) != 0 ? k.f17436a : gVar, (i12 & 16) != 0 ? null : e0Var, (i12 & 32) != 0 ? f.f17432j0.a() : i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
    }

    public static /* synthetic */ void i(f fVar, u uVar, long j, long j11, float f11, int i11, x0 x0Var, float f12, e0 e0Var, int i12, int i13, Object obj) {
        int i14 = i13;
        if (obj == null) {
            fVar.w(uVar, j, j11, (i14 & 8) != 0 ? 0.0f : f11, (i14 & 16) != 0 ? l.f17437f.a() : i11, (i14 & 32) != 0 ? null : x0Var, (i14 & 64) != 0 ? 1.0f : f12, (i14 & 128) != 0 ? null : e0Var, (i14 & 256) != 0 ? f.f17432j0.a() : i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
    }

    public static /* synthetic */ void j(f fVar, long j, long j11, long j12, float f11, int i11, x0 x0Var, float f12, e0 e0Var, int i12, int i13, Object obj) {
        int i14 = i13;
        if (obj == null) {
            fVar.B0(j, j11, j12, (i14 & 8) != 0 ? 0.0f : f11, (i14 & 16) != 0 ? l.f17437f.a() : i11, (i14 & 32) != 0 ? null : x0Var, (i14 & 64) != 0 ? 1.0f : f12, (i14 & 128) != 0 ? null : e0Var, (i14 & 256) != 0 ? f.f17432j0.a() : i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
    }

    public static /* synthetic */ void k(f fVar, w0 w0Var, u uVar, float f11, g gVar, e0 e0Var, int i11, int i12, Object obj) {
        if (obj == null) {
            float f12 = (i12 & 4) != 0 ? 1.0f : f11;
            if ((i12 & 8) != 0) {
                gVar = k.f17436a;
            }
            g gVar2 = gVar;
            if ((i12 & 16) != 0) {
                e0Var = null;
            }
            e0 e0Var2 = e0Var;
            if ((i12 & 32) != 0) {
                i11 = f.f17432j0.a();
            }
            fVar.E(w0Var, uVar, f12, gVar2, e0Var2, i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
    }

    public static /* synthetic */ void l(f fVar, w0 w0Var, long j, float f11, g gVar, e0 e0Var, int i11, int i12, Object obj) {
        if (obj == null) {
            fVar.X(w0Var, j, (i12 & 4) != 0 ? 1.0f : f11, (i12 & 8) != 0 ? k.f17436a : gVar, (i12 & 16) != 0 ? null : e0Var, (i12 & 32) != 0 ? f.f17432j0.a() : i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
    }

    public static /* synthetic */ void m(f fVar, u uVar, long j, long j11, float f11, g gVar, e0 e0Var, int i11, int i12, Object obj) {
        long j12;
        if (obj == null) {
            long c11 = (i12 & 2) != 0 ? t0.f.f16662b.c() : j;
            if ((i12 & 4) != 0) {
                f fVar2 = fVar;
                j12 = c(fVar, fVar.d(), c11);
            } else {
                f fVar3 = fVar;
                j12 = j11;
            }
            fVar.i0(uVar, c11, j12, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? k.f17436a : gVar, (i12 & 32) != 0 ? null : e0Var, (i12 & 64) != 0 ? f.f17432j0.a() : i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
    }

    public static /* synthetic */ void n(f fVar, long j, long j11, long j12, float f11, g gVar, e0 e0Var, int i11, int i12, Object obj) {
        long j13;
        if (obj == null) {
            long c11 = (i12 & 2) != 0 ? t0.f.f16662b.c() : j11;
            if ((i12 & 4) != 0) {
                f fVar2 = fVar;
                j13 = c(fVar, fVar.d(), c11);
            } else {
                f fVar3 = fVar;
                j13 = j12;
            }
            fVar.b0(j, c11, j13, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? k.f17436a : gVar, (i12 & 32) != 0 ? null : e0Var, (i12 & 64) != 0 ? f.f17432j0.a() : i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
    }

    public static /* synthetic */ void o(f fVar, u uVar, long j, long j11, long j12, float f11, g gVar, e0 e0Var, int i11, int i12, Object obj) {
        long j13;
        int i13 = i12;
        if (obj == null) {
            long c11 = (i13 & 2) != 0 ? t0.f.f16662b.c() : j;
            if ((i13 & 4) != 0) {
                f fVar2 = fVar;
                j13 = c(fVar, fVar.d(), c11);
            } else {
                f fVar3 = fVar;
                j13 = j11;
            }
            fVar.v(uVar, c11, j13, (i13 & 8) != 0 ? a.f16656a.a() : j12, (i13 & 16) != 0 ? 1.0f : f11, (i13 & 32) != 0 ? k.f17436a : gVar, (i13 & 64) != 0 ? null : e0Var, (i13 & 128) != 0 ? f.f17432j0.a() : i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
    }
}
