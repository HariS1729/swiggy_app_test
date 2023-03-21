package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.swiggypop.IPopApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesPopApiFactory implements e<IPopApi> {
    private final Provider<Retrofit> retrofitProvider;

    public SwiggyTejasEngineModule_ProvidesPopApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static SwiggyTejasEngineModule_ProvidesPopApiFactory create(Provider<Retrofit> provider) {
        return new SwiggyTejasEngineModule_ProvidesPopApiFactory(provider);
    }

    public static IPopApi providesPopApi(Retrofit retrofit) {
        return (IPopApi) i.e(SwiggyTejasEngineModule.INSTANCE.providesPopApi(retrofit));
    }

    public IPopApi get() {
        return providesPopApi(this.retrofitProvider.get());
    }
}
