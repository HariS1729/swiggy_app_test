package in.swiggy.android.tejas.feature.address.v2.repository;

import javax.inject.Provider;
import qq.e;

public final class AddressRepositoryImpl_Factory implements e<AddressRepositoryImpl> {
    private final Provider<AddressRepository> repositoryProvider;

    public AddressRepositoryImpl_Factory(Provider<AddressRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static AddressRepositoryImpl_Factory create(Provider<AddressRepository> provider) {
        return new AddressRepositoryImpl_Factory(provider);
    }

    public static AddressRepositoryImpl newInstance(AddressRepository addressRepository) {
        return new AddressRepositoryImpl(addressRepository);
    }

    public AddressRepositoryImpl get() {
        return newInstance(this.repositoryProvider.get());
    }
}
