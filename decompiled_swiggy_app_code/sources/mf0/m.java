package mf0;

import in.swiggy.android.tejas.feature.address.v2.usecase.GetAllAddressUseCase;
import javax.inject.Provider;
import qq.e;

/* compiled from: FetchUserAddressesWorker_AssistedFactory_Factory */
public final class m implements e<l> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<ef0.e> f19722a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<GetAllAddressUseCase> f19723b;

    public m(Provider<ef0.e> provider, Provider<GetAllAddressUseCase> provider2) {
        this.f19722a = provider;
        this.f19723b = provider2;
    }

    public static m a(Provider<ef0.e> provider, Provider<GetAllAddressUseCase> provider2) {
        return new m(provider, provider2);
    }

    public static l c(Provider<ef0.e> provider, Provider<GetAllAddressUseCase> provider2) {
        return new l(provider, provider2);
    }

    /* renamed from: b */
    public l get() {
        return c(this.f19722a, this.f19723b);
    }
}
