package in.swiggy.android.tejas;

import in.swiggy.android.tejas.apiinterface.IDiscoveryApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvidesDiscoveryApiFactory implements e<IDiscoveryApi> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvidesDiscoveryApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvidesDiscoveryApiFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvidesDiscoveryApiFactory(provider);
    }

    public static IDiscoveryApi providesDiscoveryApi(Retrofit retrofit) {
        return (IDiscoveryApi) i.e(APIModule.providesDiscoveryApi(retrofit));
    }

    public IDiscoveryApi get() {
        return providesDiscoveryApi(this.retrofitProvider.get());
    }
}
