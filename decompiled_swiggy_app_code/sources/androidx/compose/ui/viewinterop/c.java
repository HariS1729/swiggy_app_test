package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import i1.n;
import t0.f;

/* compiled from: AndroidViewHolder.android.kt */
public final class c {
    /* access modifiers changed from: private */
    public static final void e(View view, LayoutNode layoutNode) {
        long e11 = n.e(layoutNode.d());
        int c11 = c.c(f.m(e11));
        int c12 = c.c(f.n(e11));
        view.layout(c11, c12, view.getMeasuredWidth() + c11, view.getMeasuredHeight() + c12);
    }

    /* access modifiers changed from: private */
    public static final float f(int i11) {
        return ((float) i11) * ((float) -1);
    }

    /* access modifiers changed from: private */
    public static final float g(float f11) {
        return f11 * -1.0f;
    }

    /* access modifiers changed from: private */
    public static final int h(int i11) {
        if (i11 == 0) {
            return e1.c.f14279a.a();
        }
        return e1.c.f14279a.b();
    }
}
