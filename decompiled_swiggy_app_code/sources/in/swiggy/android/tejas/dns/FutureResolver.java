package in.swiggy.android.tejas.dns;

import bp0.k;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.q;
import okhttp3.Dns;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.SimpleResolver;
import os.u;

/* compiled from: FutureResolver.kt */
public final class FutureResolver {
    public static final Companion Companion = new Companion((i) null);
    private static final String TAG;
    private final String hostname;
    private final q<Integer, String, Integer, k> onDnsResolved;
    private final DnsServer server;

    /* compiled from: FutureResolver.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* compiled from: FutureResolver.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DnsServer.values().length];
            iArr[DnsServer.SYSTEM.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String name = FutureResolver.class.getName();
        p.i(name, "FutureResolver::class.java.name");
        TAG = name;
    }

    public FutureResolver(String str, DnsServer dnsServer, q<? super Integer, ? super String, ? super Integer, k> qVar) {
        p.j(str, "hostname");
        p.j(dnsServer, "server");
        p.j(qVar, "onDnsResolved");
        this.hostname = str;
        this.server = dnsServer;
        this.onDnsResolved = qVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: lookup$lambda-0  reason: not valid java name */
    public static final List m7lookup$lambda0(FutureResolver futureResolver) {
        p.j(futureResolver, "this$0");
        return futureResolver.resolveUsingServer();
    }

    private final List<InetAddress> resolveUsingServer() {
        try {
            if (WhenMappings.$EnumSwitchMapping$0[this.server.ordinal()] == 1) {
                return Dns.SYSTEM.lookup(this.hostname);
            }
            Lookup.setDefaultResolver(new SwiggyResolver(new SimpleResolver[]{new SimpleResolver(this.server.getIp())}, this.onDnsResolved));
            InetAddress[] allByName = SwiggyAddress.getAllByName(this.hostname);
            p.i(allByName, "getAllByName(hostname)");
            return g.d(allByName);
        } catch (Exception e11) {
            u.h(TAG, e11);
            return null;
        }
    }

    public final CompletableFuture<List<InetAddress>> lookup() {
        CompletableFuture<List<InetAddress>> supplyAsync = CompletableFuture.supplyAsync(new a(this));
        p.i(supplyAsync, "supplyAsync { resolveUsingServer() }");
        return supplyAsync;
    }
}
