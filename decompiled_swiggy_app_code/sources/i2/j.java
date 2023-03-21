package i2;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: SplineSet */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    protected b f14971a;

    /* renamed from: b  reason: collision with root package name */
    protected int[] f14972b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    protected float[] f14973c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    private int f14974d;

    /* renamed from: e  reason: collision with root package name */
    private String f14975e;

    /* compiled from: SplineSet */
    private static class a {
        static void a(int[] iArr, float[] fArr, int i11, int i12) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i12;
            iArr2[1] = i11;
            int i13 = 2;
            while (i13 > 0) {
                int i14 = i13 - 1;
                int i15 = iArr2[i14];
                i13 = i14 - 1;
                int i16 = iArr2[i13];
                if (i15 < i16) {
                    int b11 = b(iArr, fArr, i15, i16);
                    int i17 = i13 + 1;
                    iArr2[i13] = b11 - 1;
                    int i18 = i17 + 1;
                    iArr2[i17] = i15;
                    int i19 = i18 + 1;
                    iArr2[i18] = i16;
                    i13 = i19 + 1;
                    iArr2[i19] = b11 + 1;
                }
            }
        }

        private static int b(int[] iArr, float[] fArr, int i11, int i12) {
            int i13 = iArr[i12];
            int i14 = i11;
            while (i11 < i12) {
                if (iArr[i11] <= i13) {
                    c(iArr, fArr, i14, i11);
                    i14++;
                }
                i11++;
            }
            c(iArr, fArr, i14, i12);
            return i14;
        }

        private static void c(int[] iArr, float[] fArr, int i11, int i12) {
            int i13 = iArr[i11];
            iArr[i11] = iArr[i12];
            iArr[i12] = i13;
            float f11 = fArr[i11];
            fArr[i11] = fArr[i12];
            fArr[i12] = f11;
        }
    }

    public float a(float f11) {
        return (float) this.f14971a.c((double) f11, 0);
    }

    public void b(int i11, float f11) {
        int[] iArr = this.f14972b;
        if (iArr.length < this.f14974d + 1) {
            this.f14972b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f14973c;
            this.f14973c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f14972b;
        int i12 = this.f14974d;
        iArr2[i12] = i11;
        this.f14973c[i12] = f11;
        this.f14974d = i12 + 1;
    }

    public void c(String str) {
        this.f14975e = str;
    }

    public void d(int i11) {
        int i12 = this.f14974d;
        if (i12 != 0) {
            a.a(this.f14972b, this.f14973c, 0, i12 - 1);
            int i13 = 1;
            for (int i14 = 1; i14 < this.f14974d; i14++) {
                int[] iArr = this.f14972b;
                if (iArr[i14 - 1] != iArr[i14]) {
                    i13++;
                }
            }
            double[] dArr = new double[i13];
            int[] iArr2 = new int[2];
            iArr2[1] = 1;
            iArr2[0] = i13;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
            int i15 = 0;
            for (int i16 = 0; i16 < this.f14974d; i16++) {
                if (i16 > 0) {
                    int[] iArr3 = this.f14972b;
                    if (iArr3[i16] == iArr3[i16 - 1]) {
                    }
                }
                dArr[i15] = ((double) this.f14972b[i16]) * 0.01d;
                dArr2[i15][0] = (double) this.f14973c[i16];
                i15++;
            }
            this.f14971a = b.a(i11, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.f14975e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.f14974d; i11++) {
            str = str + "[" + this.f14972b[i11] + " , " + decimalFormat.format((double) this.f14973c[i11]) + "] ";
        }
        return str;
    }
}
