package fl0;

import ir.b;
import javax.inject.Provider;
import qq.e;

/* compiled from: TrackOrderActivityViewModel_Factory */
public final class d implements e<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<b> f20139a;

    public d(Provider<b> provider) {
        this.f20139a = provider;
    }

    public static d a(Provider<b> provider) {
        return new d(provider);
    }

    public static c c(b bVar) {
        return new c(bVar);
    }

    /* renamed from: b */
    public c get() {
        return c(this.f20139a.get());
    }
}
