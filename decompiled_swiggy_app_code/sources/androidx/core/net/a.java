package androidx.core.net;

import android.net.ConnectivityManager;

/* compiled from: ConnectivityManagerCompat */
public final class a {

    /* renamed from: androidx.core.net.a$a  reason: collision with other inner class name */
    /* compiled from: ConnectivityManagerCompat */
    static class C0040a {
        static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        return C0040a.a(connectivityManager);
    }
}
