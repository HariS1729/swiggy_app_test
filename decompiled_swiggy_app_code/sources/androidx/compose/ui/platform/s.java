package androidx.compose.ui.platform;

import android.view.View;
import kotlin.jvm.internal.p;

/* compiled from: AndroidComposeView.android.kt */
final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f7343a = new s();

    private s() {
    }

    public final void a(View view) {
        p.j(view, "view");
        view.setForceDarkAllowed(false);
    }
}
