package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* compiled from: AppOpsManagerCompat */
public final class e {

    /* compiled from: AppOpsManagerCompat */
    static class a {
        static <T> T a(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* compiled from: AppOpsManagerCompat */
    static class b {
        static int a(AppOpsManager appOpsManager, String str, int i11, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i11, str2);
        }

        static String b(Context context) {
            return context.getOpPackageName();
        }

        static AppOpsManager c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(Context context, int i11, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return b(context, str, str2);
        }
        AppOpsManager c11 = b.c(context);
        int a11 = b.a(c11, str, Binder.getCallingUid(), str2);
        if (a11 != 0) {
            return a11;
        }
        return b.a(c11, str, i11, b.b(context));
    }

    public static int b(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.c((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    public static String c(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.d(str);
        }
        return null;
    }
}
