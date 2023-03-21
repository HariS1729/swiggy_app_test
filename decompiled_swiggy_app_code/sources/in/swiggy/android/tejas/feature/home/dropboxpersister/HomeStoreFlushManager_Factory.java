package in.swiggy.android.tejas.feature.home.dropboxpersister;

import android.content.SharedPreferences;
import javax.inject.Provider;
import qq.e;

public final class HomeStoreFlushManager_Factory implements e<HomeStoreFlushManager> {
    private final Provider<SharedPreferences> homeStoreSharedPreferencesProvider;

    public HomeStoreFlushManager_Factory(Provider<SharedPreferences> provider) {
        this.homeStoreSharedPreferencesProvider = provider;
    }

    public static HomeStoreFlushManager_Factory create(Provider<SharedPreferences> provider) {
        return new HomeStoreFlushManager_Factory(provider);
    }

    public static HomeStoreFlushManager newInstance(SharedPreferences sharedPreferences) {
        return new HomeStoreFlushManager(sharedPreferences);
    }

    public HomeStoreFlushManager get() {
        return newInstance(this.homeStoreSharedPreferencesProvider.get());
    }
}
