package androidx.compose.ui.platform;

import android.os.Looper;

/* compiled from: AndroidUiDispatcher.android.kt */
public final class w {
    /* access modifiers changed from: private */
    public static final boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
