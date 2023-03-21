package in.swiggy.android.tejas.feature.google.directions;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class DirectionsModule_ProvidesSwiggyDirectionAPIFactory implements e<IDirectionsSwiggyApi> {
    private final Provider<Retrofit> retrofitProvider;

    public DirectionsModule_ProvidesSwiggyDirectionAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static DirectionsModule_ProvidesSwiggyDirectionAPIFactory create(Provider<Retrofit> provider) {
        return new DirectionsModule_ProvidesSwiggyDirectionAPIFactory(provider);
    }

    public static IDirectionsSwiggyApi providesSwiggyDirectionAPI(Retrofit retrofit) {
        return (IDirectionsSwiggyApi) i.e(DirectionsModule.providesSwiggyDirectionAPI(retrofit));
    }

    public IDirectionsSwiggyApi get() {
        return providesSwiggyDirectionAPI(this.retrofitProvider.get());
    }
}
