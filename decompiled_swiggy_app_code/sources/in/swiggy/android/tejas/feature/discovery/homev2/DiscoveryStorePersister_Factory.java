package in.swiggy.android.tejas.feature.discovery.homev2;

import android.content.SharedPreferences;
import in.swiggy.android.tejas.flush.SharedPrefFlushManager;
import javax.inject.Provider;
import qq.e;

public final class DiscoveryStorePersister_Factory implements e<DiscoveryStorePersister> {
    private final Provider<SharedPrefFlushManager> discoveryStoreFlushManagerProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public DiscoveryStorePersister_Factory(Provider<SharedPreferences> provider, Provider<SharedPrefFlushManager> provider2) {
        this.sharedPreferencesProvider = provider;
        this.discoveryStoreFlushManagerProvider = provider2;
    }

    public static DiscoveryStorePersister_Factory create(Provider<SharedPreferences> provider, Provider<SharedPrefFlushManager> provider2) {
        return new DiscoveryStorePersister_Factory(provider, provider2);
    }

    public static DiscoveryStorePersister newInstance(SharedPreferences sharedPreferences, SharedPrefFlushManager sharedPrefFlushManager) {
        return new DiscoveryStorePersister(sharedPreferences, sharedPrefFlushManager);
    }

    public DiscoveryStorePersister get() {
        return newInstance(this.sharedPreferencesProvider.get(), this.discoveryStoreFlushManagerProvider.get());
    }
}
