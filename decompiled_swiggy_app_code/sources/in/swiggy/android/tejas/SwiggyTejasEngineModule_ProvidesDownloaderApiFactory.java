package in.swiggy.android.tejas;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesDownloaderApiFactory implements e<Retrofit> {
    private final Provider<Retrofit> retrofitProvider;

    public SwiggyTejasEngineModule_ProvidesDownloaderApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static SwiggyTejasEngineModule_ProvidesDownloaderApiFactory create(Provider<Retrofit> provider) {
        return new SwiggyTejasEngineModule_ProvidesDownloaderApiFactory(provider);
    }

    public static Retrofit providesDownloaderApi(Retrofit retrofit) {
        return (Retrofit) i.e(SwiggyTejasEngineModule.INSTANCE.providesDownloaderApi(retrofit));
    }

    public Retrofit get() {
        return providesDownloaderApi(this.retrofitProvider.get());
    }
}
