package in.swiggy.android.tejas.feature.launch.aggregated;

import javax.inject.Provider;
import qq.e;

public final class AggregateLaunchPoller_Factory implements e<AggregateLaunchPoller> {
    private final Provider<IAggregatedCoroutineLaunchAPI> apiProvider;

    public AggregateLaunchPoller_Factory(Provider<IAggregatedCoroutineLaunchAPI> provider) {
        this.apiProvider = provider;
    }

    public static AggregateLaunchPoller_Factory create(Provider<IAggregatedCoroutineLaunchAPI> provider) {
        return new AggregateLaunchPoller_Factory(provider);
    }

    public static AggregateLaunchPoller newInstance(IAggregatedCoroutineLaunchAPI iAggregatedCoroutineLaunchAPI) {
        return new AggregateLaunchPoller(iAggregatedCoroutineLaunchAPI);
    }

    public AggregateLaunchPoller get() {
        return newInstance(this.apiProvider.get());
    }
}
