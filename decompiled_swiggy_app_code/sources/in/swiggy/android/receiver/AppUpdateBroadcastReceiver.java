package in.swiggy.android.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.mvvm.base.SwiggyBaseBroadcastReceiver;
import kotlin.jvm.internal.p;
import oq.a;

/* compiled from: AppUpdateBroadcastReceiver.kt */
public final class AppUpdateBroadcastReceiver extends SwiggyBaseBroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f18511a;

    public final SharedPreferences a() {
        SharedPreferences sharedPreferences = this.f18511a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        p.B("sharedPreferences");
        return null;
    }

    public void onReceive(Context context, Intent intent) {
        p.j(context, LogCategory.CONTEXT);
        p.j(intent, "intent");
        a.c(this, context);
        if (p.e(intent.getAction(), "android.intent.action.MY_PACKAGE_REPLACED")) {
            a().edit().putInt("app_update_view_count", 0).putLong("app_update_cancelled_time_v2", 0).putBoolean("app_update_cancelled", false).apply();
        }
    }
}
