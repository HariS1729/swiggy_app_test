package d5;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import bp0.g;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Result;
import kotlin.jvm.internal.p;

/* compiled from: extensions.kt */
public final class a {
    public static final String a(Context context) {
        p.j(context, "<this>");
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            p.i(applicationInfo, "applicationInfo");
            int i11 = applicationInfo.labelRes;
            if (i11 != 0) {
                return context.getString(i11);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            if (charSequence != null) {
                return charSequence.toString();
            }
            return context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final List<String> b() {
        if (q()) {
            String[] strArr = Build.SUPPORTED_ABIS;
            p.i(strArr, "SUPPORTED_ABIS");
            return ArraysKt___ArraysKt.j0(strArr);
        }
        return k.m(Build.CPU_ABI, Build.CPU_ABI2);
    }

    public static final Float c(Context context) {
        Object obj;
        int i11;
        int i12;
        p.j(context, "<this>");
        Float f11 = null;
        try {
            Result.a aVar = Result.f25582b;
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                i11 = -1;
            } else {
                i11 = registerReceiver.getIntExtra("level", -1);
            }
            if (registerReceiver == null) {
                i12 = -1;
            } else {
                i12 = registerReceiver.getIntExtra("scale", -1);
            }
            if (i11 != -1) {
                if (i12 != -1) {
                    obj = Result.b(Float.valueOf((((float) i11) / ((float) i12)) * 100.0f));
                    if (!Result.g(obj)) {
                        f11 = obj;
                    }
                    return f11;
                }
            }
            return null;
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f25582b;
            obj = Result.b(g.a(th2));
        }
    }

    public static final Float d(Context context) {
        Object obj;
        int i11;
        p.j(context, "<this>");
        Float f11 = null;
        try {
            Result.a aVar = Result.f25582b;
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                i11 = -1;
            } else {
                i11 = registerReceiver.getIntExtra("temperature", -1);
            }
            obj = Result.b(i11 != -1 ? Float.valueOf(((float) i11) / ((float) 10)) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f25582b;
            obj = Result.b(g.a(th2));
        }
        if (!Result.g(obj)) {
            f11 = obj;
        }
        return f11;
    }

    public static final Date e() {
        Object obj;
        try {
            Result.a aVar = Result.f25582b;
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance.setTimeInMillis(System.currentTimeMillis() - SystemClock.elapsedRealtime());
            obj = Result.b(instance.getTime());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f25582b;
            obj = Result.b(g.a(th2));
        }
        if (Result.g(obj)) {
            obj = null;
        }
        return (Date) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        jp0.b.a(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        jp0.b.a(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String f(android.content.Context r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r6, r0)
            r0 = 0
            kotlin.Result$a r1 = kotlin.Result.f25582b     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)     // Catch:{ all -> 0x0078 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0078 }
            java.io.File r6 = r6.getFilesDir()     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = "deviceId"
            r2.<init>(r6, r3)     // Catch:{ all -> 0x0078 }
            boolean r6 = r2.exists()     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = "charset"
            if (r6 != 0) goto L_0x0054
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0078 }
            r6.<init>(r2)     // Catch:{ all -> 0x0078 }
            java.io.FileOutputStream r6 = io.sentry.instrumentation.file.l.b.a(r6, r2)     // Catch:{ all -> 0x0078 }
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x004d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "randomUUID().toString()"
            kotlin.jvm.internal.p.i(r2, r4)     // Catch:{ all -> 0x004d }
            kotlin.jvm.internal.p.i(r1, r3)     // Catch:{ all -> 0x004d }
            byte[] r1 = r2.getBytes(r1)     // Catch:{ all -> 0x004d }
            java.lang.String r3 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.p.i(r1, r3)     // Catch:{ all -> 0x004d }
            r6.write(r1)     // Catch:{ all -> 0x004d }
            r6.flush()     // Catch:{ all -> 0x004d }
            jp0.b.a(r6, r0)     // Catch:{ all -> 0x0078 }
            return r2
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r2 = move-exception
            jp0.b.a(r6, r1)     // Catch:{ all -> 0x0078 }
            throw r2     // Catch:{ all -> 0x0078 }
        L_0x0054:
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "r"
            r6.<init>(r2, r4)     // Catch:{ all -> 0x0078 }
            long r4 = r6.length()     // Catch:{ all -> 0x0071 }
            int r2 = (int) r4     // Catch:{ all -> 0x0071 }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0071 }
            r6.readFully(r2)     // Catch:{ all -> 0x0071 }
            kotlin.jvm.internal.p.i(r1, r3)     // Catch:{ all -> 0x0071 }
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0071 }
            r3.<init>(r2, r1)     // Catch:{ all -> 0x0071 }
            jp0.b.a(r6, r0)     // Catch:{ all -> 0x0078 }
            return r3
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r2 = move-exception
            jp0.b.a(r6, r1)     // Catch:{ all -> 0x0078 }
            throw r2     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r6 = move-exception
            kotlin.Result$a r1 = kotlin.Result.f25582b
            java.lang.Object r6 = bp0.g.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
            boolean r1 = kotlin.Result.g(r6)
            if (r1 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r0 = r6
        L_0x008b:
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.a.f(android.content.Context):java.lang.String");
    }

    public static final Long g(Context context) {
        p.j(context, "<this>");
        Long l11 = null;
        try {
            Result.a aVar = Result.f25582b;
            File externalFilesDir = context.getExternalFilesDir((String) null);
            StatFs statFs = new StatFs(externalFilesDir == null ? null : externalFilesDir.getPath());
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f25582b;
            Object b11 = Result.b(g.a(th2));
            if (!Result.g(b11)) {
                l11 = b11;
            }
            return l11;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        jp0.b.a(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String h() {
        /*
            java.lang.String r0 = "os.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/proc/version"
            r1.<init>(r2)
            boolean r2 = r1.canRead()
            if (r2 != 0) goto L_0x0014
            return r0
        L_0x0014:
            kotlin.Result$a r2 = kotlin.Result.f25582b     // Catch:{ all -> 0x0030 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0030 }
            io.sentry.instrumentation.file.m r3 = new io.sentry.instrumentation.file.m     // Catch:{ all -> 0x0030 }
            r3.<init>((java.io.File) r1)     // Catch:{ all -> 0x0030 }
            r2.<init>(r3)     // Catch:{ all -> 0x0030 }
            r1 = 0
            java.lang.String r3 = r2.readLine()     // Catch:{ all -> 0x0029 }
            jp0.b.a(r2, r1)     // Catch:{ all -> 0x0030 }
            return r3
        L_0x0029:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002b }
        L_0x002b:
            r3 = move-exception
            jp0.b.a(r2, r1)     // Catch:{ all -> 0x0030 }
            throw r3     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r1 = move-exception
            kotlin.Result$a r2 = kotlin.Result.f25582b
            java.lang.Object r1 = bp0.g.a(r1)
            kotlin.Result.b(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.a.h():java.lang.String");
    }

    public static final ActivityManager.MemoryInfo i(Context context) {
        Object obj;
        p.j(context, "<this>");
        ActivityManager.MemoryInfo memoryInfo = null;
        try {
            Result.a aVar = Result.f25582b;
            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo2);
            }
            obj = Result.b(memoryInfo2);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f25582b;
            obj = Result.b(g.a(th2));
        }
        if (!Result.g(obj)) {
            memoryInfo = obj;
        }
        return memoryInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r6.intValue() == 1) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r6.intValue() == 9) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String j(android.content.Context r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r6, r0)
            r0 = 0
            kotlin.Result$a r1 = kotlin.Result.f25582b     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "connectivity"
            java.lang.Object r6 = r6.getSystemService(r1)     // Catch:{ all -> 0x0086 }
            if (r6 == 0) goto L_0x007e
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6     // Catch:{ all -> 0x0086 }
            boolean r1 = r()     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "cellular"
            java.lang.String r3 = "ethernet"
            java.lang.String r4 = "wifi"
            r5 = 1
            if (r1 == 0) goto L_0x0046
            android.net.Network r1 = r6.getActiveNetwork()     // Catch:{ all -> 0x0086 }
            android.net.NetworkCapabilities r6 = r6.getNetworkCapabilities(r1)     // Catch:{ all -> 0x0086 }
            kotlin.jvm.internal.p.g(r6)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "connectivityManager.getNetworkCapabilities(nw)!!"
            kotlin.jvm.internal.p.i(r6, r1)     // Catch:{ all -> 0x0086 }
            boolean r1 = r6.hasTransport(r5)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0036
            goto L_0x005f
        L_0x0036:
            r1 = 0
            boolean r1 = r6.hasTransport(r1)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x003e
            goto L_0x0079
        L_0x003e:
            r1 = 3
            boolean r6 = r6.hasTransport(r1)     // Catch:{ all -> 0x0086 }
            if (r6 == 0) goto L_0x0078
            goto L_0x006c
        L_0x0046:
            android.net.NetworkInfo r6 = r6.getActiveNetworkInfo()     // Catch:{ all -> 0x0086 }
            if (r6 != 0) goto L_0x004e
            r6 = r0
            goto L_0x0056
        L_0x004e:
            int r6 = r6.getType()     // Catch:{ all -> 0x0086 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0086 }
        L_0x0056:
            if (r6 != 0) goto L_0x0059
            goto L_0x0061
        L_0x0059:
            int r1 = r6.intValue()     // Catch:{ all -> 0x0086 }
            if (r1 != r5) goto L_0x0061
        L_0x005f:
            r2 = r4
            goto L_0x0079
        L_0x0061:
            r1 = 9
            if (r6 != 0) goto L_0x0066
            goto L_0x006e
        L_0x0066:
            int r4 = r6.intValue()     // Catch:{ all -> 0x0086 }
            if (r4 != r1) goto L_0x006e
        L_0x006c:
            r2 = r3
            goto L_0x0079
        L_0x006e:
            if (r6 != 0) goto L_0x0071
            goto L_0x0078
        L_0x0071:
            int r6 = r6.intValue()     // Catch:{ all -> 0x0086 }
            if (r6 != 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r2 = r0
        L_0x0079:
            java.lang.Object r6 = kotlin.Result.b(r2)     // Catch:{ all -> 0x0086 }
            goto L_0x0091
        L_0x007e:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            r6.<init>(r1)     // Catch:{ all -> 0x0086 }
            throw r6     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r6 = move-exception
            kotlin.Result$a r1 = kotlin.Result.f25582b
            java.lang.Object r6 = bp0.g.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L_0x0091:
            boolean r1 = kotlin.Result.g(r6)
            if (r1 == 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r0 = r6
        L_0x0099:
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.a.j(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String k(android.content.Context r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r2, r0)
            r0 = 0
            kotlin.Result$a r1 = kotlin.Result.f25582b     // Catch:{ all -> 0x0028 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ all -> 0x0028 }
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ all -> 0x0028 }
            int r2 = r2.orientation     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0022
            r1 = 1
            if (r2 == r1) goto L_0x001f
            r1 = 2
            if (r2 == r1) goto L_0x001c
            r1 = 3
            goto L_0x0022
        L_0x001c:
            java.lang.String r2 = "landscape"
            goto L_0x0023
        L_0x001f:
            java.lang.String r2 = "portrait"
            goto L_0x0023
        L_0x0022:
            r2 = r0
        L_0x0023:
            java.lang.Object r2 = kotlin.Result.b(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x0033
        L_0x0028:
            r2 = move-exception
            kotlin.Result$a r1 = kotlin.Result.f25582b
            java.lang.Object r2 = bp0.g.a(r2)
            java.lang.Object r2 = kotlin.Result.b(r2)
        L_0x0033:
            boolean r1 = kotlin.Result.g(r2)
            if (r1 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r0 = r2
        L_0x003b:
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.a.k(android.content.Context):java.lang.String");
    }

    public static final PackageInfo l(Context context) {
        p.j(context, "<this>");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        p.i(packageInfo, "packageManager.getPackageInfo(packageName, 0)");
        return packageInfo;
    }

    public static final TimeZone m(Context context) {
        p.j(context, "<this>");
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            p.i(locales, "resources.configuration.locales");
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    public static final Long n(Context context) {
        Object obj;
        p.j(context, "<this>");
        Long l11 = null;
        try {
            Result.a aVar = Result.f25582b;
            File externalFilesDir = context.getExternalFilesDir((String) null);
            StatFs statFs = new StatFs(externalFilesDir == null ? null : externalFilesDir.getPath());
            obj = Result.b(Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f25582b;
            obj = Result.b(g.a(th2));
        }
        if (!Result.g(obj)) {
            l11 = obj;
        }
        return l11;
    }

    private static final String o(PackageInfo packageInfo) {
        Number number;
        if (Build.VERSION.SDK_INT >= 28) {
            number = Long.valueOf(packageInfo.getLongVersionCode());
        } else {
            number = Integer.valueOf(packageInfo.versionCode);
        }
        return number.toString();
    }

    public static final String p(PackageInfo packageInfo) {
        p.j(packageInfo, "<this>");
        if (Build.VERSION.SDK_INT >= 28) {
            return String.valueOf(packageInfo.getLongVersionCode());
        }
        return o(packageInfo);
    }

    public static final boolean q() {
        return true;
    }

    public static final boolean r() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r3.intValue() != 1) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Boolean s(android.content.Context r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r3, r0)
            r0 = 0
            kotlin.Result$a r1 = kotlin.Result.f25582b     // Catch:{ all -> 0x0041 }
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)     // Catch:{ all -> 0x0041 }
            android.content.Intent r3 = r3.registerReceiver(r0, r1)     // Catch:{ all -> 0x0041 }
            if (r3 != 0) goto L_0x0017
            r3 = r0
            goto L_0x0022
        L_0x0017:
            java.lang.String r1 = "plugged"
            r2 = -1
            int r3 = r3.getIntExtra(r1, r2)     // Catch:{ all -> 0x0041 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0041 }
        L_0x0022:
            r1 = 1
            if (r3 != 0) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            int r2 = r3.intValue()     // Catch:{ all -> 0x0041 }
            if (r2 == r1) goto L_0x0038
        L_0x002c:
            r2 = 2
            if (r3 != 0) goto L_0x0030
            goto L_0x0037
        L_0x0030:
            int r3 = r3.intValue()     // Catch:{ all -> 0x0041 }
            if (r3 != r2) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0041 }
            java.lang.Object r3 = kotlin.Result.b(r3)     // Catch:{ all -> 0x0041 }
            goto L_0x004c
        L_0x0041:
            r3 = move-exception
            kotlin.Result$a r1 = kotlin.Result.f25582b
            java.lang.Object r3 = bp0.g.a(r3)
            java.lang.Object r3 = kotlin.Result.b(r3)
        L_0x004c:
            boolean r1 = kotlin.Result.g(r3)
            if (r1 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r3
        L_0x0054:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.a.s(android.content.Context):java.lang.Boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d4, code lost:
        if (kotlin.text.StringsKt__StringsKt.S(r1, "simulator", false, 2, (java.lang.Object) null) != false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (kotlin.text.o.N(r7, "generic", false, 2, (java.lang.Object) null) == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Boolean t() {
        /*
            java.lang.String r0 = "google_sdk"
            java.lang.String r1 = "HARDWARE"
            java.lang.String r2 = "FINGERPRINT"
            java.lang.String r3 = "MODEL"
            java.lang.String r4 = "generic"
            java.lang.String r5 = "PRODUCT"
            r6 = 0
            kotlin.Result$a r7 = kotlin.Result.f25582b     // Catch:{ all -> 0x00e0 }
            java.lang.String r7 = android.os.Build.BRAND     // Catch:{ all -> 0x00e0 }
            java.lang.String r8 = "BRAND"
            kotlin.jvm.internal.p.i(r7, r8)     // Catch:{ all -> 0x00e0 }
            r8 = 2
            r9 = 0
            boolean r7 = kotlin.text.o.N(r7, r4, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r7 == 0) goto L_0x002b
            java.lang.String r7 = android.os.Build.DEVICE     // Catch:{ all -> 0x00e0 }
            java.lang.String r10 = "DEVICE"
            kotlin.jvm.internal.p.i(r7, r10)     // Catch:{ all -> 0x00e0 }
            boolean r7 = kotlin.text.o.N(r7, r4, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r7 != 0) goto L_0x00d6
        L_0x002b:
            java.lang.String r7 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x00e0 }
            kotlin.jvm.internal.p.i(r7, r2)     // Catch:{ all -> 0x00e0 }
            boolean r4 = kotlin.text.o.N(r7, r4, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r4 != 0) goto L_0x00d6
            kotlin.jvm.internal.p.i(r7, r2)     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "unknown"
            boolean r2 = kotlin.text.o.N(r7, r2, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r2 != 0) goto L_0x00d6
            java.lang.String r2 = android.os.Build.HARDWARE     // Catch:{ all -> 0x00e0 }
            kotlin.jvm.internal.p.i(r2, r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r4 = "goldfish"
            boolean r4 = kotlin.text.StringsKt__StringsKt.S(r2, r4, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r4 != 0) goto L_0x00d6
            kotlin.jvm.internal.p.i(r2, r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = "ranchu"
            boolean r1 = kotlin.text.StringsKt__StringsKt.S(r2, r1, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x00d6
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x00e0 }
            kotlin.jvm.internal.p.i(r1, r3)     // Catch:{ all -> 0x00e0 }
            boolean r2 = kotlin.text.StringsKt__StringsKt.S(r1, r0, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r2 != 0) goto L_0x00d6
            kotlin.jvm.internal.p.i(r1, r3)     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "Emulator"
            boolean r2 = kotlin.text.StringsKt__StringsKt.S(r1, r2, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r2 != 0) goto L_0x00d6
            kotlin.jvm.internal.p.i(r1, r3)     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "Android SDK built for x86"
            boolean r1 = kotlin.text.StringsKt__StringsKt.S(r1, r2, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x00d6
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "MANUFACTURER"
            kotlin.jvm.internal.p.i(r1, r2)     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "Genymotion"
            boolean r1 = kotlin.text.StringsKt__StringsKt.S(r1, r2, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x00d6
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch:{ all -> 0x00e0 }
            kotlin.jvm.internal.p.i(r1, r5)     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "sdk_google"
            boolean r2 = kotlin.text.StringsKt__StringsKt.S(r1, r2, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r2 != 0) goto L_0x00d6
            kotlin.jvm.internal.p.i(r1, r5)     // Catch:{ all -> 0x00e0 }
            boolean r0 = kotlin.text.StringsKt__StringsKt.S(r1, r0, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x00d6
            kotlin.jvm.internal.p.i(r1, r5)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "sdk"
            boolean r0 = kotlin.text.StringsKt__StringsKt.S(r1, r0, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x00d6
            kotlin.jvm.internal.p.i(r1, r5)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "sdk_x86"
            boolean r0 = kotlin.text.StringsKt__StringsKt.S(r1, r0, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x00d6
            kotlin.jvm.internal.p.i(r1, r5)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "vbox86p"
            boolean r0 = kotlin.text.StringsKt__StringsKt.S(r1, r0, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x00d6
            kotlin.jvm.internal.p.i(r1, r5)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "emulator"
            boolean r0 = kotlin.text.StringsKt__StringsKt.S(r1, r0, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x00d6
            kotlin.jvm.internal.p.i(r1, r5)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "simulator"
            boolean r0 = kotlin.text.StringsKt__StringsKt.S(r1, r0, r9, r8, r6)     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x00d7
        L_0x00d6:
            r9 = 1
        L_0x00d7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x00e0 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ all -> 0x00e0 }
            goto L_0x00eb
        L_0x00e0:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.f25582b
            java.lang.Object r0 = bp0.g.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L_0x00eb:
            boolean r1 = kotlin.Result.g(r0)
            if (r1 == 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r6 = r0
        L_0x00f3:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.a.t():java.lang.Boolean");
    }

    public static final boolean u(Context context) {
        NetworkCapabilities networkCapabilities;
        p.j(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(2)) {
                return true;
            }
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
