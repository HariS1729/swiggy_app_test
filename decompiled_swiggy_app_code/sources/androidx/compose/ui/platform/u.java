package androidx.compose.ui.platform;

import android.view.View;
import kotlin.jvm.internal.p;

/* compiled from: AndroidComposeView.android.kt */
final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f7359a = new u();

    private u() {
    }

    public final void a(View view, int i11, boolean z11) {
        p.j(view, "view");
        view.setFocusable(i11);
        view.setDefaultFocusHighlightEnabled(z11);
    }
}
