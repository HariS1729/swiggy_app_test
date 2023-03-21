package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.core.app.e;

/* compiled from: PermissionChecker */
public final class c {
    public static int a(Context context, String str) {
        return b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(Context context, String str, int i11, int i12, String str2) {
        int i13;
        if (context.checkPermission(str, i11, i12) == -1) {
            return -1;
        }
        String c11 = e.c(str);
        if (c11 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i12);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (Process.myUid() == i12 && androidx.core.util.c.a(context.getPackageName(), str2)) {
            i13 = e.a(context, i12, c11, str2);
        } else {
            i13 = e.b(context, c11, str2);
        }
        if (i13 == 0) {
            return 0;
        }
        return -2;
    }

    public static int c(Context context, String str) {
        return b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
