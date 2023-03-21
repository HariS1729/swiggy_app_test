package t0;

/* compiled from: Size.kt */
public final class m {
    public static final long a(float f11, float f12) {
        long floatToIntBits = (long) Float.floatToIntBits(f11);
        return l.d((((long) Float.floatToIntBits(f12)) & 4294967295L) | (floatToIntBits << 32));
    }

    public static final long b(long j) {
        return g.a(l.i(j) / 2.0f, l.g(j) / 2.0f);
    }

    public static final h c(long j) {
        return i.b(f.f16662b.c(), j);
    }
}
