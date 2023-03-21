package androidx.core.view;

import android.view.MotionEvent;

/* compiled from: MotionEventCompat */
public final class n {
    @Deprecated
    public static int a(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    public static boolean c(MotionEvent motionEvent, int i11) {
        return (motionEvent.getSource() & i11) == i11;
    }
}
