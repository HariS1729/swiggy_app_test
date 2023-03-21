package i2;

import java.util.Arrays;

/* compiled from: Oscillator */
public class h {

    /* renamed from: a  reason: collision with root package name */
    float[] f14961a = new float[0];

    /* renamed from: b  reason: collision with root package name */
    double[] f14962b = new double[0];

    /* renamed from: c  reason: collision with root package name */
    double[] f14963c;

    /* renamed from: d  reason: collision with root package name */
    String f14964d;

    /* renamed from: e  reason: collision with root package name */
    g f14965e;

    /* renamed from: f  reason: collision with root package name */
    int f14966f;

    /* renamed from: g  reason: collision with root package name */
    double f14967g = 6.283185307179586d;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14968h = false;

    public void a(double d11, float f11) {
        int length = this.f14961a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f14962b, d11);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f14962b = Arrays.copyOf(this.f14962b, length);
        this.f14961a = Arrays.copyOf(this.f14961a, length);
        this.f14963c = new double[length];
        double[] dArr = this.f14962b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f14962b[binarySearch] = d11;
        this.f14961a[binarySearch] = f11;
        this.f14968h = false;
    }

    /* access modifiers changed from: package-private */
    public double b(double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        } else if (d11 > 1.0d) {
            d11 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f14962b, d11);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i11 = (-binarySearch) - 1;
        float[] fArr = this.f14961a;
        int i12 = i11 - 1;
        double d12 = (double) (fArr[i11] - fArr[i12]);
        double[] dArr = this.f14962b;
        double d13 = d12 / (dArr[i11] - dArr[i12]);
        return this.f14963c[i12] + ((((double) fArr[i12]) - (dArr[i12] * d13)) * (d11 - dArr[i12])) + ((d13 * ((d11 * d11) - (dArr[i12] * dArr[i12]))) / 2.0d);
    }

    public double c(double d11, double d12) {
        double abs;
        double b11 = b(d11) + d12;
        switch (this.f14966f) {
            case 1:
                return Math.signum(0.5d - (b11 % 1.0d));
            case 2:
                abs = Math.abs((((b11 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((b11 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((b11 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f14967g * (d12 + b11));
            case 6:
                double abs2 = 1.0d - Math.abs(((b11 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f14965e.c(b11 % 1.0d, 0);
            default:
                return Math.sin(this.f14967g * b11);
        }
        return 1.0d - abs;
    }

    public void d() {
        double d11 = 0.0d;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f14961a;
            if (i11 >= fArr.length) {
                break;
            }
            d11 += (double) fArr[i11];
            i11++;
        }
        double d12 = 0.0d;
        int i12 = 1;
        while (true) {
            float[] fArr2 = this.f14961a;
            if (i12 >= fArr2.length) {
                break;
            }
            int i13 = i12 - 1;
            double[] dArr = this.f14962b;
            d12 += (dArr[i12] - dArr[i13]) * ((double) ((fArr2[i13] + fArr2[i12]) / 2.0f));
            i12++;
        }
        int i14 = 0;
        while (true) {
            float[] fArr3 = this.f14961a;
            if (i14 >= fArr3.length) {
                break;
            }
            fArr3[i14] = (float) (((double) fArr3[i14]) * (d11 / d12));
            i14++;
        }
        this.f14963c[0] = 0.0d;
        int i15 = 1;
        while (true) {
            float[] fArr4 = this.f14961a;
            if (i15 < fArr4.length) {
                int i16 = i15 - 1;
                double[] dArr2 = this.f14962b;
                double d13 = dArr2[i15] - dArr2[i16];
                double[] dArr3 = this.f14963c;
                dArr3[i15] = dArr3[i16] + (d13 * ((double) ((fArr4[i16] + fArr4[i15]) / 2.0f)));
                i15++;
            } else {
                this.f14968h = true;
                return;
            }
        }
    }

    public void e(int i11, String str) {
        this.f14966f = i11;
        this.f14964d = str;
        if (str != null) {
            this.f14965e = g.h(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f14962b) + " period=" + Arrays.toString(this.f14961a);
    }
}
