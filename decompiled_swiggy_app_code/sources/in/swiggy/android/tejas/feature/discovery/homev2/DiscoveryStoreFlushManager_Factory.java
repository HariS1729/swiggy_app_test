package in.swiggy.android.tejas.feature.discovery.homev2;

import android.content.SharedPreferences;
import javax.inject.Provider;
import qq.e;

public final class DiscoveryStoreFlushManager_Factory implements e<DiscoveryStoreFlushManager> {
    private final Provider<SharedPreferences> discoveryStoreSharedPreferencesProvider;

    public DiscoveryStoreFlushManager_Factory(Provider<SharedPreferences> provider) {
        this.discoveryStoreSharedPreferencesProvider = provider;
    }

    public static DiscoveryStoreFlushManager_Factory create(Provider<SharedPreferences> provider) {
        return new DiscoveryStoreFlushManager_Factory(provider);
    }

    public static DiscoveryStoreFlushManager newInstance(SharedPreferences sharedPreferences) {
        return new DiscoveryStoreFlushManager(sharedPreferences);
    }

    public DiscoveryStoreFlushManager get() {
        return newInstance(this.discoveryStoreSharedPreferencesProvider.get());
    }
}
