package ng0;

import javax.inject.Provider;
import okhttp3.Dns;
import qq.i;

/* compiled from: LynxDnsModule_ProvidesDnsResolverFactory */
public final class e implements qq.e<Dns> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<g> f19791a;

    public e(Provider<g> provider) {
        this.f19791a = provider;
    }

    public static e a(Provider<g> provider) {
        return new e(provider);
    }

    public static Dns c(g gVar) {
        return (Dns) i.e(c.f19787a.b(gVar));
    }

    /* renamed from: b */
    public Dns get() {
        return c(this.f19791a.get());
    }
}
