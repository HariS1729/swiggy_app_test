package in.swiggy.android.tejas.feature.discovery.food;

import android.content.SharedPreferences;
import in.swiggy.android.tejas.flush.SharedPrefFlushManager;
import javax.inject.Provider;
import qq.e;

public final class FoodDiscoveryStorePersister_Factory implements e<FoodDiscoveryStorePersister> {
    private final Provider<SharedPrefFlushManager> discoveryStoreFlushManagerProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public FoodDiscoveryStorePersister_Factory(Provider<SharedPreferences> provider, Provider<SharedPrefFlushManager> provider2) {
        this.sharedPreferencesProvider = provider;
        this.discoveryStoreFlushManagerProvider = provider2;
    }

    public static FoodDiscoveryStorePersister_Factory create(Provider<SharedPreferences> provider, Provider<SharedPrefFlushManager> provider2) {
        return new FoodDiscoveryStorePersister_Factory(provider, provider2);
    }

    public static FoodDiscoveryStorePersister newInstance(SharedPreferences sharedPreferences, SharedPrefFlushManager sharedPrefFlushManager) {
        return new FoodDiscoveryStorePersister(sharedPreferences, sharedPrefFlushManager);
    }

    public FoodDiscoveryStorePersister get() {
        return newInstance(this.sharedPreferencesProvider.get(), this.discoveryStoreFlushManagerProvider.get());
    }
}
