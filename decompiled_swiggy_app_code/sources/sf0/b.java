package sf0;

import java.util.Set;
import javax.inject.Provider;
import qq.e;
import qq.i;
import tf0.c;

/* compiled from: AssetPreCacheModule_ProvidesHandlerFactory */
public final class b implements e<tf0.b> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Set<c>> f19881a;

    public b(Provider<Set<c>> provider) {
        this.f19881a = provider;
    }

    public static b a(Provider<Set<c>> provider) {
        return new b(provider);
    }

    public static tf0.b c(Set<c> set) {
        return (tf0.b) i.e(a.f19880a.a(set));
    }

    /* renamed from: b */
    public tf0.b get() {
        return c(this.f19881a.get());
    }
}
