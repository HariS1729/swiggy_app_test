package i0;

import kotlin.jvm.internal.p;
import mp0.e;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
final class c<K, V> extends b<K, V> implements e.a {

    /* renamed from: c  reason: collision with root package name */
    private final i<K, V> f14817c;

    /* renamed from: d  reason: collision with root package name */
    private V f14818d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(i<K, V> iVar, K k, V v) {
        super(k, v);
        p.j(iVar, "parentIterator");
        this.f14817c = iVar;
        this.f14818d = v;
    }

    public void a(V v) {
        this.f14818d = v;
    }

    public V getValue() {
        return this.f14818d;
    }

    public V setValue(V v) {
        V value = getValue();
        a(v);
        this.f14817c.c(getKey(), v);
        return value;
    }
}
