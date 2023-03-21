package in.swiggy.android.receiver;

import android.content.Context;
import android.content.Intent;
import in.swiggy.android.mvvm.base.SwiggyBaseBroadcastReceiver;
import in.swiggy.android.services.KabootarDismissNotification;

public class KabootarBroadcastReceiver extends SwiggyBaseBroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f18515a = KabootarBroadcastReceiver.class.getSimpleName();

    public void onReceive(Context context, Intent intent) {
        KabootarDismissNotification.n.a(context, intent.getExtras());
    }
}
