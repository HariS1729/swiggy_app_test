package nf0;

import javax.inject.Provider;
import jr.a;
import qq.e;

/* compiled from: NetworkPreHeatWorker_AssistedFactory_Factory */
public final class c implements e<b> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<a> f19782a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<pf0.a> f19783b;

    public c(Provider<a> provider, Provider<pf0.a> provider2) {
        this.f19782a = provider;
        this.f19783b = provider2;
    }

    public static c a(Provider<a> provider, Provider<pf0.a> provider2) {
        return new c(provider, provider2);
    }

    public static b c(Provider<a> provider, Provider<pf0.a> provider2) {
        return new b(provider, provider2);
    }

    /* renamed from: b */
    public b get() {
        return c(this.f19782a, this.f19783b);
    }
}
