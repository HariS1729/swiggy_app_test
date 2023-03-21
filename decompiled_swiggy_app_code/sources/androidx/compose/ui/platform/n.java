package androidx.compose.ui.platform;

import android.view.ViewTreeObserver;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f7324a;

    public /* synthetic */ n(AndroidComposeView androidComposeView) {
        this.f7324a = androidComposeView;
    }

    public final void onScrollChanged() {
        AndroidComposeView.l0(this.f7324a);
    }
}
