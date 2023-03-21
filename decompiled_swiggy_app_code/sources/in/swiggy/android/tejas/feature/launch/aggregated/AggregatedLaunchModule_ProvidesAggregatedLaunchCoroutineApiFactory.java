package in.swiggy.android.tejas.feature.launch.aggregated;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class AggregatedLaunchModule_ProvidesAggregatedLaunchCoroutineApiFactory implements e<IAggregatedCoroutineLaunchAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public AggregatedLaunchModule_ProvidesAggregatedLaunchCoroutineApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static AggregatedLaunchModule_ProvidesAggregatedLaunchCoroutineApiFactory create(Provider<Retrofit> provider) {
        return new AggregatedLaunchModule_ProvidesAggregatedLaunchCoroutineApiFactory(provider);
    }

    public static IAggregatedCoroutineLaunchAPI providesAggregatedLaunchCoroutineApi(Retrofit retrofit) {
        return (IAggregatedCoroutineLaunchAPI) i.e(AggregatedLaunchModule.providesAggregatedLaunchCoroutineApi(retrofit));
    }

    public IAggregatedCoroutineLaunchAPI get() {
        return providesAggregatedLaunchCoroutineApi(this.retrofitProvider.get());
    }
}
