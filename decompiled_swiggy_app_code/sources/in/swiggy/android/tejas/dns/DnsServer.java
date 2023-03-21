package in.swiggy.android.tejas.dns;

/* compiled from: DnsServer.kt */
public enum DnsServer {
    SYSTEM("0.0.0.0"),
    GOOGLE_DNS_RESOLVER("8.8.8.8"),
    CLOUDFLARE_DNS_RESOLVER("1.1.1.1"),
    GOOGLE_BACKUP_DNS_RESOLVER("8.8.4.4"),
    CLOUDFLARE_BACKUP_DNS_RESOLVER("1.0.0.1");
    

    /* renamed from: ip  reason: collision with root package name */
    private final String f20210ip;

    private DnsServer(String str) {
        this.f20210ip = str;
    }

    public final String getIp() {
        return this.f20210ip;
    }
}
