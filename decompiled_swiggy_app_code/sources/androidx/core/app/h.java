package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* compiled from: NavUtils */
public final class h {

    /* compiled from: NavUtils */
    static class a {
        static Intent a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        static boolean b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        static boolean c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    public static Intent a(Activity activity) {
        Intent a11 = a.a(activity);
        if (a11 != null) {
            return a11;
        }
        String c11 = c(activity);
        if (c11 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, c11);
        try {
            if (d(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + c11 + "' in manifest");
            return null;
        }
    }

    public static Intent b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String d11 = d(context, componentName);
        if (d11 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), d11);
        if (d(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String c(Activity activity) {
        try {
            return d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static String d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 640;
        if (i11 >= 29) {
            i12 = 269222528;
        } else if (i11 >= 24) {
            i12 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i12);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static void e(Activity activity, Intent intent) {
        a.b(activity, intent);
    }

    public static boolean f(Activity activity, Intent intent) {
        return a.c(activity, intent);
    }
}
