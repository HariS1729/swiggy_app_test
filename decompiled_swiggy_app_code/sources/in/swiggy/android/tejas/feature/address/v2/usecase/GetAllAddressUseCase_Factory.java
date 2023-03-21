package in.swiggy.android.tejas.feature.address.v2.usecase;

import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepository;
import javax.inject.Provider;
import qq.e;

public final class GetAllAddressUseCase_Factory implements e<GetAllAddressUseCase> {
    private final Provider<AddressRepository> repositoryProvider;

    public GetAllAddressUseCase_Factory(Provider<AddressRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetAllAddressUseCase_Factory create(Provider<AddressRepository> provider) {
        return new GetAllAddressUseCase_Factory(provider);
    }

    public static GetAllAddressUseCase newInstance(AddressRepository addressRepository) {
        return new GetAllAddressUseCase(addressRepository);
    }

    public GetAllAddressUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
