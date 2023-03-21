package in.swiggy.android.tejas.feature.google.directionscache.di;

import in.swiggy.android.tejas.feature.google.directionscache.api.IDirectionsGoogleApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class DirectionsCacheModule_ProvidesGoogleDirectionAPIFactory implements e<IDirectionsGoogleApi> {
    private final Provider<Retrofit> retrofitProvider;

    public DirectionsCacheModule_ProvidesGoogleDirectionAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static DirectionsCacheModule_ProvidesGoogleDirectionAPIFactory create(Provider<Retrofit> provider) {
        return new DirectionsCacheModule_ProvidesGoogleDirectionAPIFactory(provider);
    }

    public static IDirectionsGoogleApi providesGoogleDirectionAPI(Retrofit retrofit) {
        return (IDirectionsGoogleApi) i.e(DirectionsCacheModule.INSTANCE.providesGoogleDirectionAPI(retrofit));
    }

    public IDirectionsGoogleApi get() {
        return providesGoogleDirectionAPI(this.retrofitProvider.get());
    }
}
