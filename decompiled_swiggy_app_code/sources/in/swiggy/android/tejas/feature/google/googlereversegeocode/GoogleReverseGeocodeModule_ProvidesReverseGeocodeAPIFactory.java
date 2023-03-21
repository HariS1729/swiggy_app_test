package in.swiggy.android.tejas.feature.google.googlereversegeocode;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class GoogleReverseGeocodeModule_ProvidesReverseGeocodeAPIFactory implements e<IGoogleReverseGeocodeAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public GoogleReverseGeocodeModule_ProvidesReverseGeocodeAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static GoogleReverseGeocodeModule_ProvidesReverseGeocodeAPIFactory create(Provider<Retrofit> provider) {
        return new GoogleReverseGeocodeModule_ProvidesReverseGeocodeAPIFactory(provider);
    }

    public static IGoogleReverseGeocodeAPI providesReverseGeocodeAPI(Retrofit retrofit) {
        return (IGoogleReverseGeocodeAPI) i.e(GoogleReverseGeocodeModule.providesReverseGeocodeAPI(retrofit));
    }

    public IGoogleReverseGeocodeAPI get() {
        return providesReverseGeocodeAPI(this.retrofitProvider.get());
    }
}
