package in.swiggy.android.tejas.feature.home;

import in.swiggy.android.tejas.feature.landing.ILandingAPI;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class HomeLandingAPIModule_ProvidesLandingAPIFactory implements e<ILandingAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public HomeLandingAPIModule_ProvidesLandingAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static HomeLandingAPIModule_ProvidesLandingAPIFactory create(Provider<Retrofit> provider) {
        return new HomeLandingAPIModule_ProvidesLandingAPIFactory(provider);
    }

    public static ILandingAPI providesLandingAPI(Retrofit retrofit) {
        return (ILandingAPI) i.e(HomeLandingAPIModule.providesLandingAPI(retrofit));
    }

    public ILandingAPI get() {
        return providesLandingAPI(this.retrofitProvider.get());
    }
}
