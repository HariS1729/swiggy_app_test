package mf0;

import javax.inject.Provider;
import pl0.m0;
import qq.e;

/* compiled from: ImageCachingUtilWorker_AssistedFactory_Factory */
public final class s implements e<r> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<m0> f19741a;

    public s(Provider<m0> provider) {
        this.f19741a = provider;
    }

    public static s a(Provider<m0> provider) {
        return new s(provider);
    }

    public static r c(Provider<m0> provider) {
        return new r(provider);
    }

    /* renamed from: b */
    public r get() {
        return c(this.f19741a);
    }
}
