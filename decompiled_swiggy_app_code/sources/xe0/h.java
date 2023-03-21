package xe0;

import android.content.SharedPreferences;
import cg0.n;
import cg0.o;
import javax.inject.Provider;
import qq.e;
import qq.i;

/* compiled from: RepositoriesDaggerModule_ProvideUserLocationManagerFactory */
public final class h implements e<o> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<n> f19982a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<ef0.e> f19983b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<SharedPreferences> f19984c;

    public h(Provider<n> provider, Provider<ef0.e> provider2, Provider<SharedPreferences> provider3) {
        this.f19982a = provider;
        this.f19983b = provider2;
        this.f19984c = provider3;
    }

    public static h a(Provider<n> provider, Provider<ef0.e> provider2, Provider<SharedPreferences> provider3) {
        return new h(provider, provider2, provider3);
    }

    public static o c(n nVar, ef0.e eVar, SharedPreferences sharedPreferences) {
        return (o) i.e(a.g(nVar, eVar, sharedPreferences));
    }

    /* renamed from: b */
    public o get() {
        return c(this.f19982a.get(), this.f19983b.get(), this.f19984c.get());
    }
}
