package xe0;

import android.app.Application;
import in.swiggy.android.tejas.feature.address.v2.api.IAddressExp;
import javax.inject.Provider;
import os.a;
import qq.e;
import qq.i;

/* compiled from: RepositoriesDaggerModule_ProvideUserContextFactory */
public final class g implements e<ef0.e> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Application> f19979a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<a> f19980b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<IAddressExp> f19981c;

    public g(Provider<Application> provider, Provider<a> provider2, Provider<IAddressExp> provider3) {
        this.f19979a = provider;
        this.f19980b = provider2;
        this.f19981c = provider3;
    }

    public static g a(Provider<Application> provider, Provider<a> provider2, Provider<IAddressExp> provider3) {
        return new g(provider, provider2, provider3);
    }

    public static ef0.e c(Application application, a aVar, IAddressExp iAddressExp) {
        return (ef0.e) i.e(a.f(application, aVar, iAddressExp));
    }

    /* renamed from: b */
    public ef0.e get() {
        return c(this.f19979a.get(), this.f19980b.get(), this.f19981c.get());
    }
}
