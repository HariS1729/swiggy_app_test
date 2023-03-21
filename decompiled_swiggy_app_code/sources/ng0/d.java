package ng0;

import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import os.a;
import qq.e;
import qq.i;

/* compiled from: LynxDnsModule_ProvideSwiggyOkHttpClientFactory */
public final class d implements e<OkHttpClient> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Dns> f19788a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<Cache> f19789b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<a> f19790c;

    public d(Provider<Dns> provider, Provider<Cache> provider2, Provider<a> provider3) {
        this.f19788a = provider;
        this.f19789b = provider2;
        this.f19790c = provider3;
    }

    public static d a(Provider<Dns> provider, Provider<Cache> provider2, Provider<a> provider3) {
        return new d(provider, provider2, provider3);
    }

    public static OkHttpClient c(Dns dns, Cache cache, a aVar) {
        return (OkHttpClient) i.e(c.f19787a.a(dns, cache, aVar));
    }

    /* renamed from: b */
    public OkHttpClient get() {
        return c(this.f19788a.get(), this.f19789b.get(), this.f19790c.get());
    }
}
