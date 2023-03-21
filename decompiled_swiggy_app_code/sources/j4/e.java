package j4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import d4.i;

/* compiled from: NetworkStateTracker */
public class e extends d<h4.b> {
    static final String j = i.f("NetworkStateTracker");

    /* renamed from: g  reason: collision with root package name */
    private final ConnectivityManager f15282g = ((ConnectivityManager) this.f15276b.getSystemService("connectivity"));

    /* renamed from: h  reason: collision with root package name */
    private b f15283h;

    /* renamed from: i  reason: collision with root package name */
    private a f15284i;

    /* compiled from: NetworkStateTracker */
    private class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                i.c().a(e.j, "Network broadcast received", new Throwable[0]);
                e eVar = e.this;
                eVar.d(eVar.g());
            }
        }
    }

    /* compiled from: NetworkStateTracker */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            i.c().a(e.j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        public void onLost(Network network) {
            i.c().a(e.j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, n4.a aVar) {
        super(context, aVar);
        if (j()) {
            this.f15283h = new b();
        } else {
            this.f15284i = new a();
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public void e() {
        if (j()) {
            try {
                i.c().a(j, "Registering network callback", new Throwable[0]);
                this.f15282g.registerDefaultNetworkCallback(this.f15283h);
            } catch (IllegalArgumentException | SecurityException e11) {
                i.c().b(j, "Received exception while registering network callback", e11);
            }
        } else {
            i.c().a(j, "Registering broadcast receiver", new Throwable[0]);
            this.f15276b.registerReceiver(this.f15284i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public void f() {
        if (j()) {
            try {
                i.c().a(j, "Unregistering network callback", new Throwable[0]);
                this.f15282g.unregisterNetworkCallback(this.f15283h);
            } catch (IllegalArgumentException | SecurityException e11) {
                i.c().b(j, "Received exception while unregistering network callback", e11);
            }
        } else {
            i.c().a(j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f15276b.unregisterReceiver(this.f15284i);
        }
    }

    /* access modifiers changed from: package-private */
    public h4.b g() {
        NetworkInfo activeNetworkInfo = this.f15282g.getActiveNetworkInfo();
        boolean z11 = true;
        boolean z12 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i11 = i();
        boolean a11 = androidx.core.net.a.a(this.f15282g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z11 = false;
        }
        return new h4.b(z12, i11, a11, z11);
    }

    /* renamed from: h */
    public h4.b b() {
        return g();
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f15282g.getNetworkCapabilities(this.f15282g.getActiveNetwork());
            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                return false;
            }
            return true;
        } catch (SecurityException e11) {
            i.c().b(j, "Unable to validate active network", e11);
            return false;
        }
    }
}
