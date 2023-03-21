package in.swiggy.android.tejas.feature.address.v2.usecase;

import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepository;
import javax.inject.Provider;
import qq.e;

public final class GetAddressByIdUseCase_Factory implements e<GetAddressByIdUseCase> {
    private final Provider<AddressRepository> repositoryProvider;

    public GetAddressByIdUseCase_Factory(Provider<AddressRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetAddressByIdUseCase_Factory create(Provider<AddressRepository> provider) {
        return new GetAddressByIdUseCase_Factory(provider);
    }

    public static GetAddressByIdUseCase newInstance(AddressRepository addressRepository) {
        return new GetAddressByIdUseCase(addressRepository);
    }

    public GetAddressByIdUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
