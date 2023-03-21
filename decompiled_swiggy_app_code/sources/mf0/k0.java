package mf0;

import android.content.SharedPreferences;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import javax.inject.Provider;
import qq.e;

/* compiled from: SuperContentDownloadService_AssistedFactory_Factory */
public final class k0 implements e<j0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<SharedPreferences> f19718a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<IApiGeneratedService> f19719b;

    public k0(Provider<SharedPreferences> provider, Provider<IApiGeneratedService> provider2) {
        this.f19718a = provider;
        this.f19719b = provider2;
    }

    public static k0 a(Provider<SharedPreferences> provider, Provider<IApiGeneratedService> provider2) {
        return new k0(provider, provider2);
    }

    public static j0 c(Provider<SharedPreferences> provider, Provider<IApiGeneratedService> provider2) {
        return new j0(provider, provider2);
    }

    /* renamed from: b */
    public j0 get() {
        return c(this.f19718a, this.f19719b);
    }
}
