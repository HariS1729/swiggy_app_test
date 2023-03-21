package w6;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.p;
import w6.c;

@SuppressLint({"MissingPermission"})
/* compiled from: NetworkObserver.kt */
final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f17624a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a f17625b;

    /* renamed from: c  reason: collision with root package name */
    private final a f17626c;

    /* compiled from: NetworkObserver.kt */
    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f17627a;

        a(e eVar) {
            this.f17627a = eVar;
        }

        public void onAvailable(Network network) {
            this.f17627a.d(network, true);
        }

        public void onLost(Network network) {
            this.f17627a.d(network, false);
        }
    }

    public e(ConnectivityManager connectivityManager, c.a aVar) {
        this.f17624a = connectivityManager;
        this.f17625b = aVar;
        a aVar2 = new a(this);
        this.f17626c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    private final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f17624a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    /* access modifiers changed from: private */
    public final void d(Network network, boolean z11) {
        boolean z12;
        Network[] allNetworks = this.f17624a.getAllNetworks();
        int length = allNetworks.length;
        boolean z13 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Network network2 = allNetworks[i11];
            i11++;
            if (p.e(network2, network)) {
                z12 = z11;
                continue;
            } else {
                z12 = c(network2);
                continue;
            }
            if (z12) {
                z13 = true;
                break;
            }
        }
        this.f17625b.a(z13);
    }

    public boolean a() {
        Network[] allNetworks = this.f17624a.getAllNetworks();
        int length = allNetworks.length;
        int i11 = 0;
        while (i11 < length) {
            Network network = allNetworks[i11];
            i11++;
            if (c(network)) {
                return true;
            }
        }
        return false;
    }

    public void shutdown() {
        this.f17624a.unregisterNetworkCallback(this.f17626c);
    }
}
