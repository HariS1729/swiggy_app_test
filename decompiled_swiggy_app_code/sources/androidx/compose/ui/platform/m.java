package androidx.compose.ui.platform;

import android.view.ViewTreeObserver;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f7321a;

    public /* synthetic */ m(AndroidComposeView androidComposeView) {
        this.f7321a = androidComposeView;
    }

    public final void onGlobalLayout() {
        AndroidComposeView.Q(this.f7321a);
    }
}
