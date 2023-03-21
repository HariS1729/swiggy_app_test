package in.swiggy.android.tejas;

import in.swiggy.android.tejas.api.ApiBaseUrl;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesDevApiRetrofitSwiggyApiFactory implements e<Retrofit> {
    private final Provider<ApiBaseUrl> apiBaseUrlProvider;
    private final Provider<Retrofit.Builder> retrofitBuilderProvider;

    public SwiggyTejasEngineModule_ProvidesDevApiRetrofitSwiggyApiFactory(Provider<Retrofit.Builder> provider, Provider<ApiBaseUrl> provider2) {
        this.retrofitBuilderProvider = provider;
        this.apiBaseUrlProvider = provider2;
    }

    public static SwiggyTejasEngineModule_ProvidesDevApiRetrofitSwiggyApiFactory create(Provider<Retrofit.Builder> provider, Provider<ApiBaseUrl> provider2) {
        return new SwiggyTejasEngineModule_ProvidesDevApiRetrofitSwiggyApiFactory(provider, provider2);
    }

    public static Retrofit providesDevApiRetrofitSwiggyApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        return (Retrofit) i.e(SwiggyTejasEngineModule.INSTANCE.providesDevApiRetrofitSwiggyApi(builder, apiBaseUrl));
    }

    public Retrofit get() {
        return providesDevApiRetrofitSwiggyApi(this.retrofitBuilderProvider.get(), this.apiBaseUrlProvider.get());
    }
}
