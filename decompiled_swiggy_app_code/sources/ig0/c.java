package ig0;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: FeatureGateHelper */
public class c {
    public static boolean a(String str, String str2, Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).getString(str, str2);
        return string != null && string.trim().toLowerCase().equals("true");
    }

    public static boolean b(String str, String str2, SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString(str, str2);
        return string != null && string.trim().toLowerCase().equals("true");
    }
}
