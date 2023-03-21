package amazonpay.silentpay;

import amazonpay.silentpay.i;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class m {
    static boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (!z11) {
            n.d(i.a.NO_NETWORK_CONNECTIVITY);
        }
        return z11;
    }
}
