package xe0;

import android.app.Application;
import ef0.b;
import javax.inject.Provider;
import qq.i;

/* compiled from: RepositoriesDaggerModule_ProvidePopContextFactory */
public final class e implements qq.e<b> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Application> f19977a;

    public e(Provider<Application> provider) {
        this.f19977a = provider;
    }

    public static e a(Provider<Application> provider) {
        return new e(provider);
    }

    public static b c(Application application) {
        return (b) i.e(a.d(application));
    }

    /* renamed from: b */
    public b get() {
        return c(this.f19977a.get());
    }
}
