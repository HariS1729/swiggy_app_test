package in.swiggy.android.tejas;

import in.swiggy.android.tejas.api.ApiBaseUrl;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesRetrofitRecommendsApiFactory implements e<Retrofit> {
    private final Provider<ApiBaseUrl> apiBaseUrlProvider;
    private final Provider<Retrofit.Builder> retrofitBuilderProvider;

    public SwiggyTejasEngineModule_ProvidesRetrofitRecommendsApiFactory(Provider<Retrofit.Builder> provider, Provider<ApiBaseUrl> provider2) {
        this.retrofitBuilderProvider = provider;
        this.apiBaseUrlProvider = provider2;
    }

    public static SwiggyTejasEngineModule_ProvidesRetrofitRecommendsApiFactory create(Provider<Retrofit.Builder> provider, Provider<ApiBaseUrl> provider2) {
        return new SwiggyTejasEngineModule_ProvidesRetrofitRecommendsApiFactory(provider, provider2);
    }

    public static Retrofit providesRetrofitRecommendsApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        return (Retrofit) i.e(SwiggyTejasEngineModule.INSTANCE.providesRetrofitRecommendsApi(builder, apiBaseUrl));
    }

    public Retrofit get() {
        return providesRetrofitRecommendsApi(this.retrofitBuilderProvider.get(), this.apiBaseUrlProvider.get());
    }
}
