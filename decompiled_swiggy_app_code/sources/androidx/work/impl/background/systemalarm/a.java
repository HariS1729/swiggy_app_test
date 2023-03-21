package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import d4.i;
import l4.g;
import l4.h;
import m4.c;

/* compiled from: Alarms */
class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12376a = i.f("Alarms");

    public static void a(Context context, e4.i iVar, String str) {
        h K = iVar.w().K();
        g b11 = K.b(str);
        if (b11 != null) {
            b(context, str, b11.f15472b);
            i.c().a(f12376a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            K.d(str);
        }
    }

    private static void b(Context context, String str, int i11) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i11, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service != null && alarmManager != null) {
            i.c().a(f12376a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i11)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void c(Context context, e4.i iVar, String str, long j) {
        WorkDatabase w11 = iVar.w();
        h K = w11.K();
        g b11 = K.b(str);
        if (b11 != null) {
            b(context, str, b11.f15472b);
            d(context, str, b11.f15472b, j);
            return;
        }
        int b12 = new c(w11).b();
        K.a(new g(str, b12));
        d(context, str, b12, j);
    }

    private static void d(Context context, String str, int i11, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i11, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
