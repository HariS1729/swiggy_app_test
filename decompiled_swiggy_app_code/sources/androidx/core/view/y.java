package androidx.core.view;

import android.view.VelocityTracker;

@Deprecated
/* compiled from: VelocityTrackerCompat */
public final class y {
    @Deprecated
    public static float a(VelocityTracker velocityTracker, int i11) {
        return velocityTracker.getXVelocity(i11);
    }

    @Deprecated
    public static float b(VelocityTracker velocityTracker, int i11) {
        return velocityTracker.getYVelocity(i11);
    }
}
