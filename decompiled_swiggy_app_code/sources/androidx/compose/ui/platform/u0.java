package androidx.compose.ui.platform;

/* compiled from: NestedScrollInteropConnection.kt */
public final class u0 {
    private static final float a(float f11) {
        return (float) (f11 >= 0.0f ? Math.ceil((double) f11) : Math.floor((double) f11));
    }

    public static final int b(float f11) {
        return ((int) a(f11)) * -1;
    }
}
