package d2;

/* compiled from: Dp.kt */
public final class i {
    public static final long a(float f11, float f12) {
        long floatToIntBits = (long) Float.floatToIntBits(f11);
        return j.c((((long) Float.floatToIntBits(f12)) & 4294967295L) | (floatToIntBits << 32));
    }

    public static final long b(float f11, float f12) {
        long floatToIntBits = (long) Float.floatToIntBits(f11);
        return k.d((((long) Float.floatToIntBits(f12)) & 4294967295L) | (floatToIntBits << 32));
    }
}
