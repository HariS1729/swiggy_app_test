package in.swiggy.android.tejas;

import in.swiggy.android.tejas.api.ISwiggyApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesISwiggyApiFactory implements e<ISwiggyApi> {
    private final Provider<Retrofit> retrofitProvider;

    public SwiggyTejasEngineModule_ProvidesISwiggyApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static SwiggyTejasEngineModule_ProvidesISwiggyApiFactory create(Provider<Retrofit> provider) {
        return new SwiggyTejasEngineModule_ProvidesISwiggyApiFactory(provider);
    }

    public static ISwiggyApi providesISwiggyApi(Retrofit retrofit) {
        return (ISwiggyApi) i.e(SwiggyTejasEngineModule.INSTANCE.providesISwiggyApi(retrofit));
    }

    public ISwiggyApi get() {
        return providesISwiggyApi(this.retrofitProvider.get());
    }
}
