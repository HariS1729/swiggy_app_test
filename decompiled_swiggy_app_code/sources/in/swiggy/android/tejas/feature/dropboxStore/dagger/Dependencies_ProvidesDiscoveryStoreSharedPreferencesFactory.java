package in.swiggy.android.tejas.feature.dropboxStore.dagger;

import android.content.Context;
import android.content.SharedPreferences;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class Dependencies_ProvidesDiscoveryStoreSharedPreferencesFactory implements e<SharedPreferences> {
    private final Provider<Context> contextProvider;

    public Dependencies_ProvidesDiscoveryStoreSharedPreferencesFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static Dependencies_ProvidesDiscoveryStoreSharedPreferencesFactory create(Provider<Context> provider) {
        return new Dependencies_ProvidesDiscoveryStoreSharedPreferencesFactory(provider);
    }

    public static SharedPreferences providesDiscoveryStoreSharedPreferences(Context context) {
        return (SharedPreferences) i.e(Dependencies.INSTANCE.providesDiscoveryStoreSharedPreferences(context));
    }

    public SharedPreferences get() {
        return providesDiscoveryStoreSharedPreferences(this.contextProvider.get());
    }
}
