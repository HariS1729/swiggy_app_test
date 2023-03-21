package xe0;

import android.app.Application;
import ef0.c;
import javax.inject.Provider;
import qq.e;
import qq.i;

/* compiled from: RepositoriesDaggerModule_ProvideRestaurantsContextFactory */
public final class f implements e<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Application> f19978a;

    public f(Provider<Application> provider) {
        this.f19978a = provider;
    }

    public static f a(Provider<Application> provider) {
        return new f(provider);
    }

    public static c c(Application application) {
        return (c) i.e(a.e(application));
    }

    /* renamed from: b */
    public c get() {
        return c(this.f19978a.get());
    }
}
