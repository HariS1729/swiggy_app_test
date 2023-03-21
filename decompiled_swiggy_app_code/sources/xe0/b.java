package xe0;

import android.app.Application;
import android.content.SharedPreferences;
import cf0.i;
import cg0.n;
import if0.a;
import javax.inject.Provider;
import qq.e;

/* compiled from: RepositoriesDaggerModule_ProvideCartContextFactory */
public final class b implements e<i> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Application> f19966a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<a> f19967b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<n> f19968c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<SharedPreferences> f19969d;

    public b(Provider<Application> provider, Provider<a> provider2, Provider<n> provider3, Provider<SharedPreferences> provider4) {
        this.f19966a = provider;
        this.f19967b = provider2;
        this.f19968c = provider3;
        this.f19969d = provider4;
    }

    public static b a(Provider<Application> provider, Provider<a> provider2, Provider<n> provider3, Provider<SharedPreferences> provider4) {
        return new b(provider, provider2, provider3, provider4);
    }

    public static i c(Application application, a aVar, n nVar, SharedPreferences sharedPreferences) {
        return (i) qq.i.e(a.a(application, aVar, nVar, sharedPreferences));
    }

    /* renamed from: b */
    public i get() {
        return c(this.f19966a.get(), this.f19967b.get(), this.f19968c.get(), this.f19969d.get());
    }
}
