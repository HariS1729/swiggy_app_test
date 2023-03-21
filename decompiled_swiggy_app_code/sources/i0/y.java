package i0;

import java.util.Map;
import k0.a;
import kotlin.jvm.internal.p;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
public final class y<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* renamed from: d  reason: collision with root package name */
    private final i<K, V> f14854d;

    public y(i<K, V> iVar) {
        p.j(iVar, "parentIterator");
        this.f14854d = iVar;
    }

    /* renamed from: o */
    public Map.Entry<K, V> next() {
        a.a(g());
        n(f() + 2);
        return new c(this.f14854d, d()[f() - 2], d()[f() - 1]);
    }
}
