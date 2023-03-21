package m4;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.a;
import d4.i;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ProcessUtils */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f15642a = i.f("ProcessUtils");

    private f() {
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    public static String a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, f.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th2) {
            i.c().a(f15642a, "Unable to check ActivityThread for processName", th2);
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty())) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
        }
        return null;
    }

    public static boolean b(Context context, a aVar) {
        String a11 = a(context);
        if (!TextUtils.isEmpty(aVar.c())) {
            return TextUtils.equals(a11, aVar.c());
        }
        return TextUtils.equals(a11, context.getApplicationInfo().processName);
    }
}
