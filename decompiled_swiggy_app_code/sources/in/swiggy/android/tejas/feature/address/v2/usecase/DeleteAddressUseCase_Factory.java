package in.swiggy.android.tejas.feature.address.v2.usecase;

import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepository;
import javax.inject.Provider;
import qq.e;

public final class DeleteAddressUseCase_Factory implements e<DeleteAddressUseCase> {
    private final Provider<AddressRepository> repositoryProvider;

    public DeleteAddressUseCase_Factory(Provider<AddressRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static DeleteAddressUseCase_Factory create(Provider<AddressRepository> provider) {
        return new DeleteAddressUseCase_Factory(provider);
    }

    public static DeleteAddressUseCase newInstance(AddressRepository addressRepository) {
        return new DeleteAddressUseCase(addressRepository);
    }

    public DeleteAddressUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
