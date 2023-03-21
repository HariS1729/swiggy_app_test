package u0;

/* compiled from: TransformOrigin.kt */
public final class r1 {
    public static final long a(float f11, float f12) {
        long floatToIntBits = (long) Float.floatToIntBits(f11);
        return q1.c((((long) Float.floatToIntBits(f12)) & 4294967295L) | (floatToIntBits << 32));
    }
}
