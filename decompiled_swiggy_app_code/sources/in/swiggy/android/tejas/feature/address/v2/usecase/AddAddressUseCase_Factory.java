package in.swiggy.android.tejas.feature.address.v2.usecase;

import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepository;
import javax.inject.Provider;
import qq.e;

public final class AddAddressUseCase_Factory implements e<AddAddressUseCase> {
    private final Provider<AddressRepository> repositoryProvider;

    public AddAddressUseCase_Factory(Provider<AddressRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static AddAddressUseCase_Factory create(Provider<AddressRepository> provider) {
        return new AddAddressUseCase_Factory(provider);
    }

    public static AddAddressUseCase newInstance(AddressRepository addressRepository) {
        return new AddAddressUseCase(addressRepository);
    }

    public AddAddressUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
