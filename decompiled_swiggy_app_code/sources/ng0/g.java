package ng0;

import in.swiggy.android.tejas.dns.SwiggyBaseDns;
import java.util.HashMap;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SwiggyLynxDns.kt */
public final class g extends SwiggyBaseDns {
    public static final a Companion = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final jr.a f19793a;

    /* renamed from: b  reason: collision with root package name */
    private String f19794b;

    /* compiled from: SwiggyLynxDns.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public g(jr.a aVar) {
        p.j(aVar, "newRelic");
        this.f19793a = aVar;
    }

    public void onCustomResolution(String str) {
        p.j(str, "hostName");
        this.f19794b = str;
    }

    public void onDnsResolved(int i11, String str, int i12) {
        p.j(str, "host");
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.valueOf(i11));
        hashMap.put("host", str);
        hashMap.put("tries", Integer.valueOf(i12));
        String str2 = this.f19794b;
        if (str2 != null) {
            hashMap.put("hostname", str2);
        }
        this.f19793a.a("lynx_custom_dns_resolution", hashMap);
    }
}
