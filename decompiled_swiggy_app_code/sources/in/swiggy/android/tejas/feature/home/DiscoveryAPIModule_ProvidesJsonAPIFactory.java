package in.swiggy.android.tejas.feature.home;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class DiscoveryAPIModule_ProvidesJsonAPIFactory implements e<IDiscoveryJsonApi> {
    private final Provider<Retrofit> retrofitProvider;

    public DiscoveryAPIModule_ProvidesJsonAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static DiscoveryAPIModule_ProvidesJsonAPIFactory create(Provider<Retrofit> provider) {
        return new DiscoveryAPIModule_ProvidesJsonAPIFactory(provider);
    }

    public static IDiscoveryJsonApi providesJsonAPI(Retrofit retrofit) {
        return (IDiscoveryJsonApi) i.e(DiscoveryAPIModule.providesJsonAPI(retrofit));
    }

    public IDiscoveryJsonApi get() {
        return providesJsonAPI(this.retrofitProvider.get());
    }
}
