package in.swiggy.android.tejas.feature.home;

import android.content.SharedPreferences;
import in.swiggy.android.tejas.network.HttpRequest;
import js.a;
import kotlin.jvm.internal.p;

/* compiled from: CacheUtils.kt */
public final class CacheUtils {
    public static final CacheUtils INSTANCE = new CacheUtils();

    private CacheUtils() {
    }

    public final boolean isCached(SharedPreferences sharedPreferences, String str) {
        p.j(sharedPreferences, "sharedPreferences");
        p.j(str, HttpRequest.HEADER_KEY);
        if (!sharedPreferences.contains(str)) {
            a.b(sharedPreferences, str, Boolean.FALSE);
            return false;
        }
        a.b(sharedPreferences, str, Boolean.TRUE);
        return true;
    }
}
