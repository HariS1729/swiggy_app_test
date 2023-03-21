package i2;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: StepCurve */
public class l extends c {

    /* renamed from: d  reason: collision with root package name */
    g f14985d;

    l(String str) {
        this.f14917a = str;
        double[] dArr = new double[(str.length() / 2)];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i11 = 0;
        while (indexOf2 != -1) {
            dArr[i11] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i11++;
        }
        dArr[i11] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.f14985d = d(Arrays.copyOf(dArr, i11 + 1));
    }

    private static g d(double[] dArr) {
        double[] dArr2 = dArr;
        int length = (dArr2.length * 3) - 2;
        int length2 = dArr2.length - 1;
        double d11 = 1.0d / ((double) length2);
        int[] iArr = new int[2];
        iArr[1] = 1;
        iArr[0] = length;
        double[][] dArr3 = (double[][]) Array.newInstance(double.class, iArr);
        double[] dArr4 = new double[length];
        for (int i11 = 0; i11 < dArr2.length; i11++) {
            double d12 = dArr2[i11];
            int i12 = i11 + length2;
            dArr3[i12][0] = d12;
            double d13 = ((double) i11) * d11;
            dArr4[i12] = d13;
            if (i11 > 0) {
                int i13 = (length2 * 2) + i11;
                dArr3[i13][0] = d12 + 1.0d;
                dArr4[i13] = d13 + 1.0d;
                int i14 = i11 - 1;
                dArr3[i14][0] = (d12 - 1.0d) - d11;
                dArr4[i14] = (d13 - 4.0d) - d11;
            }
        }
        g gVar = new g(dArr4, dArr3);
        System.out.println(" 0 " + gVar.c(0.0d, 0));
        System.out.println(" 1 " + gVar.c(1.0d, 0));
        return gVar;
    }

    public double a(double d11) {
        return this.f14985d.c(d11, 0);
    }

    public double b(double d11) {
        return this.f14985d.k(d11, 0);
    }
}
