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

/* compiled from: SwiggyBaseDns.kt */
public class SwiggyBaseDns implements Dns {
    private static final String CLOUDFLARE_DNS_RESOLVER = "1.1.1.1";
    public static final Companion Companion = new Companion((i) null);
    private static final String GOOGLE_BACKUP_DNS_RESOLVER = "8.8.4.4";
    private static final String GOOGLE_DNS_RESOLVER = "8.8.8.8";
    private static final String TAG = SwiggyBaseDns.class.getName();
    private boolean initialized;

    /* compiled from: SwiggyBaseDns.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private final void init() {
        if (!this.initialized) {
            this.initialized = true;
            Lookup.setDefaultResolver(new SwiggyResolver(new SimpleResolver[]{new SimpleResolver(GOOGLE_DNS_RESOLVER), new SimpleResolver(CLOUDFLARE_DNS_RESOLVER), new SimpleResolver(GOOGLE_BACKUP_DNS_RESOLVER)}, new SwiggyBaseDns$init$1(this)));
        }
    }

    public List<InetAddress> lookup(String str) {
        p.j(str, "hostname");
        try {
            init();
            List<InetAddress> p11 = k.p(SwiggyAddress.getByName(str));
            onCustomResolution(str);
            return p11;
        } catch (Throwable th2) {
            u.h(TAG, th2);
            throw new UnknownHostException(str);
        }
    }

    public void onCustomResolution(String str) {
        p.j(str, "hostName");
    }

    public void onDnsResolved(int i11, String str, int i12) {
        p.j(str, "host");
    }
}
