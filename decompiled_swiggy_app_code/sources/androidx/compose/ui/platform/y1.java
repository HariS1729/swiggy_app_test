package androidx.compose.ui.platform;

import android.view.ViewParent;
import kotlin.jvm.internal.p;

/* compiled from: RenderNodeLayer.android.kt */
public final class y1 {

    /* renamed from: a  reason: collision with root package name */
    public static final y1 f7397a = new y1();

    private y1() {
    }

    public final void a(AndroidComposeView androidComposeView) {
        p.j(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
