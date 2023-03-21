package in.swiggy.android.tejas.dns;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.Dns;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.SimpleResolver;
import os.u;

/* compiled from: SwiggyBaseDnsPrioritised.kt */
public abstract class SwiggyBaseDnsPrioritised implements Dns {
    public static final Companion Companion = new Companion((i) null);
    private static final String TAG = SwiggyBaseDnsPrioritised.class.getName();

    /* compiled from: SwiggyBaseDnsPrioritised.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* compiled from: SwiggyBaseDnsPrioritised.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DnsServer.values().length];
            iArr[DnsServer.SYSTEM.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void punishServer$default(SwiggyBaseDnsPrioritised swiggyBaseDnsPrioritised, DnsServer dnsServer, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i11 = -1;
            }
            swiggyBaseDnsPrioritised.punishServer(dnsServer, i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: punishServer");
    }

    private final List<InetAddress> resolve(String str, DnsServer dnsServer) {
        long currentTimeMillis = System.currentTimeMillis();
        List<InetAddress> resolveUsingServer = resolveUsingServer(str, dnsServer);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        logDnsMetrics(str, dnsServer, resolveUsingServer != null, currentTimeMillis2);
        if (resolveUsingServer == null) {
            punishServer$default(this, dnsServer, 0, 2, (Object) null);
            return null;
        }
        saveResolutionTime(dnsServer, currentTimeMillis2);
        return resolveUsingServer;
    }

    private final List<InetAddress> resolveUsingServer(String str, DnsServer dnsServer) {
        try {
            if (WhenMappings.$EnumSwitchMapping$0[dnsServer.ordinal()] == 1) {
                return Dns.SYSTEM.lookup(str);
            }
            Lookup.setDefaultResolver(new SwiggyResolver(new SimpleResolver[]{new SimpleResolver(dnsServer.getIp())}, new SwiggyBaseDnsPrioritised$resolveUsingServer$swiggyResolver$1(this)));
            InetAddress[] allByName = SwiggyAddress.getAllByName(str);
            p.i(allByName, "getAllByName(hostname)");
            return g.d(allByName);
        } catch (Exception e11) {
            u.h(TAG, e11);
            return null;
        }
    }

    public abstract List<DnsServer> getOrderedDnsServer();

    public abstract void logDnsMetrics(String str, DnsServer dnsServer, boolean z11, long j);

    public List<InetAddress> lookup(String str) {
        p.j(str, "hostname");
        for (DnsServer resolve : getOrderedDnsServer()) {
            List<InetAddress> resolve2 = resolve(str, resolve);
            if (resolve2 != null) {
                return resolve2;
            }
        }
        throw new UnknownHostException(str);
    }

    public abstract void onDnsResolved(int i11, String str, int i12);

    public abstract void punishServer(DnsServer dnsServer, int i11);

    public abstract void saveResolutionTime(DnsServer dnsServer, long j);
}
