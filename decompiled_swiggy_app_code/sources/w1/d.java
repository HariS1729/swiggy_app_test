package w1;

import android.os.Build;

/* compiled from: AndroidPlatformLocale.android.kt */
public final class d {
    public static final h a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return new c();
        }
        return new b();
    }
}
