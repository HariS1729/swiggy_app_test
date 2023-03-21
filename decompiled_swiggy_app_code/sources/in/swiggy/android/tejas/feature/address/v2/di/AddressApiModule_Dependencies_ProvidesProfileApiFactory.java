package in.swiggy.android.tejas.feature.address.v2.di;

import in.swiggy.android.tejas.feature.user.IProfileApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class AddressApiModule_Dependencies_ProvidesProfileApiFactory implements e<IProfileApi> {
    private final Provider<Retrofit> retrofitProvider;

    public AddressApiModule_Dependencies_ProvidesProfileApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static AddressApiModule_Dependencies_ProvidesProfileApiFactory create(Provider<Retrofit> provider) {
        return new AddressApiModule_Dependencies_ProvidesProfileApiFactory(provider);
    }

    public static IProfileApi providesProfileApi(Retrofit retrofit) {
        return (IProfileApi) i.e(AddressApiModule.Dependencies.providesProfileApi(retrofit));
    }

    public IProfileApi get() {
        return providesProfileApi(this.retrofitProvider.get());
    }
}
