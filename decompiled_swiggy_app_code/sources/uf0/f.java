package uf0;

import javax.inject.Provider;
import jr.a;
import qq.e;

/* compiled from: LottieHandler_Factory */
public final class f implements e<e> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<a> f19907a;

    public f(Provider<a> provider) {
        this.f19907a = provider;
    }

    public static f a(Provider<a> provider) {
        return new f(provider);
    }

    public static e c(a aVar) {
        return new e(aVar);
    }

    /* renamed from: b */
    public e get() {
        return c(this.f19907a.get());
    }
}
