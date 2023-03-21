package i2;

/* compiled from: CurveFit */
public abstract class b {

    /* compiled from: CurveFit */
    static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        double f14913a;

        /* renamed from: b  reason: collision with root package name */
        double[] f14914b;

        a(double d11, double[] dArr) {
            this.f14913a = d11;
            this.f14914b = dArr;
        }

        public double c(double d11, int i11) {
            return this.f14914b[i11];
        }

        public void d(double d11, double[] dArr) {
            double[] dArr2 = this.f14914b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        public void e(double d11, float[] fArr) {
            int i11 = 0;
            while (true) {
                double[] dArr = this.f14914b;
                if (i11 < dArr.length) {
                    fArr[i11] = (float) dArr[i11];
                    i11++;
                } else {
                    return;
                }
            }
        }

        public void f(double d11, double[] dArr) {
            for (int i11 = 0; i11 < this.f14914b.length; i11++) {
                dArr[i11] = 0.0d;
            }
        }

        public double[] g() {
            return new double[]{this.f14913a};
        }
    }

    public static b a(int i11, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i11 = 2;
        }
        if (i11 == 0) {
            return new g(dArr, dArr2);
        }
        if (i11 != 2) {
            return new f(dArr, dArr2);
        }
        return new a(dArr[0], dArr2[0]);
    }

    public static b b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new a(iArr, dArr, dArr2);
    }

    public abstract double c(double d11, int i11);

    public abstract void d(double d11, double[] dArr);

    public abstract void e(double d11, float[] fArr);

    public abstract void f(double d11, double[] dArr);

    public abstract double[] g();
}
