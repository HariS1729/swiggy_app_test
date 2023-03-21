package t0;

/* compiled from: GeometryUtils.kt */
public final class c {
    public static final String a(float f11, int i11) {
        int max = Math.max(i11, 0);
        float pow = (float) Math.pow((double) 10.0f, (double) max);
        float f12 = f11 * pow;
        int i12 = (int) f12;
        if (f12 - ((float) i12) >= 0.5f) {
            i12++;
        }
        float f13 = ((float) i12) / pow;
        if (max > 0) {
            return String.valueOf(f13);
        }
        return String.valueOf((int) f13);
    }
}
