package in.swiggy.android.tejas;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesGoogleApiFactory implements e<Retrofit> {
    private final Provider<Retrofit> retrofitProvider;

    public SwiggyTejasEngineModule_ProvidesGoogleApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static SwiggyTejasEngineModule_ProvidesGoogleApiFactory create(Provider<Retrofit> provider) {
        return new SwiggyTejasEngineModule_ProvidesGoogleApiFactory(provider);
    }

    public static Retrofit providesGoogleApi(Retrofit retrofit) {
        return (Retrofit) i.e(SwiggyTejasEngineModule.INSTANCE.providesGoogleApi(retrofit));
    }

    public Retrofit get() {
        return providesGoogleApi(this.retrofitProvider.get());
    }
}
