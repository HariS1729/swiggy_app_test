package in.swiggy.android.tejas.feature.dropboxStore.dagger;

import android.content.Context;
import android.content.SharedPreferences;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class Dependencies_ProvidesHomeStoreSharedPreferencesFactory implements e<SharedPreferences> {
    private final Provider<Context> contextProvider;

    public Dependencies_ProvidesHomeStoreSharedPreferencesFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static Dependencies_ProvidesHomeStoreSharedPreferencesFactory create(Provider<Context> provider) {
        return new Dependencies_ProvidesHomeStoreSharedPreferencesFactory(provider);
    }

    public static SharedPreferences providesHomeStoreSharedPreferences(Context context) {
        return (SharedPreferences) i.e(Dependencies.INSTANCE.providesHomeStoreSharedPreferences(context));
    }

    public SharedPreferences get() {
        return providesHomeStoreSharedPreferences(this.contextProvider.get());
    }
}
