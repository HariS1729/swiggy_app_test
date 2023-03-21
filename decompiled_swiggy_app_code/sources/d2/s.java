package d2;

import e2.a;

/* compiled from: TextUnit.kt */
public final class s {
    public static final long a(float f11, long j) {
        return i(j, f11);
    }

    public static final void b(long j) {
        if (!(!g(j))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    public static final void c(long j, long j11) {
        if (!(!g(j) && !g(j11))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        } else if (!t.g(r.g(j), r.g(j11))) {
            throw new IllegalArgumentException(("Cannot perform operation for " + t.i(r.g(j)) + " and " + t.i(r.g(j11))).toString());
        }
    }

    public static final long d(double d11) {
        return i(4294967296L, (float) d11);
    }

    public static final long e(float f11) {
        return i(4294967296L, f11);
    }

    public static final long f(int i11) {
        return i(4294967296L, (float) i11);
    }

    public static final boolean g(long j) {
        return r.f(j) == 0;
    }

    public static final long h(long j, long j11, float f11) {
        c(j, j11);
        return i(r.f(j), a.a(r.h(j), r.h(j11), f11));
    }

    public static final long i(long j, float f11) {
        return r.c(j | (((long) Float.floatToIntBits(f11)) & 4294967295L));
    }
}
