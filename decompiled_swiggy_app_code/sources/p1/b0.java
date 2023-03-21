package p1;

/* compiled from: TextRange.kt */
public final class b0 {
    public static final long a(int i11) {
        return b(i11, i11);
    }

    public static final long b(int i11, int i12) {
        return a0.c(d(i11, i12));
    }

    public static final long c(long j, int i11, int i12) {
        int m11 = l.m(a0.n(j), i11, i12);
        int m12 = l.m(a0.i(j), i11, i12);
        if (m11 == a0.n(j) && m12 == a0.i(j)) {
            return j;
        }
        return b(m11, m12);
    }

    private static final long d(int i11, int i12) {
        boolean z11 = true;
        if (i11 >= 0) {
            if (i12 < 0) {
                z11 = false;
            }
            if (z11) {
                return (((long) i12) & 4294967295L) | (((long) i11) << 32);
            }
            throw new IllegalArgumentException(("end cannot negative. [end: " + i12 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i11 + ']').toString());
    }
}
