package t0;

import e2.a;

/* compiled from: Offset.kt */
public final class g {
    public static final long a(float f11, float f12) {
        long floatToIntBits = (long) Float.floatToIntBits(f11);
        return f.g((((long) Float.floatToIntBits(f12)) & 4294967295L) | (floatToIntBits << 32));
    }

    public static final boolean b(long j) {
        float m11 = f.m(j);
        if (!Float.isInfinite(m11) && !Float.isNaN(m11)) {
            float n = f.n(j);
            if (!Float.isInfinite(n) && !Float.isNaN(n)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(long j) {
        return j != f.f16662b.b();
    }

    public static final boolean d(long j) {
        return j == f.f16662b.b();
    }

    public static final long e(long j, long j11, float f11) {
        return a(a.a(f.m(j), f.m(j11), f11), a.a(f.n(j), f.n(j11), f11));
    }
}
