package in.swiggy.android.tejas.feature.dropboxStore.dagger;

import android.content.Context;
import android.content.SharedPreferences;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class Dependencies_ProvidesFoodDiscoveryStoreSharedPreferencesFactory implements e<SharedPreferences> {
    private final Provider<Context> contextProvider;

    public Dependencies_ProvidesFoodDiscoveryStoreSharedPreferencesFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static Dependencies_ProvidesFoodDiscoveryStoreSharedPreferencesFactory create(Provider<Context> provider) {
        return new Dependencies_ProvidesFoodDiscoveryStoreSharedPreferencesFactory(provider);
    }

    public static SharedPreferences providesFoodDiscoveryStoreSharedPreferences(Context context) {
        return (SharedPreferences) i.e(Dependencies.INSTANCE.providesFoodDiscoveryStoreSharedPreferences(context));
    }

    public SharedPreferences get() {
        return providesFoodDiscoveryStoreSharedPreferences(this.contextProvider.get());
    }
}
