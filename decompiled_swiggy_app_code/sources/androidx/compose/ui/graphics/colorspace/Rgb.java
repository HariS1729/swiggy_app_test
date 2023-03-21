package androidx.compose.ui.graphics.colorspace;

import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import lp0.l;
import v0.c;
import v0.e;
import v0.g;
import v0.h;

/* compiled from: Rgb.kt */
public final class Rgb extends a {

    /* renamed from: r  reason: collision with root package name */
    public static final a f6462r = new a((i) null);

    /* renamed from: s  reason: collision with root package name */
    private static final l<Double, Double> f6463s = Rgb$Companion$DoubleIdentity$1.f6479a;

    /* renamed from: e  reason: collision with root package name */
    private final h f6464e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final float f6465f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final float f6466g;

    /* renamed from: h  reason: collision with root package name */
    private final g f6467h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f6468i;
    private final float[] j;
    private final float[] k;

    /* renamed from: l  reason: collision with root package name */
    private final l<Double, Double> f6469l;

    /* renamed from: m  reason: collision with root package name */
    private final l<Double, Double> f6470m;
    private final l<Double, Double> n;

    /* renamed from: o  reason: collision with root package name */
    private final l<Double, Double> f6471o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f6472p;
    private final boolean q;

    /* compiled from: Rgb.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        private final float e(float[] fArr) {
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = fArr[5];
            float f17 = ((((((f11 * f14) + (f12 * f15)) + (f13 * f16)) - (f14 * f15)) - (f12 * f13)) - (f11 * f16)) * 0.5f;
            return f17 < 0.0f ? -f17 : f17;
        }

        private final boolean f(double d11, l<? super Double, Double> lVar, l<? super Double, Double> lVar2) {
            return Math.abs(lVar.invoke(Double.valueOf(d11)).doubleValue() - lVar2.invoke(Double.valueOf(d11)).doubleValue()) <= 0.001d;
        }

        /* access modifiers changed from: private */
        public final float[] g(float[] fArr, h hVar) {
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = fArr[5];
            float a11 = hVar.a();
            float b11 = hVar.b();
            float f17 = (float) 1;
            float f18 = (f17 - f11) / f12;
            float f19 = f11 / f12;
            float f21 = (f13 / f14) - f19;
            float f22 = (a11 / b11) - f19;
            float f23 = ((f17 - f13) / f14) - f18;
            float f24 = (f15 / f16) - f19;
            float f25 = (((((f17 - a11) / b11) - f18) * f21) - (f22 * f23)) / (((((f17 - f15) / f16) - f18) * f21) - (f23 * f24));
            float f26 = (f22 - (f24 * f25)) / f21;
            float f27 = (1.0f - f26) - f25;
            float f28 = f27 / f12;
            float f29 = f26 / f14;
            float f31 = f25 / f16;
            return new float[]{f28 * f11, f27, f28 * ((1.0f - f11) - f12), f29 * f13, f26, f29 * ((1.0f - f13) - f14), f31 * f15, f25, f31 * ((1.0f - f15) - f16)};
        }

        private final boolean h(float[] fArr, float[] fArr2) {
            float[] fArr3 = {fArr[0] - fArr2[0], fArr[1] - fArr2[1], fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            if (i(fArr3[0], fArr3[1], fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) < 0.0f || i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < 0.0f || i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) < 0.0f || i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < 0.0f || i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) < 0.0f || i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) < 0.0f) {
                return false;
            }
            return true;
        }

        private final float i(float f11, float f12, float f13, float f14) {
            return (f11 * f14) - (f12 * f13);
        }

        /* access modifiers changed from: private */
        public final boolean j(float[] fArr, h hVar, l<? super Double, Double> lVar, l<? super Double, Double> lVar2, float f11, float f12, int i11) {
            if (i11 == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.f6442a;
            if (!c.g(fArr, colorSpaces.t()) || !c.f(hVar, e.f17027a.e())) {
                return false;
            }
            if (!(f11 == 0.0f)) {
                return false;
            }
            if (!(f12 == 1.0f)) {
                return false;
            }
            Rgb s11 = colorSpaces.s();
            for (double d11 = 0.0d; d11 <= 1.0d; d11 += 0.00392156862745098d) {
                if (!f(d11, lVar, s11.p()) || !f(d11, lVar2, s11.m())) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final boolean k(float[] fArr, float f11, float f12) {
            float e11 = e(fArr);
            ColorSpaces colorSpaces = ColorSpaces.f6442a;
            return (e11 / e(colorSpaces.o()) > 0.9f && h(fArr, colorSpaces.t())) || (f11 < 0.0f && f12 > 1.0f);
        }

        /* access modifiers changed from: private */
        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f11 = fArr[0] + fArr[1] + fArr[2];
                fArr2[0] = fArr[0] / f11;
                fArr2[1] = fArr[1] / f11;
                float f12 = fArr[3] + fArr[4] + fArr[5];
                fArr2[2] = fArr[3] / f12;
                fArr2[3] = fArr[4] / f12;
                float f13 = fArr[6] + fArr[7] + fArr[8];
                fArr2[4] = fArr[6] / f13;
                fArr2[5] = fArr[7] / f13;
            } else {
                float[] unused = g.l(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r16, float[] r17, v0.h r18, float[] r19, lp0.l<? super java.lang.Double, java.lang.Double> r20, lp0.l<? super java.lang.Double, java.lang.Double> r21, float r22, float r23, v0.g r24, int r25) {
        /*
            r15 = this;
            r6 = r15
            r7 = r17
            r9 = r18
            r8 = r19
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            java.lang.String r0 = "name"
            r1 = r16
            kotlin.jvm.internal.p.j(r1, r0)
            java.lang.String r0 = "primaries"
            kotlin.jvm.internal.p.j(r7, r0)
            java.lang.String r0 = "whitePoint"
            kotlin.jvm.internal.p.j(r9, r0)
            java.lang.String r0 = "oetf"
            kotlin.jvm.internal.p.j(r10, r0)
            java.lang.String r0 = "eotf"
            kotlin.jvm.internal.p.j(r11, r0)
            v0.b$a r0 = v0.b.f17013a
            long r2 = r0.b()
            r5 = 0
            r0 = r15
            r4 = r25
            r0.<init>(r1, r2, r4, r5)
            r6.f6464e = r9
            r6.f6465f = r12
            r6.f6466g = r13
            r0 = r24
            r6.f6467h = r0
            r6.f6469l = r10
            androidx.compose.ui.graphics.colorspace.Rgb$oetf$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            r0.<init>(r15)
            r6.f6470m = r0
            r6.n = r11
            androidx.compose.ui.graphics.colorspace.Rgb$eotf$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            r0.<init>(r15)
            r6.f6471o = r0
            int r0 = r7.length
            r1 = 9
            r2 = 6
            if (r0 == r2) goto L_0x0065
            int r0 = r7.length
            if (r0 != r1) goto L_0x005d
            goto L_0x0065
        L_0x005d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"
            r0.<init>(r1)
            throw r0
        L_0x0065:
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ba
            androidx.compose.ui.graphics.colorspace.Rgb$a r0 = f6462r
            float[] r2 = r0.l(r7)
            r6.f6468i = r2
            if (r8 != 0) goto L_0x007a
            float[] r1 = r0.g(r2, r9)
            r6.j = r1
            goto L_0x007f
        L_0x007a:
            int r3 = r8.length
            if (r3 != r1) goto L_0x00a2
            r6.j = r8
        L_0x007f:
            float[] r1 = r6.j
            float[] r1 = v0.c.j(r1)
            r6.k = r1
            boolean r1 = r0.k(r2, r12, r13)
            r6.f6472p = r1
            r7 = r0
            r8 = r2
            r9 = r18
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r25
            boolean r0 = r7.j(r8, r9, r10, r11, r12, r13, r14)
            r6.q = r0
            return
        L_0x00a2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Transform must have 9 entries! Has "
            r1.append(r2)
            int r2 = r8.length
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ba:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid range: min="
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = ", max="
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = "; min must be strictly < max"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], v0.h, float[], lp0.l, lp0.l, float, float, v0.g, int):void");
    }

    public float[] a(float[] fArr) {
        p.j(fArr, "v");
        c.m(this.k, fArr);
        fArr[0] = (float) this.f6470m.invoke(Double.valueOf((double) fArr[0])).doubleValue();
        fArr[1] = (float) this.f6470m.invoke(Double.valueOf((double) fArr[1])).doubleValue();
        fArr[2] = (float) this.f6470m.invoke(Double.valueOf((double) fArr[2])).doubleValue();
        return fArr;
    }

    public float d(int i11) {
        return this.f6466g;
    }

    public float e(int i11) {
        return this.f6465f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.e(s.b(Rgb.class), s.b(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.f6465f, this.f6465f) != 0 || Float.compare(rgb.f6466g, this.f6466g) != 0 || !p.e(this.f6464e, rgb.f6464e) || !Arrays.equals(this.f6468i, rgb.f6468i)) {
            return false;
        }
        g gVar = this.f6467h;
        if (gVar != null) {
            return p.e(gVar, rgb.f6467h);
        }
        if (rgb.f6467h == null) {
            return true;
        }
        if (!p.e(this.f6469l, rgb.f6469l)) {
            return false;
        }
        return p.e(this.n, rgb.n);
    }

    public boolean h() {
        return this.q;
    }

    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.f6464e.hashCode()) * 31) + Arrays.hashCode(this.f6468i)) * 31;
        float f11 = this.f6465f;
        boolean z11 = true;
        int i11 = 0;
        int floatToIntBits = (hashCode + (!((f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f11) : 0)) * 31;
        float f12 = this.f6466g;
        if (f12 != 0.0f) {
            z11 = false;
        }
        int floatToIntBits2 = (floatToIntBits + (!z11 ? Float.floatToIntBits(f12) : 0)) * 31;
        g gVar = this.f6467h;
        if (gVar != null) {
            i11 = gVar.hashCode();
        }
        int i12 = floatToIntBits2 + i11;
        return this.f6467h == null ? (((i12 * 31) + this.f6469l.hashCode()) * 31) + this.n.hashCode() : i12;
    }

    public float[] i(float[] fArr) {
        p.j(fArr, "v");
        fArr[0] = (float) this.f6471o.invoke(Double.valueOf((double) fArr[0])).doubleValue();
        fArr[1] = (float) this.f6471o.invoke(Double.valueOf((double) fArr[1])).doubleValue();
        fArr[2] = (float) this.f6471o.invoke(Double.valueOf((double) fArr[2])).doubleValue();
        return c.m(this.j, fArr);
    }

    public final l<Double, Double> l() {
        return this.f6471o;
    }

    public final l<Double, Double> m() {
        return this.n;
    }

    public final float[] n() {
        return this.k;
    }

    public final l<Double, Double> o() {
        return this.f6470m;
    }

    public final l<Double, Double> p() {
        return this.f6469l;
    }

    public final float[] q() {
        return this.j;
    }

    public final h r() {
        return this.f6464e;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r13, float[] r14, v0.h r15, v0.g r16, int r17) {
        /*
            r12 = this;
            r9 = r16
            java.lang.String r0 = "name"
            r1 = r13
            kotlin.jvm.internal.p.j(r13, r0)
            java.lang.String r0 = "primaries"
            r2 = r14
            kotlin.jvm.internal.p.j(r14, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r15
            kotlin.jvm.internal.p.j(r15, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.p.j(r9, r0)
            double r4 = r16.e()
            r0 = 1
            r6 = 0
            r7 = 0
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0027
            r4 = 1
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            if (r4 == 0) goto L_0x003d
            double r4 = r16.f()
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = 0
        L_0x0035:
            if (r4 == 0) goto L_0x003d
            androidx.compose.ui.graphics.colorspace.Rgb$1 r4 = new androidx.compose.ui.graphics.colorspace.Rgb$1
            r4.<init>(r9)
            goto L_0x0042
        L_0x003d:
            androidx.compose.ui.graphics.colorspace.Rgb$2 r4 = new androidx.compose.ui.graphics.colorspace.Rgb$2
            r4.<init>(r9)
        L_0x0042:
            r5 = r4
            double r10 = r16.e()
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 == 0) goto L_0x0062
            double r10 = r16.f()
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x0062
            androidx.compose.ui.graphics.colorspace.Rgb$3 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$3
            r0.<init>(r9)
            goto L_0x0067
        L_0x0062:
            androidx.compose.ui.graphics.colorspace.Rgb$4 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$4
            r0.<init>(r9)
        L_0x0067:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r9 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], v0.h, v0.g, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r23, float[] r24, v0.h r25, double r26, float r28, float r29, int r30) {
        /*
            r22 = this;
            r1 = r26
            java.lang.String r0 = "name"
            r15 = r23
            kotlin.jvm.internal.p.j(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r24
            kotlin.jvm.internal.p.j(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r25
            kotlin.jvm.internal.p.j(r14, r0)
            r0 = 1
            r3 = 0
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            if (r4 == 0) goto L_0x0027
            lp0.l<java.lang.Double, java.lang.Double> r4 = f6463s
            goto L_0x002c
        L_0x0027:
            androidx.compose.ui.graphics.colorspace.Rgb$5 r4 = new androidx.compose.ui.graphics.colorspace.Rgb$5
            r4.<init>(r1)
        L_0x002c:
            r17 = r4
            if (r6 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            lp0.l<java.lang.Double, java.lang.Double> r0 = f6463s
            goto L_0x003c
        L_0x0037:
            androidx.compose.ui.graphics.colorspace.Rgb$6 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$6
            r0.<init>(r1)
        L_0x003c:
            r18 = r0
            v0.g r19 = new v0.g
            r0 = r19
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r20 = 0
            r13 = r20
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r26
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r5 = 0
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r6 = r17
            r7 = r18
            r8 = r28
            r9 = r29
            r10 = r19
            r11 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], v0.h, double, float, float, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Rgb(Rgb rgb, float[] fArr, h hVar) {
        this(rgb.g(), rgb.f6468i, hVar, fArr, rgb.f6469l, rgb.n, rgb.f6465f, rgb.f6466g, rgb.f6467h, -1);
        p.j(rgb, "colorSpace");
        p.j(fArr, "transform");
        p.j(hVar, "whitePoint");
    }
}
