package u0;

import kotlin.jvm.internal.p;
import t0.h;

/* compiled from: Canvas.kt */
public final /* synthetic */ class w {
    public static void a(x xVar, h hVar, int i11) {
        p.j(hVar, "rect");
        xVar.b(hVar.i(), hVar.l(), hVar.j(), hVar.e(), i11);
    }

    public static void b(x xVar, h hVar, t0 t0Var) {
        p.j(hVar, "rect");
        p.j(t0Var, "paint");
        xVar.k(hVar.i(), hVar.l(), hVar.j(), hVar.e(), t0Var);
    }

    public static /* synthetic */ void c(x xVar, w0 w0Var, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i11 = c0.f16752a.b();
            }
            xVar.d(w0Var, i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    public static /* synthetic */ void d(x xVar, float f11, float f12, float f13, float f14, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 16) != 0) {
                i11 = c0.f16752a.b();
            }
            xVar.b(f11, f12, f13, f14, i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    public static /* synthetic */ void e(x xVar, h hVar, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i11 = c0.f16752a.b();
            }
            xVar.u(hVar, i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
    }
}
