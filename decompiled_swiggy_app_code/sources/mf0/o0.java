package mf0;

import android.content.SharedPreferences;
import ef0.f;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import javax.inject.Provider;
import qq.e;

/* compiled from: SyncSettingsWorker_AssistedFactory_Factory */
public final class o0 implements e<n0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<SharedPreferences> f19731a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<f> f19732b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<IApiGeneratedService> f19733c;

    public o0(Provider<SharedPreferences> provider, Provider<f> provider2, Provider<IApiGeneratedService> provider3) {
        this.f19731a = provider;
        this.f19732b = provider2;
        this.f19733c = provider3;
    }

    public static o0 a(Provider<SharedPreferences> provider, Provider<f> provider2, Provider<IApiGeneratedService> provider3) {
        return new o0(provider, provider2, provider3);
    }

    public static n0 c(Provider<SharedPreferences> provider, Provider<f> provider2, Provider<IApiGeneratedService> provider3) {
        return new n0(provider, provider2, provider3);
    }

    /* renamed from: b */
    public n0 get() {
        return c(this.f19731a, this.f19732b, this.f19733c);
    }
}
