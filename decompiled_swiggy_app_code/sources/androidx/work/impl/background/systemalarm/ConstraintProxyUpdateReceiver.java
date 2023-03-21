package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import d4.i;
import m4.d;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static final String f12367a = i.f("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f12368a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f12369b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f12370c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f12368a = intent;
            this.f12369b = context;
            this.f12370c = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f12368a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f12368a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f12368a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f12368a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                i.c().a(ConstraintProxyUpdateReceiver.f12367a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                d.a(this.f12369b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                d.a(this.f12369b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                d.a(this.f12369b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                d.a(this.f12369b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f12370c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z12).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z13).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z14);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            i.c().a(f12367a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
        } else {
            e4.i.s(context).x().c(new a(intent, context, goAsync()));
        }
    }
}
