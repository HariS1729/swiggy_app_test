package d5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import bp0.g;
import bp0.k;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.network.HttpRequest;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.Result;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: RootChecker.kt */
public final class b {
    public static final a Companion = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f14139b = Charset.forName(HttpRequest.CHARSET_UTF8);

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f14140c = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f14141d = {"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};

    /* renamed from: a  reason: collision with root package name */
    private final Context f14142a;

    /* compiled from: RootChecker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public b(Context context) {
        p.j(context, LogCategory.CONTEXT);
        this.f14142a = context;
    }

    private final boolean a() {
        String[] strArr = f14140c;
        int length = strArr.length;
        int i11 = 0;
        while (i11 < length) {
            String str = strArr[i11];
            i11++;
            try {
                Result.a aVar = Result.f25582b;
                if (new File(str).exists()) {
                    return true;
                }
                Result.b(k.f22762a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f25582b;
                Result.b(g.a(th2));
            }
        }
        return false;
    }

    private final boolean b() {
        PackageManager packageManager = this.f14142a.getPackageManager();
        if (packageManager != null) {
            String[] strArr = f14141d;
            int length = strArr.length;
            int i11 = 0;
            while (i11 < length) {
                String str = strArr[i11];
                i11++;
                try {
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        jp0.b.a(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        throw r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean c() {
        /*
            r7 = this;
            java.lang.String r0 = "/system/xbin/which"
            java.lang.String r1 = "su"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0046, all -> 0x003e }
            java.lang.Process r0 = r3.exec(r0)     // Catch:{ Exception -> 0x0046, all -> 0x003e }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            java.nio.charset.Charset r6 = f14139b     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            java.lang.String r4 = r3.readLine()     // Catch:{ all -> 0x0032 }
            if (r4 == 0) goto L_0x002a
            r4 = 1
            goto L_0x002b
        L_0x002a:
            r4 = 0
        L_0x002b:
            jp0.b.a(r3, r2)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r0.destroy()
            return r4
        L_0x0032:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r4 = move-exception
            jp0.b.a(r3, r2)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            throw r4     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
        L_0x0039:
            r1 = move-exception
            r2 = r0
            goto L_0x003f
        L_0x003c:
            r2 = r0
            goto L_0x0047
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r2 != 0) goto L_0x0042
            goto L_0x0045
        L_0x0042:
            r2.destroy()
        L_0x0045:
            throw r1
        L_0x0046:
        L_0x0047:
            if (r2 != 0) goto L_0x004a
            goto L_0x004d
        L_0x004a:
            r2.destroy()
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.b.c():boolean");
    }

    private final boolean d() {
        String str = Build.TAGS;
        if (str == null || !StringsKt__StringsKt.S(str, "test-keys", false, 2, (Object) null)) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        return d() || a() || c() || b();
    }
}
