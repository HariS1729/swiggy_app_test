package og0;

import cg0.n;
import javax.inject.Provider;
import os.a;
import qq.e;

/* compiled from: DefaultHeaders_Factory */
public final class b implements e<a> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<n> f19802a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<ps.b> f19803b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<ef0.e> f19804c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<a> f19805d;

    public b(Provider<n> provider, Provider<ps.b> provider2, Provider<ef0.e> provider3, Provider<a> provider4) {
        this.f19802a = provider;
        this.f19803b = provider2;
        this.f19804c = provider3;
        this.f19805d = provider4;
    }

    public static b a(Provider<n> provider, Provider<ps.b> provider2, Provider<ef0.e> provider3, Provider<a> provider4) {
        return new b(provider, provider2, provider3, provider4);
    }

    public static a c(n nVar, ps.b bVar, ef0.e eVar, a aVar) {
        return new a(nVar, bVar, eVar, aVar);
    }

    /* renamed from: b */
    public a get() {
        return c(this.f19802a.get(), this.f19803b.get(), this.f19804c.get(), this.f19805d.get());
    }
}
