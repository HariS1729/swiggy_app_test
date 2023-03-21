package androidx.compose.ui.platform;

import android.view.ViewTreeObserver;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f7328a;

    public /* synthetic */ o(AndroidComposeView androidComposeView) {
        this.f7328a = androidComposeView;
    }

    public final void onTouchModeChanged(boolean z11) {
        AndroidComposeView.r0(this.f7328a, z11);
    }
}
