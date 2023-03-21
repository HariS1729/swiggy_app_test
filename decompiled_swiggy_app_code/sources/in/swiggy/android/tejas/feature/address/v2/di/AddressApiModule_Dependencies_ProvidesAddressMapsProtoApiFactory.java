package in.swiggy.android.tejas.feature.address.v2.di;

import in.swiggy.android.tejas.feature.address.v2.api.IAddressMapsProtoApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class AddressApiModule_Dependencies_ProvidesAddressMapsProtoApiFactory implements e<IAddressMapsProtoApi> {
    private final Provider<Retrofit> retrofitProvider;

    public AddressApiModule_Dependencies_ProvidesAddressMapsProtoApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static AddressApiModule_Dependencies_ProvidesAddressMapsProtoApiFactory create(Provider<Retrofit> provider) {
        return new AddressApiModule_Dependencies_ProvidesAddressMapsProtoApiFactory(provider);
    }

    public static IAddressMapsProtoApi providesAddressMapsProtoApi(Retrofit retrofit) {
        return (IAddressMapsProtoApi) i.e(AddressApiModule.Dependencies.providesAddressMapsProtoApi(retrofit));
    }

    public IAddressMapsProtoApi get() {
        return providesAddressMapsProtoApi(this.retrofitProvider.get());
    }
}
