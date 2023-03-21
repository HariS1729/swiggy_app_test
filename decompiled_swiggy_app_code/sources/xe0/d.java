package xe0;

import android.app.Application;
import if0.a;
import javax.inject.Provider;
import qq.e;
import qq.i;

/* compiled from: RepositoriesDaggerModule_ProvidePersistanceContextServiceFactory */
public final class d implements e<a> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Application> f19976a;

    public d(Provider<Application> provider) {
        this.f19976a = provider;
    }

    public static d a(Provider<Application> provider) {
        return new d(provider);
    }

    public static a c(Application application) {
        return (a) i.e(a.c(application));
    }

    /* renamed from: b */
    public a get() {
        return c(this.f19976a.get());
    }
}
