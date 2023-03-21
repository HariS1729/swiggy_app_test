package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* compiled from: ConfigurationCompat */
public final class d {

    /* compiled from: ConfigurationCompat */
    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static f a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return f.e(a.a(configuration));
        }
        return f.a(configuration.locale);
    }
}
