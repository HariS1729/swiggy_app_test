package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.recommends.IRecommendsApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesIRecommendsApiFactory implements e<IRecommendsApi> {
    private final Provider<Retrofit> retrofitProvider;

    public SwiggyTejasEngineModule_ProvidesIRecommendsApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static SwiggyTejasEngineModule_ProvidesIRecommendsApiFactory create(Provider<Retrofit> provider) {
        return new SwiggyTejasEngineModule_ProvidesIRecommendsApiFactory(provider);
    }

    public static IRecommendsApi providesIRecommendsApi(Retrofit retrofit) {
        return (IRecommendsApi) i.e(SwiggyTejasEngineModule.INSTANCE.providesIRecommendsApi(retrofit));
    }

    public IRecommendsApi get() {
        return providesIRecommendsApi(this.retrofitProvider.get());
    }
}
