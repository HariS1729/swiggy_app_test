package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.c;
import i2.c;
import java.util.Arrays;
import java.util.LinkedHashMap;
import pc0.x;

/* compiled from: MotionPaths */
class p implements Comparable<p> {
    static String[] t = {"position", x.f81957i, "y", "width", "height", "pathRotate"};

    /* renamed from: a  reason: collision with root package name */
    c f8571a;

    /* renamed from: b  reason: collision with root package name */
    int f8572b = 0;

    /* renamed from: c  reason: collision with root package name */
    float f8573c;

    /* renamed from: d  reason: collision with root package name */
    float f8574d;

    /* renamed from: e  reason: collision with root package name */
    float f8575e;

    /* renamed from: f  reason: collision with root package name */
    float f8576f;

    /* renamed from: g  reason: collision with root package name */
    float f8577g;

    /* renamed from: h  reason: collision with root package name */
    float f8578h;

    /* renamed from: i  reason: collision with root package name */
    float f8579i = Float.NaN;
    float j = Float.NaN;
    int k;

    /* renamed from: l  reason: collision with root package name */
    int f8580l;

    /* renamed from: m  reason: collision with root package name */
    float f8581m;
    m n;

    /* renamed from: o  reason: collision with root package name */
    LinkedHashMap<String, ConstraintAttribute> f8582o;

    /* renamed from: p  reason: collision with root package name */
    int f8583p;
    int q;

    /* renamed from: r  reason: collision with root package name */
    double[] f8584r;

    /* renamed from: s  reason: collision with root package name */
    double[] f8585s;

    public p() {
        int i11 = d.f8455f;
        this.k = i11;
        this.f8580l = i11;
        this.f8581m = Float.NaN;
        this.n = null;
        this.f8582o = new LinkedHashMap<>();
        this.f8583p = 0;
        this.f8584r = new double[18];
        this.f8585s = new double[18];
    }

    private boolean d(float f11, float f12) {
        if (Float.isNaN(f11) || Float.isNaN(f12)) {
            if (Float.isNaN(f11) != Float.isNaN(f12)) {
                return true;
            }
            return false;
        } else if (Math.abs(f11 - f12) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    public void a(c.a aVar) {
        this.f8571a = i2.c.c(aVar.f8804d.f8861d);
        c.C0030c cVar = aVar.f8804d;
        this.k = cVar.f8862e;
        this.f8580l = cVar.f8859b;
        this.f8579i = cVar.f8866i;
        this.f8572b = cVar.f8863f;
        this.q = cVar.f8860c;
        this.j = aVar.f8803c.f8873e;
        this.f8581m = aVar.f8805e.D;
        for (String next : aVar.f8807g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f8807g.get(next);
            if (constraintAttribute != null && constraintAttribute.g()) {
                this.f8582o.put(next, constraintAttribute);
            }
        }
    }

    /* renamed from: c */
    public int compareTo(p pVar) {
        return Float.compare(this.f8574d, pVar.f8574d);
    }

    /* access modifiers changed from: package-private */
    public void e(p pVar, boolean[] zArr, String[] strArr, boolean z11) {
        boolean d11 = d(this.f8575e, pVar.f8575e);
        boolean d12 = d(this.f8576f, pVar.f8576f);
        zArr[0] = zArr[0] | d(this.f8574d, pVar.f8574d);
        boolean z12 = d11 | d12 | z11;
        zArr[1] = zArr[1] | z12;
        zArr[2] = z12 | zArr[2];
        zArr[3] = zArr[3] | d(this.f8577g, pVar.f8577g);
        zArr[4] = d(this.f8578h, pVar.f8578h) | zArr[4];
    }

    /* access modifiers changed from: package-private */
    public void f(double[] dArr, int[] iArr) {
        float[] fArr = {this.f8574d, this.f8575e, this.f8576f, this.f8577g, this.f8578h, this.f8579i};
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            if (iArr[i12] < 6) {
                dArr[i11] = (double) fArr[iArr[i12]];
                i11++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(double d11, int[] iArr, double[] dArr, float[] fArr, int i11) {
        int[] iArr2 = iArr;
        float f11 = this.f8575e;
        float f12 = this.f8576f;
        float f13 = this.f8577g;
        float f14 = this.f8578h;
        for (int i12 = 0; i12 < iArr2.length; i12++) {
            float f15 = (float) dArr[i12];
            int i13 = iArr2[i12];
            if (i13 == 1) {
                f11 = f15;
            } else if (i13 == 2) {
                f12 = f15;
            } else if (i13 == 3) {
                f13 = f15;
            } else if (i13 == 4) {
                f14 = f15;
            }
        }
        m mVar = this.n;
        if (mVar != null) {
            float[] fArr2 = new float[2];
            mVar.i(d11, fArr2, new float[2]);
            float f16 = fArr2[0];
            float f17 = fArr2[1];
            double d12 = (double) f16;
            double d13 = (double) f11;
            double d14 = (double) f12;
            f11 = (float) ((d12 + (Math.sin(d14) * d13)) - ((double) (f13 / 2.0f)));
            f12 = (float) ((((double) f17) - (d13 * Math.cos(d14))) - ((double) (f14 / 2.0f)));
        }
        fArr[i11] = f11 + (f13 / 2.0f) + 0.0f;
        fArr[i11 + 1] = f12 + (f14 / 2.0f) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void h(double d11, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f11;
        int[] iArr2 = iArr;
        float f12 = this.f8575e;
        float f13 = this.f8576f;
        float f14 = this.f8577g;
        float f15 = this.f8578h;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            float f21 = (float) dArr[i11];
            float f22 = (float) dArr2[i11];
            int i12 = iArr2[i11];
            if (i12 == 1) {
                f12 = f21;
                f16 = f22;
            } else if (i12 == 2) {
                f13 = f21;
                f18 = f22;
            } else if (i12 == 3) {
                f14 = f21;
                f17 = f22;
            } else if (i12 == 4) {
                f15 = f21;
                f19 = f22;
            }
        }
        float f23 = 2.0f;
        float f24 = (f17 / 2.0f) + f16;
        float f25 = (f19 / 2.0f) + f18;
        m mVar = this.n;
        if (mVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            mVar.i(d11, fArr3, fArr4);
            float f26 = fArr3[0];
            float f27 = fArr3[1];
            float f28 = fArr4[0];
            double d12 = (double) f12;
            float f29 = fArr4[1];
            double d13 = (double) f13;
            f11 = f14;
            double d14 = (double) f16;
            double d15 = (double) f18;
            float sin = (float) (((double) f28) + (Math.sin(d13) * d14) + (Math.cos(d13) * d15));
            f25 = (float) ((((double) f29) - (d14 * Math.cos(d13))) + (Math.sin(d13) * d15));
            f24 = sin;
            f12 = (float) ((((double) f26) + (Math.sin(d13) * d12)) - ((double) (f14 / 2.0f)));
            f13 = (float) ((((double) f27) - (d12 * Math.cos(d13))) - ((double) (f15 / 2.0f)));
            f23 = 2.0f;
        } else {
            f11 = f14;
        }
        fArr[0] = f12 + (f11 / f23) + 0.0f;
        fArr[1] = f13 + (f15 / f23) + 0.0f;
        fArr2[0] = f24;
        fArr2[1] = f25;
    }

    /* access modifiers changed from: package-private */
    public int i(String str, double[] dArr, int i11) {
        ConstraintAttribute constraintAttribute = this.f8582o.get(str);
        int i12 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.h() == 1) {
            dArr[i11] = (double) constraintAttribute.e();
            return 1;
        }
        int h11 = constraintAttribute.h();
        float[] fArr = new float[h11];
        constraintAttribute.f(fArr);
        while (i12 < h11) {
            dArr[i11] = (double) fArr[i12];
            i12++;
            i11++;
        }
        return h11;
    }

    /* access modifiers changed from: package-private */
    public int j(String str) {
        ConstraintAttribute constraintAttribute = this.f8582o.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.h();
    }

    /* access modifiers changed from: package-private */
    public void k(int[] iArr, double[] dArr, float[] fArr, int i11) {
        float f11 = this.f8575e;
        float f12 = this.f8576f;
        float f13 = this.f8577g;
        float f14 = this.f8578h;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f15 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                f11 = f15;
            } else if (i13 == 2) {
                f12 = f15;
            } else if (i13 == 3) {
                f13 = f15;
            } else if (i13 == 4) {
                f14 = f15;
            }
        }
        m mVar = this.n;
        if (mVar != null) {
            float j11 = mVar.j();
            double d11 = (double) f11;
            double d12 = (double) f12;
            f12 = (float) ((((double) this.n.k()) - (d11 * Math.cos(d12))) - ((double) (f14 / 2.0f)));
            f11 = (float) ((((double) j11) + (Math.sin(d12) * d11)) - ((double) (f13 / 2.0f)));
        }
        float f16 = f13 + f11;
        float f17 = f14 + f12;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i14 = i11 + 1;
        fArr[i11] = f11 + 0.0f;
        int i15 = i14 + 1;
        fArr[i14] = f12 + 0.0f;
        int i16 = i15 + 1;
        fArr[i15] = f16 + 0.0f;
        int i17 = i16 + 1;
        fArr[i16] = f12 + 0.0f;
        int i18 = i17 + 1;
        fArr[i17] = f16 + 0.0f;
        int i19 = i18 + 1;
        fArr[i18] = f17 + 0.0f;
        fArr[i19] = f11 + 0.0f;
        fArr[i19 + 1] = f17 + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean l(String str) {
        return this.f8582o.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public void m(h hVar, p pVar, p pVar2) {
        h hVar2 = hVar;
        p pVar3 = pVar;
        p pVar4 = pVar2;
        float f11 = ((float) hVar2.f8456a) / 100.0f;
        this.f8573c = f11;
        this.f8572b = hVar2.j;
        float f12 = Float.isNaN(hVar2.k) ? f11 : hVar2.k;
        float f13 = Float.isNaN(hVar2.f8492l) ? f11 : hVar2.f8492l;
        float f14 = pVar4.f8577g;
        float f15 = pVar3.f8577g;
        float f16 = pVar4.f8578h;
        float f17 = pVar3.f8578h;
        this.f8574d = this.f8573c;
        float f18 = pVar3.f8575e;
        float f19 = pVar3.f8576f;
        float f21 = (pVar4.f8575e + (f14 / 2.0f)) - ((f15 / 2.0f) + f18);
        float f22 = (pVar4.f8576f + (f16 / 2.0f)) - (f19 + (f17 / 2.0f));
        float f23 = (f14 - f15) * f12;
        float f24 = f23 / 2.0f;
        this.f8575e = (float) ((int) ((f18 + (f21 * f11)) - f24));
        float f25 = (f16 - f17) * f13;
        float f26 = f25 / 2.0f;
        this.f8576f = (float) ((int) ((f19 + (f22 * f11)) - f26));
        this.f8577g = (float) ((int) (f15 + f23));
        this.f8578h = (float) ((int) (f17 + f25));
        h hVar3 = hVar;
        float f27 = Float.isNaN(hVar3.f8493m) ? f11 : hVar3.f8493m;
        float f28 = 0.0f;
        float f29 = Float.isNaN(hVar3.f8495p) ? 0.0f : hVar3.f8495p;
        if (!Float.isNaN(hVar3.n)) {
            f11 = hVar3.n;
        }
        if (!Float.isNaN(hVar3.f8494o)) {
            f28 = hVar3.f8494o;
        }
        this.f8583p = 0;
        p pVar5 = pVar;
        this.f8575e = (float) ((int) (((pVar5.f8575e + (f27 * f21)) + (f28 * f22)) - f24));
        this.f8576f = (float) ((int) (((pVar5.f8576f + (f21 * f29)) + (f22 * f11)) - f26));
        this.f8571a = i2.c.c(hVar3.f8490h);
        this.k = hVar3.f8491i;
    }

    /* access modifiers changed from: package-private */
    public void n(h hVar, p pVar, p pVar2) {
        h hVar2 = hVar;
        p pVar3 = pVar;
        p pVar4 = pVar2;
        float f11 = ((float) hVar2.f8456a) / 100.0f;
        this.f8573c = f11;
        this.f8572b = hVar2.j;
        float f12 = Float.isNaN(hVar2.k) ? f11 : hVar2.k;
        float f13 = Float.isNaN(hVar2.f8492l) ? f11 : hVar2.f8492l;
        float f14 = pVar4.f8577g - pVar3.f8577g;
        float f15 = pVar4.f8578h - pVar3.f8578h;
        this.f8574d = this.f8573c;
        if (!Float.isNaN(hVar2.f8493m)) {
            f11 = hVar2.f8493m;
        }
        float f16 = pVar3.f8575e;
        float f17 = pVar3.f8577g;
        float f18 = pVar3.f8576f;
        float f19 = pVar3.f8578h;
        float f21 = (pVar4.f8575e + (pVar4.f8577g / 2.0f)) - ((f17 / 2.0f) + f16);
        float f22 = (pVar4.f8576f + (pVar4.f8578h / 2.0f)) - ((f19 / 2.0f) + f18);
        float f23 = f21 * f11;
        float f24 = f14 * f12;
        float f25 = f24 / 2.0f;
        this.f8575e = (float) ((int) ((f16 + f23) - f25));
        float f26 = f11 * f22;
        float f27 = f15 * f13;
        float f28 = f27 / 2.0f;
        this.f8576f = (float) ((int) ((f18 + f26) - f28));
        this.f8577g = (float) ((int) (f17 + f24));
        this.f8578h = (float) ((int) (f19 + f27));
        h hVar3 = hVar;
        float f29 = Float.isNaN(hVar3.n) ? 0.0f : hVar3.n;
        float f31 = (-f22) * f29;
        float f32 = f21 * f29;
        this.f8583p = 1;
        p pVar5 = pVar;
        this.f8575e = ((float) ((int) ((pVar5.f8575e + f23) - f25))) + f31;
        this.f8576f = ((float) ((int) ((pVar5.f8576f + f26) - f28))) + f32;
        this.f8580l = this.f8580l;
        this.f8571a = i2.c.c(hVar3.f8490h);
        this.k = hVar3.f8491i;
    }

    /* access modifiers changed from: package-private */
    public void o(int i11, int i12, h hVar, p pVar, p pVar2) {
        float f11;
        float f12;
        float f13 = ((float) hVar.f8456a) / 100.0f;
        this.f8573c = f13;
        this.f8572b = hVar.j;
        this.f8583p = hVar.q;
        float f14 = Float.isNaN(hVar.k) ? f13 : hVar.k;
        float f15 = Float.isNaN(hVar.f8492l) ? f13 : hVar.f8492l;
        float f16 = pVar2.f8577g;
        float f17 = pVar.f8577g;
        float f18 = pVar2.f8578h;
        float f19 = pVar.f8578h;
        this.f8574d = this.f8573c;
        this.f8577g = (float) ((int) (f17 + ((f16 - f17) * f14)));
        this.f8578h = (float) ((int) (f19 + ((f18 - f19) * f15)));
        int i13 = hVar.q;
        if (i13 == 1) {
            float f21 = Float.isNaN(hVar.f8493m) ? f13 : hVar.f8493m;
            float f22 = pVar2.f8575e;
            float f23 = pVar.f8575e;
            this.f8575e = (f21 * (f22 - f23)) + f23;
            if (!Float.isNaN(hVar.n)) {
                f13 = hVar.n;
            }
            float f24 = pVar2.f8576f;
            float f25 = pVar.f8576f;
            this.f8576f = (f13 * (f24 - f25)) + f25;
        } else if (i13 != 2) {
            float f26 = Float.isNaN(hVar.f8493m) ? f13 : hVar.f8493m;
            float f27 = pVar2.f8575e;
            float f28 = pVar.f8575e;
            this.f8575e = (f26 * (f27 - f28)) + f28;
            if (!Float.isNaN(hVar.n)) {
                f13 = hVar.n;
            }
            float f29 = pVar2.f8576f;
            float f31 = pVar.f8576f;
            this.f8576f = (f13 * (f29 - f31)) + f31;
        } else {
            if (Float.isNaN(hVar.f8493m)) {
                float f32 = pVar2.f8575e;
                float f33 = pVar.f8575e;
                f11 = ((f32 - f33) * f13) + f33;
            } else {
                f11 = Math.min(f15, f14) * hVar.f8493m;
            }
            this.f8575e = f11;
            if (Float.isNaN(hVar.n)) {
                float f34 = pVar2.f8576f;
                float f35 = pVar.f8576f;
                f12 = (f13 * (f34 - f35)) + f35;
            } else {
                f12 = hVar.n;
            }
            this.f8576f = f12;
        }
        this.f8580l = pVar.f8580l;
        this.f8571a = i2.c.c(hVar.f8490h);
        this.k = hVar.f8491i;
    }

    /* access modifiers changed from: package-private */
    public void p(int i11, int i12, h hVar, p pVar, p pVar2) {
        h hVar2 = hVar;
        p pVar3 = pVar;
        p pVar4 = pVar2;
        float f11 = ((float) hVar2.f8456a) / 100.0f;
        this.f8573c = f11;
        this.f8572b = hVar2.j;
        float f12 = Float.isNaN(hVar2.k) ? f11 : hVar2.k;
        float f13 = Float.isNaN(hVar2.f8492l) ? f11 : hVar2.f8492l;
        float f14 = pVar4.f8577g;
        float f15 = pVar3.f8577g;
        float f16 = pVar4.f8578h;
        float f17 = pVar3.f8578h;
        this.f8574d = this.f8573c;
        float f18 = pVar3.f8575e;
        float f19 = pVar3.f8576f;
        float f21 = pVar4.f8575e + (f14 / 2.0f);
        float f22 = pVar4.f8576f + (f16 / 2.0f);
        float f23 = (f14 - f15) * f12;
        this.f8575e = (float) ((int) ((f18 + ((f21 - ((f15 / 2.0f) + f18)) * f11)) - (f23 / 2.0f)));
        float f24 = (f16 - f17) * f13;
        this.f8576f = (float) ((int) ((f19 + ((f22 - (f19 + (f17 / 2.0f))) * f11)) - (f24 / 2.0f)));
        this.f8577g = (float) ((int) (f15 + f23));
        this.f8578h = (float) ((int) (f17 + f24));
        this.f8583p = 2;
        h hVar3 = hVar;
        if (!Float.isNaN(hVar3.f8493m)) {
            this.f8575e = (float) ((int) (hVar3.f8493m * ((float) ((int) (((float) i11) - this.f8577g)))));
        }
        if (!Float.isNaN(hVar3.n)) {
            this.f8576f = (float) ((int) (hVar3.n * ((float) ((int) (((float) i12) - this.f8578h)))));
        }
        this.f8580l = this.f8580l;
        this.f8571a = i2.c.c(hVar3.f8490h);
        this.k = hVar3.f8491i;
    }

    /* access modifiers changed from: package-private */
    public void q(float f11, float f12, float f13, float f14) {
        this.f8575e = f11;
        this.f8576f = f12;
        this.f8577g = f13;
        this.f8578h = f14;
    }

    /* access modifiers changed from: package-private */
    public void r(float f11, float f12, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            float f17 = (float) dArr[i11];
            double d11 = dArr2[i11];
            int i12 = iArr2[i11];
            if (i12 == 1) {
                f13 = f17;
            } else if (i12 == 2) {
                f15 = f17;
            } else if (i12 == 3) {
                f14 = f17;
            } else if (i12 == 4) {
                f16 = f17;
            }
        }
        float f18 = f13 - ((0.0f * f14) / 2.0f);
        float f19 = f15 - ((0.0f * f16) / 2.0f);
        fArr[0] = (f18 * (1.0f - f11)) + (((f14 * 1.0f) + f18) * f11) + 0.0f;
        fArr[1] = (f19 * (1.0f - f12)) + (((f16 * 1.0f) + f19) * f12) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void s(float f11, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z11) {
        float f12;
        boolean z12;
        float f13;
        View view2 = view;
        int[] iArr2 = iArr;
        double[] dArr4 = dArr2;
        float f14 = this.f8575e;
        float f15 = this.f8576f;
        float f16 = this.f8577g;
        float f17 = this.f8578h;
        if (iArr2.length != 0 && this.f8584r.length <= iArr2[iArr2.length - 1]) {
            int i11 = iArr2[iArr2.length - 1] + 1;
            this.f8584r = new double[i11];
            this.f8585s = new double[i11];
        }
        Arrays.fill(this.f8584r, Double.NaN);
        for (int i12 = 0; i12 < iArr2.length; i12++) {
            this.f8584r[iArr2[i12]] = dArr[i12];
            this.f8585s[iArr2[i12]] = dArr4[i12];
        }
        float f18 = Float.NaN;
        int i13 = 0;
        float f19 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        float f23 = 0.0f;
        while (true) {
            double[] dArr5 = this.f8584r;
            if (i13 >= dArr5.length) {
                break;
            }
            double d11 = 0.0d;
            if (!Double.isNaN(dArr5[i13]) || !(dArr3 == null || dArr3[i13] == 0.0d)) {
                if (dArr3 != null) {
                    d11 = dArr3[i13];
                }
                if (!Double.isNaN(this.f8584r[i13])) {
                    d11 = this.f8584r[i13] + d11;
                }
                f13 = f18;
                float f24 = (float) d11;
                float f25 = (float) this.f8585s[i13];
                if (i13 == 1) {
                    f18 = f13;
                    f19 = f25;
                    f14 = f24;
                } else if (i13 == 2) {
                    f18 = f13;
                    f21 = f25;
                    f15 = f24;
                } else if (i13 == 3) {
                    f18 = f13;
                    f22 = f25;
                    f16 = f24;
                } else if (i13 == 4) {
                    f18 = f13;
                    f23 = f25;
                    f17 = f24;
                } else if (i13 == 5) {
                    f18 = f24;
                }
                i13++;
                double[] dArr6 = dArr2;
            } else {
                f13 = f18;
            }
            f18 = f13;
            i13++;
            double[] dArr62 = dArr2;
        }
        float f26 = f18;
        m mVar = this.n;
        if (mVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            mVar.i((double) f11, fArr, fArr2);
            float f27 = fArr[0];
            float f28 = fArr[1];
            float f29 = fArr2[0];
            float f31 = fArr2[1];
            double d12 = (double) f14;
            double d13 = (double) f15;
            double sin = ((double) f27) + (Math.sin(d13) * d12);
            f12 = f17;
            float f32 = (float) (sin - ((double) (f16 / 2.0f)));
            float cos = (float) ((((double) f28) - (Math.cos(d13) * d12)) - ((double) (f17 / 2.0f)));
            double d14 = (double) f19;
            double d15 = (double) f21;
            float sin2 = (float) (((double) f29) + (Math.sin(d13) * d14) + (Math.cos(d13) * d12 * d15));
            float f33 = f32;
            float cos2 = (float) ((((double) f31) - (d14 * Math.cos(d13))) + (d12 * Math.sin(d13) * d15));
            double[] dArr7 = dArr2;
            if (dArr7.length >= 2) {
                z12 = false;
                dArr7[0] = (double) sin2;
                dArr7[1] = (double) cos2;
            } else {
                z12 = false;
            }
            if (!Float.isNaN(f26)) {
                view2.setRotation((float) (((double) f26) + Math.toDegrees(Math.atan2((double) cos2, (double) sin2))));
            }
            f14 = f33;
            f15 = cos;
        } else {
            float f34 = f26;
            f12 = f17;
            z12 = false;
            if (!Float.isNaN(f34)) {
                view2.setRotation((float) (((double) 0.0f) + ((double) f34) + Math.toDegrees(Math.atan2((double) (f21 + (f23 / 2.0f)), (double) (f19 + (f22 / 2.0f))))));
            }
        }
        if (view2 instanceof c) {
            ((c) view2).a(f14, f15, f16 + f14, f15 + f12);
            return;
        }
        float f35 = f14 + 0.5f;
        int i14 = (int) f35;
        float f36 = f15 + 0.5f;
        int i15 = (int) f36;
        int i16 = (int) (f35 + f16);
        int i17 = (int) (f36 + f12);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (!(i18 == view.getMeasuredWidth() && i19 == view.getMeasuredHeight())) {
            z12 = true;
        }
        if (z12 || z11) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
        view2.layout(i14, i15, i16, i17);
    }

    public void t(m mVar, p pVar) {
        double d11 = (double) (((this.f8575e + (this.f8577g / 2.0f)) - pVar.f8575e) - (pVar.f8577g / 2.0f));
        double d12 = (double) (((this.f8576f + (this.f8578h / 2.0f)) - pVar.f8576f) - (pVar.f8578h / 2.0f));
        this.n = mVar;
        this.f8575e = (float) Math.hypot(d12, d11);
        if (Float.isNaN(this.f8581m)) {
            this.f8576f = (float) (Math.atan2(d12, d11) + 1.5707963267948966d);
        } else {
            this.f8576f = (float) Math.toRadians((double) this.f8581m);
        }
    }

    public p(int i11, int i12, h hVar, p pVar, p pVar2) {
        int i13 = d.f8455f;
        this.k = i13;
        this.f8580l = i13;
        this.f8581m = Float.NaN;
        this.n = null;
        this.f8582o = new LinkedHashMap<>();
        this.f8583p = 0;
        this.f8584r = new double[18];
        this.f8585s = new double[18];
        if (pVar.f8580l != d.f8455f) {
            o(i11, i12, hVar, pVar, pVar2);
            return;
        }
        int i14 = hVar.q;
        if (i14 == 1) {
            n(hVar, pVar, pVar2);
        } else if (i14 != 2) {
            m(hVar, pVar, pVar2);
        } else {
            p(i11, i12, hVar, pVar, pVar2);
        }
    }
}
