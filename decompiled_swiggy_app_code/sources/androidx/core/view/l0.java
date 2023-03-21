package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: WindowCompat */
public final class l0 {

    /* compiled from: WindowCompat */
    static class a {
        static void a(Window window, boolean z11) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z11 ? systemUiVisibility & -1793 : systemUiVisibility | 1792);
        }
    }

    /* compiled from: WindowCompat */
    static class b {
        static void a(Window window, boolean z11) {
            window.setDecorFitsSystemWindows(z11);
        }
    }

    public static p0 a(Window window, View view) {
        return new p0(window, view);
    }

    public static void b(Window window, boolean z11) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z11);
        } else {
            a.a(window, z11);
        }
    }
}
