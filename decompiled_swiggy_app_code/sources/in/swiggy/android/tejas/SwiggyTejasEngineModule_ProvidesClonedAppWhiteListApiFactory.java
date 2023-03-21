package in.swiggy.android.tejas;

import in.swiggy.android.tejas.api.ApiBaseUrl;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesClonedAppWhiteListApiFactory implements e<Retrofit> {
    private final Provider<ApiBaseUrl> apiBaseUrlProvider;
    private final Provider<OkHttpClient> jsonOkHttpProvider;

    public SwiggyTejasEngineModule_ProvidesClonedAppWhiteListApiFactory(Provider<OkHttpClient> provider, Provider<ApiBaseUrl> provider2) {
        this.jsonOkHttpProvider = provider;
        this.apiBaseUrlProvider = provider2;
    }

    public static SwiggyTejasEngineModule_ProvidesClonedAppWhiteListApiFactory create(Provider<OkHttpClient> provider, Provider<ApiBaseUrl> provider2) {
        return new SwiggyTejasEngineModule_ProvidesClonedAppWhiteListApiFactory(provider, provider2);
    }

    public static Retrofit providesClonedAppWhiteListApi(OkHttpClient okHttpClient, ApiBaseUrl apiBaseUrl) {
        return (Retrofit) i.e(SwiggyTejasEngineModule.INSTANCE.providesClonedAppWhiteListApi(okHttpClient, apiBaseUrl));
    }

    public Retrofit get() {
        return providesClonedAppWhiteListApi(this.jsonOkHttpProvider.get(), this.apiBaseUrlProvider.get());
    }
}
