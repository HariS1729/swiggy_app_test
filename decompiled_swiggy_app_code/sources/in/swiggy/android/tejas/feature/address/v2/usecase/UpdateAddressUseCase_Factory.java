package in.swiggy.android.tejas.feature.address.v2.usecase;

import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepository;
import javax.inject.Provider;
import qq.e;

public final class UpdateAddressUseCase_Factory implements e<UpdateAddressUseCase> {
    private final Provider<AddressRepository> repositoryProvider;

    public UpdateAddressUseCase_Factory(Provider<AddressRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static UpdateAddressUseCase_Factory create(Provider<AddressRepository> provider) {
        return new UpdateAddressUseCase_Factory(provider);
    }

    public static UpdateAddressUseCase newInstance(AddressRepository addressRepository) {
        return new UpdateAddressUseCase(addressRepository);
    }

    public UpdateAddressUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
