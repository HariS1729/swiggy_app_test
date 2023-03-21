package vh0;

import android.content.SharedPreferences;
import ef0.f;
import javax.inject.Provider;
import qq.e;

/* compiled from: LynxStateManagerImpl_Factory */
public final class b implements e<a> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<SharedPreferences> f19947a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<f> f19948b;

    public b(Provider<SharedPreferences> provider, Provider<f> provider2) {
        this.f19947a = provider;
        this.f19948b = provider2;
    }

    public static b a(Provider<SharedPreferences> provider, Provider<f> provider2) {
        return new b(provider, provider2);
    }

    public static a c(SharedPreferences sharedPreferences, f fVar) {
        return new a(sharedPreferences, fVar);
    }

    /* renamed from: b */
    public a get() {
        return c(this.f19947a.get(), this.f19948b.get());
    }
}
