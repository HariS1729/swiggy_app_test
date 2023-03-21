package in.swiggy.android.tejas.coroutines.coroutinespolling;

import in.swiggy.android.tejas.feature.trackv3.TrackV3Manager;
import javax.inject.Provider;
import qq.e;

public final class TrackCoroutinesPoller_Factory implements e<TrackCoroutinesPoller> {
    private final Provider<TrackV3Manager> trackV3ManagerProvider;

    public TrackCoroutinesPoller_Factory(Provider<TrackV3Manager> provider) {
        this.trackV3ManagerProvider = provider;
    }

    public static TrackCoroutinesPoller_Factory create(Provider<TrackV3Manager> provider) {
        return new TrackCoroutinesPoller_Factory(provider);
    }

    public static TrackCoroutinesPoller newInstance(TrackV3Manager trackV3Manager) {
        return new TrackCoroutinesPoller(trackV3Manager);
    }

    public TrackCoroutinesPoller get() {
        return newInstance(this.trackV3ManagerProvider.get());
    }
}
