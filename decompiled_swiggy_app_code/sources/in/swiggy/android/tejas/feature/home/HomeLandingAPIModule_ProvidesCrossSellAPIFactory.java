package in.swiggy.android.tejas.feature.home;

import in.swiggy.android.tejas.feature.crosssell.ICrossSellAPI;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class HomeLandingAPIModule_ProvidesCrossSellAPIFactory implements e<ICrossSellAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public HomeLandingAPIModule_ProvidesCrossSellAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static HomeLandingAPIModule_ProvidesCrossSellAPIFactory create(Provider<Retrofit> provider) {
        return new HomeLandingAPIModule_ProvidesCrossSellAPIFactory(provider);
    }

    public static ICrossSellAPI providesCrossSellAPI(Retrofit retrofit) {
        return (ICrossSellAPI) i.e(HomeLandingAPIModule.providesCrossSellAPI(retrofit));
    }

    public ICrossSellAPI get() {
        return providesCrossSellAPI(this.retrofitProvider.get());
    }
}
