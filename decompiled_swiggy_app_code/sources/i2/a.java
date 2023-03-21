package i2;

import java.util.Arrays;

/* compiled from: ArcCurveFit */
public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private final double[] f14895a;

    /* renamed from: b  reason: collision with root package name */
    C0134a[] f14896b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14897c = true;

    /* renamed from: i2.a$a  reason: collision with other inner class name */
    /* compiled from: ArcCurveFit */
    private static class C0134a {

        /* renamed from: s  reason: collision with root package name */
        private static double[] f14898s = new double[91];

        /* renamed from: a  reason: collision with root package name */
        double[] f14899a;

        /* renamed from: b  reason: collision with root package name */
        double f14900b;

        /* renamed from: c  reason: collision with root package name */
        double f14901c;

        /* renamed from: d  reason: collision with root package name */
        double f14902d;

        /* renamed from: e  reason: collision with root package name */
        double f14903e;

        /* renamed from: f  reason: collision with root package name */
        double f14904f;

        /* renamed from: g  reason: collision with root package name */
        double f14905g;

        /* renamed from: h  reason: collision with root package name */
        double f14906h;

        /* renamed from: i  reason: collision with root package name */
        double f14907i;
        double j;
        double k;

        /* renamed from: l  reason: collision with root package name */
        double f14908l;

        /* renamed from: m  reason: collision with root package name */
        double f14909m;
        double n;

        /* renamed from: o  reason: collision with root package name */
        double f14910o;

        /* renamed from: p  reason: collision with root package name */
        double f14911p;
        boolean q;

        /* renamed from: r  reason: collision with root package name */
        boolean f14912r = false;

        C0134a(int i11, double d11, double d12, double d13, double d14, double d15, double d16) {
            int i12 = i11;
            double d17 = d11;
            double d18 = d12;
            double d19 = d13;
            double d21 = d14;
            double d22 = d15;
            double d23 = d16;
            boolean z11 = false;
            int i13 = 1;
            this.q = i12 == 1 ? true : z11;
            this.f14901c = d17;
            this.f14902d = d18;
            this.f14907i = 1.0d / (d18 - d17);
            if (3 == i12) {
                this.f14912r = true;
            }
            double d24 = d22 - d19;
            double d25 = d23 - d21;
            if (this.f14912r || Math.abs(d24) < 0.001d || Math.abs(d25) < 0.001d) {
                this.f14912r = true;
                this.f14903e = d19;
                this.f14904f = d22;
                this.f14905g = d21;
                this.f14906h = d16;
                double hypot = Math.hypot(d25, d24);
                this.f14900b = hypot;
                this.n = hypot * this.f14907i;
                double d26 = this.f14902d;
                double d27 = this.f14901c;
                this.f14908l = d24 / (d26 - d27);
                this.f14909m = d25 / (d26 - d27);
                return;
            }
            this.f14899a = new double[101];
            boolean z12 = this.q;
            this.j = d24 * ((double) (z12 ? -1 : 1));
            this.k = d25 * ((double) (!z12 ? -1 : i13));
            this.f14908l = z12 ? d22 : d19;
            this.f14909m = z12 ? d21 : d16;
            a(d13, d14, d15, d16);
            this.n = this.f14900b * this.f14907i;
        }

        private void a(double d11, double d12, double d13, double d14) {
            double d15;
            double d16 = d13 - d11;
            double d17 = d12 - d14;
            int i11 = 0;
            double d18 = 0.0d;
            double d19 = 0.0d;
            double d21 = 0.0d;
            while (true) {
                double[] dArr = f14898s;
                if (i11 >= dArr.length) {
                    break;
                }
                double d22 = d18;
                double radians = Math.toRadians((((double) i11) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d16;
                double cos = Math.cos(radians) * d17;
                if (i11 > 0) {
                    d15 = Math.hypot(sin - d19, cos - d21) + d22;
                    f14898s[i11] = d15;
                } else {
                    d15 = d22;
                }
                i11++;
                d21 = cos;
                double d23 = sin;
                d18 = d15;
                d19 = d23;
            }
            double d24 = d18;
            this.f14900b = d24;
            int i12 = 0;
            while (true) {
                double[] dArr2 = f14898s;
                if (i12 >= dArr2.length) {
                    break;
                }
                dArr2[i12] = dArr2[i12] / d24;
                i12++;
            }
            int i13 = 0;
            while (true) {
                double[] dArr3 = this.f14899a;
                if (i13 < dArr3.length) {
                    double length = ((double) i13) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(f14898s, length);
                    if (binarySearch >= 0) {
                        this.f14899a[i13] = ((double) binarySearch) / ((double) (f14898s.length - 1));
                    } else if (binarySearch == -1) {
                        this.f14899a[i13] = 0.0d;
                    } else {
                        int i14 = -binarySearch;
                        int i15 = i14 - 2;
                        double[] dArr4 = f14898s;
                        this.f14899a[i13] = (((double) i15) + ((length - dArr4[i15]) / (dArr4[i14 - 1] - dArr4[i15]))) / ((double) (dArr4.length - 1));
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public double b() {
            double d11 = this.j * this.f14911p;
            double hypot = this.n / Math.hypot(d11, (-this.k) * this.f14910o);
            if (this.q) {
                d11 = -d11;
            }
            return d11 * hypot;
        }

        /* access modifiers changed from: package-private */
        public double c() {
            double d11 = this.j * this.f14911p;
            double d12 = (-this.k) * this.f14910o;
            double hypot = this.n / Math.hypot(d11, d12);
            return this.q ? (-d12) * hypot : d12 * hypot;
        }

        public double d(double d11) {
            return this.f14908l;
        }

        public double e(double d11) {
            return this.f14909m;
        }

        public double f(double d11) {
            double d12 = (d11 - this.f14901c) * this.f14907i;
            double d13 = this.f14903e;
            return d13 + (d12 * (this.f14904f - d13));
        }

        public double g(double d11) {
            double d12 = (d11 - this.f14901c) * this.f14907i;
            double d13 = this.f14905g;
            return d13 + (d12 * (this.f14906h - d13));
        }

        /* access modifiers changed from: package-private */
        public double h() {
            return this.f14908l + (this.j * this.f14910o);
        }

        /* access modifiers changed from: package-private */
        public double i() {
            return this.f14909m + (this.k * this.f14911p);
        }

        /* access modifiers changed from: package-private */
        public double j(double d11) {
            if (d11 <= 0.0d) {
                return 0.0d;
            }
            if (d11 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f14899a;
            double length = d11 * ((double) (dArr.length - 1));
            int i11 = (int) length;
            return dArr[i11] + ((length - ((double) i11)) * (dArr[i11 + 1] - dArr[i11]));
        }

        /* access modifiers changed from: package-private */
        public void k(double d11) {
            double j11 = j((this.q ? this.f14902d - d11 : d11 - this.f14901c) * this.f14907i) * 1.5707963267948966d;
            this.f14910o = Math.sin(j11);
            this.f14911p = Math.cos(j11);
        }
    }

    public a(int[] iArr, double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        this.f14895a = dArr3;
        this.f14896b = new C0134a[(dArr3.length - 1)];
        int i11 = 0;
        int i12 = 1;
        int i13 = 1;
        while (true) {
            C0134a[] aVarArr = this.f14896b;
            if (i11 < aVarArr.length) {
                int i14 = iArr[i11];
                if (i14 == 0) {
                    i13 = 3;
                } else if (i14 == 1) {
                    i12 = 1;
                    i13 = 1;
                } else if (i14 == 2) {
                    i12 = 2;
                    i13 = 2;
                } else if (i14 == 3) {
                    i12 = i12 == 1 ? 2 : 1;
                    i13 = i12;
                }
                int i15 = i11 + 1;
                aVarArr[i11] = new C0134a(i13, dArr3[i11], dArr3[i15], dArr2[i11][0], dArr2[i11][1], dArr2[i15][0], dArr2[i15][1]);
                i11 = i15;
            } else {
                return;
            }
        }
    }

    public double c(double d11, int i11) {
        double d12;
        double g11;
        double e11;
        double i12;
        double c11;
        int i13 = 0;
        if (this.f14897c) {
            C0134a[] aVarArr = this.f14896b;
            if (d11 < aVarArr[0].f14901c) {
                double d13 = aVarArr[0].f14901c;
                d12 = d11 - aVarArr[0].f14901c;
                if (!aVarArr[0].f14912r) {
                    aVarArr[0].k(d13);
                    if (i11 == 0) {
                        i12 = this.f14896b[0].h();
                        c11 = this.f14896b[0].b();
                    } else {
                        i12 = this.f14896b[0].i();
                        c11 = this.f14896b[0].c();
                    }
                    return i12 + (d12 * c11);
                } else if (i11 == 0) {
                    g11 = aVarArr[0].f(d13);
                    e11 = this.f14896b[0].d(d13);
                } else {
                    g11 = aVarArr[0].g(d13);
                    e11 = this.f14896b[0].e(d13);
                }
            } else if (d11 > aVarArr[aVarArr.length - 1].f14902d) {
                double d14 = aVarArr[aVarArr.length - 1].f14902d;
                d12 = d11 - d14;
                int length = aVarArr.length - 1;
                if (i11 == 0) {
                    g11 = aVarArr[length].f(d14);
                    e11 = this.f14896b[length].d(d14);
                } else {
                    g11 = aVarArr[length].g(d14);
                    e11 = this.f14896b[length].e(d14);
                }
            }
            return g11 + (d12 * e11);
        }
        C0134a[] aVarArr2 = this.f14896b;
        if (d11 < aVarArr2[0].f14901c) {
            d11 = aVarArr2[0].f14901c;
        } else if (d11 > aVarArr2[aVarArr2.length - 1].f14902d) {
            d11 = aVarArr2[aVarArr2.length - 1].f14902d;
        }
        while (true) {
            C0134a[] aVarArr3 = this.f14896b;
            if (i13 >= aVarArr3.length) {
                return Double.NaN;
            }
            if (d11 > aVarArr3[i13].f14902d) {
                i13++;
            } else if (!aVarArr3[i13].f14912r) {
                aVarArr3[i13].k(d11);
                if (i11 == 0) {
                    return this.f14896b[i13].h();
                }
                return this.f14896b[i13].i();
            } else if (i11 == 0) {
                return aVarArr3[i13].f(d11);
            } else {
                return aVarArr3[i13].g(d11);
            }
        }
    }

    public void d(double d11, double[] dArr) {
        if (this.f14897c) {
            C0134a[] aVarArr = this.f14896b;
            if (d11 < aVarArr[0].f14901c) {
                double d12 = aVarArr[0].f14901c;
                double d13 = d11 - aVarArr[0].f14901c;
                if (aVarArr[0].f14912r) {
                    dArr[0] = aVarArr[0].f(d12) + (this.f14896b[0].d(d12) * d13);
                    dArr[1] = this.f14896b[0].g(d12) + (d13 * this.f14896b[0].e(d12));
                    return;
                }
                aVarArr[0].k(d12);
                dArr[0] = this.f14896b[0].h() + (this.f14896b[0].b() * d13);
                dArr[1] = this.f14896b[0].i() + (d13 * this.f14896b[0].c());
                return;
            } else if (d11 > aVarArr[aVarArr.length - 1].f14902d) {
                double d14 = aVarArr[aVarArr.length - 1].f14902d;
                double d15 = d11 - d14;
                int length = aVarArr.length - 1;
                if (aVarArr[length].f14912r) {
                    dArr[0] = aVarArr[length].f(d14) + (this.f14896b[length].d(d14) * d15);
                    dArr[1] = this.f14896b[length].g(d14) + (d15 * this.f14896b[length].e(d14));
                    return;
                }
                aVarArr[length].k(d11);
                dArr[0] = this.f14896b[length].h() + (this.f14896b[length].b() * d15);
                dArr[1] = this.f14896b[length].i() + (d15 * this.f14896b[length].c());
                return;
            }
        } else {
            C0134a[] aVarArr2 = this.f14896b;
            if (d11 < aVarArr2[0].f14901c) {
                d11 = aVarArr2[0].f14901c;
            }
            if (d11 > aVarArr2[aVarArr2.length - 1].f14902d) {
                d11 = aVarArr2[aVarArr2.length - 1].f14902d;
            }
        }
        int i11 = 0;
        while (true) {
            C0134a[] aVarArr3 = this.f14896b;
            if (i11 >= aVarArr3.length) {
                return;
            }
            if (d11 > aVarArr3[i11].f14902d) {
                i11++;
            } else if (aVarArr3[i11].f14912r) {
                dArr[0] = aVarArr3[i11].f(d11);
                dArr[1] = this.f14896b[i11].g(d11);
                return;
            } else {
                aVarArr3[i11].k(d11);
                dArr[0] = this.f14896b[i11].h();
                dArr[1] = this.f14896b[i11].i();
                return;
            }
        }
    }

    public void e(double d11, float[] fArr) {
        if (this.f14897c) {
            C0134a[] aVarArr = this.f14896b;
            if (d11 < aVarArr[0].f14901c) {
                double d12 = aVarArr[0].f14901c;
                double d13 = d11 - aVarArr[0].f14901c;
                if (aVarArr[0].f14912r) {
                    fArr[0] = (float) (aVarArr[0].f(d12) + (this.f14896b[0].d(d12) * d13));
                    fArr[1] = (float) (this.f14896b[0].g(d12) + (d13 * this.f14896b[0].e(d12)));
                    return;
                }
                aVarArr[0].k(d12);
                fArr[0] = (float) (this.f14896b[0].h() + (this.f14896b[0].b() * d13));
                fArr[1] = (float) (this.f14896b[0].i() + (d13 * this.f14896b[0].c()));
                return;
            } else if (d11 > aVarArr[aVarArr.length - 1].f14902d) {
                double d14 = aVarArr[aVarArr.length - 1].f14902d;
                double d15 = d11 - d14;
                int length = aVarArr.length - 1;
                if (aVarArr[length].f14912r) {
                    fArr[0] = (float) (aVarArr[length].f(d14) + (this.f14896b[length].d(d14) * d15));
                    fArr[1] = (float) (this.f14896b[length].g(d14) + (d15 * this.f14896b[length].e(d14)));
                    return;
                }
                aVarArr[length].k(d11);
                fArr[0] = (float) this.f14896b[length].h();
                fArr[1] = (float) this.f14896b[length].i();
                return;
            }
        } else {
            C0134a[] aVarArr2 = this.f14896b;
            if (d11 < aVarArr2[0].f14901c) {
                d11 = aVarArr2[0].f14901c;
            } else if (d11 > aVarArr2[aVarArr2.length - 1].f14902d) {
                d11 = aVarArr2[aVarArr2.length - 1].f14902d;
            }
        }
        int i11 = 0;
        while (true) {
            C0134a[] aVarArr3 = this.f14896b;
            if (i11 >= aVarArr3.length) {
                return;
            }
            if (d11 > aVarArr3[i11].f14902d) {
                i11++;
            } else if (aVarArr3[i11].f14912r) {
                fArr[0] = (float) aVarArr3[i11].f(d11);
                fArr[1] = (float) this.f14896b[i11].g(d11);
                return;
            } else {
                aVarArr3[i11].k(d11);
                fArr[0] = (float) this.f14896b[i11].h();
                fArr[1] = (float) this.f14896b[i11].i();
                return;
            }
        }
    }

    public void f(double d11, double[] dArr) {
        C0134a[] aVarArr = this.f14896b;
        if (d11 < aVarArr[0].f14901c) {
            d11 = aVarArr[0].f14901c;
        } else if (d11 > aVarArr[aVarArr.length - 1].f14902d) {
            d11 = aVarArr[aVarArr.length - 1].f14902d;
        }
        int i11 = 0;
        while (true) {
            C0134a[] aVarArr2 = this.f14896b;
            if (i11 >= aVarArr2.length) {
                return;
            }
            if (d11 > aVarArr2[i11].f14902d) {
                i11++;
            } else if (aVarArr2[i11].f14912r) {
                dArr[0] = aVarArr2[i11].d(d11);
                dArr[1] = this.f14896b[i11].e(d11);
                return;
            } else {
                aVarArr2[i11].k(d11);
                dArr[0] = this.f14896b[i11].b();
                dArr[1] = this.f14896b[i11].c();
                return;
            }
        }
    }

    public double[] g() {
        return this.f14895a;
    }
}
