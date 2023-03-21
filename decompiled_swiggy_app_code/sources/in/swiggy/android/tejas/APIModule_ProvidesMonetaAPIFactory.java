package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.moneta.IMonetaAPI;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvidesMonetaAPIFactory implements e<IMonetaAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvidesMonetaAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvidesMonetaAPIFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvidesMonetaAPIFactory(provider);
    }

    public static IMonetaAPI providesMonetaAPI(Retrofit retrofit) {
        return (IMonetaAPI) i.e(APIModule.providesMonetaAPI(retrofit));
    }

    public IMonetaAPI get() {
        return providesMonetaAPI(this.retrofitProvider.get());
    }
}
