package mf0;

import in.swiggy.android.tejas.feature.address.v2.usecase.GetAllDefaultingAddressUseCase;
import javax.inject.Provider;
import qq.e;

/* compiled from: FetchUserDefaultingAddressesWorker_AssistedFactory_Factory */
public final class o implements e<n> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<ef0.e> f19729a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<GetAllDefaultingAddressUseCase> f19730b;

    public o(Provider<ef0.e> provider, Provider<GetAllDefaultingAddressUseCase> provider2) {
        this.f19729a = provider;
        this.f19730b = provider2;
    }

    public static o a(Provider<ef0.e> provider, Provider<GetAllDefaultingAddressUseCase> provider2) {
        return new o(provider, provider2);
    }

    public static n c(Provider<ef0.e> provider, Provider<GetAllDefaultingAddressUseCase> provider2) {
        return new n(provider, provider2);
    }

    /* renamed from: b */
    public n get() {
        return c(this.f19729a, this.f19730b);
    }
}
