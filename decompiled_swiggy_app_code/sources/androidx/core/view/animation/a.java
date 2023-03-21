package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PathInterpolatorCompat */
public final class a {

    /* renamed from: androidx.core.view.animation.a$a  reason: collision with other inner class name */
    /* compiled from: PathInterpolatorCompat */
    static class C0049a {
        static PathInterpolator a(float f11, float f12) {
            return new PathInterpolator(f11, f12);
        }

        static PathInterpolator b(float f11, float f12, float f13, float f14) {
            return new PathInterpolator(f11, f12, f13, f14);
        }

        static PathInterpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f11, float f12, float f13, float f14) {
        return C0049a.b(f11, f12, f13, f14);
    }
}
