package i2;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* compiled from: TimeCycleSplineSet */
public abstract class o {
    protected static float k = 6.2831855f;

    /* renamed from: a  reason: collision with root package name */
    protected b f14998a;

    /* renamed from: b  reason: collision with root package name */
    protected int f14999b = 0;

    /* renamed from: c  reason: collision with root package name */
    protected int[] f15000c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    protected float[][] f15001d = ((float[][]) Array.newInstance(float.class, new int[]{10, 3}));

    /* renamed from: e  reason: collision with root package name */
    protected int f15002e;

    /* renamed from: f  reason: collision with root package name */
    protected String f15003f;

    /* renamed from: g  reason: collision with root package name */
    protected float[] f15004g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    protected boolean f15005h = false;

    /* renamed from: i  reason: collision with root package name */
    protected long f15006i;
    protected float j = Float.NaN;

    /* compiled from: TimeCycleSplineSet */
    protected static class a {
        static void a(int[] iArr, float[][] fArr, int i11, int i12) {
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

        private static int b(int[] iArr, float[][] fArr, int i11, int i12) {
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

        private static void c(int[] iArr, float[][] fArr, int i11, int i12) {
            int i13 = iArr[i11];
            iArr[i11] = iArr[i12];
            iArr[i12] = i13;
            float[] fArr2 = fArr[i11];
            fArr[i11] = fArr[i12];
            fArr[i12] = fArr2;
        }
    }

    /* access modifiers changed from: protected */
    public float a(float f11) {
        float abs;
        switch (this.f14999b) {
            case 1:
                return Math.signum(f11 * k);
            case 2:
                abs = Math.abs(f11);
                break;
            case 3:
                return (((f11 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f11 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f11 * k));
            case 6:
                float abs2 = 1.0f - Math.abs(((f11 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f11 * k));
        }
        return 1.0f - abs;
    }

    public void b(int i11, float f11, float f12, int i12, float f13) {
        int[] iArr = this.f15000c;
        int i13 = this.f15002e;
        iArr[i13] = i11;
        float[][] fArr = this.f15001d;
        fArr[i13][0] = f11;
        fArr[i13][1] = f12;
        fArr[i13][2] = f13;
        this.f14999b = Math.max(this.f14999b, i12);
        this.f15002e++;
    }

    /* access modifiers changed from: protected */
    public void c(long j11) {
        this.f15006i = j11;
    }

    public void d(String str) {
        this.f15003f = str;
    }

    public void e(int i11) {
        int i12 = this.f15002e;
        if (i12 == 0) {
            PrintStream printStream = System.err;
            printStream.println("Error no points added to " + this.f15003f);
            return;
        }
        a.a(this.f15000c, this.f15001d, 0, i12 - 1);
        int i13 = 1;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f15000c;
            if (i13 >= iArr.length) {
                break;
            }
            if (iArr[i13] != iArr[i13 - 1]) {
                i14++;
            }
            i13++;
        }
        if (i14 == 0) {
            i14 = 1;
        }
        double[] dArr = new double[i14];
        int[] iArr2 = new int[2];
        iArr2[1] = 3;
        iArr2[0] = i14;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
        int i15 = 0;
        for (int i16 = 0; i16 < this.f15002e; i16++) {
            if (i16 > 0) {
                int[] iArr3 = this.f15000c;
                if (iArr3[i16] == iArr3[i16 - 1]) {
                }
            }
            dArr[i15] = ((double) this.f15000c[i16]) * 0.01d;
            double[] dArr3 = dArr2[i15];
            float[][] fArr = this.f15001d;
            dArr3[0] = (double) fArr[i16][0];
            dArr2[i15][1] = (double) fArr[i16][1];
            dArr2[i15][2] = (double) fArr[i16][2];
            i15++;
        }
        this.f14998a = b.a(i11, dArr, dArr2);
    }

    public String toString() {
        String str = this.f15003f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.f15002e; i11++) {
            str = str + "[" + this.f15000c[i11] + " , " + decimalFormat.format(this.f15001d[i11]) + "] ";
        }
        return str;
    }
}
