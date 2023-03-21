package in.swiggy.android.tejas.feature.home;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class DiscoveryAPIModule_ProvidesAPIFactory implements e<IDiscoveryAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public DiscoveryAPIModule_ProvidesAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static DiscoveryAPIModule_ProvidesAPIFactory create(Provider<Retrofit> provider) {
        return new DiscoveryAPIModule_ProvidesAPIFactory(provider);
    }

    public static IDiscoveryAPI providesAPI(Retrofit retrofit) {
        return (IDiscoveryAPI) i.e(DiscoveryAPIModule.providesAPI(retrofit));
    }

    public IDiscoveryAPI get() {
        return providesAPI(this.retrofitProvider.get());
    }
}
