package mf0;

import com.google.gson.Gson;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import javax.inject.Provider;
import qq.e;

/* compiled from: SendFeedBackWorker_AssistedFactory_Factory */
public final class g0 implements e<f0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Gson> f19706a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<IApiGeneratedService> f19707b;

    public g0(Provider<Gson> provider, Provider<IApiGeneratedService> provider2) {
        this.f19706a = provider;
        this.f19707b = provider2;
    }

    public static g0 a(Provider<Gson> provider, Provider<IApiGeneratedService> provider2) {
        return new g0(provider, provider2);
    }

    public static f0 c(Provider<Gson> provider, Provider<IApiGeneratedService> provider2) {
        return new f0(provider, provider2);
    }

    /* renamed from: b */
    public f0 get() {
        return c(this.f19706a, this.f19707b);
    }
}
