package p10;

import javax.inject.Provider;
import qq.e;
import qq.i;
import x40.b;

/* compiled from: AccountFragmentModule_ProvidesClickActionDelegateFactory */
public final class g implements e<b> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<ba0.e> f16208a;

    public g(Provider<ba0.e> provider) {
        this.f16208a = provider;
    }

    public static g a(Provider<ba0.e> provider) {
        return new g(provider);
    }

    public static b c(ba0.e eVar) {
        return (b) i.e(d.f16203a.c(eVar));
    }

    /* renamed from: b */
    public b get() {
        return c(this.f16208a.get());
    }
}
