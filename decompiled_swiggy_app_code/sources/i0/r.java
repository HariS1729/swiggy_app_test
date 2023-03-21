package i0;

import g0.b;
import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.p;

/* compiled from: PersistentHashMapContentViews.kt */
public final class r<K, V> extends AbstractCollection<V> implements b<V> {

    /* renamed from: a  reason: collision with root package name */
    private final d<K, V> f14842a;

    public r(d<K, V> dVar) {
        p.j(dVar, "map");
        this.f14842a = dVar;
    }

    public int c() {
        return this.f14842a.size();
    }

    public boolean contains(Object obj) {
        return this.f14842a.containsValue(obj);
    }

    public Iterator<V> iterator() {
        return new s(this.f14842a.q());
    }
}
