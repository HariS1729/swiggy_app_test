package u0;

import android.graphics.Canvas;
import kotlin.jvm.internal.p;

/* compiled from: CanvasUtils.android.kt */
final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f16750a = new b0();

    private b0() {
    }

    public final void a(Canvas canvas, boolean z11) {
        p.j(canvas, "canvas");
        if (z11) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
