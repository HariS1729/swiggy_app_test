package w6;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.a;
import c7.g;
import c7.q;
import w6.c;

/* compiled from: NetworkObserver.kt */
public final class d {
    public static final c a(Context context, c.a aVar, q qVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) a.j(context, ConnectivityManager.class);
        if (connectivityManager == null || !c7.d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (qVar != null && qVar.getLevel() <= 5) {
                qVar.a("NetworkObserver", 5, "Unable to register network observer.", (Throwable) null);
            }
            return new b();
        }
        try {
            return new e(connectivityManager, aVar);
        } catch (Exception e11) {
            if (qVar != null) {
                g.a(qVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e11));
            }
            return new b();
        }
    }
}
