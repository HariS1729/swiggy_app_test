package uf0;

import javax.inject.Provider;
import ps.b;
import qq.e;

/* compiled from: MagicCartEndCardImageHandler_Factory */
public final class h implements e<g> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<b> f19909a;

    public h(Provider<b> provider) {
        this.f19909a = provider;
    }

    public static h a(Provider<b> provider) {
        return new h(provider);
    }

    public static g c(b bVar) {
        return new g(bVar);
    }

    /* renamed from: b */
    public g get() {
        return c(this.f19909a.get());
    }
}
