package androidx.activity;

import android.window.OnBackInvokedCallback;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f1407a;

    public /* synthetic */ h(Runnable runnable) {
        this.f1407a = runnable;
    }

    public final void onBackInvoked() {
        this.f1407a.run();
    }
}
