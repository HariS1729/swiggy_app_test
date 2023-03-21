package in.swiggy.android.tejas;

import in.swiggy.android.tejas.api.ApiBaseUrl;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesDevApiRetrofitDashApiFactory implements e<Retrofit> {
    private final Provider<ApiBaseUrl> apiBaseUrlProvider;
    private final Provider<Retrofit.Builder> retrofitBuilderProvider;

    public SwiggyTejasEngineModule_ProvidesDevApiRetrofitDashApiFactory(Provider<Retrofit.Builder> provider, Provider<ApiBaseUrl> provider2) {
        this.retrofitBuilderProvider = provider;
        this.apiBaseUrlProvider = provider2;
    }

    public static SwiggyTejasEngineModule_ProvidesDevApiRetrofitDashApiFactory create(Provider<Retrofit.Builder> provider, Provider<ApiBaseUrl> provider2) {
        return new SwiggyTejasEngineModule_ProvidesDevApiRetrofitDashApiFactory(provider, provider2);
    }

    public static Retrofit providesDevApiRetrofitDashApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        return (Retrofit) i.e(SwiggyTejasEngineModule.INSTANCE.providesDevApiRetrofitDashApi(builder, apiBaseUrl));
    }

    public Retrofit get() {
        return providesDevApiRetrofitDashApi(this.retrofitBuilderProvider.get(), this.apiBaseUrlProvider.get());
    }
}
