package g3;

import androidx.lifecycle.j0;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InitializerViewModelFactory.kt */
public final class e<T extends j0> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f14733a;

    /* renamed from: b  reason: collision with root package name */
    private final l<a, T> f14734b;

    public e(Class<T> cls, l<? super a, ? extends T> lVar) {
        p.j(cls, "clazz");
        p.j(lVar, "initializer");
        this.f14733a = cls;
        this.f14734b = lVar;
    }

    public final Class<T> a() {
        return this.f14733a;
    }

    public final l<a, T> b() {
        return this.f14734b;
    }
}
