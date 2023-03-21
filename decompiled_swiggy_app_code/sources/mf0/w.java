package mf0;

import in.swiggy.android.tejas.network.IApiGeneratedService;
import javax.inject.Provider;
import qq.e;

/* compiled from: KabootarDismissNotification_AssistedFactory_Factory */
public final class w implements e<v> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<ef0.e> f19746a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<IApiGeneratedService> f19747b;

    public w(Provider<ef0.e> provider, Provider<IApiGeneratedService> provider2) {
        this.f19746a = provider;
        this.f19747b = provider2;
    }

    public static w a(Provider<ef0.e> provider, Provider<IApiGeneratedService> provider2) {
        return new w(provider, provider2);
    }

    public static v c(Provider<ef0.e> provider, Provider<IApiGeneratedService> provider2) {
        return new v(provider, provider2);
    }

    /* renamed from: b */
    public v get() {
        return c(this.f19746a, this.f19747b);
    }
}
