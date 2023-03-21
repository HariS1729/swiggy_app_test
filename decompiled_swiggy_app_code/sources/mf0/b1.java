package mf0;

import android.content.SharedPreferences;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import javax.inject.Provider;
import qq.e;

/* compiled from: WebContentDownloadService_AssistedFactory_Factory */
public final class b1 implements e<a1> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<SharedPreferences> f19688a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<IApiGeneratedService> f19689b;

    public b1(Provider<SharedPreferences> provider, Provider<IApiGeneratedService> provider2) {
        this.f19688a = provider;
        this.f19689b = provider2;
    }

    public static b1 a(Provider<SharedPreferences> provider, Provider<IApiGeneratedService> provider2) {
        return new b1(provider, provider2);
    }

    public static a1 c(Provider<SharedPreferences> provider, Provider<IApiGeneratedService> provider2) {
        return new a1(provider, provider2);
    }

    /* renamed from: b */
    public a1 get() {
        return c(this.f19688a, this.f19689b);
    }
}
