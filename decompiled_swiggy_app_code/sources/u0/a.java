package u0;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import u0.s;

/* compiled from: AndroidBlendMode.android.kt */
public final class a {
    public static final BlendMode a(int i11) {
        s.a aVar = s.f16866b;
        if (s.G(i11, aVar.a())) {
            return BlendMode.CLEAR;
        }
        if (s.G(i11, aVar.x())) {
            return BlendMode.SRC;
        }
        if (s.G(i11, aVar.g())) {
            return BlendMode.DST;
        }
        if (s.G(i11, aVar.B())) {
            return BlendMode.SRC_OVER;
        }
        if (s.G(i11, aVar.k())) {
            return BlendMode.DST_OVER;
        }
        if (s.G(i11, aVar.z())) {
            return BlendMode.SRC_IN;
        }
        if (s.G(i11, aVar.i())) {
            return BlendMode.DST_IN;
        }
        if (s.G(i11, aVar.A())) {
            return BlendMode.SRC_OUT;
        }
        if (s.G(i11, aVar.j())) {
            return BlendMode.DST_OUT;
        }
        if (s.G(i11, aVar.y())) {
            return BlendMode.SRC_ATOP;
        }
        if (s.G(i11, aVar.h())) {
            return BlendMode.DST_ATOP;
        }
        if (s.G(i11, aVar.C())) {
            return BlendMode.XOR;
        }
        if (s.G(i11, aVar.t())) {
            return BlendMode.PLUS;
        }
        if (s.G(i11, aVar.q())) {
            return BlendMode.MODULATE;
        }
        if (s.G(i11, aVar.v())) {
            return BlendMode.SCREEN;
        }
        if (s.G(i11, aVar.s())) {
            return BlendMode.OVERLAY;
        }
        if (s.G(i11, aVar.e())) {
            return BlendMode.DARKEN;
        }
        if (s.G(i11, aVar.o())) {
            return BlendMode.LIGHTEN;
        }
        if (s.G(i11, aVar.d())) {
            return BlendMode.COLOR_DODGE;
        }
        if (s.G(i11, aVar.c())) {
            return BlendMode.COLOR_BURN;
        }
        if (s.G(i11, aVar.m())) {
            return BlendMode.HARD_LIGHT;
        }
        if (s.G(i11, aVar.w())) {
            return BlendMode.SOFT_LIGHT;
        }
        if (s.G(i11, aVar.f())) {
            return BlendMode.DIFFERENCE;
        }
        if (s.G(i11, aVar.l())) {
            return BlendMode.EXCLUSION;
        }
        if (s.G(i11, aVar.r())) {
            return BlendMode.MULTIPLY;
        }
        if (s.G(i11, aVar.n())) {
            return BlendMode.HUE;
        }
        if (s.G(i11, aVar.u())) {
            return BlendMode.SATURATION;
        }
        if (s.G(i11, aVar.b())) {
            return BlendMode.COLOR;
        }
        if (s.G(i11, aVar.p())) {
            return BlendMode.LUMINOSITY;
        }
        return BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i11) {
        s.a aVar = s.f16866b;
        if (s.G(i11, aVar.a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (s.G(i11, aVar.x())) {
            return PorterDuff.Mode.SRC;
        }
        if (s.G(i11, aVar.g())) {
            return PorterDuff.Mode.DST;
        }
        if (s.G(i11, aVar.B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (s.G(i11, aVar.k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (s.G(i11, aVar.z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (s.G(i11, aVar.i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (s.G(i11, aVar.A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (s.G(i11, aVar.j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (s.G(i11, aVar.y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (s.G(i11, aVar.h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (s.G(i11, aVar.C())) {
            return PorterDuff.Mode.XOR;
        }
        if (s.G(i11, aVar.t())) {
            return PorterDuff.Mode.ADD;
        }
        if (s.G(i11, aVar.v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (s.G(i11, aVar.s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (s.G(i11, aVar.e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (s.G(i11, aVar.o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (s.G(i11, aVar.q())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
