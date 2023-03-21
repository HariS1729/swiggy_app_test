package mf0;

import android.content.SharedPreferences;
import javax.inject.Provider;
import jr.a;
import qq.e;

/* compiled from: ClearCachePeriodicWorker_AssistedFactory_Factory */
public final class i implements e<h> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<a> f19710a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<SharedPreferences> f19711b;

    public i(Provider<a> provider, Provider<SharedPreferences> provider2) {
        this.f19710a = provider;
        this.f19711b = provider2;
    }

    public static i a(Provider<a> provider, Provider<SharedPreferences> provider2) {
        return new i(provider, provider2);
    }

    public static h c(Provider<a> provider, Provider<SharedPreferences> provider2) {
        return new h(provider, provider2);
    }

    /* renamed from: b */
    public h get() {
        return c(this.f19710a, this.f19711b);
    }
}
