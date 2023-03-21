package xe0;

import android.app.Application;
import cg0.n;
import dg0.b;
import in.swiggy.android.swiggylocation.utils.eventmanager.interfaces.ILocationEventManager;
import javax.inject.Provider;
import kg0.a;
import qq.e;
import qq.i;

/* compiled from: RepositoriesDaggerModule_ProvideLocationContextFactory */
public final class c implements e<n> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Application> f19970a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<String> f19971b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<ILocationEventManager> f19972c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<a> f19973d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<ig0.e> f19974e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider<b> f19975f;

    public c(Provider<Application> provider, Provider<String> provider2, Provider<ILocationEventManager> provider3, Provider<a> provider4, Provider<ig0.e> provider5, Provider<b> provider6) {
        this.f19970a = provider;
        this.f19971b = provider2;
        this.f19972c = provider3;
        this.f19973d = provider4;
        this.f19974e = provider5;
        this.f19975f = provider6;
    }

    public static c a(Provider<Application> provider, Provider<String> provider2, Provider<ILocationEventManager> provider3, Provider<a> provider4, Provider<ig0.e> provider5, Provider<b> provider6) {
        return new c(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static n c(Application application, String str, ILocationEventManager iLocationEventManager, a aVar, ig0.e eVar, b bVar) {
        return (n) i.e(a.b(application, str, iLocationEventManager, aVar, eVar, bVar));
    }

    /* renamed from: b */
    public n get() {
        return c(this.f19970a.get(), this.f19971b.get(), this.f19972c.get(), this.f19973d.get(), this.f19974e.get(), this.f19975f.get());
    }
}
