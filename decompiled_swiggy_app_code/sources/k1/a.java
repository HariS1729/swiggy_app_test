package k1;

import kotlin.jvm.internal.k;

/* compiled from: HitTestResult.kt */
final class a {
    public static final int a(long j, long j11) {
        boolean d11 = d(j);
        if (d11 != d(j11)) {
            return d11 ? -1 : 1;
        }
        return (int) Math.signum(c(j) - c(j11));
    }

    public static long b(long j) {
        return j;
    }

    public static final float c(long j) {
        k kVar = k.f25688a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean d(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }
}
