package androidx.compose.runtime;

import android.view.Choreographer;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: ActualAndroid.android.kt */
final class DefaultChoreographerFrameClock$withFrameNanos$2$1 extends Lambda implements l<Throwable, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Choreographer.FrameCallback f5998a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultChoreographerFrameClock$withFrameNanos$2$1(Choreographer.FrameCallback frameCallback) {
        super(1);
        this.f5998a = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return k.f22762a;
    }

    public final void invoke(Throwable th2) {
        DefaultChoreographerFrameClock.f5994b.removeFrameCallback(this.f5998a);
    }
}
