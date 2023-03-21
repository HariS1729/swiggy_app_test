package in.swiggy.android.tejas;

import in.swiggy.android.tejas.api.ApiBaseUrl;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesTrackDeTipApiFactory implements e<Retrofit> {
    private final Provider<ApiBaseUrl> apiBaseUrlProvider;
    private final Provider<Retrofit.Builder> retrofitBuilderProvider;

    public SwiggyTejasEngineModule_ProvidesTrackDeTipApiFactory(Provider<Retrofit.Builder> provider, Provider<ApiBaseUrl> provider2) {
        this.retrofitBuilderProvider = provider;
        this.apiBaseUrlProvider = provider2;
    }

    public static SwiggyTejasEngineModule_ProvidesTrackDeTipApiFactory create(Provider<Retrofit.Builder> provider, Provider<ApiBaseUrl> provider2) {
        return new SwiggyTejasEngineModule_ProvidesTrackDeTipApiFactory(provider, provider2);
    }

    public static Retrofit providesTrackDeTipApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        return (Retrofit) i.e(SwiggyTejasEngineModule.INSTANCE.providesTrackDeTipApi(builder, apiBaseUrl));
    }

    public Retrofit get() {
        return providesTrackDeTipApi(this.retrofitBuilderProvider.get(), this.apiBaseUrlProvider.get());
    }
}
