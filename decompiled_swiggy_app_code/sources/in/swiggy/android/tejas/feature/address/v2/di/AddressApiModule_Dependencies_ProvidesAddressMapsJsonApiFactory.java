package in.swiggy.android.tejas.feature.address.v2.di;

import in.swiggy.android.tejas.feature.address.v2.api.IAddressMapsJsonApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class AddressApiModule_Dependencies_ProvidesAddressMapsJsonApiFactory implements e<IAddressMapsJsonApi> {
    private final Provider<Retrofit> retrofitProvider;

    public AddressApiModule_Dependencies_ProvidesAddressMapsJsonApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static AddressApiModule_Dependencies_ProvidesAddressMapsJsonApiFactory create(Provider<Retrofit> provider) {
        return new AddressApiModule_Dependencies_ProvidesAddressMapsJsonApiFactory(provider);
    }

    public static IAddressMapsJsonApi providesAddressMapsJsonApi(Retrofit retrofit) {
        return (IAddressMapsJsonApi) i.e(AddressApiModule.Dependencies.providesAddressMapsJsonApi(retrofit));
    }

    public IAddressMapsJsonApi get() {
        return providesAddressMapsJsonApi(this.retrofitProvider.get());
    }
}
