package amazonpay.silentpay;

import android.util.Log;

final class j {
    static void a(String str, String str2) {
        c(str, str2, (Throwable) null, 4);
    }

    static void b(String str, String str2, Throwable th2) {
    }

    private static void c(String str, String str2, Throwable th2, int i11) {
        d dVar = a.f1156b;
        if (dVar != null && i11 > dVar.o()) {
            n.f(str, str2, th2);
        }
    }

    static void d(String str, String str2) {
        Log.w(str, str2);
        c(str, str2, (Throwable) null, 5);
    }

    static void e(String str, String str2, Throwable th2) {
        Log.w(str, str2);
        c(str, str2, th2, 5);
    }

    static void f(String str, String str2) {
        Log.e(str, str2);
        c(str, str2, (Throwable) null, 6);
    }

    static void g(String str, String str2, Throwable th2) {
        Log.e(str, str2);
        c(str, str2, th2, 6);
    }
}
