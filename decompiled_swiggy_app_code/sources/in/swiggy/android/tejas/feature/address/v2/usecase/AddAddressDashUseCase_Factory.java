package in.swiggy.android.tejas.feature.address.v2.usecase;

import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepository;
import javax.inject.Provider;
import qq.e;

public final class AddAddressDashUseCase_Factory implements e<AddAddressDashUseCase> {
    private final Provider<AddressRepository> repositoryProvider;

    public AddAddressDashUseCase_Factory(Provider<AddressRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static AddAddressDashUseCase_Factory create(Provider<AddressRepository> provider) {
        return new AddAddressDashUseCase_Factory(provider);
    }

    public static AddAddressDashUseCase newInstance(AddressRepository addressRepository) {
        return new AddAddressDashUseCase(addressRepository);
    }

    public AddAddressDashUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
