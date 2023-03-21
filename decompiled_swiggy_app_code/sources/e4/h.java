package e4;

import android.content.Context;
import android.os.Build;
import d4.i;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WorkDatabasePathHelper */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14310a = i.f("WrkDbPathHelper");

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f14311b = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return b(context);
        }
        return c(context, "androidx.work.workdb");
    }

    public static File b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    private static File c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static String d() {
        return "androidx.work.workdb";
    }

    public static void e(Context context) {
        String str;
        File b11 = b(context);
        if (Build.VERSION.SDK_INT >= 23 && b11.exists()) {
            i.c().a(f14310a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> f11 = f(context);
            for (File next : f11.keySet()) {
                File file = f11.get(next);
                if (next.exists() && file != null) {
                    if (file.exists()) {
                        i.c().h(f14310a, String.format("Over-writing contents of %s", new Object[]{file}), new Throwable[0]);
                    }
                    if (next.renameTo(file)) {
                        str = String.format("Migrated %s to %s", new Object[]{next, file});
                    } else {
                        str = String.format("Renaming %s to %s failed", new Object[]{next, file});
                    }
                    i.c().a(f14310a, str, new Throwable[0]);
                }
            }
        }
    }

    public static Map<File, File> f(Context context) {
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            File b11 = b(context);
            File a11 = a(context);
            hashMap.put(b11, a11);
            for (String str : f14311b) {
                hashMap.put(new File(b11.getPath() + str), new File(a11.getPath() + str));
            }
        }
        return hashMap;
    }
}
