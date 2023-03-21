package mf0;

import android.content.SharedPreferences;
import ir.b;
import javax.inject.Provider;
import qq.e;

/* compiled from: OverlaysEventWorker_AssistedFactory_Factory */
public final class a0 implements e<z> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<SharedPreferences> f19678a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<b> f19679b;

    public a0(Provider<SharedPreferences> provider, Provider<b> provider2) {
        this.f19678a = provider;
        this.f19679b = provider2;
    }

    public static a0 a(Provider<SharedPreferences> provider, Provider<b> provider2) {
        return new a0(provider, provider2);
    }

    public static z c(Provider<SharedPreferences> provider, Provider<b> provider2) {
        return new z(provider, provider2);
    }

    /* renamed from: b */
    public z get() {
        return c(this.f19678a, this.f19679b);
    }
}
