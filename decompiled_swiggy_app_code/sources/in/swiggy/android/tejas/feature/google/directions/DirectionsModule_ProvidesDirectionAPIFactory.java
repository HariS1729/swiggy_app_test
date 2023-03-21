package in.swiggy.android.tejas.feature.google.directions;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class DirectionsModule_ProvidesDirectionAPIFactory implements e<IDirectionsAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public DirectionsModule_ProvidesDirectionAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static DirectionsModule_ProvidesDirectionAPIFactory create(Provider<Retrofit> provider) {
        return new DirectionsModule_ProvidesDirectionAPIFactory(provider);
    }

    public static IDirectionsAPI providesDirectionAPI(Retrofit retrofit) {
        return (IDirectionsAPI) i.e(DirectionsModule.providesDirectionAPI(retrofit));
    }

    public IDirectionsAPI get() {
        return providesDirectionAPI(this.retrofitProvider.get());
    }
}
