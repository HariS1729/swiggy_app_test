package in.swiggy.android.tejas;

import in.swiggy.android.tejas.api.ApiBaseUrl;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesDevApiRetrofitDiscoveryApiFactory implements e<Retrofit> {
    private final Provider<ApiBaseUrl> apiBaseUrlProvider;
    private final Provider<Retrofit.Builder> retrofitBuilderProvider;

    public SwiggyTejasEngineModule_ProvidesDevApiRetrofitDiscoveryApiFactory(Provider<Retrofit.Builder> provider, Provider<ApiBaseUrl> provider2) {
        this.retrofitBuilderProvider = provider;
        this.apiBaseUrlProvider = provider2;
    }

    public static SwiggyTejasEngineModule_ProvidesDevApiRetrofitDiscoveryApiFactory create(Provider<Retrofit.Builder> provider, Provider<ApiBaseUrl> provider2) {
        return new SwiggyTejasEngineModule_ProvidesDevApiRetrofitDiscoveryApiFactory(provider, provider2);
    }

    public static Retrofit providesDevApiRetrofitDiscoveryApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        return (Retrofit) i.e(SwiggyTejasEngineModule.INSTANCE.providesDevApiRetrofitDiscoveryApi(builder, apiBaseUrl));
    }

    public Retrofit get() {
        return providesDevApiRetrofitDiscoveryApi(this.retrofitBuilderProvider.get(), this.apiBaseUrlProvider.get());
    }
}
