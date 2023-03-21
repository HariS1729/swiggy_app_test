package i0;

import cp0.f;
import g0.e;
import java.util.Iterator;

/* compiled from: PersistentHashMapContentViews.kt */
public final class p<K, V> extends f<K> implements e<K> {

    /* renamed from: b  reason: collision with root package name */
    private final d<K, V> f14841b;

    public p(d<K, V> dVar) {
        kotlin.jvm.internal.p.j(dVar, "map");
        this.f14841b = dVar;
    }

    public int c() {
        return this.f14841b.size();
    }

    public boolean contains(Object obj) {
        return this.f14841b.containsKey(obj);
    }

    public Iterator<K> iterator() {
        return new q(this.f14841b.q());
    }
}
