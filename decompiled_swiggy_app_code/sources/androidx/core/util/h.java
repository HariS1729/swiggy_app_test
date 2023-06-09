package androidx.core.util;

import com.newrelic.agent.android.util.SafeJsonPrimitive;
import java.io.PrintWriter;

/* compiled from: TimeUtils */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f9419a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static char[] f9420b = new char[24];

    private static int a(int i11, int i12, boolean z11, int i13) {
        if (i11 > 99 || (z11 && i13 >= 3)) {
            return i12 + 3;
        }
        if (i11 > 9 || (z11 && i13 >= 2)) {
            return i12 + 2;
        }
        if (z11 || i11 > 0) {
            return i12 + 1;
        }
        return 0;
    }

    public static void b(long j, long j11, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            d(j - j11, printWriter, 0);
        }
    }

    public static void c(long j, PrintWriter printWriter) {
        d(j, printWriter, 0);
    }

    public static void d(long j, PrintWriter printWriter, int i11) {
        synchronized (f9419a) {
            printWriter.print(new String(f9420b, 0, e(j, i11)));
        }
    }

    private static int e(long j, int i11) {
        char c11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j11 = j;
        int i17 = i11;
        if (f9420b.length < i17) {
            f9420b = new char[i17];
        }
        char[] cArr = f9420b;
        int i18 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
        if (i18 == 0) {
            int i19 = i17 - 1;
            while (i19 > 0) {
                cArr[0] = SafeJsonPrimitive.NULL_CHAR;
            }
            cArr[0] = '0';
            return 1;
        }
        if (i18 > 0) {
            c11 = '+';
        } else {
            c11 = '-';
            j11 = -j11;
        }
        int i21 = (int) (j11 % 1000);
        int floor = (int) Math.floor((double) (j11 / 1000));
        if (floor > 86400) {
            i12 = floor / 86400;
            floor -= 86400 * i12;
        } else {
            i12 = 0;
        }
        if (floor > 3600) {
            i13 = floor / 3600;
            floor -= i13 * 3600;
        } else {
            i13 = 0;
        }
        if (floor > 60) {
            int i22 = floor / 60;
            i14 = floor - (i22 * 60);
            i15 = i22;
        } else {
            i14 = floor;
            i15 = 0;
        }
        if (i17 != 0) {
            int a11 = a(i12, 1, false, 0);
            int a12 = a11 + a(i13, 1, a11 > 0, 2);
            int a13 = a12 + a(i15, 1, a12 > 0, 2);
            int a14 = a13 + a(i14, 1, a13 > 0, 2);
            i16 = 0;
            for (int a15 = a14 + a(i21, 2, true, a14 > 0 ? 3 : 0) + 1; a15 < i17; a15++) {
                cArr[i16] = SafeJsonPrimitive.NULL_CHAR;
                i16++;
            }
        } else {
            i16 = 0;
        }
        cArr[i16] = c11;
        int i23 = i16 + 1;
        boolean z11 = i17 != 0;
        int i24 = i23;
        int f11 = f(cArr, i12, 'd', i23, false, 0);
        int f12 = f(cArr, i13, 'h', f11, f11 != i24, z11 ? 2 : 0);
        int f13 = f(cArr, i15, 'm', f12, f12 != i24, z11 ? 2 : 0);
        int f14 = f(cArr, i14, 's', f13, f13 != i24, z11 ? 2 : 0);
        int f15 = f(cArr, i21, 'm', f14, true, (!z11 || f14 == i24) ? 0 : 3);
        cArr[f15] = 's';
        return f15 + 1;
    }

    private static int f(char[] cArr, int i11, char c11, int i12, boolean z11, int i13) {
        int i14;
        if (!z11 && i11 <= 0) {
            return i12;
        }
        if ((!z11 || i13 < 3) && i11 <= 99) {
            i14 = i12;
        } else {
            int i15 = i11 / 100;
            cArr[i12] = (char) (i15 + 48);
            i14 = i12 + 1;
            i11 -= i15 * 100;
        }
        if ((z11 && i13 >= 2) || i11 > 9 || i12 != i14) {
            int i16 = i11 / 10;
            cArr[i14] = (char) (i16 + 48);
            i14++;
            i11 -= i16 * 10;
        }
        cArr[i14] = (char) (i11 + 48);
        int i17 = i14 + 1;
        cArr[i17] = c11;
        return i17 + 1;
    }
}
