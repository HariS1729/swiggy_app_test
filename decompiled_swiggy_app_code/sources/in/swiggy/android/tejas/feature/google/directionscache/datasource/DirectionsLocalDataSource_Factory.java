package in.swiggy.android.tejas.feature.google.directionscache.datasource;

import in.swiggy.android.tejas.flush.SharedPrefFlushManager;
import javax.inject.Provider;
import qq.e;

public final class DirectionsLocalDataSource_Factory implements e<DirectionsLocalDataSource> {
    private final Provider<SharedPrefFlushManager> sharedPrefFlushManagerProvider;

    public DirectionsLocalDataSource_Factory(Provider<SharedPrefFlushManager> provider) {
        this.sharedPrefFlushManagerProvider = provider;
    }

    public static DirectionsLocalDataSource_Factory create(Provider<SharedPrefFlushManager> provider) {
        return new DirectionsLocalDataSource_Factory(provider);
    }

    public static DirectionsLocalDataSource newInstance(SharedPrefFlushManager sharedPrefFlushManager) {
        return new DirectionsLocalDataSource(sharedPrefFlushManager);
    }

    public DirectionsLocalDataSource get() {
        return newInstance(this.sharedPrefFlushManagerProvider.get());
    }
}
