package in.swiggy.android.tejas.feature.google.directionscache.di;

import in.swiggy.android.tejas.feature.google.directionscache.api.IDirectionsSwiggyApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class DirectionsCacheModule_ProvidesSwiggyDirectionsAPIFactory implements e<IDirectionsSwiggyApi> {
    private final Provider<Retrofit> retrofitProvider;

    public DirectionsCacheModule_ProvidesSwiggyDirectionsAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static DirectionsCacheModule_ProvidesSwiggyDirectionsAPIFactory create(Provider<Retrofit> provider) {
        return new DirectionsCacheModule_ProvidesSwiggyDirectionsAPIFactory(provider);
    }

    public static IDirectionsSwiggyApi providesSwiggyDirectionsAPI(Retrofit retrofit) {
        return (IDirectionsSwiggyApi) i.e(DirectionsCacheModule.INSTANCE.providesSwiggyDirectionsAPI(retrofit));
    }

    public IDirectionsSwiggyApi get() {
        return providesSwiggyDirectionsAPI(this.retrofitProvider.get());
    }
}
