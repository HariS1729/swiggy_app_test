package ng0;

import android.app.Application;
import javax.inject.Provider;
import okhttp3.Cache;
import qq.e;
import qq.i;

/* compiled from: LynxDnsModule_ProvidesLynxOkHttpCacheFactory */
public final class f implements e<Cache> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Application> f19792a;

    public f(Provider<Application> provider) {
        this.f19792a = provider;
    }

    public static f a(Provider<Application> provider) {
        return new f(provider);
    }

    public static Cache c(Application application) {
        return (Cache) i.e(c.f19787a.c(application));
    }

    /* renamed from: b */
    public Cache get() {
        return c(this.f19792a.get());
    }
}
