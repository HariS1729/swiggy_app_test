package mf0;

import javax.inject.Provider;
import qq.e;
import wm0.g;

/* compiled from: WebResourceDownloadWorker_AssistedFactory_Factory */
public final class d1 implements e<c1> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<g> f19697a;

    public d1(Provider<g> provider) {
        this.f19697a = provider;
    }

    public static d1 a(Provider<g> provider) {
        return new d1(provider);
    }

    public static c1 c(Provider<g> provider) {
        return new c1(provider);
    }

    /* renamed from: b */
    public c1 get() {
        return c(this.f19697a);
    }
}
