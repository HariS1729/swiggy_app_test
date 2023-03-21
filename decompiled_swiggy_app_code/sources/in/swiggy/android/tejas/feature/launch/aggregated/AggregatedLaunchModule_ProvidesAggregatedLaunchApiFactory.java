package in.swiggy.android.tejas.feature.launch.aggregated;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class AggregatedLaunchModule_ProvidesAggregatedLaunchApiFactory implements e<IAggregatedLaunchAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public AggregatedLaunchModule_ProvidesAggregatedLaunchApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static AggregatedLaunchModule_ProvidesAggregatedLaunchApiFactory create(Provider<Retrofit> provider) {
        return new AggregatedLaunchModule_ProvidesAggregatedLaunchApiFactory(provider);
    }

    public static IAggregatedLaunchAPI providesAggregatedLaunchApi(Retrofit retrofit) {
        return (IAggregatedLaunchAPI) i.e(AggregatedLaunchModule.providesAggregatedLaunchApi(retrofit));
    }

    public IAggregatedLaunchAPI get() {
        return providesAggregatedLaunchApi(this.retrofitProvider.get());
    }
}
