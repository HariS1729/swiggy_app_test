package rf0;

import javax.inject.Provider;
import jr.a;
import qq.e;
import tf0.b;

/* compiled from: AssetPreCacheWorker_AssistedFactory_Factory */
public final class c implements e<b> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<a> f19866a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<b> f19867b;

    public c(Provider<a> provider, Provider<b> provider2) {
        this.f19866a = provider;
        this.f19867b = provider2;
    }

    public static c a(Provider<a> provider, Provider<b> provider2) {
        return new c(provider, provider2);
    }

    public static b c(Provider<a> provider, Provider<b> provider2) {
        return new b(provider, provider2);
    }

    /* renamed from: b */
    public b get() {
        return c(this.f19866a, this.f19867b);
    }
}
