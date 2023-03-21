package androidx.compose.ui.platform;

import android.view.Choreographer;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: AndroidUiFrameClock.android.kt */
final class AndroidUiFrameClock$withFrameNanos$2$2 extends Lambda implements l<Throwable, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidUiFrameClock f7095a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Choreographer.FrameCallback f7096b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidUiFrameClock$withFrameNanos$2$2(AndroidUiFrameClock androidUiFrameClock, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.f7095a = androidUiFrameClock;
        this.f7096b = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return k.f22762a;
    }

    public final void invoke(Throwable th2) {
        this.f7095a.c().removeFrameCallback(this.f7096b);
    }
}
