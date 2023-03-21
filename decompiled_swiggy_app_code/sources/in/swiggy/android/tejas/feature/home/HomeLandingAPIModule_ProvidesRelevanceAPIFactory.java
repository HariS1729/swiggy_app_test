package in.swiggy.android.tejas.feature.home;

import in.swiggy.android.tejas.feature.relevance.IRelevanceAPI;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class HomeLandingAPIModule_ProvidesRelevanceAPIFactory implements e<IRelevanceAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public HomeLandingAPIModule_ProvidesRelevanceAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static HomeLandingAPIModule_ProvidesRelevanceAPIFactory create(Provider<Retrofit> provider) {
        return new HomeLandingAPIModule_ProvidesRelevanceAPIFactory(provider);
    }

    public static IRelevanceAPI providesRelevanceAPI(Retrofit retrofit) {
        return (IRelevanceAPI) i.e(HomeLandingAPIModule.providesRelevanceAPI(retrofit));
    }

    public IRelevanceAPI get() {
        return providesRelevanceAPI(this.retrofitProvider.get());
    }
}
