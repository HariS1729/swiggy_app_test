package in.swiggy.android.tejas.feature.launch.aggregated;

import javax.inject.Provider;
import qq.e;

public final class AggregatedLaunchManager_Factory implements e<AggregatedLaunchManager> {
    private final Provider<IAggregatedLaunchAPI> apiProvider;

    public AggregatedLaunchManager_Factory(Provider<IAggregatedLaunchAPI> provider) {
        this.apiProvider = provider;
    }

    public static AggregatedLaunchManager_Factory create(Provider<IAggregatedLaunchAPI> provider) {
        return new AggregatedLaunchManager_Factory(provider);
    }

    public static AggregatedLaunchManager newInstance(IAggregatedLaunchAPI iAggregatedLaunchAPI) {
        return new AggregatedLaunchManager(iAggregatedLaunchAPI);
    }

    public AggregatedLaunchManager get() {
        return newInstance(this.apiProvider.get());
    }
}
