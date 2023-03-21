package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.offers.IOffersApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvideOfferApiFactory implements e<IOffersApi> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvideOfferApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvideOfferApiFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvideOfferApiFactory(provider);
    }

    public static IOffersApi provideOfferApi(Retrofit retrofit) {
        return (IOffersApi) i.e(APIModule.provideOfferApi(retrofit));
    }

    public IOffersApi get() {
        return provideOfferApi(this.retrofitProvider.get());
    }
}
