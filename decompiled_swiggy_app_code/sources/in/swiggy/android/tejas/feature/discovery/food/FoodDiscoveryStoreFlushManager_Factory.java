package in.swiggy.android.tejas.feature.discovery.food;

import android.content.SharedPreferences;
import javax.inject.Provider;
import qq.e;

public final class FoodDiscoveryStoreFlushManager_Factory implements e<FoodDiscoveryStoreFlushManager> {
    private final Provider<SharedPreferences> discoveryStoreSharedPreferencesProvider;

    public FoodDiscoveryStoreFlushManager_Factory(Provider<SharedPreferences> provider) {
        this.discoveryStoreSharedPreferencesProvider = provider;
    }

    public static FoodDiscoveryStoreFlushManager_Factory create(Provider<SharedPreferences> provider) {
        return new FoodDiscoveryStoreFlushManager_Factory(provider);
    }

    public static FoodDiscoveryStoreFlushManager newInstance(SharedPreferences sharedPreferences) {
        return new FoodDiscoveryStoreFlushManager(sharedPreferences);
    }

    public FoodDiscoveryStoreFlushManager get() {
        return newInstance(this.discoveryStoreSharedPreferencesProvider.get());
    }
}
