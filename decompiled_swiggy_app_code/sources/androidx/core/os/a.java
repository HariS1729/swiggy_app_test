package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Locale;

/* compiled from: BuildCompat */
public class a {
    protected static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    public static boolean c() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 >= 31 || (i11 >= 30 && a("S", Build.VERSION.CODENAME));
    }

    public static boolean d() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 >= 33 || (i11 >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }
}
