package in.swiggy.android.tejas.feature.address.v2.usecase;

import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepository;
import javax.inject.Provider;
import qq.e;

public final class AddPopAddressUseCase_Factory implements e<AddPopAddressUseCase> {
    private final Provider<AddressRepository> repositoryProvider;

    public AddPopAddressUseCase_Factory(Provider<AddressRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static AddPopAddressUseCase_Factory create(Provider<AddressRepository> provider) {
        return new AddPopAddressUseCase_Factory(provider);
    }

    public static AddPopAddressUseCase newInstance(AddressRepository addressRepository) {
        return new AddPopAddressUseCase(addressRepository);
    }

    public AddPopAddressUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
