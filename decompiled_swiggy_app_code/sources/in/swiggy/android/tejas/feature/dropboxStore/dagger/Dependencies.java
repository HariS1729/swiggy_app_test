package in.swiggy.android.tejas.feature.dropboxStore.dagger;

import android.content.Context;
import android.content.SharedPreferences;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.TejasConstants;
import in.swiggy.android.tejas.utils.GeneralUtilsKt;
import kotlin.jvm.internal.p;

/* compiled from: DropboxStoreModule.kt */
public final class Dependencies {
    public static final Dependencies INSTANCE = new Dependencies();

    private Dependencies() {
    }

    @DiscoveryStoreSharedPreferences
    public final SharedPreferences providesDiscoveryStoreSharedPreferences(Context context) {
        p.j(context, LogCategory.CONTEXT);
        return GeneralUtilsKt.getCustomSharedPreferences$default(context, TejasConstants.SHARED_PREF_DISCOVERY_STORE, 0, 2, (Object) null);
    }

    @FoodDiscoveryStoreSharedPreferences
    public final SharedPreferences providesFoodDiscoveryStoreSharedPreferences(Context context) {
        p.j(context, LogCategory.CONTEXT);
        return GeneralUtilsKt.getCustomSharedPreferences$default(context, TejasConstants.SHARED_PREF_FOOD_DISCOVERY_STORE, 0, 2, (Object) null);
    }

    @HomeStoreSharedPreferences
    public final SharedPreferences providesHomeStoreSharedPreferences(Context context) {
        p.j(context, LogCategory.CONTEXT);
        return GeneralUtilsKt.getCustomSharedPreferences$default(context, TejasConstants.SHARED_PREF_HOME_STORE, 0, 2, (Object) null);
    }
}
