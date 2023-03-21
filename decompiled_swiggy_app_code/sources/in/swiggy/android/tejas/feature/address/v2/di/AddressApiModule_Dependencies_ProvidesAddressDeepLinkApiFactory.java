package in.swiggy.android.tejas.feature.address.v2.di;

import in.swiggy.android.tejas.shareaddress.api.IAddressDeepLinkApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class AddressApiModule_Dependencies_ProvidesAddressDeepLinkApiFactory implements e<IAddressDeepLinkApi> {
    private final Provider<Retrofit> retrofitProvider;

    public AddressApiModule_Dependencies_ProvidesAddressDeepLinkApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static AddressApiModule_Dependencies_ProvidesAddressDeepLinkApiFactory create(Provider<Retrofit> provider) {
        return new AddressApiModule_Dependencies_ProvidesAddressDeepLinkApiFactory(provider);
    }

    public static IAddressDeepLinkApi providesAddressDeepLinkApi(Retrofit retrofit) {
        return (IAddressDeepLinkApi) i.e(AddressApiModule.Dependencies.providesAddressDeepLinkApi(retrofit));
    }

    public IAddressDeepLinkApi get() {
        return providesAddressDeepLinkApi(this.retrofitProvider.get());
    }
}
