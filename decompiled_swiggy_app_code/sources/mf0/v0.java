package mf0;

import in.swiggy.android.tejas.network.IApiGeneratedService;
import javax.inject.Provider;
import qq.e;

/* compiled from: UserLogoutWorker_AssistedFactory_Factory */
public final class v0 implements e<u0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<IApiGeneratedService> f19745a;

    public v0(Provider<IApiGeneratedService> provider) {
        this.f19745a = provider;
    }

    public static v0 a(Provider<IApiGeneratedService> provider) {
        return new v0(provider);
    }

    public static u0 c(Provider<IApiGeneratedService> provider) {
        return new u0(provider);
    }

    /* renamed from: b */
    public u0 get() {
        return c(this.f19745a);
    }
}
