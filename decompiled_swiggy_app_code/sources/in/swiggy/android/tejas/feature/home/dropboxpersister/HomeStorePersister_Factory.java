package in.swiggy.android.tejas.feature.home.dropboxpersister;

import android.content.SharedPreferences;
import in.swiggy.android.tejas.flush.SharedPrefFlushManager;
import javax.inject.Provider;
import qq.e;

public final class HomeStorePersister_Factory implements e<HomeStorePersister> {
    private final Provider<SharedPrefFlushManager> homeStoreFlushManagerProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public HomeStorePersister_Factory(Provider<SharedPreferences> provider, Provider<SharedPrefFlushManager> provider2) {
        this.sharedPreferencesProvider = provider;
        this.homeStoreFlushManagerProvider = provider2;
    }

    public static HomeStorePersister_Factory create(Provider<SharedPreferences> provider, Provider<SharedPrefFlushManager> provider2) {
        return new HomeStorePersister_Factory(provider, provider2);
    }

    public static HomeStorePersister newInstance(SharedPreferences sharedPreferences, SharedPrefFlushManager sharedPrefFlushManager) {
        return new HomeStorePersister(sharedPreferences, sharedPrefFlushManager);
    }

    public HomeStorePersister get() {
        return newInstance(this.sharedPreferencesProvider.get(), this.homeStoreFlushManagerProvider.get());
    }
}
