package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;

/* compiled from: ForEachGesture.kt */
public final class GestureCancellationException extends CancellationException {
    public GestureCancellationException() {
        this((String) null, 1, (i) null);
    }

    public GestureCancellationException(String str) {
        super(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GestureCancellationException(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str);
    }
}
