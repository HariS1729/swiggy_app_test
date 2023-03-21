package v0;

import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.a;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.apache.pdfbox.pdmodel.common.PDPageLabelRange;
import v0.b;
import v0.d;

/* compiled from: ColorSpace.kt */
public final class c {
    public static final double a(double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = d11;
        return Math.copySign(n(d17 < 0.0d ? -d17 : d17, d12, d13, d14, d15, d16), d17);
    }

    public static final double b(double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = d11;
        return Math.copySign(p(d17 < 0.0d ? -d17 : d17, d12, d13, d14, d15, d16), d17);
    }

    public static final a c(a aVar, h hVar, a aVar2) {
        p.j(aVar, "<this>");
        p.j(hVar, "whitePoint");
        p.j(aVar2, "adaptation");
        if (!b.e(aVar.f(), b.f17013a.b())) {
            return aVar;
        }
        Rgb rgb = (Rgb) aVar;
        if (f(rgb.r(), hVar)) {
            return aVar;
        }
        return new Rgb(rgb, k(e(aVar2.b(), rgb.r().c(), hVar.c()), rgb.q()), hVar);
    }

    public static /* synthetic */ a d(a aVar, h hVar, a aVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar2 = a.f17008b.a();
        }
        return c(aVar, hVar, aVar2);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        p.j(fArr, "matrix");
        p.j(fArr2, "srcWhitePoint");
        p.j(fArr3, "dstWhitePoint");
        float[] m11 = m(fArr, fArr2);
        float[] m12 = m(fArr, fArr3);
        return k(j(fArr), l(new float[]{m12[0] / m11[0], m12[1] / m11[1], m12[2] / m11[2]}, fArr));
    }

    public static final boolean f(h hVar, h hVar2) {
        p.j(hVar, PDPageLabelRange.STYLE_LETTERS_LOWER);
        p.j(hVar2, "b");
        if (hVar == hVar2) {
            return true;
        }
        return Math.abs(hVar.a() - hVar2.a()) < 0.001f && Math.abs(hVar.b() - hVar2.b()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        p.j(fArr, PDPageLabelRange.STYLE_LETTERS_LOWER);
        p.j(fArr2, "b");
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (Float.compare(fArr[i11], fArr2[i11]) != 0 && Math.abs(fArr[i11] - fArr2[i11]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final d h(a aVar, a aVar2, int i11) {
        p.j(aVar, "$this$connect");
        p.j(aVar2, "destination");
        if (aVar == aVar2) {
            return d.f17018g.c(aVar);
        }
        long f11 = aVar.f();
        b.a aVar3 = b.f17013a;
        if (!b.e(f11, aVar3.b()) || !b.e(aVar2.f(), aVar3.b())) {
            return new d(aVar, aVar2, i11, (i) null);
        }
        return new d.b((Rgb) aVar, (Rgb) aVar2, i11, (i) null);
    }

    public static /* synthetic */ d i(a aVar, a aVar2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            aVar2 = ColorSpaces.f6442a.s();
        }
        if ((i12 & 2) != 0) {
            i11 = f.f17036a.b();
        }
        return h(aVar, aVar2, i11);
    }

    public static final float[] j(float[] fArr) {
        float[] fArr2 = fArr;
        p.j(fArr2, "m");
        float f11 = fArr2[0];
        float f12 = fArr2[3];
        float f13 = fArr2[6];
        float f14 = fArr2[1];
        float f15 = fArr2[4];
        float f16 = fArr2[7];
        float f17 = fArr2[2];
        float f18 = fArr2[5];
        float f19 = fArr2[8];
        float f21 = (f15 * f19) - (f16 * f18);
        float f22 = (f16 * f17) - (f14 * f19);
        float f23 = (f14 * f18) - (f15 * f17);
        float f24 = (f11 * f21) + (f12 * f22) + (f13 * f23);
        float[] fArr3 = new float[fArr2.length];
        fArr3[0] = f21 / f24;
        fArr3[1] = f22 / f24;
        fArr3[2] = f23 / f24;
        fArr3[3] = ((f13 * f18) - (f12 * f19)) / f24;
        fArr3[4] = ((f19 * f11) - (f13 * f17)) / f24;
        fArr3[5] = ((f17 * f12) - (f18 * f11)) / f24;
        fArr3[6] = ((f12 * f16) - (f13 * f15)) / f24;
        fArr3[7] = ((f13 * f14) - (f16 * f11)) / f24;
        fArr3[8] = ((f11 * f15) - (f12 * f14)) / f24;
        return fArr3;
    }

    public static final float[] k(float[] fArr, float[] fArr2) {
        p.j(fArr, "lhs");
        p.j(fArr2, "rhs");
        return new float[]{(fArr[0] * fArr2[0]) + (fArr[3] * fArr2[1]) + (fArr[6] * fArr2[2]), (fArr[1] * fArr2[0]) + (fArr[4] * fArr2[1]) + (fArr[7] * fArr2[2]), (fArr[2] * fArr2[0]) + (fArr[5] * fArr2[1]) + (fArr[8] * fArr2[2]), (fArr[0] * fArr2[3]) + (fArr[3] * fArr2[4]) + (fArr[6] * fArr2[5]), (fArr[1] * fArr2[3]) + (fArr[4] * fArr2[4]) + (fArr[7] * fArr2[5]), (fArr[2] * fArr2[3]) + (fArr[5] * fArr2[4]) + (fArr[8] * fArr2[5]), (fArr[0] * fArr2[6]) + (fArr[3] * fArr2[7]) + (fArr[6] * fArr2[8]), (fArr[1] * fArr2[6]) + (fArr[4] * fArr2[7]) + (fArr[7] * fArr2[8]), (fArr[2] * fArr2[6]) + (fArr[5] * fArr2[7]) + (fArr[8] * fArr2[8])};
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        p.j(fArr, "lhs");
        p.j(fArr2, "rhs");
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr[0] * fArr2[3], fArr[1] * fArr2[4], fArr[2] * fArr2[5], fArr[0] * fArr2[6], fArr[1] * fArr2[7], fArr[2] * fArr2[8]};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        p.j(fArr, "lhs");
        p.j(fArr2, "rhs");
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        float f13 = fArr2[2];
        fArr2[0] = (fArr[0] * f11) + (fArr[3] * f12) + (fArr[6] * f13);
        fArr2[1] = (fArr[1] * f11) + (fArr[4] * f12) + (fArr[7] * f13);
        fArr2[2] = (fArr[2] * f11) + (fArr[5] * f12) + (fArr[8] * f13);
        return fArr2;
    }

    public static final double n(double d11, double d12, double d13, double d14, double d15, double d16) {
        return d11 >= d15 * d14 ? (Math.pow(d11, 1.0d / d16) - d13) / d12 : d11 / d14;
    }

    public static final double o(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        return d11 >= d15 * d14 ? (Math.pow(d11 - d16, 1.0d / d18) - d13) / d12 : (d11 - d17) / d14;
    }

    public static final double p(double d11, double d12, double d13, double d14, double d15, double d16) {
        return d11 >= d15 ? Math.pow((d12 * d11) + d13, d16) : d11 * d14;
    }

    public static final double q(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        return d11 >= d15 ? Math.pow((d12 * d11) + d13, d18) + d16 : (d14 * d11) + d17;
    }
}
