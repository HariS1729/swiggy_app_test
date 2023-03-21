package in.swiggy.android.tejas;

import in.swiggy.android.tejas.api.ApiBaseUrl;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesProtobufDineoutApiRetrofitFactory implements e<Retrofit> {
    private final Provider<ApiBaseUrl> apiBaseUrlProvider;
    private final Provider<Retrofit.Builder> retrofitBuilderProvider;

    public SwiggyTejasEngineModule_ProvidesProtobufDineoutApiRetrofitFactory(Provider<Retrofit.Builder> provider, Provider<ApiBaseUrl> provider2) {
        this.retrofitBuilderProvider = provider;
        this.apiBaseUrlProvider = provider2;
    }

    public static SwiggyTejasEngineModule_ProvidesProtobufDineoutApiRetrofitFactory create(Provider<Retrofit.Builder> provider, Provider<ApiBaseUrl> provider2) {
        return new SwiggyTejasEngineModule_ProvidesProtobufDineoutApiRetrofitFactory(provider, provider2);
    }

    public static Retrofit providesProtobufDineoutApiRetrofit(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        return (Retrofit) i.e(SwiggyTejasEngineModule.INSTANCE.providesProtobufDineoutApiRetrofit(builder, apiBaseUrl));
    }

    public Retrofit get() {
        return providesProtobufDineoutApiRetrofit(this.retrofitBuilderProvider.get(), this.apiBaseUrlProvider.get());
    }
}
