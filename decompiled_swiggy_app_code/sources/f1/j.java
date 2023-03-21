package f1;

import android.view.MotionEvent;
import kotlin.jvm.internal.p;
import t0.g;

/* compiled from: MotionEventAdapter.android.kt */
final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f14503a = new j();

    private j() {
    }

    public final long a(MotionEvent motionEvent, int i11) {
        p.j(motionEvent, "motionEvent");
        return g.a(motionEvent.getRawX(i11), motionEvent.getRawY(i11));
    }
}
