package in.swiggy.android.tejas.feature.discovery.homev2;

import android.content.SharedPreferences;
import android.text.format.DateUtils;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.feature.dropboxStore.dagger.DiscoveryStoreSharedPreferences;
import in.swiggy.android.tejas.flush.SharedPrefFlushManager;
import java.util.Date;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;

/* compiled from: DiscoveryStoreFlushManager.kt */
public final class DiscoveryStoreFlushManager implements SharedPrefFlushManager {
    public static final Companion Companion = new Companion((i) null);
    private static final String LAST_CLEANED_TIME = "discovery-store-last-cleaned-time";
    private static final String TAG = "DiscoveryStoreSharePrefFlushManager";
    private final SharedPreferences discoveryStoreSharedPreferences;
    private boolean isAlreadyCleaned;
    private final SharedPreferences sharedPreferences;

    /* compiled from: DiscoveryStoreFlushManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DiscoveryStoreFlushManager(@DiscoveryStoreSharedPreferences SharedPreferences sharedPreferences2) {
        p.j(sharedPreferences2, "discoveryStoreSharedPreferences");
        this.discoveryStoreSharedPreferences = sharedPreferences2;
        this.sharedPreferences = sharedPreferences2;
    }

    private final boolean isAlreadyCleaned() {
        if (this.isAlreadyCleaned) {
            return true;
        }
        if (getSharedPreferences().contains(LAST_CLEANED_TIME)) {
            long j = getSharedPreferences().getLong(LAST_CLEANED_TIME, 0);
            u.b(TAG, "lastCleanedTime : " + j + " , " + new Date(j));
            this.isAlreadyCleaned = DateUtils.isToday(j);
        }
        return this.isAlreadyCleaned;
    }

    public void clearCache() {
        SharedPrefFlushManager.DefaultImpls.clearCache(this);
    }

    public SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public Object removeDayOldCache(c<? super k> cVar) {
        if (!isAlreadyCleaned()) {
            SharedPreferences.Editor edit = getSharedPreferences().edit();
            p.i(edit, "editor");
            edit.clear();
            u.b(TAG, "discovery store cache cleared");
            edit.putLong(LAST_CLEANED_TIME, System.currentTimeMillis());
            this.isAlreadyCleaned = true;
            edit.apply();
        }
        return k.f22762a;
    }
}
