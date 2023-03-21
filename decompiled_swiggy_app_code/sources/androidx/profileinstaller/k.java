package androidx.profileinstaller;

import android.view.Choreographer;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f11079a;

    public /* synthetic */ k(Runnable runnable) {
        this.f11079a = runnable;
    }

    public final void doFrame(long j) {
        this.f11079a.run();
    }
}
