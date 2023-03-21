package in.swiggy.android.tejas.feature.home.grid.model.remotelottie;

import kotlin.jvm.internal.p;

/* compiled from: RemoteLottieProperties.kt */
public final class RemoteLottieProperties {
    private final int repeatCount;
    private final RemoteLottieRepeatMode repeatMode;

    public RemoteLottieProperties(int i11, RemoteLottieRepeatMode remoteLottieRepeatMode) {
        p.j(remoteLottieRepeatMode, "repeatMode");
        this.repeatCount = i11;
        this.repeatMode = remoteLottieRepeatMode;
    }

    public final int getRepeatCount() {
        return this.repeatCount;
    }

    public final RemoteLottieRepeatMode getRepeatMode() {
        return this.repeatMode;
    }
}
