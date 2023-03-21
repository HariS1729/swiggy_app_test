package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import d4.i;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12372a = i.f("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        i.c().a(f12372a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                e4.i.s(context).B(goAsync());
            } catch (IllegalStateException e11) {
                i.c().b(f12372a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e11);
            }
        } else {
            context.startService(b.e(context));
        }
    }
}
