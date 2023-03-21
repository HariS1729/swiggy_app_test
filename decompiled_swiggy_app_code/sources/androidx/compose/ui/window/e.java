package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.p;

/* compiled from: AndroidPopup.android.kt */
final class e extends f {
    public void b(View view, int i11, int i12) {
        p.j(view, "composeView");
        view.setSystemGestureExclusionRects(k.p(new Rect(0, 0, i11, i12)));
    }
}
