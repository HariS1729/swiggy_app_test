package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.jvm.internal.p;

/* compiled from: AndroidPopup.android.kt */
class f implements d {
    public void a(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        p.j(windowManager, "windowManager");
        p.j(view, "popupView");
        p.j(layoutParams, "params");
        windowManager.updateViewLayout(view, layoutParams);
    }

    public void b(View view, int i11, int i12) {
        p.j(view, "composeView");
    }

    public void c(View view, Rect rect) {
        p.j(view, "composeView");
        p.j(rect, "outRect");
        view.getWindowVisibleDisplayFrame(rect);
    }
}
