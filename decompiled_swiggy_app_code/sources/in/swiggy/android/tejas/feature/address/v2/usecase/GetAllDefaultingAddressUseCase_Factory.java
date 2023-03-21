package in.swiggy.android.tejas.feature.address.v2.usecase;

import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepository;
import javax.inject.Provider;
import qq.e;

public final class GetAllDefaultingAddressUseCase_Factory implements e<GetAllDefaultingAddressUseCase> {
    private final Provider<AddressRepository> repositoryProvider;

    public GetAllDefaultingAddressUseCase_Factory(Provider<AddressRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetAllDefaultingAddressUseCase_Factory create(Provider<AddressRepository> provider) {
        return new GetAllDefaultingAddressUseCase_Factory(provider);
    }

    public static GetAllDefaultingAddressUseCase newInstance(AddressRepository addressRepository) {
        return new GetAllDefaultingAddressUseCase(addressRepository);
    }

    public GetAllDefaultingAddressUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
