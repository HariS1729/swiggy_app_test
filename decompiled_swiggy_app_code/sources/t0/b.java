package t0;

/* compiled from: CornerRadius.kt */
public final class b {
    public static final long a(float f11, float f12) {
        long floatToIntBits = (long) Float.floatToIntBits(f11);
        return a.b((((long) Float.floatToIntBits(f12)) & 4294967295L) | (floatToIntBits << 32));
    }

    public static /* synthetic */ long b(float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = f11;
        }
        return a(f11, f12);
    }
}
