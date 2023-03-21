package amazonpay.silentpay;

import amazonpay.silentpay.e;
import amazonpay.silentpay.i;
import android.content.Context;

final class n {

    /* renamed from: a  reason: collision with root package name */
    private static i f1279a;

    private static void a() {
    }

    static void b(long j, long j11) {
        i iVar = f1279a;
        if (iVar != null) {
            iVar.f(j, j11);
        } else {
            a();
        }
    }

    static void c(e.a aVar) {
        if (a.f1158d.containsKey(aVar)) {
            b(a.f1158d.get(a.f1157c).longValue(), System.currentTimeMillis());
        }
    }

    static void d(i.a aVar) {
        i iVar = f1279a;
        if (iVar != null) {
            iVar.g(aVar);
        } else {
            a();
        }
    }

    static void e(Context context) {
        f1279a = i.a(context);
    }

    static void f(String str, String str2, Throwable th2) {
        i iVar = f1279a;
        if (iVar != null) {
            iVar.h(str, str2, th2);
        } else {
            a();
        }
    }
}
