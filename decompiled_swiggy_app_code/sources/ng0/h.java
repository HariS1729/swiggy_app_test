package ng0;

import javax.inject.Provider;
import jr.a;
import qq.e;

/* compiled from: SwiggyLynxDns_Factory */
public final class h implements e<g> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<a> f19795a;

    public h(Provider<a> provider) {
        this.f19795a = provider;
    }

    public static h a(Provider<a> provider) {
        return new h(provider);
    }

    public static g c(a aVar) {
        return new g(aVar);
    }

    /* renamed from: b */
    public g get() {
        return c(this.f19795a.get());
    }
}
