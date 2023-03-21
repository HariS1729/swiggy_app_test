package in.swiggy.android.receiver;

import android.content.Context;
import android.content.Intent;
import h3.a;
import in.swiggy.android.mvvm.base.SwiggyBaseBroadcastReceiver;
import in.swiggy.android.tejas.network.utils.NetworkUtils;
import os.u;

public class NetworkChangeReceiver extends SwiggyBaseBroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f18516a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f18517b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f18518c;

    static {
        String simpleName = NetworkChangeReceiver.class.getSimpleName();
        f18516a = simpleName;
        f18517b = simpleName + "available";
        f18518c = simpleName + "notAvailable";
    }

    public void onReceive(Context context, Intent intent) {
        Intent intent2;
        super.onReceive(context, intent);
        try {
            if (NetworkUtils.isNetworkAvailable(context)) {
                intent2 = new Intent(f18517b);
            } else {
                intent2 = new Intent(f18518c);
            }
            a.b(context).d(intent2);
        } catch (Exception e11) {
            u.h(f18516a, e11);
        }
    }
}
