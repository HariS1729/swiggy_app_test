package d2;

/* compiled from: Velocity.kt */
public final class v {
    public static final long a(float f11, float f12) {
        long floatToIntBits = (long) Float.floatToIntBits(f11);
        return u.c((((long) Float.floatToIntBits(f12)) & 4294967295L) | (floatToIntBits << 32));
    }
}
