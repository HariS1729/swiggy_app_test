package in.swiggy.android.tejas.dns;

import android.os.Build;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.Dns;
import os.u;

/* compiled from: SwiggyBaseDnsParallel.kt */
public abstract class SwiggyBaseDnsParallel implements Dns {
    public static final Companion Companion = new Companion((i) null);
    private static final String TAG;

    /* compiled from: SwiggyBaseDnsParallel.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    static {
        String name = SwiggyBaseDnsParallel.class.getName();
        p.i(name, "SwiggyBaseDnsParallel::class.java.name");
        TAG = name;
    }

    public List<InetAddress> lookup(String str) {
        p.j(str, "hostname");
        if (Build.VERSION.SDK_INT < 24) {
            return Dns.SYSTEM.lookup(str);
        }
        try {
            Object obj = CompletableFuture.anyOf(new CompletableFuture[]{new FutureResolver(str, DnsServer.SYSTEM, new SwiggyBaseDnsParallel$lookup$system$1(this)).lookup(), new FutureResolver(str, DnsServer.GOOGLE_DNS_RESOLVER, new SwiggyBaseDnsParallel$lookup$google$1(this)).lookup()}).get();
            List<InetAddress> list = obj instanceof List ? (List) obj : null;
            if (list != null) {
                return list;
            }
        } catch (Exception e11) {
            u.h(TAG, e11);
        }
        throw new UnknownHostException(str);
    }

    public abstract void onDnsResolved(int i11, String str, int i12);
}
