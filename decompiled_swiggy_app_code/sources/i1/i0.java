package i1;

import t0.l;
import t0.m;

/* compiled from: ScaleFactor.kt */
public final class i0 {
    public static final long a(float f11, float f12) {
        long floatToIntBits = (long) Float.floatToIntBits(f11);
        return h0.a((((long) Float.floatToIntBits(f12)) & 4294967295L) | (floatToIntBits << 32));
    }

    public static final long b(long j, long j11) {
        return m.a(l.i(j) * h0.b(j11), l.g(j) * h0.c(j11));
    }
}
